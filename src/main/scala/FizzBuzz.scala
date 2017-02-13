
object FizzBuzz extends App {

  // n multiplo de 3 => print fizz
  // n multiplo de 5 => print buzz
  // n multiplo de 15 => print fizz buzz
  def fizzBuzz(n: Int) = {
    var s: String = ""
    if (n % 3 == 0) s = "fizz"
    if (n % 5 == 0) s = "buzz"
    if (n % 15 == 0) s = "fizz buzz"
    s
  }

  def fizzBuzzMatch(n: Int) = {
    n match {
      case x:Int if x % 15 == 0 => "fizz buzz"
      case x:Int if x % 5 == 0 => "buzz"
      case x:Int if x % 3 == 0 => "fizz"
      case _ => ""
    }
  }

  assert("fizz" == fizzBuzzMatch(3))
  assert("buzz" == fizzBuzzMatch(5))
  assert("fizz buzz" == fizzBuzzMatch(15))
  assert("" == fizzBuzzMatch(7))
}