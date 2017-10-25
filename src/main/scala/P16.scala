/**
  * Created by Yomi on 2017/10/25.
  */
class P16 {
  def drop[T](n:Int,l:List[T]):List[T] = {
    def loop(m:Int,l:List[T]):List[T] = { l match {
      case x :: xs  if m == 1 => loop(n,xs)
      case x :: xs  if m > 1 => x :: loop(m-1,xs)
      case Nil => List[T]()
    }
    }
    if (n > 0) loop(n,l) else sys.error("")
  }
}
