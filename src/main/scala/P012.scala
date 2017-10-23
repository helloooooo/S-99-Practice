/**
  * Created by Yomi on 2017/10/22.
  */
class P012 {
  def decode[T](l:List[(Int,T)]):List[T] = {
    def loop[T](l:List[(Int,T)],sub:List[T]):List[T] = {
      l match {
        case x :: xs => loop(xs,mapping(x, sub))
        case Nil => sub.reverse
      }
    }
    loop(l,Nil)
  }
  def mapping[T](m:(Int,T),s:List[T]):List[T] =  {
    m._1 match {
      case 0 => s
      case n => mapping((m._1 -1,m._2),m._2 :: s)
    }
  }
}
