# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table o_addresses (
  district_id               bigint not null,
  address_zip_code          varchar(255),
  address_city              varchar(255),
  address_state             varchar(255),
  address_street            varchar(255),
  address_street2           varchar(255))
;

create table o_district (
  id                        bigint not null,
  name_id                   bigint,
  constraint pk_o_district primary key (id))
;

create table o_logins (
  id                        bigint not null,
  user_name                 varchar(255),
  pass_hash                 varchar(255),
  login_access              integer,
  last_logged_in            timestamp,
  constraint pk_o_logins primary key (id))
;

create table o_names (
  id                        bigint not null,
  value                     varchar(255),
  constraint pk_o_names primary key (id))
;

create table o_schools (
  id                        bigint not null,
  district_id               bigint not null,
  school_name               varchar(255),
  terms_per_year            integer,
  classes_per_term          integer,
  constraint pk_o_schools primary key (id))
;

create sequence o_district_seq;

create sequence o_logins_seq;

create sequence o_names_seq;

create sequence o_schools_seq;

alter table o_addresses add constraint fk_o_addresses_o_district_1 foreign key (district_id) references o_district (id) on delete restrict on update restrict;
create index ix_o_addresses_o_district_1 on o_addresses (district_id);
alter table o_district add constraint fk_o_district_name_2 foreign key (name_id) references o_names (id) on delete restrict on update restrict;
create index ix_o_district_name_2 on o_district (name_id);
alter table o_schools add constraint fk_o_schools_o_district_3 foreign key (district_id) references o_district (id) on delete restrict on update restrict;
create index ix_o_schools_o_district_3 on o_schools (district_id);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists o_addresses;

drop table if exists o_district;

drop table if exists o_logins;

drop table if exists o_names;

drop table if exists o_schools;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists o_district_seq;

drop sequence if exists o_logins_seq;

drop sequence if exists o_names_seq;

drop sequence if exists o_schools_seq;

