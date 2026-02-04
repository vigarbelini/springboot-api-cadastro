create database banco_de_usuarios;
use banco_de_usuarios;

create table usuario(
    id integer auto_increment primary key,
    nome varchar(200) not null,
    username varchar(100) not null unique,
    email varchar(50) not null unique,
    senha text not null,
    telefone varchar(15) not null
);

insert into usuario values (null, 'Daniel', 'dsdsdsdsdsd', 'dafrddd', '11212121');

select * from usuario;

ALTER TABLE usuario CHANGE nome_completo nome VARCHAR(200) NOT NULL;

ALTER TABLE usuario DROP COLUMN username;
