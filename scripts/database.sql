-- public."role" definition

-- Drop table

-- DROP TABLE "role";

CREATE TABLE "role" (
	id serial NOT NULL,
	"name" text NOT NULL,
	description text NOT NULL,
	CONSTRAINT role_id_pkey PRIMARY KEY (id)
);


-- public.users definition

-- Drop table

-- DROP TABLE users;

CREATE TABLE users (
	id serial NOT NULL,
	first_name text NOT NULL,
	last_name text NOT NULL,
	created_on timestamp NOT NULL,
	CONSTRAINT users_id_pkey PRIMARY KEY (id)
);


-- public.project definition

-- Drop table

-- DROP TABLE project;

CREATE TABLE project (
	id serial NOT NULL,
	"name" text NOT NULL,
	description text NOT NULL,
	created_on timestamp NOT NULL,
	created_by int4 NOT NULL,
	modified_on timestamp NOT NULL,
	modified_by int4 NOT NULL,
	CONSTRAINT project_id_pkey PRIMARY KEY (id),
	CONSTRAINT project_created_by_users_id_fkey FOREIGN KEY (created_by) REFERENCES users(id),
	CONSTRAINT project_modified_by_users_id_fkey FOREIGN KEY (modified_by) REFERENCES users(id)
);


-- public.user_role definition

-- Drop table

-- DROP TABLE user_role;

CREATE TABLE user_role (
	id serial NOT NULL,
	user_id int4 NOT NULL,
	role_id int4 NOT NULL,
	CONSTRAINT user_role_role_id_role_id_fkey FOREIGN KEY (role_id) REFERENCES role(id),
	CONSTRAINT user_role_user_id_users_id_fkey FOREIGN KEY (user_id) REFERENCES users(id)
);


-- public.persons definition

-- Drop table

-- DROP TABLE persons;

CREATE TABLE persons (
	id serial NOT NULL,
	project_id int4 NOT NULL,
	"name" text NOT NULL,
	CONSTRAINT persons_id_pkey PRIMARY KEY (id),
	CONSTRAINT persons_project_id_name_key UNIQUE (project_id, name),
	CONSTRAINT persons_project_id_project_id_fkey FOREIGN KEY (project_id) REFERENCES project(id)
);


-- public.bill definition

-- Drop table

-- DROP TABLE bill;

CREATE TABLE bill (
	id serial NOT NULL,
	project_id int4 NOT NULL,
	"name" text NOT NULL,
	description text NULL,
	total_amount float4 NOT NULL,
	created_on timestamp NOT NULL,
	CONSTRAINT bill_id_pkey PRIMARY KEY (id),
	CONSTRAINT bill_project_id_project_id_fkey FOREIGN KEY (project_id) REFERENCES project(id)
);


-- public.bill_item definition

-- Drop table

-- DROP TABLE bill_item;

CREATE TABLE bill_item (
	id serial NOT NULL,
	bill_id int4 NOT NULL,
	amount float4 NOT NULL,
	person_pay int4 NOT NULL,
	person_pay_for int4 NOT NULL,
	CONSTRAINT bill_item_bill_id_bill_id_fkey FOREIGN KEY (bill_id) REFERENCES bill(id),
	CONSTRAINT bill_item_person_pay_for_persons_id_fkey FOREIGN KEY (person_pay_for) REFERENCES persons(id),
	CONSTRAINT bill_item_person_pay_persons_id_fkey FOREIGN KEY (person_pay) REFERENCES persons(id)
);


-- public.loan definition

-- Drop table

-- DROP TABLE loan;

CREATE TABLE loan (
	id serial NOT NULL,
	project_id int4 NOT NULL,
	"name" text NOT NULL,
	description varchar NULL,
	person_from int4 NOT NULL,
	person_to int4 NOT NULL,
	CONSTRAINT loan_person_from_persons_id_fkey FOREIGN KEY (person_from) REFERENCES persons(id),
	CONSTRAINT loan_person_to_persons_id_fkey FOREIGN KEY (person_to) REFERENCES persons(id),
	CONSTRAINT loan_project_id_project_id_fkey FOREIGN KEY (project_id) REFERENCES project(id)
);
