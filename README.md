# Proyecto Spring Boot - Gestión de Libros (API REST + MVC)

### Puerto del servidor

La app está en el puerto **9090**, lo he tenido que cambiar porque el que es por defecto lo tenia ocupado.

```
src/main/resources/application.properties
```

```properties
server.port=9090
spring.thymeleaf.cache=false
```

---

##  Estructura del proyecto

```
controller
  BookController.java       → API REST
  BookMvcController.java    → API SSR
  GlobalExceptionHandler.java → Controlador global de errores

service
  BookService.java          → Lógica de negocio

model
  Book.java                 → Clase modelo con validaciones

templates
  books-list.html           → Página que lista los libros
  error-page.html           → Página de error personalizada

```

---

## Endpoints REST (para usar en Postman)

Ejemplos para probar con Postman

### 1. Crear un libro (POST)

```
POST http://localhost:9090/api/books
```

Body (JSON):
```json
{
  "title": "1984",
  "author": "George Orwell",
  "stock": 10,
  "editorial": "Casa",
  "publicationDate": "1949-06-08"
}
```

### 2. Listar todos los libros (GET)

```
GET http://localhost:9090/api/books
```

### 3. Obtener un libro por ID (GET)

```
GET http://localhost:9090/api/books/1
```

### 4. Actualizar un libro (PUT)

```
PUT http://localhost:9090/api/books/1
```

Body (JSON):
```json
{
  "title": "1984",
  "author": "George Orwell",
  "stock": 15,
  "editorial": "Hola",
  "publicationDate": "1949-06-08"
}
```

### 5. Eliminar un libro (DELETE)

```
DELETE http://localhost:9090/api/books/1
```

---

## Interfaz web 

### Ver listado de libros

```
http://localhost:9090/books-list
```

Muestra los libros cargados en memoria. Se actualiza si:

- Has hecho un `POST` en Postman.
- No has reiniciado la app (no he usado ninguna base de datos).

### Página de error personalizada

Si ocurre un error, se redirige automáticamente a:

```
error-page.html
```

