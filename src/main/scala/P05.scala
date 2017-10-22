class P05 {
  def reverse[T](l:List[T]):List[T] = {
    def go[T](l:List[T],sub:List[T]):List[T] = l match {
      case Nil => sub
      case x :: xs => go(xs, x:: sub)
      case _  => sys.error("plaease input List with Any type")
    }
    go(l,Nil)
  }
}


