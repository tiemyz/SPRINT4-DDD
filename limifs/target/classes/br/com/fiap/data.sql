CREATE TABLE T_LIMIFS_CANDIDATO (
    
    nom_candidato       VARCHAR2 (50)   NOT NULL, 
    tel_candidato       VARCHAR2 (20)   NOT NULL, 
    data_candidato      DATE            NOT NULL, 
    cpf_candidato       VARCHAR2 (15)   NOT NULL, 
    genero_candidato    VARCHAR2 (20)   NOT NULL, 
    senha_candidato     VARCHAR2 (200)  NOT NULL, 
    email_candidato     VARCHAR2 (200)  NOT NULL
);

SELECT * FROM T_LIMIFS_CANDIDATO;

CREATE TABLE T_LIMIFS_EMPRESA (

    nom_empresa       VARCHAR2 (50)   NOT NULL, 
    loc_empresa       VARCHAR2 (20)   NOT NULL, 
    tipo_empresa      VARCHAR2 (15)   NOT NULL, 
    email_empresa     VARCHAR2 (20)   NOT NULL, 
    cnpj_empresa      VARCHAR2 (200)  NOT NULL, 
    senha_empresa     VARCHAR2 (200)  NOT NULL
);

SELECT * FROM T_LIMIFS_EMPRESA;

CREATE TABLE T_LIMIFS_CURRICULO (

    grau_curriculo    VARCHAR2 (70)   NOT NULL,
    cursos_curriculo  VARCHAR2 (400)  NOT NULL,
    certi_curriculo   VARCHAR2 (400)  NOT NULL,
    exp_curriculo     VARCHAR2 (400)  NOT NULL

);

SELECT * FROM T_LIMIFS_CURRICULO;