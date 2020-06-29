package base.domain;

import javax.persistence.*;

@Entity
public class Category {
    @Id
    @GeneratedValue
    private Long uid;
    private String description;

    public Category() {

    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "list_id", nullable = false)
    private Task list;

    public Task getTaskList() {
        return list;
    }

    public void setTaskList(Task list) {
        this.list = list;
    }
}
