# Memoria de organización y desarrollo del proyecto T-RAZA

## 1. Introducción

Este documento recoge la organización, planificación y seguimiento del trabajo realizado durante el desarrollo del proyecto T-RAZA.

El proyecto se ha desarrollado en equipo, utilizando la metodología Scrum para organizar las tareas, repartir responsabilidades y realizar un seguimiento del progreso.

A lo largo de esta memoria se describirá la organización del equipo, las tareas realizadas durante el Sprint, las funcionalidades desarrolladas, las herramientas utilizadas y las dificultades encontradas.

El objetivo es dejar constancia del trabajo realizado y valorar el funcionamiento del equipo durante el desarrollo del proyecto.

## 2. Organización del equipo y reparto de responsabilidades

El equipo de desarrollo del proyecto T-RAZA está formado por cuatro integrantes. Para organizar el trabajo, se repartieron las responsabilidades teniendo en cuenta las diferentes partes del proyecto.

Las responsabilidades principales de cada integrante son las siguientes:

| Integrante | Responsabilidades |
|---|---|
| Daniel | Scrum Master. Gestión y seguimiento de las tareas en Trello, desarrollo de los endpoints GET de establecimientos, categorías y productos, configuración de CORS y documentación del proyecto. |
| Ildefonso | Desarrollo y gestión de la parte del backend. |
| Curro | Diseño y preparación de la base de datos. |
| Alexis | Desarrollo del frontend utilizando Angular. |

### 2.1. Organización del trabajo

El equipo utiliza GitHub para gestionar el código fuente y controlar los cambios realizados por cada integrante.

Además, se utiliza Trello para organizar las tareas, asignar responsables y realizar un seguimiento del trabajo pendiente y completado.

La distribución de responsabilidades permite que cada integrante trabaje en una parte concreta del proyecto, facilitando la coordinación y la integración de los diferentes componentes.

## 3. Planificación y seguimiento del Sprint 2

### 3.1. Planificación del Sprint

Para el Sprint 2 se establecieron los objetivos y las tareas que debía realizar el equipo durante este periodo.

Para organizar el trabajo, se seleccionaron las historias de usuario correspondientes del Product Backlog y se trasladaron al tablero de Trello.

**Duración del Sprint:** [Añadir fecha de inicio y fecha de finalización].

**Historias de usuario seleccionadas:** [Añadir las historias de usuario que finalmente se incluyeron en el Sprint].

### 3.2. Herramienta de seguimiento

Para gestionar el Sprint se utilizó Trello, mediante el tablero del proyecto T-RAZA.

El tablero permite organizar las tareas en diferentes listas según su estado, facilitando la visualización del trabajo pendiente, en progreso y terminado.

Como Scrum Master, mi responsabilidad fue mantener organizado el tablero, facilitar el seguimiento de las tareas y comprobar que el trabajo estuviera correctamente asignado.

### 3.3. Seguimiento del trabajo

Durante el desarrollo del Sprint, Trello sirvió como herramienta para consultar el estado de las tareas y visualizar el progreso del equipo.

Las tareas completadas se trasladaron a la lista correspondiente de finalizadas, mientras que las que todavía estaban pendientes permanecieron en sus correspondientes listas.

De esta manera, el equipo pudo tener una visión general del trabajo realizado y de las tareas que todavía quedaban por completar.

## 4. Funcionalidades desarrolladas

Durante el desarrollo del proyecto he trabajado principalmente en la parte de consultas del backend y en la configuración necesaria para permitir la comunicación entre el frontend y el backend.

### 4.1. Consulta de establecimientos

Se ha trabajado en la implementación de los endpoints GET de establecimientos.

Las operaciones desarrolladas permiten:

- Obtener todos los establecimientos.
- Buscar un establecimiento mediante su identificador.

Endpoints:

| Método HTTP | Ruta | Funcionalidad |
|---|---|---|
| GET | `/api/establecimientos` | Obtener todos los establecimientos. |
| GET | `/api/establecimientos/{id}` | Buscar un establecimiento por ID. |

### 4.2. Consulta de categorías

Se ha trabajado en la implementación de los endpoints GET de categorías.

Las operaciones desarrolladas permiten:

- Obtener todas las categorías.
- Buscar una categoría mediante su identificador.

Endpoints:

| Método HTTP | Ruta | Funcionalidad |
|---|---|---|
| GET | `/api/categorias` | Obtener todas las categorías. |
| GET | `/api/categorias/{id}` | Buscar una categoría por ID. |

### 4.3. Consulta de productos

Se ha trabajado en la implementación de los endpoints GET de productos.

Las operaciones desarrolladas permiten:

- Obtener todos los productos.
- Buscar un producto mediante su identificador.

Endpoints:

| Método HTTP | Ruta | Funcionalidad |
|---|---|---|
| GET | `/api/productos` | Obtener todos los productos. |
| GET | `/api/productos/{id}` | Buscar un producto por ID. |

### 4.4. Configuración de CORS

