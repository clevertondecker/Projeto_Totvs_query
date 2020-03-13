
CREATE TABLE  aluno
(
    id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    nome character varying(255) COLLATE pg_catalog."default" NOT NULL,
    email character varying(255) COLLATE pg_catalog."default" NOT NULL,
    cpf character varying(255) COLLATE pg_catalog."default" NOT NULL,
    matricula character varying(255) COLLATE pg_catalog."default" NOT NULL,
    forma_Ingresso character varying(255) COLLATE pg_catalog."default" NOT NULL,
    turma_Id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT aluno_pkey PRIMARY KEY (id)
);

CREATE TABLE professor
(
    id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    nome character varying(255) COLLATE pg_catalog."default" NOT NULL,
    email character varying(255) COLLATE pg_catalog."default" NOT NULL,
    cpf character varying(255) COLLATE pg_catalog."default" NOT NULL,
    titulo character varying(255) COLLATE pg_catalog."default" NOT NULL,
    disciplina_Id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT professor_pkey PRIMARY KEY (id)
);
