package base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import base.domain.List;
import base.repository.ListRepository;

@ComponentScan
@EnableAutoConfiguration
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class);
        ListRepository repository= context.getBean(ListRepository.class);
        repository.save(new List(1L,"Общие"));
        repository.save(new List(2L,"Дом"));
        repository.save(new List(3L,"Работа"));
        repository.save(new List(4L,"Семья"));
        repository.save(new List(5L,"Друзья"));
        repository.save(new List(6L,"Встречи"));
        repository.save(new List(7L,"Покупки"));

        /*Iterable<ListE> lists = repository.findAll();
        for (ListE entity: lists){
            System.out.println(entity.getName());
        }
        SpringApplication.run(Application.class, args);
        context.close();*/

    }
}