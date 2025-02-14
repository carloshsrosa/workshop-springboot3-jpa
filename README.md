# Workshop Spring Boot 3 + JPA

Este repositório contém um projeto de workshop que demonstra o uso do **Spring Boot 3** e **JPA** para a construção de uma API REST.

## 🚀 Tecnologias Utilizadas
- **Java 17+**
- **Spring Boot 3**
- **Spring Data JPA**
- **H2 Database**
- **Maven**

## 📌 Pré-requisitos
Antes de começar, você precisará ter instalado:
- [JDK 17+](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Apache Maven](https://maven.apache.org/)
- [Git](https://git-scm.com/)

## ⚙️ Como Executar o Projeto
1. Clone o repositório:
   ```sh
   git clone https://github.com/carloshsrosa/workshop-springboot3-jpa.git
   cd workshop-springboot3-jpa
   ```

2. Compile e execute a aplicação:
   ```sh
   ./mvnw spring-boot:run
   ```

3. Acesse a API no navegador ou via ferramenta como **Postman**:
   ```
   http://localhost:8080
   ```

## 🗄️ Banco de Dados
O projeto utiliza o banco de dados em memória **H2**. Para acessar o console do H2:
```
http://localhost:8080/h2-console
```
Use as credenciais definidas no `application.properties`.

## 📜 Documentação da API
A API segue padrões RESTful para operações CRUD. Exemplo de endpoint:
```http
GET /users
```

---

**Autor:** [Carlos Henrique Santos Rosa Viegas](https://github.com/carloshsrosa)
