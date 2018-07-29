package scala_99_problems

object penultimateElement {
  def findPenultiMateElement[A](ls:List[A]): A = ls match {
    case h :: _ :: Nil => h
    case h :: tail => findPenultiMateElement(tail)
    case _ => throw new NoSuchElementException
  }
  def main(args:Array[String]): Unit={
    print("Second Last Element " + findPenultiMateElement(List(1,2,3,4,5)))
  }
}
