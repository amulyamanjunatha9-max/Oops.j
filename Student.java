class Student{
    int age;

    Student(int age){
        this.age = age;}

        void display(){
            System.out.println("Age="+age);
        }

        public static void main(String[] arge){
            Student s = new Student(20);
            s.display();
        }
    }