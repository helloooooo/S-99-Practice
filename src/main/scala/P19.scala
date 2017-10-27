/**
  * Created by Yomi on 2017/10/26.
  */
class P19 {
  def rotate[T](n:Int,l:List[T]):List[T] = {
    def loop(m: Int, l: List[T], sub: List[T]):List[T] = m match {
      case m if m >0 => l match{
        case x :: xs => loop(m - 1, x :: l, xs)
        case Nil => loop(m, Nil, l.reverse)
      }
      case m if m < 0 => sub match{
        case x ::xs => loop(m + 1,xs,x ::sub )
        case Nil => Nil
      }
      case 0 => append(sub, l.reverse)
    }
    def append[T](a: List[T], b: List[T]): List[T] = a match {
      case Nil => b
      case x :: xs => x :: append(xs, b)
    }
    loop(n,l,Nil)
  }
}
