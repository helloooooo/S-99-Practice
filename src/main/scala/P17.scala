/**
  * Created by Yomi on 2017/10/25.
  */
class P17 {
  def split[T](n:Int,l:List[T]):(List[T],List[T]) = l match{
    case xs if n ==0 => (List[T](),xs)
    case x :: xs if n > 0 => split(n-1,xs) match {
      case (a,b) => (x ::a ,b)
      case _ => sys.error("")
    }
  }
}
