import com.kuang.pojo.Hello;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author zhangdongwei
 */
public class MyTest {
    public static void main(String[] args) {
        //获取spring的上下文对象！
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        //我们的对象都在spring中的管理了，我们要使用，直接去里面取出来就可以了
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }
}
