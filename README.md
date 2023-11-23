# GlobalSolution-2SEM-Microservices

# Projeto Spring Boot com JDK 17 e MySQL

Este é um projeto Spring Boot configurado com JDK 17 e MySQL, projetado para fornecer endpoints para manipulação de Objetivos e Indicadores.

## Configurações do Projeto

- **JDK**: 17
- **Spring Boot**: v3.1.5
- **MySQL**

Certifique-se de ter essas configurações instaladas em seu ambiente antes de executar o projeto.

## Configuração do Banco de Dados

O projeto utiliza o MySQL como banco de dados. Certifique-se de criar um banco de dados com o nome "ods", em seguida utilize o script sql disponibilizado, e ajuste as configurações de conexão no arquivo `application.properties` conforme necessário.


### properties
- spring.datasource.url=jdbc:mysql://localhost:3306/seu_banco_de_dados
- spring.datasource.username=seu_usuario
- spring.datasource.password=sua_senha



## Endpoints

### Objetivos

- **Endpoint**: `/objetivos`
  - **Método**: GET
  - **Descrição**: Recupera todos os objetivos.
  - **Exemplo**: `http://localhost:8080/objetivos`

![postman1](https://github.com/Kaique646/GlobalSolution-2SEM-Microservices/assets/80988490/95608dbc-a6fd-4b04-853d-c26dd59c4f69)


### Indicadores por ID

- **Endpoint**: `/indicadores/{id}`
  - **Método**: GET
  - **Descrição**: Recupera os indicadores para um determinado ID.
  - **Exemplo**: `http://localhost:8080/indicadores/1`

![postman2](https://github.com/Kaique646/GlobalSolution-2SEM-Microservices/assets/80988490/b6e80746-2698-40d4-9c24-8ca3129008a8)

## Como Executar o Projeto

1. Clone o repositório para o seu ambiente local.
2. Certifique-se de ter o JDK 17 instalado.
3. Configure o banco de dados no arquivo `application.properties`.
4. Execute o projeto usando sua IDE favorita ou o comando Maven: `mvn spring-boot:run`.

Agora você pode acessar os endpoints mencionados acima.

