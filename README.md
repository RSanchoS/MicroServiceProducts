# Microservice Products

Proyecto de microservicio en **Spring Boot** que se va encargar de la gestión de los productos y las distintas areas de estos.

Este proyecto se trabaja con TDD.

La documentación de la API REST se genera con **Swagger** .

La base de datos que se va usar es PostgresDb.

Para su despliegue se va incluir el plugin de **fabric8/docker-maven-plugin** para generar la imagen de este.

La configuración del puerto y el context path se encuentran en src/resources/application.yml


### TODO-LIST Configuración
- ✅ Configuración de proyecto basica del proyecto . (puerto, contextPath)
- ✅ Configuración de la base de datos (conexion)
- ✅ Configuración de la documentacion de Swagger
- ✅ Configuración del despliegue de la imagen con Docker.
- Configuración de bbdd para test de integración

### TODO-LIST Project

### Comandos utiles

$ mvn spring-boot:run -> Lanza el proyecto 

$ mvn test -> Lanza todos los test que se encuentren


### PostgresDB

Toda la configuración username, pass y dbname se encuentra en docker/.env

La base de datos que se va usar en este microservicio es ${POSTGRESDBNAME}.

En archivo docker/docker-compose.yml esta el contenedor de la base de datos para pruebas 
    $ docker-compose up -d -> Para lanzar la bbdd

### Swagger

Toda la configuración de Swagger se encuentra en config/SwaggerConfig.java

Para poder entrar en SwaggerUI 
    http://localhost:8001/api/v0/swagger-ui.html#/

Para ver las anotaciones de Swagger
    https://github.com/swagger-api/swagger-core/wiki/Annotations-1.5.X

### Docker maven

https://dmp.fabric8.io/#example

https://github.com/fabric8io/docker-maven-plugin

$ mvn docker:build -> Genera la imagen 
$ mvn docker:start -> Arranca el contenedor

### Lombok

https://projectlombok.org/features/all
