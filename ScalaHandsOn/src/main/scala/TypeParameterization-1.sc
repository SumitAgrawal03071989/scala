class Queue[T]  private (
                private val leading: List[T],
                private val trailing: List[T]
              ) {
  def this(elems: T*) = this(elems.toList, Nil)

  private def mirror =
    if (leading.isEmpty)
      new Queue(trailing.reverse, Nil)
    else
      this

  def head = mirror.leading.head

  def tail = {
    val q = mirror
    new Queue(q.leading.tail, q.trailing)
  }

  def enqueue(x: T) =
    new Queue(leading, x :: trailing)

  def showleadingMe = leading.foreach(println(_))
  def showTrailingMe = trailing.foreach(println(_))

}

object Queue {
  // constructs a queue with initial elements `xs'
  def apply[T](xs: T*) = new Queue[T](xs.toList, Nil)
}



val testQ  = new Queue[String]( "A1")

//val testQ = new Queue[String]()
val testQ1 = testQ enqueue "A"
val testQ2 = testQ1 enqueue "B"


var testq1  = testQ2 enqueue "C"

println("Printing Leading " + testq1.showleadingMe)
println("Printing Trailing " + testq1.showTrailingMe)
testq1.head
println("Printing Leading " + testq1.showleadingMe)
println("Printing Trailing " + testq1.showTrailingMe)


Queue("TestA")

def doesNotCompile(q: Queue) = {}








