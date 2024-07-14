package challenges;

  class StudentDetails {
        String name;
        int age;

        public StudentDetails(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        public static void main(String[] args) {
            StudentDetails Std1 = new StudentDetails("ajay", 23);
            System.out.println(Std1.toString());
        }
    }
