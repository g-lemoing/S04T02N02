# Creació d'ApiRest amb SpringBoot i base de dades mySQL
En aquesta tasca desenvolupen un CRUD (Create, Read, Update, Delete) fent persistir les dades amb base de dades MySQL.

Creem un projecte Spring amb Spring Initializr (https://start.spring.io/), amb gestor de dependències Maven i 4 dependències: Spring Boot DevTools, Spring Web, Spring Data JPA i MySQL Driver.
Importem aquest projecte en Intellij, creem l'estructura de carpetes on escriurem el nostre codi: model (objecte d'accès a dades: Fruit), repository on desarem la interfície FruitRepository que fem heredar de la interfície JpaRepository per beneficiar-nos de tots els mètodes existents del CRUD, controller on ubiquem el nostre controlador FruitController, receptora de totes les peticions RestAPI, i finalment una cinquena carpeta excepcions on definim les excepcions personalitzades i un GlobalExceptionHandler per gestionar de forma totalment independent al controlador les excepcions que es produeixin.
En el fitxer application.properties, definim els paràmetres de conexió a la base de dades MySQL.

La clase Fruit té 3 atributs: 
- un id de tipus int, 
- un nom de tipus String,
- un pes de tipus int

El control d'excepcions està principalment destinat a cobrir casos de peticions mal fetes (on manca un paràmetre obligatori bàsicament, bé en la URI, bé en el body de la petició en cas de creació o eliminació), o casos de objectes no trobats en la base de dades.

La comprovació del funcionament de l'API es fa gràcies a l'eina Postman.

## Instalación: 
1. Clonar el repositorio de Github
git clone https://github.com/g-lemoing/S04T02N02.git
2. Abrir el IDE e importar el proyecto desde el repositorio local desde File > Open.
3. Abrir el MySQLWorkbench (descargarlo e instalarlo si necesario desde https://dev.mysql.com/downloads/) y crear una conexión
4. En la aplicación, editar si necesario el fichero application.properties para adecuar los valores de conexión a la base de datos. Los parámetros habituales son:
spring.datasource.url=jdbc:mysql://localhost:3306/db_grocershop?useSSL=false
spring.datasource.username=[your_username]
spring.datasource.password=[your_password]
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

## Ejecución:
Localizar la clase Main y ejecutar S04T02N02Application.
Abrir el Postman (descargar si necesario desde https://www.postman.com/downloads/), y ejecutar las peticiones:

http://localhost:8080/fruita/add

http://localhost:8080/fruita/update

http://localhost:8080/fruita/delete/{id}

http://localhost:8080/fruita/getOne/{id}

http://localhost:8080/fruita/getAll
## Contribucions:
1. Crear un fork del repositorio: 
2. Clonar el repositorio hacia el directorio local marcado por git bash
 git clone https://github.com/YOUR-USERNAME/S04T02N02
3. Crear una rama
git branch BRANCH-NAME
git checkout BRANCH-NAME
4. Realizar cambios o comentarios, y hacer un commit: git commit -m 'mensaje cambios'
5. Subir cambios a tu nueva rama: git push origin BRANCH-NAME
6. Hacer un pull request