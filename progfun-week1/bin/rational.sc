object rational {
  val x = new Rationals(1,2)                      //> x  : Rationals = 1/2
  val y = new Rationals(2,3)                      //> y  : Rationals = 2/3
  x.max(y)                                        //> res0: Rationals = 2/3
}



class Rationals(x: Int, y: Int){
	
	require(y != 0, "Denominator must be nonzero")
	
	def this(x: Int) = this(x,1)
	
	private def gcd(a: Int, b: Int): Int = if(b == 0) a else gcd(b, a%b)
	private val g = gcd(x,y)
	def numer = x/g
	def denom = y/g

	def less(that: Rationals) = this.numer * that.denom < that.numer * this.denom
	
	def max(that: Rationals) = if(this.less(that)) that else this
	
	def neg: Rationals = new Rationals(-numer, denom)
	
	def add(that: Rationals) =
		new Rationals(
			numer * that.denom + that.numer * denom,
			denom * that.denom)
			
	override def toString = numer + "/" + denom
	
	def sub(that: Rationals) = add(that.neg)
	
	
}