CREATE DATABASE agenda;
USE agenda;

CREATE TABLE contato(
	idContato MEDIUMINT NOT NULL AUTO_INCREMENT,
	nome VARCHAR(60) NOT NULL,
	ederenco VARCHAR(60),
	telefone1 BIGINT NOT NULL,
	telefone2 BIGINT,
	email VARCHAR(60),
	dataNasc DATE,
	profissao VARCHAR(60),
	sexo VARCHAR(20),
	estadoCivil BOOLEAN,
	escolaridade VARCHAR(20),
	PRIMARY KEY (idContato)
);