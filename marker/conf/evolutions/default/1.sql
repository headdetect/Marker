# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table o_district (
  id                        bigint not null,
  constraint pk_o_district primary key (id))
;

create table name (
  id                        bigint not null,
  value                     varchar(255),
  constraint pk_name primary key (id))
;

create sequence o_district_seq;

create sequence name_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists o_district;

drop table if exists name;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists o_district_seq;

drop sequence if exists name_seq;

