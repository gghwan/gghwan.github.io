```java
#Calculate
public class Calculate {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return (double) a / b;
    }
}
```

### Department.java
```java
```java
public class Department {
    private String name;
    private String head;

    public Department(String name, String head) {
        this.name = name;
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", head='" + head + '\'' +
                '}';
    }
}
```

### Hospital.java
```java
```java
import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String name;
    private List<Department> departments;

    public Hospital(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public List<Department> getDepartments() {
        return departments;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "name='" + name + '\'' +
                ", departments=" + departments +
                '}';
    }
}
```

### Input.java
```java
```java
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public int getInt(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public String getString(String prompt) {
        System.out.print(prompt);
        return scanner.next();
    }
}
```

### Main.java
```java
```java
public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        Department cardiology = new Department("Cardiology", "Dr. Smith");
        Department neurology = new Department("Neurology", "Dr. Johnson");

        hospital.addDepartment(cardiology);
        hospital.addDepartment(neurology);

        System.out.println(hospital);
    }
}
```

### Output.java
```java
```java
public class Output {
    public void print(String message) {
        System.out.println(message);
    }

    public void printError(String message) {
        System.err.println(message);
    }
}
```

### Patient.java
```java
```java
public class Patient {
    private String name;
    private int age;
    private String ailment;

    public Patient(String name, int age, String ailment) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAilment() {
        return ailment;
    }

    public void setAilment(String ailment) {
        this.ailment = ailment;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ailment='" + ailment + '\'' +
                '}';
    }
}
```

### Sort.java
```java
```java
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {
    public void sortPatientsByName(List<Patient> patients) {
        Collections.sort(patients, Comparator.comparing(Patient::getName));
    }

    public void sortPatientsByAge(List<Patient> patients) {
        Collections.sort(patients, Comparator.comparingInt(Patient::getAge));
    }
}
```