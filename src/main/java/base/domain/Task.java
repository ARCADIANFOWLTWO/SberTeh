package base.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Task {
    @Id
    @GeneratedValue
    private Long uid;
    private String title;
    private String description;
    private Boolean done;
    private Date date;
    private Long parentuId;

    public Task() {
    }

    public Task(Long uid, Long parentuId, String title, String description, Boolean done, Date date) {
        this.uid = uid;
        this.parentuId = parentuId;
        this.title = title;
        this.description = description;
        this.done = done;
        this.date = date;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getUid() {
        return uid;
    }

    public void setParentuId(Long parentuId){
        this.parentuId = parentuId;
    }

    public long getParentuId(){
        return parentuId;
    }

    public void setName(String title) {
        this.title = title;
    }

    public String getName() {
        return title;
    }
    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public void setDone(Boolean done){
        this.done = done;
    }

    public Boolean getDone(){
        return done;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public Date getDate(){
        return date;
    }
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "listuId", nullable = false)

    private List list;

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }
}