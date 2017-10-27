/**
  * Created by Yomi on 2017/10/27.
  */
class P20 {
  def removeAt[T](n:Int,l:List[T]):(List[T],T)= {
    l match {
      case x :: xs if n == 0 => (xs,x)
      case x:: xs if n >0 => removeAt(n -1 ,xs) match {
        case  (ys,y) => (x :: ys, y)
      }
      case _ => sys.error("")
    }
    }
}
