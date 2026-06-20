package crudspringExample;

import java.util.List;

public interface StudentDAO {
    public void save(Student student);
    public List<Student> findAll();
    public void Update(Student student);
    public  void Delete(int id);


}
