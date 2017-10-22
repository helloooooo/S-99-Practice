/**
  * Created by Yomi on 2017/10/22.
  */
class P10 {
  def encode[T](l:List[T]):List[(Int,T)] = {
    def loop[T](l:List[List[T]],sub:List[(Int,T)]):List[(Int,T)] = {
      val p4 = new P04()
      l match {
        case x :: xs => loop(xs, (p4.length(x), x.head) :: sub)
        case Nil => sub
      }
    }
    val p9 = new P09()
    loop(p9.pack(l),Nil).reverse
  }
}
