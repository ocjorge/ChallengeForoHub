# ChallengeForoHub
Curso de Practicando Spring Framework: Challenge Foro Hub
# FórumHub

FórumHub es una API RESTful desarrollada con Spring Boot que permite la gestión de tópicos de un foro. La API incluye funcionalidades CRUD (Crear, Leer, Actualizar, Eliminar) para los tópicos, así como autenticación y autorización mediante tokens JWT.

## Tecnologías Utilizadas

- **Spring Boot**: Versión 3 en adelante
- **MySQL**: Versión 8 en adelante
- **Java**: Versión 17 en adelante
- **Maven**: Versión 4
- **Dependencias**:
  - Lombok
  - Spring Web
  - Spring Boot DevTools
  - Spring Data JPA
  - Flyway Migration
  - MySQL Driver
  - Validation
  - Spring Security
  - JWT (Auth0)

## Funcionalidades

1. **Crear un nuevo tópico**
2. **Mostrar todos los tópicos creados**
3. **Mostrar un tópico específico**
4. **Actualizar un tópico**
5. **Eliminar un tópico**
6. **Autenticación y autorización mediante JWT**

## Configuración Inicial

1. **Crear el proyecto con Spring Initializr**:
   - Ir a [Spring Initializr](https://start.spring.io/)
   - Seleccionar las dependencias necesarias: Lombok, Spring Web, Spring Boot DevTools, Spring Data JPA, Flyway Migration, MySQL Driver, Validation, Spring Security.
   - Descargar el proyecto.

2. **Configurar la base de datos MySQL**:
   - Instalar MySQL 8 o superior.
   - Crear una base de datos para el proyecto.
   - Configurar las propiedades de conexión en `application.properties`.

3. **Configurar Flyway para migraciones**:
   - Crear scripts SQL en `src/main/resources/db/migration` para la creación de tablas y configuración inicial de la base de datos.

4. **Configurar JWT para autenticación**:
   - Agregar la dependencia de JWT en `pom.xml`.
   - Configurar las propiedades de JWT en `application.properties`.

## Endpoints de la API

### Autenticación

- **POST /login**: Autenticar usuario y generar token JWT.
  - **Cuerpo de la solicitud**:
    ```json
    {
      "username": "usuario",
      "password": "contraseña"
    }
    ```
  - **Respuesta**:
    ```json
    {
      "token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c3VhcmlvIiwiaWF0IjoxNjA3MjAxMjIzfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c"
    }
    ```

### Tópicos

- **POST /topico**: Crear un nuevo tópico.
  - **Cuerpo de la solicitud**:
    ```json
    {
      "title": "Título del tópico",
      "message": "Mensaje del tópico",
      "course": "Curso del tópico",
      "author_id": 1
    }
    ```
  - **Respuesta**:
    ```json
    {
      "id": 1,
      "title": "Título del tópico",
      "message": "Mensaje del tópico",
      "date": "2023-10-01T10:00:00",
      "status": "ACTIVE",
      "author_id": 1,
      "course": "Curso del tópico"
    }
    ```

- **GET /topico**: Listar todos los tópicos.
  - **Respuesta**:
    ```json
    [
      {
        "id": 1,
        "title": "Título del tópico",
        "message": "Mensaje del tópico",
        "date": "2023-10-01T10:00:00",
        "status": "ACTIVE",
        "author_id": 1,
        "course": "Curso del tópico"
      },
      ...
    ]
    ```

- **GET /topico/{id}**: Mostrar un tópico específico.
  - **Respuesta**:
    ```json
    {
      "id": 1,
      "title": "Título del tópico",
      "message": "Mensaje del tópico",
      "date": "2023-10-01T10:00:00",
      "status": "ACTIVE",
      "author_id": 1,
      "course": "Curso del tópico"
    }
    ```

- **PUT /topico/{id}**: Actualizar un tópico.
  - **Cuerpo de la solicitud**:
    ```json
    {
      "title": "Nuevo título del tópico",
      "message": "Nuevo mensaje del tópico",
      "course": "Nuevo curso del tópico",
      "author_id": 1
    }
    ```
  - **Respuesta**:
    ```json
    {
      "id": 1,
      "title": "Nuevo título del tópico",
      "message": "Nuevo mensaje del tópico",
      "date": "2023-10-01T10:00:00",
      "status": "ACTIVE",
      "author_id": 1,
      "course": "Nuevo curso del tópico"
    }
    ```

- **DELETE /topico/{id}**: Eliminar un tópico.
  - **Respuesta**:
    ```json
    {
      "message": "Tópico eliminado correctamente"
    }
    ```

## Pruebas

Para probar la API, se pueden utilizar herramientas como Postman o Insomnia. Asegúrate de incluir el token JWT en el encabezado `Authorization` de las solicitudes que requieren autenticación.

## Ejecución

Para ejecutar la aplicación, utiliza el siguiente comando en la raíz del proyecto:

```sh
mvn spring-boot\:run
