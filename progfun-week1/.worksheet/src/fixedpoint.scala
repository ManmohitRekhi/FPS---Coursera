import math.abs

object fixedpoint {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(81); 
  println("Welcome to the Scala worksheet");$skip(28); 

  val tolerance = 0.00001;System.out.println("""tolerance  : Double = """ + $show(tolerance ));$skip(141); 

  def isCloseEnough(x: Double, y: Double): Boolean = {
    println("guess: " + x + " next: " + y)
    abs((x - y) / x) / x < tolerance
  };System.out.println("""isCloseEnough: (x: Double, y: Double)Boolean""");$skip(243); 

  def fixedPoint(f: Double => Double)(firstGuess: Double) = {

    def iterate(guess: Double): Double = {

      val next = f(guess)
      if (isCloseEnough(guess, next)) next
      else iterate(next)

    }

    iterate(firstGuess)
  };System.out.println("""fixedPoint: (f: Double => Double)(firstGuess: Double)Double""");$skip(69); 

  def averageDamp(f: Double => Double)(x: Double) = (x + f(x)) / 2;System.out.println("""averageDamp: (f: Double => Double)(x: Double)Double""");$skip(65); 

  def sqrt(x: Double) = fixedPoint(averageDamp(y => x / y))(1);System.out.println("""sqrt: (x: Double)Double""");$skip(10); val res$0 = 
  sqrt(2);System.out.println("""res0: Double = """ + $show(res$0))}
}
