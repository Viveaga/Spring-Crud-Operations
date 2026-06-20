package crudspringExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext container=new AnnotationConfigApplicationContext(AppConfig.class);
        StudentService studentService=container.getBean(StudentService.class);

        System.out.println("Insert Operaion :");
        System.out.println();
        studentService.RegisterStudentDAO(new Student(4,"Vive"));
        System.out.println();
        System.out.println();

        System.out.println("Read Operation :");
        System.out.println();
        List<Student> st=studentService.getAllStudents();
        for(Student s:st)
        {
            System.out.println("Id : "+s.getId()+"   Name : "+s.getName());
        }
        System.out.println();
        System.out.println();

        System.out.println("Update Operation");
        System.out.println();
        studentService.updateStudent(new Student(4,"Rahul"));
        System.out.println();
        System.out.println("Read after update");
        System.out.println();
        List<Student> students=studentService.getAllStudents();
        for(Student student:students)
        {
            System.out.println("Id : "+student.getId()+"   Name : "+student.getName());
        }
        System.out.println();
        System.out.println();

        System.out.println("Delete Operation");
        System.out.println();
        studentService.DeleteStudent(4);
        System.out.println();
        System.out.println("Read after delete");
        System.out.println();
        List<Student> dele=studentService.getAllStudents();
        for(Student d:dele)
        {
            System.out.println("Id : "+d.getId()+"   Name : "+d.getName());
        }
    }
}