# Chapter 04. Classes and Objects

## CLASSES, FIELDS, AND METHODS

```
  class ChecksumAccumulator {
    // class definition goes here
  }

  new ChecksumAccumulator
```

val test = new ChecksumAccumulator will create new instance of class ChecksumAccumulator and assign it to test.
you can not assign new instance to val test as its immutable.
test is immutable, but object to which its pointing is mutable.

```
 class ChecksumAccumulator {
    private var sum = 0
  }
```
* Given this definition of ChecksumAccumulator, any attempt to access sum from the outside of the class would fail:
* The way you make members public in Scala is by not explicitly specifying any access modifier. Put another way, where you'd say "public" in Java, you simply say nothing in Scala. Public is Scala's default access level.
* 


```
  def add(b: Byte): Unit = {
    b = 1     // This won't compile, because b is a val
    sum += b
  }
```
* One important characteristic of method parameters in Scala is that they are vals, not vars.[1] If you attempt to reassign a parameter inside a method in Scala, therefore, it won't compile:

## return 
The recommended style for methods is in fact to avoid having explicit, and especially multiple, return statements. 
Instead, think of each method as an expression that yields one value, which is returned. This philosophy will encourage you to make methods quite small, to factor larger methods into multiple smaller ones. 
On the other hand, design choices depend on the design context, and Scala makes it easy to write methods that have multiple, explicit returns if that's what you desire.

* Its good to speify retrun type of method even if scala comiler can infer it, this will help readability.
* Methods with a result type of Unit, such as ChecksumAccumulator's add method, are executed for their side effects. A side effect is generally defined as mutating state somewhere external to the method or performing an I/O action. 
* A method that is executed only for its side effects is known as a procedure.


## 4.2 SEMICOLON INFERENCE
* no need to specify semicolon at end of each statement, scala will infer it automatically
* sometimes scala will split the statemnet x + y 
as 
```
x+
y 
```
this will not yield correct result, to avoid this spcify it as ( x+y) or put infix operator like + at end of line.

```
x+
y+ 
z
```








## SINGLETON OBJECTS

As mentioned in Chapter 1, one way in which Scala is more object-oriented than Java is that classes in **Scala cannot have static members.** Instead, Scala has singleton objects. A singleton object definition looks like a class definition, except instead of the keyword class you use the keyword object.

The singleton object in this figure is named ChecksumAccumulator, the same name as the class in the previous example. When a singleton object shares the same name with a class, it is called that class's companion object. You must define both the class and its companion object in the same source file.

A class and its companion object can access each other's private members.


```
    // In file ChecksumAccumulator.scala
    import scala.collection.mutable
  
    object ChecksumAccumulator {
  
      private val cache = mutable.Map.empty[String, Int]
  
      def calculate(s: String): Int = 
        if (cache.contains(s))
          cache(s)
        else {
          val acc = new ChecksumAccumulator
          for (c <- s)
            acc.add(c.toByte)
          val cs = acc.checksum()
          cache += (s -> cs)
          cs
        }
    }
```


One difference between classes and singleton objects is that singleton objects cannot take parameters, whereas classes can. Because you can't instantiate a singleton object with the new keyword, you have no way to pass parameters to it. Each singleton object is implemented as an instance of a synthetic class referenced from a static variable, so they have the same initialization semantics as Java statics.[4] In particular, a singleton object is initialized the first time some code accesses it.


A singleton object that does not share the same name with a companion class is called a standalone object. You can use standalone objects for many purposes, including collecting related utility methods together or defining an entry point to a Scala application. This use case is shown in the next section.







