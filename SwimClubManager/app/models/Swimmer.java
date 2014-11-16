package models;

import play.db.ebean.Model; // 3. Ebean persistance framework in Play with Java

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // 4.	EBean uses Annotations fom javax.persistance - @Entity
public class Swimmer extends Model {

    @Id // primary key
    public String id;
    public String name;
    public int age;


}
