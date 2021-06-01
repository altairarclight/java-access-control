# java-access-control
Testing repo for different access controls in Java. Access controls include `public`, `protected`, `private` and `no modifier`.

## What is this?
There are two packages, `a` and `b`. Within package `a`, there are two classes, one containing a public-access class and the containing a package-access class. Different access controls have been set for the methods of both classes. For each package, there is a tester class that tests the accessiblity of the classes / methods in package `a`.

## Why is this here?
For clarity on how access control works in Java.

## Running the Program
The program does not compile, which is anticipated from the cases that violate Java access control.
```
a/PackageTester.java:37: error: cannot find symbol
      myClass4.privateCall();
              ^
  symbol:   method privateCall()
  location: variable myClass4 of type PublicClassDecendent
b/PublicTester.java:17: error: PackageRestrictedClass is not public in a; cannot be accessed from outside package
    a.PackageRestrictedClass myClass = null;
     ^
b/PublicTester.java:34: error: noModifierCall() is not public in PublicClass; cannot be accessed from outside package
      myClass2.noModifierCall();
              ^
b/PublicTester.java:44: error: cannot find symbol
      myClass4.privateCall();
              ^
  symbol:   method privateCall()
  location: variable myClass4 of type PublicClassDecendent
b/PublicTester.java:52: error: PackageRestrictedClass is not public in a; cannot be accessed from outside package
      myClass = new a.PackageRestrictedClass();
                     ^
5 errors
```
