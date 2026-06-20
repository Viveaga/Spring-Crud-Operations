package crudspringExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentService {
    @Autowired
    private StudentDAO studentDao;

    public void RegisterStudentDAO(Student student)
    {
        studentDao.save(student);
        System.out.println("Registerd sucessfully");
    }

    public List<Student> getAllStudents()
    {

        return studentDao.findAll();
    }
    public void updateStudent(Student student)
    {
        studentDao.Update(student);
        System.out.println("Updated Sucessfully");
    }
    public  void DeleteStudent(int id)
    {
        studentDao.Delete(id);
        System.out.println("Deleted Sucessfully");
    }
}
