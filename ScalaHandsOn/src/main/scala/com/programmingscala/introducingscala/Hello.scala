package com.programmingscala.introducingscala

object Hello extends App {
  if (args.size == 0)
    println("Hello, you")
  else
    println("Hello, " + args(0))
}