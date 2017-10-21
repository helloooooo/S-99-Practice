object P05 {
  def reverse[T](l:List[T]):List[T] ={
    def go(l:List[T],sub:List[T]):List[T] = {
      l match {
        case x :: xs => go(xs,x::sub)
        case Nil => sub
      }
    }
    go(l,Nil)
  }
}
