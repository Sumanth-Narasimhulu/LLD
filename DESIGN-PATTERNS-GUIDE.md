# Design Patterns Guide

A comprehensive overview of all design patterns implemented in this repository with simple definitions and practical examples.

---

## Table of Contents

- [Behavioral Design Patterns](#behavioral-design-patterns)
- [Creational Design Patterns](#creational-design-patterns)
- [Structural Design Patterns](#structural-design-patterns)

---

## Behavioral Design Patterns

Behavioral patterns focus on communication between objects, defining how they interact and distribute responsibilities.

### 1. Chain of Responsibility Pattern

**Definition:** Passes a request along a chain of handlers where each handler decides whether to process it or pass it to the next handler.

**Example - Leave Request System:**

- Multiple approval levels: Supervisor → Manager → Director → HR
- Each approver handles leave requests based on duration
- If one can't approve, it automatically forwards to the next level
- Decouples request sender from receivers

---

### 2. Command Pattern

**Definition:** Encapsulates a request as an object, allowing you to parameterize clients with different requests and support undoable operations.

**Example - Remote Control for Lights:**

- Remote control can execute different commands (turn on/off light)
- Commands are objects that can be stored, queued, or logged
- Light operations are decoupled from the remote control
- Easy to add new commands without modifying existing code

---

### 3. Iterator Pattern

**Definition:** Provides a way to access elements of a collection sequentially without exposing its underlying representation.

**Example - Playlist with Different Iterators:**

- PlayList manages a collection of songs
- SimpleIterator: Iterates through all songs
- FavouriteIterator: Iterates only through favorite songs
- Client code doesn't need to know the internal structure of the playlist
- Different iteration strategies without changing the collection

---

### 4. Observer Pattern

**Definition:** Defines a one-to-many dependency where when one object changes state, all its dependents are notified automatically.

**Example - YouTube Channel Subscription System:**

- YouTube channel (Subject) maintains list of subscribers
- Subscribers (Observers) get notified when new content is uploaded
- Loose coupling between channel and subscribers
- Easy to add or remove subscribers dynamically

---

### 5. State Pattern

**Definition:** Allows an object to change its behavior when its internal state changes, appearing as if the object changed its class.

**Example - Traffic Light System:**

- Traffic light changes behavior based on current state (Red, Orange, Yellow)
- Each state defines its own behavior
- State transitions are encapsulated within state objects
- Clean alternative to large conditional statements

---

### 6. Strategy Pattern

**Definition:** Defines a family of algorithms, encapsulates each one, and makes them interchangeable at runtime.

**Example - Payment Processing System:**

- Multiple payment methods: Credit Card, Phone Payment, Crypto
- Payment processor can switch between strategies at runtime
- Each payment method implements the same interface
- Easy to add new payment methods without modifying existing code

---

### 7. Template Method Pattern

**Definition:** Defines the skeleton of an algorithm in a base class, letting subclasses override specific steps without changing the algorithm's structure.

**Example - Authentication System:**

- Base LoginTemplate defines the login flow structure
- PasswordLogin and OTPLogin implement specific authentication methods
- Common steps (validation, session creation) are reused
- Specific steps (verify credentials) are customized by subclasses

---

## Creational Design Patterns

Creational patterns deal with object creation mechanisms, trying to create objects in a manner suitable to the situation.

### 1. Singleton Pattern

**Definition:** Ensures a class has only one instance and provides a global point of access to it.

**Example - Logger System:**

- Single Logger instance shared across multiple threads
- Thread-safe implementation to prevent multiple instances
- Global access point for logging throughout the application
- Controlled access to shared resources

---

### 2. Factory Pattern

**Definition:** Provides an interface for creating objects without specifying their exact classes, delegating instantiation to subclasses or factory methods.

**Example - Vehicle Creation:**

- VehicleFactory creates different types of vehicles (Car, Truck)
- Client doesn't need to know the concrete classes
- Object creation logic is centralized
- Easy to extend with new vehicle types

---

### 3. Abstract Factory Pattern

**Definition:** Provides an interface for creating families of related objects without specifying their concrete classes.

**Example - Vehicle Brand Factories:**

- Different factories for different brands: BMW, Honda, Suzuki
- Each factory creates vehicles specific to that brand
- Ensures related objects (from same brand) are created together
- Encapsulates object creation for entire product families

---

### 4. Builder Pattern

**Definition:** Separates the construction of a complex object from its representation, allowing step-by-step creation with different configurations.

**Example - Car Configuration:**

- CarBuilder allows creating cars with different specifications
- Step-by-step configuration: color, wheels, seats, airbags, power steering
- Same construction process can create different representations
- Produces immutable objects with fluent interface

---

### 5. Prototype Pattern

**Definition:** Creates new objects by copying existing objects (prototypes) rather than creating from scratch.

**Example - ID Card Cloning:**

- Master ID card template with company details
- Clone master card and customize employee-specific details
- Avoids expensive initialization of common properties
- Reduces object creation overhead

---

## Structural Design Patterns

Structural patterns deal with object composition, creating relationships between objects to form larger structures.

### 1. Adapter Pattern

**Definition:** Converts the interface of a class into another interface clients expect, allowing incompatible interfaces to work together.

**Example - SMS Notification System:**

- TwilioSMS has incompatible interface with NotificationService
- TwilioSMSAdapter translates between the two interfaces
- Allows third-party libraries to work with existing code
- Acts as a bridge between incompatible interfaces

---

### 2. Decorator Pattern

**Definition:** Attaches additional responsibilities to an object dynamically, providing a flexible alternative to subclassing for extending functionality.

**Example - Coffee Customization:**

- Start with SimpleCoffee
- Dynamically add decorators: Milk, Sugar
- Each decorator adds behavior and wraps the original object
- Price and description are calculated dynamically
- Can stack multiple decorators without modifying base class

---

### 3. Facade Pattern

**Definition:** Provides a simplified, unified interface to a complex subsystem, making it easier to use.

**Example - Authentication System:**

- AuthFacade simplifies complex authentication process
- Hides complexity of Auth, OTP, Session, and LogService
- Single entry point for authentication operations
- Reduces coupling between client and authentication subsystem

---

## Summary

This repository contains **15 design patterns** organized into three categories:

- **7 Behavioral Patterns**: Focus on object collaboration and responsibility distribution
- **5 Creational Patterns**: Handle object creation in a flexible and reusable way
- **3 Structural Patterns**: Deal with object composition and relationships

Each pattern solves specific design problems and promotes code reusability, maintainability, and flexibility. The examples demonstrate real-world scenarios where these patterns provide elegant solutions to common programming challenges.

---

## Pattern Selection Guide

**Use Behavioral Patterns when:**

- You need flexible communication between objects
- You want to define how objects interact
- You need runtime behavior changes

**Use Creational Patterns when:**

- You need control over object creation
- You want to hide creation complexity
- You need flexible object instantiation

**Use Structural Patterns when:**

- You need to compose objects into larger structures
- You want to adapt incompatible interfaces
- You need to add functionality without modification

---

_Generated from analysis of design pattern implementations in the Streams project._
