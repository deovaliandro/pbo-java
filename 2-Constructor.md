# Constructor

Konstruktor adalah fungsi yang dijalankan ketika pertama kali sebuah objek dipanggil.
Sebuah `class` tanpa konstruksi akan otomatis dibuatkan konstruksi oleh java.

Constructor sangat mirip dengan method tetapi tidak memiliki return type dan nama constructor harus sama dengan nama classnya.

```java
class Employee {
    String name = “Karina”;
    double salary = 1;
    
    public Employee () {
        name = “Shelena”;
        salary = 0;
    }
//...
}
```

Ketika dibuat sebuah objek dari class di atas dengan statement `Employee emp = new Employee();` maka nilai attribute `name = Shelena` dan nilai attribute `salary = 0`.

```java
class Employee {
    String name = “Karina”;
    double salary = 1;

    public Employee () {
        name = “Shelena”;
        salary = 0;
    }
}
public class Main {
public static void main (String[] args) {
    Employee emp = new Employee();
        System.out.println(“Name = ”+ emp.name);
        System.out.println(“Salary = ”+ emp.salary);
    }
}
```

Sebuah class dapat memiliki lebih dari satu constructor tetapi nama constructor harus sama dengan nama class. Java memperbolehkan sebuah class memiliki banyak constructor dengan ketentuan:
- Setiap Constructor memiliki jumlah parameter yang berbeda
- Jumlah parameter boleh sama tetapi type data masing-masing parameternya harus berbeda
- Apabila terdapat lebih dari satu constructor dalam class maka Constructor yang digunakan adalah constructor yang sesuai dengan ketika objek di-instansikan

Contoh:
```java
class Employee {
    String name = "Karina";
    double salary = 1;
    public Employee (double salary) {
        this.salary = salary;
    }

    public Employee (String name) {
        this.name = name;
    }

    public Employee (String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class Main {
    public static void main (String[] args) {
        Employee emp1 = new Employee(20);
        Employee emp2 = new Employee(“Gussion”);
        Employee emp3 = new Employee(“Lesley”);

        System.out.println("Name1 = "+ emp1.name);
        System.out.println("Name2 = "+ emp2.name);
        System.out.println("Name3 = "+ emp3.name);
    }
}

// Output
/*  Name1 = Karina
*   Name2 = Shelena
*   Name3 = Lesley
*/
```
