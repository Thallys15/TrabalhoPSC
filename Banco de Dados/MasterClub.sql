create database MasterClub;
use MasterClub;
	create table usuario(
		id int primary key auto_increment,
        login varchar(8),
        senha varchar(8)
	);
	create table pessoa(
		codigo int primary key auto_increment,
        nome varchar(255)
    );
    create table endereco(
		codigo int primary key auto_increment,
        rua varchar(20), 
        bairro varchar(20),
        numero int,
        complemento varchar(11),
        cidade varchar(30),
        estado varchar(30)
	);
    create table contrato(
		data_inicio date,
        data_termino date,
        recisao varchar(255),
        renovacao int,
        salario float
	);
    create table funcionario(
		id int primary key auto_increment,
        nome varchar(50),
		cpf char(14),
        rg char(12),
        cargo varchar(30),
        idade int,
        salario double
    );
    create table modalidade(
		codigo int primary key auto_increment,
        nome varchar(50), 
        descricao varchar(255)
    );
    create table titulos(
		id int primary key auto_increment,
        nome varchar(50),
        data_inicio date,
        data_termino date
    );
    create table chefe(
		id int primary key auto_increment,
        administracao varchar(30)
    );
    create table dependencia(
		id int primary key auto_increment,
        nome varchar(50),
        capacidade int
    );
         create table clube(
		id int primary key auto_increment,
		cnpj char(18),
		nome varchar(30),
		quantidade_atletas int,
		titulo int,
		foreign key (titulo) references titulos(id)
    );
	create table atleta(
		id int primary key auto_increment,
        nome varchar(50),
		posicao varchar(10),
        lado varchar(10),
        categoria varchar(10),
        naturalidade varchar(50),
        idade int,
        altura double,
        peso double,
        cpf char(14),
        rg char(11),
        clube int,
        foreign key (clube) references clube(id)
    );
    create table responsavel_modalidade(
		id int primary key,
        funcionario int,
        modalidade int,
        foreign key (modalidade) references modalidade(codigo),
        foreign key (funcionario) references funcionario(id),
        coordenador varchar(30)
    );
    create table participa(
		id int primary key auto_increment,
		clube int,
        modalidade int,
        foreign key (clube) references clube(id),
        foreign key (modalidade) references modalidade(codigo)
    );
    create table financas(
		codigo int primary key auto_increment,
        contratacoes varchar(255),
        vendas varchar(255),
        emprestimos varchar(255),
        chefe int,
        foreign key (chefe) references chefe(id)
    );
    create table patrocinio(
		id int primary key auto_increment,
        nome varchar(50),
        valor double
    );
	create table patrocinar(
		id int primary key auto_increment,
		patrocinio int,
        clube int,
        valorpatrocinio float,
        foreign key (clube) references clube(id),
        foreign key (patrocinio) references patrocinio(id)
    );
    create table aluguel(
		id int primary key auto_increment,
		clube int,
        dependencia int,
        foreign key (clube) references clube(id),
        foreign key (dependencia) references dependencia(id),
        dataaluguel date,
        valorTotalAluguel float
	);
    insert into clube(cnpj,nome,quantidade_atletas,titulo) values ('12121232/211','sesc',15,2);
    select * from clube;