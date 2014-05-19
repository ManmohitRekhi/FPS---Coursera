object session {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def sqrt(x: Double) = {

    def abs(x :Double) = if (x < 0) -x else x

    def sI(guess: Double): Double =
      if (iGE(guess)) guess
      else sI(improve(guess))

    def iGE(guess: Double) =
      abs(guess * guess - x) / x < 0.001

    def improve(guess: Double) =
      (guess + x / guess) / 2

    sI(1.0)

  }                                               //> sqrt: (x: Double)Double

  sqrt(2)                                         //> res0: Double = 1.4142156862745097
  sqrt(4)                                         //> res1: Double = 2.000609756097561
}