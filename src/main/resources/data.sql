/*DROP TABLE IF EXISTS t_user_roles;
DROP TABLE IF EXISTS t_user;
DROP TABLE IF EXISTS t_role;*/

/*CREATE TABLE t_role
(
    id         INT  PRIMARY KEY,
    name VARCHAR(250) NOT NULL
);

CREATE TABLE t_user
(
    id   INT  PRIMARY KEY,
    username VARCHAR(250) NOT NULL,
    password VARCHAR(250) NOT NULL
);

CREATE TABLE phone_numbers
(
    number      VARCHAR(250) PRIMARY KEY,
    user_id    int          not null,
    company_id int          not null,
    FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE,
    FOREIGN KEY (company_id) REFERENCES phone_companies (id) ON DELETE CASCADE
);*/


INSERT INTO public.t_role(id, name)
VALUES (1, 'ROLE_USER'), (2, 'ROLE_ADMIN');

INSERT INTO public.t_user_roles(user_id, roles_id)
VALUES (1, 2);