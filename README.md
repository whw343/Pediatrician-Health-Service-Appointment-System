# Pediatrician Health Service Appointment System  
A console-based Java application created for an object-oriented programming assignment (PROG2004) that simulates a health service appointment system specifically for pediatricians. It demonstrates key OOP concepts such as inheritance, polymorphism, encapsulation, composition, and collection handling.

## 📋 Project Overview  
This project models a simplified appointment booking system where patients (or parents) can book sessions with pediatricians (and possibly other health professionals). It is designed to highlight:
- A base class `HealthProfessional`
- A subclass `Pediatrician` extending the base class, with specific attributes relevant to pediatric practice
- An `Appointment` class that uses composition to include a `HealthProfessional` reference
- Use of `ArrayList<Appointment>` to manage appointments (adding, listing, cancelling)
- Clear class structure in line with OOP principles

## 🧠 Features  
- Creation of multiple health professional objects (including pediatricians)  
- Display of professional details via overridden `displayDetails()` methods (polymorphism)  
- Patients/parents can book, view, and cancel appointments  
- Input validation and prevention of duplicate bookings by mobile number  
- Console-based output showing each stage clearly (Part 3: object usage; Part 5: collection operations)  

## 🛠 Technology / Setup  
- Language: Java (e.g., Java 17 or similar)  
- IDE: Eclipse or IntelliJ (set up as a standard Java project, not using modules)  
- Build: Compile the `.java` files and run the main class  
  ```bash
  javac *.java
  java AssignmentOne
