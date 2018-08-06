import com.spring1.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String... args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        CustomerService customerService = context.getBean("customerService",  CustomerService.class);
        System.out.println(customerService.getInfo().get(0).getFirstName() + " " + customerService.getInfo().get(0).getLastName());
    }
}