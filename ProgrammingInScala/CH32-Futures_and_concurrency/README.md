# Chapter 32. Futures and Concurrency 

## Java Futures:
* Requires that you access the result via a blocking get method.
* You can call isDone to find out if a Java Future has completed before calling get, thereby avoiding any blocking
* You must wait until the Java Future has completed before proceeding with any computation that uses the result.




