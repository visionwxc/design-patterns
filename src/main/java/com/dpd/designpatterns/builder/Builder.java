package com.dpd.designpatterns.builder;

/**
 * 建造者模式：当一个对象有很多属性时，需要使用一个属性来构造这个对象，但是又不能写那么多的
 * 构造方法时可以使用建造这模式
 */
public class Builder {
    static class Student{
        String name = null;
        int number = -1;
        String sex = null;
        int age = -1;
        String school = null;

        //构造器，利用构造器作为参数来构建Student对象
        static class StudentBuilder{
            String name = null;
            int number = -1;
            String sex = null;
            int age = -1;
            String school = null;

            public StudentBuilder setName(String name) {
                this.name = name;
                return this;
            }

            public StudentBuilder setNumber(int number) {
                this.number = number;
                return this;
            }

            public StudentBuilder setSex(String sex) {
                this.sex = sex;
                return this;
            }

            public StudentBuilder setAge(int age) {
                this.age = age;
                return this;
            }

            public StudentBuilder setSchool(String school) {
                this.school = school;
                return this;
            }
            public Student build(){
                return new Student(this);
            }
        }
        public Student(StudentBuilder studentBuilder){
            this.age = studentBuilder.age;
            this.name = studentBuilder.name;
            this.number = studentBuilder.number;
            this.school = studentBuilder.school ;
            this.sex = studentBuilder.sex ;
        }
    }

    public static void main(String[] args) {
        Student a = new Student.StudentBuilder().setAge(12).setNumber(12).build();
        Student b = new Student.StudentBuilder().setAge(13).setSchool("田头小学").build();
        System.out.println(a + "" + b);
    }
}
