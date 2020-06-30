package base.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.*;
import java.util.Set;

@Entity
public class Task {
    @Id
    @GeneratedValue
    private Long uid;
    private String name;

    public Task() {

    }

    public Task(String name) {
        this(null, name);
    }

    public Task(Long uid, String name) {
        this.uid = uid;
        this.name = name;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getUid() {
        return uid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "list")
    private Set<Category> tasks;

    public Set<Category> getTasks() {
        return tasks;
    }

    public void setTasks(Set<Category> tasks) {
        this.tasks = tasks;
    }
}