object P08 {
  def comperess[T](l:List[T]):List[T] ={
    def check(validation:T,rest:List[T]):List[T] = rest match {
        case x :: xs if validation == x  => check(validation,xs)
        case x :: xs => validation::check(x,xs)
        case Nil => validation::Nil
      }
      l match {
        case x :: xs => check(x,xs)
        case Nil => Nil
      }
  }
}
