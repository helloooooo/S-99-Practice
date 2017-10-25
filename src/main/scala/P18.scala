/**
  * Created by Yomi on 2017/10/25.
  */
class P18 {
  def slice[T](n:Int,m:Int,l:List[T]):List[T] = l match {
    case x ::xs if n > 0 => slice(n -1,m-1,xs)
    case x :: xs if m > 0 => x ::slice(0,m -1 ,xs)
    case _ if n == 0 =>List[T]()
    case _ => sys.error("")
  }
}
