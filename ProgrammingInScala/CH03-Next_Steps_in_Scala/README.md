# Chapter 03. Next Steps in Scala

##  PARAMETERIZE ARRAYS WITH TYPES

When you instantiate an object in Scala, you can parameterize it with values and types

```
 val big = new java.math.BigInteger("12345")
```

You parameterize an instance with types by specifying one or more types in square brackets

```
    val greetStrings = new Array[String](3)
  
    greetStrings(0) = "Hello"
    greetStrings(1) = ", "
    greetStrings(2) = "world!\n"
  
    for (i <- 0 to 2)
      print(greetStrings(i))
```

Arrays in Scala are accessed by placing the index inside parentheses, not square brackets as in Java. Thus the zeroth element of the array is greetStrings(0), not greetStrings[0].

These three lines of code illustrate an important concept to understand about Scala concerning the meaning of val. When you define a variable with val, the variable can't be reassigned, but the object to which it refers could potentially still be changed.

Scala doesn't technically have operator overloading, because it doesn't actually have operators in the traditional sense. 
Instead, characters such as +, -, *  and / can be used in method names.
Thus, when you typed 1 + 2 into the Scala interpreter in Step 1, you were actually invoking a method named + on the Int object 1, passing in 2 as a parameter. As illustrated in Figure 3.1, you could alternatively have written 1 + 2 using traditional method invocation syntax, (1).+(2).

Another important idea illustrated by this example will give you insight into why arrays are accessed with parentheses in Scala. Scala has fewer special cases than Java. Arrays are simply instances of classes like any other class in Scala. When you apply parentheses surrounding one or more values to a variable, Scala will transform the code into an invocation of a method named apply on that variable. So greetStrings(i) gets transformed into greetStrings.apply(i). Thus accessing an element of an array in Scala is simply a method call like any other. This principle is not restricted to arrays: any application of an object to some arguments in parentheses will be transformed to an apply method call. Of course this will compile only if that type of object actually defines an apply method. So it's not a special case; it's a general rule.


Similarly, when an assignment is made to a variable to which parentheses and one or more arguments have been applied, the compiler will transform that into an invocation of an update method that takes the arguments in parentheses as well as the object to the right of the equals sign. For example:

```
 greetStrings(0) = "Hello" 
 # will be transformed into:
 greetStrings.update(0, "Hello")
```

```
  val numNames = Array("zero", "one", "two")
  val numNames2 = Array.apply("zero", "one", "two")
```

## USE LISTS

One of the big ideas of the functional style of programming is that methods should not have side effects. A method's only act should be to compute and return a value. Some benefits gained when you take this approach are that methods become less entangled, and therefore more reliable and reusable. Another benefit (in a statically typed language) is that everything that goes into and out of a method is checked by a type checker, so logic errors are more likely to manifest themselves as type errors. Applying this functional philosophy to the world of objects means making objects immutable.

For an immutable sequence of objects that share the same type you can use Scala's List class. As with arrays, a List[String] contains only strings. Scala's List, scala.List, differs from Java's java.util.List type in that Scala Lists are always immutable (whereas Java Lists can be mutable). More generally, Scala's List is designed to enable a functional style of programming. Creating a list is easy, and Listing 3.3 shows how:


```
  val oneTwo = List(1, 2)
  val threeFour = List(3, 4)
  val oneTwoThreeFour = oneTwo ::: threeFour
  println(oneTwo + " and " + threeFour + " were not mutated.")
  println("Thus, " + oneTwoThreeFour + " is a new list.")

```


```
  val twoThree = List(2, 3)
  val oneTwoThree = 1 :: twoThree
  println(oneTwoThree)

In the expression "1 :: twoThree", :: is a method of its right operand, the list, twoThree. You might suspect there's something amiss with the associativity of the :: method, but it is actually a simple rule to remember: If a method is used in operator notation, such as a * b, the method is invoked on the left operand, as in a.*(b)—unless the method name ends in a colon. If the method name ends in a colon, the method is invoked on the right operand. Therefore, in 1 :: twoThree, the :: method is invoked on twoThree, passing in 1, like this: twoThree.::(1). Operator associativity will be described in more detail in Section 5.9.
```

