

--CLIENTS
INSERT INTO public.clients(identification, name, email) VALUES ('1010243260','Fernando','fernandocardenascdn@gmail.com');
INSERT INTO public.clients(identification, name, email) VALUES ('46375890','yolanda','yolandahha@gmail.com');
INSERT INTO public.clients(identification, name, email) VALUES ('10239900','Natalia','nataliass2@gmail.com');
INSERT INTO public.clients(identification, name, email) VALUES ('1234567890','Camilo','Camilo98@gmail.com');

select * from clients;

--PRODUCTS
INSERT INTO public.products(name) VALUES ('Crédito Libre Destino');
INSERT INTO public.products(name) VALUES ('Crédito Vivienda');
INSERT INTO public.products(name) VALUES ('Crédito Vehículo');
INSERT INTO public.products(name) VALUES ('Crédito Educativo');

select * from products;

--PAYMENT DELAYS
--PRODUCT 1
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (0, 0, '1010243260', 1);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (1, 1, '1010243260', 1);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (2, 0, '1010243260', 1);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (3, 0, '1010243260', 1);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (4, 5, '1010243260', 1);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (5, 1, '1010243260', 1);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (6, 0, '1010243260', 1);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (7, 0, '1010243260', 1);

--PRODUCT 2
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (0, 0, '1010243260', 2);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (1, 3, '1010243260', 2);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (2, 4, '1010243260', 2);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (3, 3, '1010243260', 2);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (4, 8, '1010243260', 2);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (5, 2, '1010243260', 2);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (6, 0, '1010243260', 2);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (7, 2, '1010243260', 2);

--PRODUCT 3
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (0, 7, '1010243260', 3);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (1, 8, '1010243260', 3);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (2, 2, '1010243260', 3);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (3, 0, '1010243260', 3);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (4, 9, '1010243260', 3);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (5, 0, '1010243260', 3);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (6, 2, '1010243260', 3);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (7, 0, '1010243260', 3);

--PRODUCT 4
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (0, 0, '1010243260', 4);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (1, 0, '1010243260', 4);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (2, 0, '1010243260', 4);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (3, 5, '1010243260', 4);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (4, 0, '1010243260', 4);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (5, 0, '1010243260', 4);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (6, 0, '1010243260', 4);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (7, 0, '1010243260', 4);

------------------------------------------------------------------------------------------------------------------------------------------

--PRODUCT 1
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (0, 0, '46375890', 1);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (1, 1, '46375890', 1);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (2, 0, '46375890', 1);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (3, 0, '46375890', 1);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (4, 5, '46375890', 1);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (5, 1, '46375890', 1);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (6, 0, '46375890', 1);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (7, 1, '46375890', 1);

--PRODUCT 2
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (0, 0, '46375890', 2);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (1, 3, '46375890', 2);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (2, 4, '46375890', 2);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (3, 3, '46375890', 2);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (4, 8, '46375890', 2);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (5, 2, '46375890', 2);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (6, 0, '46375890', 2);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (7, 2, '46375890', 2);

--PRODUCT 3
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (0, 7, '46375890', 3);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (1, 8, '46375890', 3);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (2, 2, '46375890', 3);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (3, 0, '46375890', 3);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (4, 9, '46375890', 3);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (5, 0, '46375890', 3);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (6, 2, '46375890', 3);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (7, 4, '46375890', 3);

--PRODUCT 4
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (0, 0, '46375890', 4);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (1, 0, '46375890', 4);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (2, 0, '46375890', 4);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (3, 5, '46375890', 4);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (4, 0, '46375890', 4);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (5, 0, '46375890', 4);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (6, 0, '46375890', 4);
INSERT INTO public.paymentdelays(period, quantity, idclient, idproduct) VALUES (7, 9, '46375890', 4);

SELECT * FROM paymentdelays

delete from paymentdelays;
delete from clients;
delete from products;


