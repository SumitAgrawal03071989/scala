val a = List(1,2,3)

val b = 0 +: a
val b = List(-1, 0, 2, 4) ++: a


val a  = 3:: "a" :: Nil :: Nil :: Nil

a.foreach(println(_))
a.head
a.tail.head
a.tail.tail.head


val fruits = List("Apple","Orange","Chiku","Mango");
val List(p,q,r,s) = fruits

val p :: q :: rest = fruits

List(List(1, 2), List(3), List(), List(4, 5))

List(List(1,2) , List(List(List(3,4))))






