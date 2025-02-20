# Workshop Spring Boot 3 com JPA

Este repositório contém o código-fonte do **Workshop Spring Boot 3 com JPA**, que demonstra boas práticas de desenvolvimento de aplicações Java utilizando **Spring Boot 3**, **JPA**, e um banco de dados relacional.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3**
- **Spring Data JPA**
- **Banco de Dados H2 (para desenvolvimento e testes)**
- **Banco de Dados PostgreSQL/MySQL (para produção)**
- **Maven**

## Como Executar o Projeto

### 1. Clonar o Repositório
```bash
git clone https://github.com/carloshsrosa/workshop-springboot3-jpa.git
cd workshop-springboot3-jpa
```

### 2. Configurar o Banco de Dados
- Para desenvolvimento, o projeto está configurado para rodar com **H2** (banco em memória).
- Caso queira utilizar um banco de dados real, configure as credenciais no arquivo `application.properties` ou `application.yml`.

### 3. Executar o Projeto
```bash
mvn spring-boot:run
```
Ou, caso esteja utilizando Docker:
```bash
docker-compose up -d
```

### 4. Acessar a API
- **H2 Console (caso esteja usando H2):** [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

## Estrutura do Projeto

```
workshop-springboot3-jpa/
├── src/main/java/com/example/workshop/   # Pacotes de código-fonte
│   ├── config/                           # Configurações da aplicação
│   ├── controllers/                      # Controladores REST
│   ├── entities/                         # Entidades JPA
│   ├── repositories/                     # Repositórios Spring Data JPA
│   ├── services/                         # Lógica de negócio
├── src/main/resources/                   # Recursos estáticos e configurações
│   ├── application.properties            # Configuração padrão
│   ├── data.sql                          # Scripts para popular o banco de dados
├── pom.xml                               # Dependências Maven
├── Dockerfile                            # Configuração Docker
├── README.md                             # Documentação do projeto
```

## Melhorias Futuras
- Implementar autenticação e autorização com **Spring Security**.
- Adicionar testes unitários e de integração com **JUnit e Mockito**.
- Criar um frontend para consumir a API.

---
Desenvolvido por **Carlos Henrique Santos Rosa Viegas** 🚀

