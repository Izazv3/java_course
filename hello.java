import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.BufferedReader;
import java.io.IOException;

class Hello {
  public static void main(String[] args) throws IOException {
    System.out.println("hello world");

    int num = 5;
    System.out.println(num);
    System.out.println(9 + 3);

    int num1 = 9;
    int i = 2; // 4 bytes
    long l = 223434; // 8 bytes
    short s = 32; // 2 bytes
    byte b = 127; // 1 byte less than 127
    float f = 9.833f;
    double d = 9.323344;
    char c = 'h';
    boolean bool = true;

    int antony = 555;
    byte bala = (byte) antony; // byte conversion casting
    System.out.println(bala);

    int array[] = { 2, 4, 5, 3 };
    System.out.println("array - " + array[0]);

    // two dimentsional array

    int nums[][] = new int[3][4];

    for (int n[] : nums) {

      for (int m : n) {
        System.out.print(m + " ");
      }

      System.out.println(" ");

    }

    // three dimensional array

    int threee[][][] = new int[3][4][5];

    int one[] = new int[5];

    // enhanced for loop

    for (int n : one) {
      System.out.println(n);
    }

    String name = "izaz";
    System.out.println(name.concat("ahamed"));

    StringBuffer stringBuffer = new StringBuffer();

    System.out.println(stringBuffer.capacity());

    Student s1 = new Student();
    s1.name = "izaz";
    s1.age = 22;

    Student.std = "class12"; // assign for all the obj in a static value

    s1.show();

    Student.showstatic(s1);

    try {
      Class.forName("Mobile");
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    Mobile mobile = new Mobile();

    B bclass = new B(5);

    Computer comp = new Laptop(); // polymorphism --> many behaviour
    comp.show();

    // final ==> var, method and classs
    // var -- declare const var
    // class -- making refuse inheritance that does not allow extends another class
    // method -- does not allow method overriding in inheritance

    Car objCar = new Bmw();
    objCar.drive();
    objCar.fly();

    java javaObj;

    javaObj = new javaImpl();

    javaObj.show();
    javaObj.config();

    // class -> class = extends
    // interface -> class = implements
    // interface -> interface = extends

    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      int userInput = Integer.parseInt(br.readLine());
      System.out.println(userInput);
    }

    // work on isolate of multiple thread --> extends thread classs and
    // obj1.start(), obj1.sleep(), obj1,join()

    // lamda expression = ()->{} only for functional interfacec

    // thread calling same method -> synchronized keyword allows once at a time

    Map<String, Integer> myMap = new HashMap<>();

    myMap.put("izaz", 100);
    myMap.put("harish", 80);
    myMap.put("gokul", 71);
    myMap.put("peter", 76);
    myMap.put("hari", 91);

    System.out.println(myMap);

    for (String n : myMap.keySet()) {
      System.out.println(n + " - " + myMap.get(n));
    }

    System.out.println("**************");

    // comparator and conparable

    Comparator<Person> coms = (j, k) -> j.age > k.age ? 1 : -1; // lamda expression

    List<Person> persons = new ArrayList<Person>();
    persons.add(new Person("izaz", 25));
    persons.add(new Person("navin", 30));
    persons.add(new Person("harish", 12));
    persons.add(new Person("reddy", 45));
    persons.add(new Person("kiran", 19));

    persons.sort(coms);

    for (Person p : persons) {
      System.out.println(p.name + " - " + p.age);
    }

  }

}

class Student {
  String name;
  int age;
  static String std;

  public void show() {
    System.out.println(name + " : " + age + " : " + std);
  }

  public static void showstatic(Student s) {
    System.out.println(s.name + " : " + s.age + " : " + std);
  }
}

class Mobile {
  String name;
  static int price;

  // constructor generate with instances
  public Mobile() {
    this.name = "apple";
    this.price = 5000;

    System.out.println("constructor is called " + name + " : " + price);

  }

  static {
    price = 2000;
    System.out.println("static class loaded first without instance : " + price);
  }

}

// encapsulation with getter and setter

class Human {
  private String name;

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

  private int age;

}

// java does not support multiple inheritance

class A extends Object { // object is a inheritance, it also work without obj
  public A() {
    super();

    System.out.println("in A");
  }

  public A(int n) {
    super();

    System.out.println("in A int");
  }
}

class B extends A { // inherited A class multi level inheretance
  public B() {
    super();
    System.out.println("in B");
  }

  public B(int n) {
    this();
    System.out.println("in B int");
  }
}

// polymorphism --> many behaviour

class Computer {
  public void show() {
    System.out.println("this is a computer");
  }
}

class Laptop extends Computer {
  public void show() {
    System.out.println("this is a laptop");
  }

}

// abstract class cant create obj

abstract class Car {
  public abstract void drive();

  public abstract void fly();
}

class Bmw extends Car {

  @Override
  public void drive() {
    System.out.println("bmw driving....");
  }

  @Override
  public void fly() {
    System.out.println("bmw flying....");
  }

}

// interface in java

// @FunctionalInterface --> allows only one methods
// interfacetypes --> normal, functional, marker
interface java {
  int age = 25; // final and static
  String area = "Bangalore";

  void show();

  void config();
}

class javaImpl implements java {

  public void show() {
    System.out.println("in show");
  }

  public void config() {
    System.out.println("in config");

  }

}

// comparator vs comparable

class Person {
  String name;
  int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

}