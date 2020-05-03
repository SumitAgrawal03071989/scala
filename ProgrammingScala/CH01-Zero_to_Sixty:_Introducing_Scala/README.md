# Chapter 1. Zero to Sixty: Introducing Scala

## A Taste of Scala


```
class Upper {
  def upper(strings: String*): Seq[String] = {
    strings.map((s:String) => s.toUpperCase())
  }
}

val up = new Upper
println(up.upper("Hello", "World!"))
```

In Scala, a class begins with the class keyword and the entire class body is inside the outermost curly braces ({…}). 
In fact, the body is also the primary constructor for the class. 
If we needed to pass arguments to this constructor, we would put an argument list after the class name, Upper.


Method definitions begin with the def keyword, followed by the method name and an optional argument list. 
Next comes an optional return type (it can be inferred in many cases), indicated by a colon and a type. 
Finally, an equals sign (=) separates the method signature from the method body.

The equals sign also emphasizes the principle in functional programming that values and functions are more closely aligned concepts. 
As we’ll see, functions are passed as arguments to other functions, returned from functions, and assigned to variables, just like with objects.

The method body calls the map method on the strings collection, which takes a function literal as an argument. 
Function literals are “anonymous” functions. 
In other languages, they are variously called lambdas, closures, blocks, or procs.

In this case, we passed in the following function literal:

```
(s:String) => s.toUpperCase()
```

It takes an argument list with a single String argument named s. The body of the function literal is after the “arrow,” =>. (UTF8 ⇒ is also allowed.) The body calls toUpperCase() on s. The result of this call is automatically returned by the function literal. 

In Scala, the last expression in a function or method is the return value.

```
# Second Version of above code
object Upper {
  def upper(strings: String*) = strings.map(_.toUpperCase())
}

println(Upper.upper("Hello", "World!"))
```

On the first line, Upper is now declared as an object, which is a singleton
Scala can usually infer the return type of the method, but not the types of the method arguments, so we drop the explicit declaration
Also, because there is only one expression in the method body, we can drop the braces and put the entire method definition on one line.

Note: 1) Here for argument of method, type can not be infer by scala, 2) return type can be infered with exception in recursive functions.

The map method takes a single function argument, where the function itself takes a single argument. In this case, the function body only uses the argument once, so we can use the “placeholder” indicator _ instead of a named parameter. That is, the _ acts like an anonymous variable,

On the last line, using an object rather than a class simplifies the invocation. Instead of creating an instance with new Upper, we can just call the upper method on the Upper object directly. This is the same syntax you would use when calling static methods in a Java class.


Let’s do one more refactoring; convert the script into a compiled, command-line tool.









