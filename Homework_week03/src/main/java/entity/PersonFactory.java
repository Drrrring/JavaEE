package entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
public class PersonFactory {
    @Bean("student")
    @Conditional(FalseCondition.class)
    public Student getStudent(){
        return new Student();
    }

    @Bean("teacher")
    @Conditional(TrueCondition.class)
    public Teacher getTeacher(){
        return new Teacher();
    }
}
