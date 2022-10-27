import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(MyConfig.class);
        TestClass testClass = annotationConfigApplicationContext.getBean(TestClass.class);
        testClass.TestMethod();

    }
}
