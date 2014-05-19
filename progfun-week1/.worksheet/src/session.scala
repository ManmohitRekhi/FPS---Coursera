object session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(60); 
  println("Welcome to the Scala worksheet");$skip(329); 

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

  };System.out.println("""sqrt: (x: Double)Double""");$skip(12); val res$0 = 

  sqrt(2);System.out.println("""res0: Double = """ + $show(res$0));$skip(10); val res$1 = 
  sqrt(4);System.out.println("""res1: Double = """ + $show(res$1))}
}
