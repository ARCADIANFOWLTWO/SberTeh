package base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import base.repository.TaskRepository;
import base.domain.Task;

@ComponentScan
@EnableAutoConfiguration
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class);
        TaskRepository repository = context.getBean(TaskRepository.class);

        repository.save(new Task("New message 1"));
        repository.save(new Task("New message 2"));

        Iterable<Task> lists = repository.findAll();
        System.out.println("Lists found with findAll():");
        System.out.println("-------------------------------");
        for (Task entity: lists){
            System.out.println(entity.getName());
        }
        context.close();
    }

}