
class P07 {
  def flatten(l:List[Any]):List[Any] = l match{
    case (x:List[_]) :: xs => flatten(x) :: flatten(xs)
    case  x :: xs => x :: flatten(xs)
    case Nil => Nil
  }

}
