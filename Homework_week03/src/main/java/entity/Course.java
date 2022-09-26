package entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Course {
    @Autowired(required = false)
    public Teacher teacher;

    @Autowired(required = false)
    public Student student;
}
