/**
  * Created by Yomi on 2017/10/22.
  */
class P09{
  def pack[T](l:List[T]):List[List[T]] = {
    def check[T](key:T,l: List[T],sub:List[T]):List[List[T]] = {
      l match {
        case x :: xs if x == key =>check(key,xs,key::sub)
        case x :: xs => (key :: sub):: check(x,xs,Nil)
        case Nil => (key ::sub):: Nil
      }
    }

    l match {
      case x :: xs  => check(x,xs,Nil)
      case  Nil => Nil
    }
  }
}