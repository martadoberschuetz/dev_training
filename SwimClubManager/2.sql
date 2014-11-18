# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

insert into swimmer(id,name,age) values (1,"Michael Phelps",29);
insert into swimmer(id,name,age) values (2,"Jessica Hardy",30);
insert into swimmer(id,name,age) values (3,"Alain Bernard",31);

# --- !Downs

delete * from swimmer