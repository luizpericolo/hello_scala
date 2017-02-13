
object Fibonacci extends App {
  // fib(0) = 1
  // fib(1) = 1
  // fib(n) = fib(n - 1) + fib(n - 2)
  def fib(n: Int): Int = {
    if (n == 0) return 1
    if (n == 1) return 1
    fib(n-1) + fib(n-2)
  }


  def fib2(n:Int)={
    n match{
      case 0 => 1
      case 1 => 1
      case _ => fib(n-1) + fib(n-2)
    }
  }

  def fibTR(n: Int) = {
    def fibAcc(n: Int, a: Int, b: Int):Int =
      n match {
        case 0 => b
        case _ => fibAcc(n - 1, b, a + b)
      }
    fibAcc(n, 0, 1)
  }


  assert(1==fib2(0))
  assert(1==fib2(1))
  assert(2==fib2(2))

  assert(3==fibTR(3))
}

