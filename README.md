# hiring-exercise-06
# Solución prueba técnica Evaluación de Riesgos

Realizada por: Brayan Fernando Cárdenas Piragauta.

En primera instancia, se implementaron los 3 métodos solicitados en la clase CreditRiskAssessment, con la lógica necesaria para cumplir las correspondientes funcionalidades:

standardDeviation,
paymentDelayMaxPeakIndex,
latePaymentProbabilityByPeriod.

Se ejecutaron las pruebas unitarias propuestas y pasaron todas como se puede observar en la Imagen:

![image](https://user-images.githubusercontent.com/78576954/131445876-5f98e0b9-e6e2-4c3e-b833-7ca7c6af9333.png)

Luego de que pasaran los test, se propone realizar una aplicación web con las tecnologías deseadas para el cargo, donde se pudiese validar el funcionamiento de los métodos, por consiguiente, se diseña la siguiente aplicación:

# FRONTEND:

A continuación, se presenta el Frontend de la aplicación, esta Interfaz de usuario fue desarrollada usando Angular, Boostrap, HTML y CSS. 
Código fuente: /hiring-exercise-06-FRONTEND

![image](https://user-images.githubusercontent.com/78576954/131445932-57fb9b0d-788d-43f0-957e-49c7e4c16d72.png)

La Interfaz de usuario permite consultar la Evaluación de Riesgo de un cliente, teniendo en cuenta su número de identificación (cédula de ciudadanía) y el producto a consultar, de tal forma, la aplicación retorna la desviación estándar y el Índice del pico máximo de pagos atrasados de un producto del cliente, mostrando el resultado de dos de los métodos implementados. Esto lo hace realizando peticiones al Backend de la aplicación, cuya lógica usa la información de pagos atrasados de una base de datos PostgreSQL y se muestra más adelante. 

![image](https://user-images.githubusercontent.com/78576954/131445994-c4575273-456b-4db2-bba5-c2bf3563fa92.png)

# BACKEND:

La parte Backend de la aplicación se desarrolló usando Java 1.8, Spring Boot, Spring Data JPA para modelar capa de datos y sus respectivos repositorios, Spring Web para exponer los servicios de tipo Rest para ser consumidos por el Frontend, y Gradle como gestor de dependencias.

Código fuente: /hiring-exercise-06-BACKEND

![image](https://user-images.githubusercontent.com/78576954/131446026-70df7636-807d-41be-9f6e-d50da87eb7f0.png)

Como se puede observar en la Imagen, el Backend de la aplicación fue desarrollado teniendo en cuenta una estructura de paquetes, que incluyen Modelos, Controladores, Servicios y Repositorios.

riskEvaluationController : Controlador de tipo REST que expone los servicios de la aplicación, recibe petición http.
riskEvaluationService: Servicio principal de la aplicación, en él se aloja la lógica de negocio de la misma, haciendo uso de los repositorios o capa de acceso a datos.
Models: Clases que representan entidades de tablas de BD. (client, product, paymentDelay)
Repositories: Interfaces que tienen como fin el mapeo de la capa de datos de cada una de las entidades descritas en los modelos. (client, product, paymentDelay).

# BASE DE DATOS:
Para el diseño de la capa de datos, se diseña una base de datos en PostgreSQL, se plantea el modelo entidad relación mostrado en la siguiente Imagen, donde es posible observar tres tablas, paymentdelays, clients, products con sus respectivos campos, llaves primarias y relaciones de llaves foráneas:

Modelo entidad relación de la base de datos diseñada:

![image](https://user-images.githubusercontent.com/78576954/131446050-e376ec08-d43c-4037-a058-6e9ca5f10a08.png)

La base de datos fue llenada con el script insert.sql y de esta forma en la tabla principal (payment delays) se pueden observar los pagos atrasados, relacionados con el periodo, cantidad de día atrasados, el cliente y el producto del banco:

![image](https://user-images.githubusercontent.com/78576954/131446068-2fc401ed-712a-4076-8357-12ea8633f891.png)

# FUNCIONAMIENTO DE LA APP:

La aplicación de spring se ejecuta a través del puerto 8081 del computador local, y con un contexpath o url de acceso base al servicio: 
http://localhost:8081/scotiabank/api/CreditRiskApplication/getClientsRiskEvaluationByProduct
http://localhost:8081/scotiabank/api/CreditRiskApplication/getClientsRiskEvaluationByProduct?product=1&client=1010243260
La base de datos debe estar creada y con las configuraciones existentes en el application.properties del ambiente de desarrollo.

con el servicio corriendo se procede a compilar el proyecto Angular del frontend, con el comando ng serve sobre la ruta del explorador de archivos, al hacerlo se despliega la aplicación en el puerto 4200 y queda lista para ser usada por el usuario.

