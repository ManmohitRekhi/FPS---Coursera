package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = if(r == 0 || c == 0 || r == c) 1 else pascal(c, r-1) + pascal(c-1, r - 1)

 
  /**
   * Exercise 2
   */
  
  def balance(chars: List[Char]): Boolean = {
    
    def eval(i: Int, chars: List[Char]): Int = i + (if(chars.head == '(') 1 else( if(chars.head == ')') -1 else 0))
    
    def check(i: Int, z: Boolean): Boolean = if(z) (i >= 0) else z 
    
    def counter(i:Int, chars: List[Char], z: Boolean): Boolean = {
      
      if(chars.isEmpty) z
      else counter(eval(i,chars), chars.tail, check(eval(i,chars),z) )
    
    }
    
    counter(0,chars, true)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = if(money == 0) 1 else if(money < 0 || coins.isEmpty) 0 else countChange(money, coins.tail) + countChange(money-coins.head, coins)
}
