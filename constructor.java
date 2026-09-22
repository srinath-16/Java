    class student {
        String name;
        int age;
        student(String name){
            this.name = name;
        }
        student() {
            System.out.println("the object is created");
            this .name = "name";
        }
        student(int age){
            this.age = age;
        }
        
    }
    class Main{
        public static void main(String[] args) {
            student s= new student();
          student s1 = new student("thor");
          student s2 = new student(20);
            System.out.println(s1.name);
            System.out.println(s2.age);
        }

    }
    

