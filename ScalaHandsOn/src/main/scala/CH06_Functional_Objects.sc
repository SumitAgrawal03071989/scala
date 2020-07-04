
class Rational(n: Int, d: Int){
  // this line will be placed in constructor
  println("Created " + n + "/" + d )

  require(d != 0)

  // overriding to string method
  override def toString = n + "/" + d
}

new Rational(3,1)

// Test Require
//new Rational(3,0)


class Rational_v1(n: Int, d: Int){
  val num = n
  val den = d

  // this line will be placed in constructor
  println("Created " + num + "/" + den )

  require(den != 0)

  // overriding to string method
  override def toString = num + "/" + den

  def +(that : Rational_v1) : Rational_v1 =
    new Rational_v1(num * that.den + that.num  * den,
      den * that.den
    )
}

val threeByOne = new Rational_v1(3,1)
val fourByTwo = new Rational_v1(4,2)

threeByOne + fourByTwo

// Test Require
new Rational(3,0)
