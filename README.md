##Object Oriented Design Principles

ObjectAid is a great in IDE UML diagrammer
It allows you to simply copy and paste your class files in the IDE
into the UML file and it generates the UML Diagram for you.
https://objectaid.com/home

### SOLID
####[S]ingle Responsibility Principle (SRP)
 -- A class should have one and only one responsibility and it should encapsulate that responsibility completely.
 Only changes to one part of the software's specification should be able to affect the specification of the class.
####[O]pen Closed Principle (OCP)
-- Classes should be Open for Extension and Closed for Modification - that is, a class should allow its behavior to be
extended without modifying its own source code.
####[L]iskov Substitution Principle (LSP)
-- Objects in a program should be replaceable with instances of their subtypes without altering the correctness 
    of that program. See also design by contract.
####[I]nterface segregation principle (ISP)
--  Many client-specific interfaces are better than one general-purpose interface. 
Clients should not depend on an interface with a bunch of methods they don't use.
####[D]ependency Inversion Principle (DIP)
-- High Level Modules should NOT depend on Low Level Modules. All Modules should depend on Abstraction.
 Abstractions should not depend upon details. Details should depend upon abstractions.
Abstract Classes and Interfaces don't change as often as concrete derivatives and this is a good thing!