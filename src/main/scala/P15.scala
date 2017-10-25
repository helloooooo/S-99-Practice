class P15{
  def duplicateN[T](n:Int,l:List[T]):List[T] =  l match {
    case x :: xs => Nmap(x,n,Nil) ::: duplicateN(n,xs)
    case Nil => Nil
  }
    def Nmap[T](c:T,n:Int,sub:List[T]):List[T] = { n match {
      case 0 => sub
      case n  => Nmap(c,n-1,c::sub)
    }
    }
}
