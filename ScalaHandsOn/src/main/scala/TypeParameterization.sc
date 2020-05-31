class SlowAppendQueue[T](elems: List[T]) { // Not efficient
  def head = elems.head
  def tail = new SlowAppendQueue(elems.tail)
  def enqueue(x: T) = new SlowAppendQueue(elems ::: List(x))
  def showMe = elems.foreach(println(_))
}

class SlowHeadQueue[T](smele: List[T]) { // Not efficient
  // smele is elems reversed
  def head = smele.last
  def tail = new SlowHeadQueue(smele.init)
  def enqueue(x: T) = new SlowHeadQueue(x :: smele)
  def showMe = smele.foreach(println(_))
}



val slowAppendQueue = new SlowAppendQueue(List("A","B","C"))
slowAppendQueue.showMe

(slowAppendQueue enqueue "D").showMe


val slowHeadQueue = new SlowHeadQueue(List("A","B","C"))
(slowHeadQueue enqueue "D").showMe


val a = "D" :: List("A","B","C")
val b = List("A","B","C") :: List("D")



