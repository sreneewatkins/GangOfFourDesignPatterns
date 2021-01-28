# Java Design Patterns
### Creational Design Patterns

1. *Builder*: Builder design pattern is an alternative way to construct complex objects and should be used only when we want to build different types of immutable objects using same object building process.
2. *Prototype*: Prototype design pattern is used in scenarios where application needs to create a large number of instances of a class, which have almost same state or differ very little. |
3. *Factory*: Factory design pattern is most suitable when complex object creation steps are involved. To ensure that these steps are centralized and not exposed to composing classes. |
4. *Abstract factory*: Abstract factory pattern is used whenever we need another level of abstraction over a group of factories created using factory pattern. |
5. *Singleton*: Singleton enables an application to have one and only one instance of a class per JVM.

### Structural Design Patterns

1. *Adapter*: An adapter converts the interface of a class into another interface clients expect. It lets classes work together that couldn’t otherwise because of incompatible interfaces.
2. *Bridge*: Bridge design pattern is used to decouple a class into two parts – abstraction and its implementation – so that both can evolve in future without affecting each other. It increases the loose coupling between class abstraction and its implementation.
3. *Composite*: Composite design pattern helps to compose the objects into tree structures to represent whole-part hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.
4. *Decorator*: Decorator design pattern is used to add additional features or behaviors to a particular instance of a class, while not modifying the other instances of same class.
5. *Facade*: Facade design pattern provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.
6. *Flyweight*: Flyweight design pattern enables use sharing of objects to support large numbers of fine-grained objects efficiently. A flyweight is a shared object that can be used in multiple contexts simultaneously. The flyweight acts as an independent object in each context.
7. *Proxy*: One object approximates another.

### Behavioral Design Patterns

1. *Chain of responsibility*: Chain of responsibility design pattern gives more than one object an opportunity to handle a request by linking receiving objects together in form of a chain.
2. *Command*: Command design pattern is useful to abstract the business logic into discrete actions which we call commands. These command objects help in loose coupling between two classes where one class (invoker) shall call a method on other class (receiver) to perform a business operation.
3. *Iterator*: Iterator pattern provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
4. *Observer*: Observer pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically. It is also referred to as the publish-subscribe pattern.
5. *Strategy*: Strategy pattern is used where we choose a specific implementation of algorithm or task in run time – out of multiple other implementations for same task.
6. *Visitor*: Visitor pattern is used when we want a hierarchy of objects to modify their behavior but without modifying their source code.
7. *Interpreter*:
8. *Mediator*:
9. *Memento*:
10. *State*:
11. *Template Method*:
