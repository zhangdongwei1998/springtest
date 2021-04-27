import com.kuang.pojo.User;
import com.kuang.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author zhangdongwei
 */
public class MyTest {
    public static void main(String[] args) {
        //spring容器，就类似于婚介网站！
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        UserT user = (UserT) context.getBean("u5");
        user.show();
    }
}
