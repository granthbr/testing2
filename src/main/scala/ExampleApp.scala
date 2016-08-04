/**
  * Created by BGRANTHAM on 7/24/16.
  */
object ExampleApp extends App{
  println("testing scala")
  def fib(n: Int): Int = {
    var a = 0
    var b = 1
    var i = 0
    while (i < n) {
      val prev_a = a
      a = b
      b = prev_a + b
      i = i + 1
    }
    a
   }
  def fibFunctional(n: Int): Int = {
    def fibIter(i: Int, a: Int, b: Int): Int =
      if(i==n) a else fibIter(i+1, b, a+b)
    fibIter(0,0,1)

  }
  println(fib(9))
  println(fibFunctional(9))
}
