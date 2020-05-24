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


## SINGLETON OBJECTS

As mentioned in Chapter 1, one way in which Scala is more object-oriented than Java is that classes in Scala cannot have static members. Instead, Scala has singleton objects. A singleton object definition looks like a class definition, except instead of the keyword class you use the keyword object.

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