También se ha añadido una configuración de CORS en el backend mediante una clase llamada `CorsConfig`.

Esta configuración permite que el frontend desarrollado con Angular pueda realizar peticiones HTTP al backend desde su origen local:

`http://localhost:4200`

Se han permitido los siguientes métodos HTTP:

- GET
- POST
- PUT
- PATCH
- DELETE
- OPTIONS

También se han permitido las cabeceras HTTP necesarias para las peticiones.

Con esta configuración se prepara el backend para permitir la comunicación entre ambas partes de la aplicación.

## 5. Pruebas realizadas

Para comprobar el funcionamiento de los endpoints se ha utilizado Postman.

Se han realizado peticiones GET a los diferentes recursos de la API, comprobando que el backend devuelve los datos almacenados en la base de datos.

### 5.1. Pruebas de establecimientos

Se han probado las siguientes rutas:

- `GET http://localhost:8080/api/establecimientos`
- `GET http://localhost:8080/api/establecimientos/1`

### 5.2. Pruebas de categorías

Se han probado las siguientes rutas:

- `GET http://localhost:8080/api/categorias`
- `GET http://localhost:8080/api/categorias/1`

### 5.3. Pruebas de productos

Se han probado las siguientes rutas:

- `GET http://localhost:8080/api/productos`
- `GET http://localhost:8080/api/productos/1`

Las peticiones probadas devolvieron respuestas satisfactorias y permitieron comprobar que los datos se recuperaban correctamente.

### 5.4. Evidencias

En este apartado se añadirán capturas de Postman que muestren las peticiones realizadas y sus respuestas.

También se incluirán capturas del código de la configuración CORS y del backend iniciado correctamente.

**Evidencias pendientes de añadir:**

- Captura de GET de establecimientos.
- Captura de GET de categorías.
- Captura de GET de productos.
- Captura de la clase `CorsConfig`.
- Captura del backend arrancado sin errores.

## 6. Herramientas utilizadas

Durante el desarrollo del proyecto se han utilizado las siguientes herramientas:

| Herramienta | Uso |
|---|---|
| GitHub | Control de versiones y gestión del código fuente. |
| Trello | Organización y seguimiento de las tareas mediante Scrum. |
| Visual Studio Code | Edición y desarrollo del código. |
| Spring Boot | Desarrollo del backend y de la API REST. |
| MySQL | Almacenamiento y gestión de los datos. |
| MySQL Workbench | Administración y consulta de la base de datos. |
| Postman | Pruebas de los endpoints de la API. |
| Angular | Desarrollo del frontend. |

## 7. Dificultades encontradas

Durante el desarrollo se han encontrado algunas dificultades técnicas que han sido necesarias resolver para continuar con el trabajo.

Una de ellas estuvo relacionada con la conexión del backend a la base de datos MySQL. El problema se debía a que la variable de entorno que contenía la contraseña de la base de datos no estaba disponible en la terminal. Se solucionó configurando de nuevo dicha variable antes de iniciar Spring Boot.

También se encontraron algunos problemas al realizar las primeras peticiones desde Postman, relacionados con la introducción incorrecta de la dirección de la API y con la actualización del backend después de crear nuevos controladores.

Por último, se añadió una configuración de CORS para preparar la comunicación entre el frontend Angular y el backend Spring Boot.

## 8. Retrospectiva del Sprint 2

La retrospectiva permite valorar el trabajo realizado durante el Sprint, identificar los aspectos positivos y detectar posibles mejoras para los siguientes periodos de desarrollo.

### 8.1. Aspectos positivos

- Se han desarrollado y probado diferentes endpoints GET del backend.
- Se ha avanzado en la integración de los componentes del proyecto.
- Se ha utilizado Trello para organizar y consultar el estado de las tareas.
- Se han resuelto algunos problemas técnicos durante el desarrollo.

### 8.2. Aspectos que se pueden mejorar

- Mejorar la coordinación y comunicación entre los integrantes.
- Mantener actualizado el tablero de Trello.
- Comprobar las funcionalidades a medida que se desarrollan.
- Documentar los cambios realizados para facilitar el seguimiento del proyecto.

### 8.3. Propuestas de mejora

Para los siguientes Sprints se propone mantener una comunicación constante entre los integrantes, actualizar las tareas de Trello y realizar pruebas de las funcionalidades antes de darlas por finalizadas.

También se considera importante mantener la documentación actualizada durante todo el desarrollo del proyecto.

## 9. Conclusiones

El desarrollo del proyecto T-RAZA está permitiendo poner en práctica los conocimientos adquiridos durante el ciclo formativo, tanto en programación como en gestión de proyectos.

La utilización de Scrum, Trello y GitHub facilita la organización del equipo y el seguimiento del trabajo.

En mi caso, he participado en la gestión del equipo como Scrum Master y en el desarrollo de diferentes funcionalidades del backend, además de preparar la configuración CORS.

Este trabajo servirá como base para continuar desarrollando e integrando las diferentes partes de la aplicación en los siguientes Sprints.