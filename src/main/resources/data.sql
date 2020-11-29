DROP TABLE IF EXISTS t_user_roles;
DROP TABLE IF EXISTS t_user;
DROP TABLE IF EXISTS t_role;

INSERT INTO public.t_role(id, name)
VALUES (1, 'ROLE_REGISTERED_USER'), (2, 'ROLE_BOOKING_USER');

INSERT INTO public.t_user_roles(user_id, roles_id)
VALUES (1, 2);