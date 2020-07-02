package base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class Application {
    public static void main(String[] args){

        SpringApplication.run(Application.class, args);

        /*ConfigurableApplicationContext context = SpringApplication.run(Application.class);
        ListRepository repository = context.getBean(ListRepository.class);
        repository.save(new List( 1L,"list1"));
        repository.save(new List( 2L,"list2"));
        Iterable<List> lists = repository.findAll();
        for (List entity: lists){
            System.out.println(entity.getName());
        }
        context.close();*/
    }
}
/*import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}*/
