package com.acme.basic;

public class HelloWorld {
  
  int i=1;
  int j=2;

  void sayHello() {
    System.out.println("Hello World!");
    System.out.println("addition:"+add(i,j));
  }

  void notCovered() {
    System.out.println("This method is not covered by unit tests");
  }
  int add(int i, int j){
    return i+j;
  }
}
