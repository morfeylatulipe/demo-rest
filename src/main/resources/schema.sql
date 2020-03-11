
create table questions
(
   id bigint auto_increment,
   title varchar(255) not null,
   type integer not null,
   primary key(id)
);

create table answers
(
   id bigint auto_increment,
   title varchar(255) not null,
   questionId integer not null,
   status integer not null,
   primary key(id)
);

create table responses
(
   id bigint auto_increment,
   userId bigint not null,
   questionId bigint not null,
   responseValue bigint not null,
   primary key(id)
);

create table response_text
(
   id bigint auto_increment,
   responseText varchar(255) not null,
   primary key(id)
);