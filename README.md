# PROJETO SIMPLES EM JAVA COM SPRING BOOT E JPA

O projeto consiste em um sistema CRUD para categoria e produto utilizando persistencia com Spring Boot e JPA, utilizando o Postman como cliente para requisições http.



## Requisitos

JDK 11

Sprint Tool Suit 4 ou qualquer IDE de sua preferência

Postman



## Dependencias

- Spring Web
- Spring data JPA
- H2 Database



## Diagrama de classe

![](https://github.com/andrezasecon/img/blob/main/img-diagrama-classes.PNG)

## Modelo entidade relacional do banco de dados



![](https://github.com/andrezasecon/img/blob/main/img-bd-1.png)



![](https://github.com/andrezasecon/img/blob/main/img-bd-2.png)



![](https://github.com/andrezasecon/img/blob/main/img-bd-3.png)

## Configuração do application.properties

*** Abrir o arquivo application.properties em src/main/resources  e colar o conteúdo abaixo ***

```
spring.profiles.active=test
```

## Configuração do application-test.properties

*** Criar o arquivo application-test.proporties em src/main/resources ***

```
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=

spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

## Populando o banco de dados com o arquivo data.sql

*** Criar o arquivo data.sql em src/main/resources, colar o conteúdo abaixo e salvar ***

```
INSERT INTO tb_category (name) VALUES ('Livros');
INSERT INTO tb_category (name) VALUES ('Eletrônicos');
INSERT INTO tb_category (name) VALUES ('Computadores');

INSERT INTO tb_product (name, price, description, img_url) VALUES ('The Lord of the Rings', 90.5, 'Lorem ipsum', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/1-big.jpg');
INSERT INTO tb_product (name, price, description, img_url) VALUES ('Smart TV', 2190.0, 'Lorem ipsum', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/2-big.jpg');
INSERT INTO tb_product (name, price, description, img_url) VALUES ('Macbook Pro', 1250.0, 'Lorem ipsum', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/3-big.jpg');
INSERT INTO tb_product (name, price, description, img_url) VALUES ('PC Gamer', 1200.0, 'Lorem ipsum', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/4-big.jpg');

INSERT INTO tb_product_category (product_id, category_id) VALUES (1, 1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (2, 2);
INSERT INTO tb_product_category (product_id, category_id) VALUES (2, 3);
INSERT INTO tb_product_category (product_id, category_id) VALUES (3, 3);
INSERT INTO tb_product_category (product_id, category_id) VALUES (4, 3);
```
## Requisição Client utilizando o Postman

- Você deve ter instalado no ambiente o app postman.
- Startar o projeto no STS ou na IDE que estiver utilizando

Criar uma Workspace e adicionar uma requisição GET apontando para localhost:8080/products, clicar em Send, resultado esperado:

![](https://github.com/andrezasecon/img/blob/main/img-postman.PNG)


