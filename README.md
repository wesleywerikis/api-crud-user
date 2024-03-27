
# API CRUD de Usuários

Esta é uma aplicação backend desenvolvida em Java usando Spring Boot para criar, ler, atualizar e excluir (CRUD) usuários.

## Entidade
#### A entidade User representa um usuário do sistema e possui os seguintes campos:

    · id: Identificador único do usuário (gerado automaticamente).
    · name: Nome do usuário.
    · username: Nome de usuário único.
    · password: Senha do usuário.
    · email: Endereço de e-mail do usuário.
    · creationDate: Data de criação do usuário.
    · updateDate: Data de atualização do usuário.

## Funcionalidades
#### A API oferece as seguintes funcionalidades:

    · Listar todos os usuários: Endpoint para recuperar todos os usuários cadastrados.
    · Buscar usuário por ID: Endpoint para recuperar um usuário específico com base no ID.
    · Criar usuário: Endpoint para criar um novo usuário.
    · Atualizar usuário: Endpoint para atualizar as informações de um usuário existente.
    · Excluir usuário: Endpoint para excluir um usuário existente com base no ID.
    · Estrutura do Projeto

## Estrutura do Projeto
#### O projeto está dividido nas seguintes partes:

    · Entity: Contém a definição da entidade User.
    · Repository: Define a interface do repositório UserRepository para interagir com o banco de dados.
    · Service: Contém a lógica de negócios da aplicação no UserService.
    · Controller: Define os endpoints da API no UserController.

## Tecnologias Utilizadas
    · Java
    · Spring Boot
    · Spring Data JPA
    · Hibernate
    · Lombok

## Como Executar
    1. Clone este repositório.
    2. Certifique-se de ter o Java JDK e o Apache Maven instalados.
    3. Navegue até o diretório raiz do projeto.
    4. Execute o comando mvn spring-boot:run para iniciar a aplicação.
    5. Acesse os endpoints da API conforme descrito na seção de funcionalidades.

## Endpoints
    · GET /api/users: Recupera todos os usuários.
    · GET /api/users/{id}: Recupera um usuário específico por ID.
    · POST /api/users: Cria um novo usuário.
    · PUT /api/users/{id}: Atualiza um usuário existente por ID.
    · DELETE /api/users/{id}: Exclui um usuário existente por ID.

## Exemplo de Uso
#### Listar todos os usuários
    · GET /api/users

#### Buscar usuário por ID
    · GET /api/users/{id}
    
#### Criar usuário
    · POST /api/users

    Body:
    {
        "name": "Nome do Usuário",
        "username": "nome_usuario",
        "password": "senha123",
        "email": "usuario@example.com"
    }

#### Atualizar usuário
    · PUT /api/users/{id}

    Body:
    {
        "name": "Novo Nome",
        "username": "novo_nome_usuario",
        "password": "novasenha123",
        "email": "novo_email@example.com"
    }

#### Excluir usuário
    · DELETE /api/users/{id}