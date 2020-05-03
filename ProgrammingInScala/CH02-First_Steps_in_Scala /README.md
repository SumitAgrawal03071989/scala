# Chapter 02 First Steps in Scala

## Define some variables
Scala has two kinds of variables, vals and vars. A val is similar to a final variable in Java. Once initialized, a val can never be reassigned. A var, by contrast, is similar to a non-final variable in Java. A var can be reassigned throughout its lifetime. Here's a val definition:

```
  scala> val msg = "Hello, world!"
  msg: String = Hello, world!
```

This example illustrates type inference, Scala's ability to figure out types you leave off.
* Sometimes its helpful to declare type externally, for such cases

```
  scala> val msg3: String = "Hello yet again, world!"
  msg3: String = Hello yet again, world!
```

## Define some functions

```
def max(x: Int, y: Int): Int = {
   if (x > y) x
   else y
 }
```

Function definitions start with def
max is name of function 
2 parameters to functions, specifying type is necessary here as Scala compiler does not infer type if function arguments.
:Int before = sign is return type Its optional to specify except recursive functions.

```
def great() = print("This is test")
```

This function does not take any argument and does not return anything void, it referes as Unit in scala

## LOOP WITH WHILE; DECIDE WITH IF

```
  var i = 0;
  while (i < args.length) {
    if (i != 0) {
      print(" ");
    }
    print(args(i));
    i += 1;
  }
  println();
```

## ITERATE WITH FOREACH AND FOR

While look in previous example is programmed in "imperative style" ( you give one imperative command at a time, iterate with loops, and often mutate state shared between different functions ) 
In scala you will do more programming in "functional style"

```
  args.foreach(arg => println(arg))
```
In this code, you call the foreach method on args and pass in a function. In this case, you're passing in a function literal that takes one parameter named arg. The body of the function is println(arg).
In the previous example, the Scala interpreter infers the type of arg to be String, since String is the element type of the array on which you're calling foreach.

If a function literal consists of one statement that takes a single argument, you need not explicitly name and specify the argument.[10] Thus, the following code also works:

```
  args.foreach(println)
```








