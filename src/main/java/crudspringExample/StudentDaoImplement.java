package crudspringExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class StudentDaoImplement implements StudentDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;
    public void save(Student student)
    {
        String sql="Insert into students(id,name) values(?,?) ";
        int rows=jdbcTemplate.update(sql,student.getId(),student.getName());
        System.out.println(rows+" inserted");

    }
    public List<Student> findAll()
    {
        String sql="select * from students";
        return jdbcTemplate.query(sql,
                (rs,rowNum)->new Student(rs.getInt("id"),rs.getString("name")));

    }
    public void Update(Student student)
    {
        String sql="update students set name=? where id=?";
        int rows=jdbcTemplate.update(sql,student.getName(),student.getId());
        System.out.println("Updated");
    }
    public  void Delete(int id)
    {
        String sql="delete from students where id=?";
        int rows=jdbcTemplate.update(sql,id);
        System.out.println(rows+"Deleted");
    }
}
