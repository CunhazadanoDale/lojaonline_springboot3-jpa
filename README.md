O projeto é uma aplicação web desenvolvida em Java utilizando o framework Spring Boot e a especificação para mapeamento objeto relacional.

O projeto têm como objetivo:

- Criar um projeto Spring Boot Java;
- Implementar um modelo de domínio;
- Estruturar camadas lógicas: resource (controladores REST), service (serviços) e repository (repositórios);
- Configurar um banco de dados de teste, como o H2;
- Povoar o banco de dados com dados iniciais;
- Realizar operações CRUD (Create, Retrieve, Update, Delete);
- Implementar tratamento de exceções.

A aplicação foca no gerenciamento de entidades como usuários, pedidos, produtos e categorias, estabelecendo relacionamentos entre elas, como "um para muitos" e "muitos para muitos". O projeto é estruturado em camadas lógicas que se comunicam entre si:

(Resource:) Controladores REST que expõem endpoints da API;
(Service): Camada de serviços que contém a lógica de negócios;
(Repository): Repositórios JPA para acesso aos dados.

Para o desenvolvimento e testes, é comum a utilização do banco de dados em memória H2, permitindo uma configuração rápida e eficiente. Ferramentas como o Postman podem também serem utilizadas para testar as requisições HTTP e validar o comportamento da API.

As tecnologias empregadas no projeto incluem:

Java;
Spring Boot;
JPA/Hibernate;
Maven;
H2 (para testes);
Postman (para testes de API).
