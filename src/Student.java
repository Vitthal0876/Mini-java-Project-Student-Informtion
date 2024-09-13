class Person {
    String name;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
}
class Student extends Person {
    int rollno;
    int marks;

    Student(String name, int age, int rollno, int marks) {
        super(name, age);
        this.rollno = rollno;
        this.marks = marks;
    }

    class MyInformastion {
        public static void main(String[] args) {

            Student s1 = new Student("vitthal", 101, 90, 90);
            System.out.println("My name is : " + s1.name);
            System.out.println("my is  age : " + s1.age);
            System.out.println("My school rollno : " + s1.rollno);
            System.out.println("That is my marks : " + s1.marks);

        }
    }
}
