package base;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import base.repository.ListRepository;
import base.repository.TaskRepository;
import base.domain.List;

@ComponentScan
@EnableAutoConfiguration
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class);
        ListRepository repository= context.getBean(ListRepository.class);
        // repository.deleteAll();


    }
}