## WHY NOT APPEND TO LISTS?

Class List does offer an "append" operation—it's written :+ and is explained in Chapter 24—but this operation is rarely used, because the time it takes to append to a list grows linearly with the size of the list, whereas prepending with :: takes constant time. If you want to build a list efficiently by appending elements, you can prepend them and when you're done call reverse. Or you can use a ListBuffer, a mutable list that does offer an append operation, and when you're done call toList. ListBuffer will be described in Section 22.2.


## USE TUPLES

Another useful container object is the tuple. Like lists, tuples are immutable, but unlike lists, tuples can contain different types of elements. Whereas a list might be a List[Int] or a List[String],

Tuples are very useful, for example, if you need to return multiple objects from a method. Whereas in Java you would often create a JavaBean-like class to hold the multiple return values, in Scala you can simply return a tuple. And it is simple: To instantiate a new tuple that holds some objects, just place the objects in parentheses, separated by commas. Once you have a tuple instantiated, you can access its elements individually with a dot, underscore, and the one-based index of the element.

```
   val pair = (99, "Luftballons")
    println(pair._1)
    println(pair._2)s

    You may be wondering why you can't access the elements of a tuple like the elements of a list, for example, with "pair(0)". The reason is that a list's apply method always returns the same type, but each element of a tuple may be a different type: _1 can have one result type, _2 another, and so on. These _N numbers are one-based, instead of zero-based, because starting with 1 is a tradition set by other languages with statically typed tuples, such as Haskell and ML.
```

## USE SETS AND MAPS

Because Scala aims to help you take advantage of both functional and imperative styles, its collections libraries make a point to differentiate between mutable and immutable collections. For example, arrays are always mutable; lists are always immutable. Scala also provides mutable and immutable alternatives for sets and maps, but uses the same simple names for both versions. For sets and maps, Scala models mutability in the class hierarchy.

```
 var jetSet = Set("Boeing", "Airbus")
    jetSet += "Lear"
    println(jetSet.contains("Cessna"))
```

in the second line of above code, you reassign the jetSet var with a new set containing "Boeing", "Airbus", and "Lear".


As with sets, Scala provides mutable and immutable versions of Map, using a class hierarchy. 

```
    import scala.collection.mutable
  
    val treasureMap = mutable.Map[Int, String]()
    treasureMap += (1 -> "Go to island.")
    treasureMap += (2 -> "Find big X on ground.")
    treasureMap += (3 -> "Dig.")
    println(treasureMap(2))
```

For example, Listing 3.7 shows a mutable map in action. On the first line of Listing 3.7, you import the mutable Map. You then define a val named treasureMap, and initialize it with an empty mutable Map that has integer keys and string values. The map is empty because you pass nothing to the factory method (the parentheses in "Map[Int, String]()" are empty).[7] On the next three lines you add key/value pairs to the map using the -> and += methods. As illustrated previously, the Scala compiler transforms a binary operation expression like 1 -> "Go to island." into (1).->("Go to island."). Thus, when you say 1 -> "Go to island.", you are actually calling a method named -> on an integer with the value 1, passing in a string with the value "Go to island." This -> method, which you can invoke on any object in a Scala program, returns a two-element tuple containing the key and value.[8] You then pass this tuple to the += method of the map object to which treasureMap refers. Finally, the last line prints the value that corresponds to the key 2 in the treasureMap.


##  LEARN TO RECOGNIZE THE FUNCTIONAL STYLE
Prefer vals, immutable objects, and methods without side effects. Reach for them first. Use vars, mutable objects, and methods with side effects when you have a specific need and justification for them.


















