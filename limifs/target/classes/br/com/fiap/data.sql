/*
DROP TABLE T_LIM_CANDIDATO;
DROP TABLE T_LIM_EMPRESA;
DROP TABLE T_LIM_CURRICULO;
*/

CREATE TABLE T_LIM_CANDIDATO (
    nom_candidato        NUMBER(4)      NOT NULL,
    tel_candidato        VARCHAR2(50)   NOT NULL,
    data_candidato       NUMBER(12)     NOT NULL,
    cpf_candidato        DATE           NOT NULL,
    genero_candidato     NUMBER(11)     NOT NULL,
    senha_candidato      CHAR(2)        NOT NULL,
    email_candidato      VARCHAR2(10)   NOT NULL
);

ALTER TABLE T_LIM_CANDIDATO ADD CONSTRAINT PK_LIM_USUARIO PRIMARY KEY (NOM_CANDIDATO);

SELECT * FROM T_LIM_CANDIDATO;

CREATE TABLE T_LIM_EMPRESA (

   nom_empresas        NUMBER(5)      NOT NULL,
   loc_empresas        VARCHAR2(50)   NOT NULL,
   tipo_empresas       VARCHAR2(80)   NOT NULL,
   email_empresas      VARCHAR2(15)   NOT NULL,
   cnpj_empresas       VARCHAR2(60)   NOT NULL,
   senha_empresas      NUMBER(14)     NOT NULL
);

ALTER TABLE T_LIM_EMPRESA ADD CONSTRAINT PK_LIM_EMPRESA PRIMARY KEY (NOM_EMPRESAS);

SELECT * FROM T_LIM_EMPRESA;

CREATE TABLE T_LIM_CURRICULO (

   cd_curriculo      NUMBER(6)       NOT NULL,
   grau_curriculo    VARCHAR2(70)    NOT NULL,
   cursos_curriculo  VARCHAR2(400)   NOT NULL,
   certi_curriculo   VARCHAR2(400)   NOT NULL,
   exp_curriculo     VARCHAR2(400)   NOT NULL
);

ALTER TABLE T_LIM_CURRICULO ADD CONSTRAINT PK_LIM_CURRICULO PRIMARY KEY (CD_CURRICULO);

SELECT * FROM T_LIM_CURRICULO;