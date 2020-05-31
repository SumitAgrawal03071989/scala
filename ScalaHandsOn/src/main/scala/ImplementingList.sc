abstract class Fruit
class Apple extends Fruit
class Orange extends Fruit

val apples = new Apple :: Nil
val fruits = new Orange :: apples

apples.foreach(print(_))

Set('a', 'b', 'c')('c')