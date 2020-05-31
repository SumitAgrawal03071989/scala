# Chapter 05. Basic Types and Operations

## 5.3 STRING INTERPOLATION

* s
```
  val name = "reader"
  println(s"Hello, $name!")
```

* raw
```
s"The answer\tis ${6 * 7}."
val res0: String = The answer	is 42.

raw"The answer \t is ${6 * 7}."
val res1: String = The answer \t is 42.
```

* f
The f string interpolator allows you to attach printf-style formatting instructions to embedded expressions. 

```
  scala> f"${math.Pi}%.5f"
  res1: String = 3.14159
```


## 5.4 OPERATORS ARE METHODS

Scala provides a rich set of operators for its basic types. As mentioned in previous chapters, these operators are actually just a nice syntax for ordinary method calls. For example, 1 + 2 really means the same thing as 1.+(2).

1		3 		13
/  + 	/	= 	/
3		4 		12



