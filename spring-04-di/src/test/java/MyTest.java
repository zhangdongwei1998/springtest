import com.kuang.pojo.Student;
import com.kuang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author zhangdongwei
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student=(Student) context.getBean("student");
        System.out.println(student.toString());

/*        Student{
                name='张冬伟',
                address=Address{address='安徽'},
                books=[红楼梦, 西游记, 水浒传, 三国演义],
                hobbys=[听歌, 敲代码, 看电影],
                card={身份证=341221199808182031, 银行卡=45612378945},
                games=[LOL, COC, BOB],
                wife='null',
                info={password=123456, url=男, driver=17114524, username=root}}
*/


    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user =context.getBean("user2",User.class);
        User user2 =context.getBean("user2",User.class);

        System.out.println(user==user2);
    }
}
