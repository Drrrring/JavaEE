import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class LogAspects {
//    public long startTime;
//    public long endTime;
//    @Pointcut("execution(void TestClass.TestMethod(..))")
//    public void pointCut(){}
//
//    @Before("pointCut()")
//    public void logStart(){
//        var startTime = System.currentTimeMillis();
//        this.startTime = startTime;
//        System.out.println("start: " + startTime);
//    }
//
//    @AfterReturning("pointCut()")
//    public void logReturn(){
//        var endTime = System.currentTimeMillis();
//        this.endTime = endTime;
//        System.out.println("after returning: " + endTime);
//    }
//
//    @AfterThrowing("pointCut()")
//    public void logException(){
//        var endTime = System.currentTimeMillis();
//        this.endTime = endTime;
//        System.out.println("after returning: " + endTime);
//    }
//
//    @After("pointCut()")
//    public void logEnd(){
//        var duringTime = this.endTime - this.startTime;
//        System.out.println("The method lasts: " + duringTime + "ms");
//    }
    @Around("@annotation(TimeRecord)")
    public Object Around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        var startTime = System.currentTimeMillis();
        Object obj = proceedingJoinPoint.proceed();
        var endTime = System.currentTimeMillis();
        System.out.println("start: " + startTime);
                System.out.println("after returning: " + endTime);
        System.out.println("The method lasts: " + (endTime - startTime) + "ms");

        return obj;
    }


}
