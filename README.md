# scala

# Why Scala 

1) Compatible, We can extend functionality writtern in java with scala.
2) Statically Typed
```
* A language is statically typed if the type of a variable is known at compile time. 
* For some languages this means that you as the programmer must specify what type each variable is (e.g.: Java, C, C++); 
* other languages offer some form of type inference, the capability of the type system to deduce the type of a variable (e.g.: OCaml, Haskell, Scala, Kotlin)
```



# Chapter 06 Functional Objects.
Rational Object, 3/2 
Rational numbers are mathematically more natural than floating point numbers as it does not have round off.

## IMMUTABLE OBJECT TRADE-OFFS

```
Advantages.
* State does not change over time
* Immutable objects can be passed very feely, for mulatble object while passign a copy needs to be maintained.
* Thread Safe, 
* Good to use as Hash Keys

Disadvantage
* Sometimes require that a large object graph be copied, whereas an update could be done in its place. 
```

```
We can name method add as + and its not operator overloading in scala, because + is not operator in scala.
```

## IMPLICIT CONVERSIONS
```
With overloading + operator we can achive 2/3 (Rational object) + 4 (Integer number).
But 4 + 2/3 would result into compilation error as Interger does not have any method that adds Rational number.
This is when implicite comes into picture.

implicit def intToRational(x: Int) = new Rational(x);

When we get this method in scope int to rational will happen automatically.
```

# Chapter 07 Built-in Control Structures
```
* if,while, for, try, match, and function calls
* almost all of Scala's control structures result in some value.

```
```
Example of if control structure 
val filename =
 if (!args.isEmpty) args(0)
 else "default.txt"
```

```
* Whie loop, Just as Java.
* Do while loop, Just as Java.
* Unit is equivalent to void.
* In scala assignment would yield unit value, hence ``` while ((line = readLine()) != "")``` does not work.
* While loop is present in scala becuse sometimes its more readable with imperative style.
* One should try replacing while loop with recursion
```

```
Match Expression
This is just like java's switch.

Difference between match and Java's Switch.

1) Match can work with any constanct type, Its not limited to int, string and enum as Javas Switch.
2) Break is not needed in match, this behaviour is imlicite.
3) Match Expression results in value where as Javas switch does not.

```

```
Continue and Break are not present in scala.
```


# Chapter 8, Functions and Closures

```
* Scala sopports methods, Method is nothing but function associated with some object
* In Scala,  you can define functions inside other functions. Just like local variables, such local functions are visible only in their enclosing block

 def processFile(filename: String, width: Int) = {

 	def processLine(filename: String,
 	width: Int, line: String) = {

		 if (line.length > width)
		 println(filename + ": " + line.trim)
		 }

		 val source = Source.fromFile(filename)
		 for (line <- source.getLines()) {
		 processLine(filename, width, line)
 	}
 }

* Inner function can access variables which are in scope of outer function
* So in above case width and filename are already visible in ProcessLine

```

## FIRST-CLASS FUNCTIONS






