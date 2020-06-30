package base;

import base.domain.List;
import base.repository.ListRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class Application {
    public static void main(String[] args){
        ConfigurableApplicationContext context = SpringApplication.run(Application.class);

        ListRepository repository = context.getBean(ListRepository.class);
        repository.save(new List((long) 1,"list1"));
        repository.save(new List((long) 2,"list2"));

        Iterable<List> lists = repository.findAll();

        for (List entity: lists){
            System.out.println(entity.getName());
        }

        context.close();
    }
}
