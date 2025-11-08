// HealthProfessional.java
// Author: Felix
// Base class for all healthcare professionals

public class HealthProfessional {
    // =============================
    // 🔹 Fields (Encapsulation)
    // =============================
    private int id;           // unique identifier for doctor
    private String name;      // doctor's full name

    // =============================
    // 🔹 Constructors (Overloading)
    // =============================

    // Default constructor
    public HealthProfessional() {
        this.id = 0;
        this.name = "Unknown";
    }

    // Parameterized constructor
    public HealthProfessional(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // =============================
    // 🔹 Getters and Setters
    // =============================
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // =============================
    // 🔹 Display Method (Polymorphism)
    // =============================
    public void printDetails() {
        System.out.println("Doctor Details:");
        System.out.println("ID: " + id + ", Name: " + name);
    }

    // =============================
    // 🔹 Utility Method (for clarity)
    // =============================
    @Override
    public String toString() {
        return "HealthProfessional[ID=" + id + ", Name=" + name + "]";
    }
}
