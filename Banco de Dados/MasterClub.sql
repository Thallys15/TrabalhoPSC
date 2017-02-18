create database MasterClub;
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
	create table atleta(
		id int primary key auto_increment,
		posicao varchar(10),
        lado varchar(10),
        categoria varchar(10),
        naturalidade varchar(50),
        idade int,
        altura float,
        peso float,
        cpf char(11),
        rg char(10),
        clube int,
        foreign key (clube) references clube(cnpj)
    );
    create table funcionario(
		id int primary key auto_increment,
		cpf char(11),
        rg char(10),
        cargo varchar(30),
        idade int
    );
    create table modalidade(
		codigo int primary key auto_increment,
        nome varchar(50), 
        descricao varchar(255)
    );
    create table responsavel_modalidade(
		modalidade int primary key,
        funcionario int primary key,
        foreign key (modalidade) references modalidade(codigo),
        foreign key (funcionario) references funcionario(id),
        coordenador varchar(30)
    );
    create table clube(
    id int primary key auto_increment,
    cnpj char(18),
    nome varchar(30),
    quantidade_atletas int,
    titulo int,
    foreign key (titulo) references titulo(codigo)
    );
    create table participa(
		clube int primary key auto_increment,
        modalidade int primary key auto_increment,
        foreign key (clube) references clube(cnpj),
        foreign key (modalidade) references modalidade(codigo)
    );
	create table titulos(
		codigo int primary key auto_increment,
        data_titulo date
    );
    create table chefe(
		id int primary key auto_increment,
        administracao varchar(30)
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
		codigo int primary key auto_increment,
        nome varchar(50)
    );
	create table patrocinar(
		patrocinio int primary key auto_increment,
        clube int primary key auto_increment,
        valorpatrocinio float,
        foreign key (clube) references clube(cnpj),
        foreign key (patrocinio) references patrocinio(codigo)
    );
    create table dependencia(
		id int primary key auto_increment,
        nome varchar(50),
        capacidade int
    );
    create table aluguel(
		clube int primary key auto_increment ,
        dependencia int primary key auto_increment,
        foreign key (clube) references clube(cnpj),
        foreign key (dependencia) references dependencia(codigo),
        dataaluguel date,
        valorTotalAluguel float
    );