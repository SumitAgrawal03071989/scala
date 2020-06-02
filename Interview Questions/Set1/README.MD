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






## Tail-Recursion with Example.
	-- TBD
## Pattern matching.
	-- TBD
## REPL 
Read - Evaluate - Print - Loop. 

## Currying / Function Currying, What it is, what are use cases.

## What is App in Scala, Why we need it, Use cases.






