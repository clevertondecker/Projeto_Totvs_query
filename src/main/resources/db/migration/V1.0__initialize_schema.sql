
CREATE TABLE aluno
(
    id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    nome character varying(255) COLLATE pg_catalog."default" NOT NULL,
    email character varying(255) COLLATE pg_catalog."default" NOT NULL,
    cpf character varying(255) COLLATE pg_catalog."default" NOT NULL,
    matricula character varying(255) COLLATE pg_catalog."default" NOT NULL,
    formaIngresso character varying(255) COLLATE pg_catalog."default" NOT NULL,
    turmaId character varying(255) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT aluno_pkey PRIMARY KEY (id)
);
