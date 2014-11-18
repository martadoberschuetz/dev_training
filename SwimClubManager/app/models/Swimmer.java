package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Swimmer extends Model {

    @Id // primary key
    public Long id;
    public String name;
    public Long age;

    public static Finder<Long, Swimmer> find = new Finder<Long, Swimmer>(Long.class, Swimmer.class);

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getAge() {
        return age;
    }
    public void setAge(Long age) {
        this.age = age;
    }


}
