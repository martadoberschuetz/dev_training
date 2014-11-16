# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table swimmer (
  id                        varchar(255) not null,
  name                      varchar(255),
  age                       integer,
  constraint pk_swimmer primary key (id))
;

create sequence swimmer_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists swimmer;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists swimmer_seq;

