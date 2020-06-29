package base.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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
}