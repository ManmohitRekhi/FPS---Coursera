import math.abs

object fixedpoint {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  val tolerance = 0.00001                         //> tolerance  : Double = 1.0E-5

  def isCloseEnough(x: Double, y: Double): Boolean = {
    println("guess: " + x + " next: " + y)
    abs((x - y) / x) / x < tolerance
  }                                               //> isCloseEnough: (x: Double, y: Double)Boolean

  def fixedPoint(f: Double => Double)(firstGuess: Double) = {

    def iterate(guess: Double): Double = {

      val next = f(guess)
      if (isCloseEnough(guess, next)) next
      else iterate(next)

    }

    iterate(firstGuess)
  }                                               //> fixedPoint: (f: Double => Double)(firstGuess: Double)Double

  def averageDamp(f: Double => Double)(x: Double) = (x + f(x)) / 2
                                                  //> averageDamp: (f: Double => Double)(x: Double)Double

  def sqrt(x: Double) = fixedPoint(averageDamp(y => x / y))(1)
                                                  //> sqrt: (x: Double)Double
  sqrt(2)                                         //> guess: 1.0 next: 1.5
                                                  //| guess: 1.5 next: 1.4166666666666665
                                                  //| guess: 1.4166666666666665 next: 1.4142156862745097
                                                  //| guess: 1.4142156862745097 next: 1.4142135623746899
                                                  //| res0: Double = 1.4142135623746899
}