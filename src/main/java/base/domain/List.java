package base.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class List {
    @Id
    @GeneratedValue
    private Long uid;
    private String name;

    public List() {
    }

    public List(Long uid, String name) {
        this.uid = uid;
        this.name = name;
    }
    public Long getUid() {
        return uid;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "list")
    private Set<Task> tasks;

    public Set<Task> getTask() {
        return tasks;
    }

    public void setTask(Set<Task> tasks) {
        this.tasks = tasks;
    }
}
