
create table if not exists usuario
(
   id int unsigned not null auto_increment primary key,
   usuario varchar(20) not null,
   senha varchar(100) not null,
   tipo varchar(20) not null
)ENGINE=MyISAM  DEFAULT CHARSET=utf8;

create table if not exists paciente
(
   id int unsigned not null auto_increment primary key,
   prontuario varchar(20) not null,
   nome varchar(100) not null,
   nome_mae varchar(20) not null,
   data_nascimento datetime,
   estado_civil varchar(20),
   cor varchar(20),
   telefone varchar(20),
   fotografia varchar(200)
)ENGINE=MyISAM  DEFAULT CHARSET=utf8;

create table if not exists ficha
(
   id int unsigned not null auto_increment primary key,
   idpaciente int unsigned not null, 
   data datetime,
   queixas varchar(100) not null,
   sintomas varchar(100) not null,
   habitos_alimentares varchar(20),
   cancer_familia varchar(50),
   mamografia varchar(20),
   protese varchar(20),
   alteracao_mamilo varchar(100),
   informacoes text,
   foreign key (idpaciente)references paciente(id)
 
)ENGINE=MyISAM  DEFAULT CHARSET=utf8;

create table if not exists mamografia
(
   id int unsigned not null auto_increment primary key,
   idficha int unsigned not null,
   posicao varchar(20) not null,
   imagem varchar(100) not null,
   foreign key(idficha) references ficha(id)

)ENGINE=MyISAM  DEFAULT CHARSET=utf8;





