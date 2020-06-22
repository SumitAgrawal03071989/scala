# Interview Questions.

## Explain Streams in Scala.
* In simple words, we define Stream as a Lazy list which evaluates the elements only when it needs to. This sort of lazy computation enhances the Performance of the program.
* e.g. Consider operation where we are transforming elements in list and then secting only 10 elements from list.
* when we write this set of operation as connected stream, then it does not scans complete list as it has to select any 10 elements.

## Advantages of Scala
* It is highly Scalable
	This means, scalable is meant in terms of flexibility and expressiveness. You can create your own control structures. E.g. the actors frameworks is a library, but it looks like it uses language features.
	This means that Scala will scale according to the needed abstraction, not necessarily in terms of "answering 1.000.000 requests in a second" 

* It is highly Maintainable and Productive
	As we have to read less code to express more.

* It facilitates Concurrent programming
* It is both Object-Oriented and Functional
* It has no Boilerplate code
* Singleton objects are a cleaner solution than Static
* Scala Arrays use regular Generics
-- Explanation to be done.
* Scala has Native Tuples and Concise code 
-- Example to be done.


## Operators
* Arithmetic Operators
	+ , - , * , / , %
* Relational Operators
	==, !=, >, <, >=, <=
* Logical Operators
	&&, ||, !
* Bitwise Operators
	AND (&), OR (|), NOT(!), XOR(^)
* Assignment Operators
```	=, +=, -=, *=, /=, %=, &=, ^=, |=```

## Explain the use of Tuples in Scala?
* Scala tuples combine a Finite number of items together so that the programmer can Pass a tuple around as a Whole. Unlike an Array or List, a tuple is Immutable and can hold objects with different Datatypes.

## Higher Order Functions with Example.
	* Reference: https://docs.scala-lang.org/tour/higher-order-functions.html#inner-main
	* Higher order functions take other functions as parameters or return a function as a result
	* This is possible because functions are first-class values in Scala
		What does it mean that we can use function as values, assign it to some values, pass it as parameter.
	* One of the most common examples is the higher-order function map which is available for collections in Scala.
	```
		val salaries = Seq(20000, 70000, 40000)
		val doubleSalary = (x: Int) => x * 2
		val newSalaries = salaries.map(doubleSalary) // List(40000, 140000, 80000)
	```

### Coercing methods into functions
	Method if passed as function, scala would automatically convert it to function, (see reference)
### Functions that accept functions
	Behaviour parameterization ( see reference )
### Functions that return functions
	URL Builder ( see reference )


## Scope of variables

* Fields:
Fields are variables declared inside an object and they can be accessed anywhere inside the program depending upon the access modifiers. Fields can be declared using var as well as val.

* Method Parameters:
Method parameters are strictly Immutable. Method parameters are mainly used to Pass values to the methods. These are accessed inside a method, but it is possible to access them from outside the method provided by a Reference.

* Local Variables:
Local variables are declared inside a method and they are accessible only inside the method. They can be accessed if you return them from the method.



## Closures in Scala.
References : 
1) https://medium.com/@senthil.nayagan/whats-are-closures-in-scala-eda698ced70c
2) https://www.tutorialspoint.com/scala/scala_closures.htm

A closure is a function, whose return value depends on the value of one or more variables declared outside this function.
```
val multiplier = (i:Int) => i * factor
```
here factor is not parameter of local variable.


## Traits
Refer Traits in Programming in Scala book. ( Add link to Notes : TBD )
Reference: https://docs.scala-lang.org/tour/traits.html#inner-main
Traits are used to share interfaces and fields between classes. They are similar to Java 8’s interfaces. Classes and objects can extend traits, but traits cannot be instantiated and therefore have no parameters.

## Inheritance and overriding
* All classes in Scala inherit from a super-class. When no super-class is specified, as in the Complex example of previous section, scala.AnyRef is implicitly used.
* It is possible to override methods inherited from a super-class in Scala. It is however mandatory to explicitly specify that a method overrides another one using the override modifier, in order to avoid accidental overriding. As an example, our Complex class can be augmented with a redefinition of the toString method inherited from Object.

```
class Complex(real: Double, imaginary: Double) {
  def re = real
  def im = imaginary
  override def toString() =
    "" + re + (if (im >= 0) "+" else "") + im + "i"
}
```

## Implicite parameters and conversions
* A method can have an implicit parameter list, marked by the implicit keyword at the start of the parameter list. If the parameters in that parameter list are not passed as usual, Scala will look if it can get an implicit value of the correct type, and if it can, pass it automatically.
Refer : https://docs.scala-lang.org/tour/implicit-parameters.html#inner-main 

Implecite parameters and conversion explained : https://stackoverflow.com/questions/2861501/can-someone-explain-me-implicit-conversions-in-scala



## Scala Lists
https://docs.scala-lang.org/overviews/scala-book/list-class.html#inner-main
( Also cover the list class from Programming in scala 4)

## Option / Some / None 
https://docs.scala-lang.org/overviews/scala-book/no-null-values.html#inner-main

## For Expression.
https://docs.scala-lang.org/overviews/scala-book/for-expressions.html#inner-main

## Java 8 vs Scala
https://www.infoq.com/articles/java-8-vs-scala/


## Tail-Recursion with Example.
	-- TBD
## Pattern matching.
* Extractor Objects: https://docs.scala-lang.org/tour/extractor-objects.html#inner-main
* case objects : https://docs.scala-lang.org/overviews/scala-book/case-objects.html#inner-main
* case classes : https://docs.scala-lang.org/overviews/scala-book/case-objects.html#inner-main
* Pattern Matching : https://docs.scala-lang.org/tour/pattern-matching.html#inner-main

	
## REPL 
Read - Evaluate - Print - Loop. 

## Currying / Function Currying, What it is, what are use cases.
https://medium.com/@kadirmalak/currying-in-scala-a-useful-example-bd0e3a44195


## Auxiliary constructors:
https://docs.scala-lang.org/overviews/scala-book/classes-aux-constructors.html#inner-main


## Covarient and Contravarient.
https://www.journaldev.com/9585/scala-variances-covariant-invariant-contravariant


## What is Null in Scala?
Null is a Type in Scala. It is available in Scala package as “scala. Null”.


## What is Scala “If..else”?
* Scala “If. Else” is an expression. We can be assigned it to a variable. For EG:
```
val year = if( count == 0) 2014 else 2015
```

## What Is Scala Anonymous Function?
In a source code, anonymous functions are called ‘function literals’ and at run time, function literals are instantiated into objects called function values.  Scala provides a relatively easy syntax for defining anonymous functions.



## Monad :
-- TBD 

## Lazy Vals:
https://stackoverflow.com/questions/7484928/what-does-a-lazy-val-do




#Collections questions.

##  What Are The Differences Between Array And Arraybuffer In Scala?
-- TBD


## Difference Between Array And List In Scala?
-- TBD

















