package scala_99_problems

object kthElementOfList {
  def getKthElementOfList[A](n:Int, ls:List[A]): A = (n, ls) match {
    case (0, h::_) => h
    case (n, h::tail) => getKthElementOfList(n-1, tail)
      case( _, Nil) => throw new NoSuchElementException
  }

  def main(args:Array[String]): Unit={
    val n = 4
    val list = List(1,2,3,4,5)
    print("The "+n+" Element of list is "+ getKthElementOfList(n,list))
  }
}
