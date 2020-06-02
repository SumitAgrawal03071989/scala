# Chapter 32. Futures and Concurrency 

## Java Futures:
* Requires that you access the result via a blocking get method.
* You can call isDone to find out if a Java Future has completed before calling get, thereby avoiding any blocking
* You must wait until the Java Future has completed before proceeding with any computation that uses the result.

## Scala Futures:
* You can specify transformations on a Scala Future whether it has completed or not
* Each transformation results in a new Future representing the asynchronous result of the original Future transformed by the function.
* The thread that performs the computation is determined by an implicitly provided execution context.




