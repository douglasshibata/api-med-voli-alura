# Api Med Voli Alura
API Rest desenvolvida na aula Spring boot 3 Desenvolva Api Rest Java da alura


## Informações do projeto
* Spring boot Versão - 3.0.0-RC2
* JAVA 17 LTS
* JAR
* MAVEN

### Dependências
* Spring Boot Starter Web
* Lombok
* Mysql
* Spring JPA
* flyway
* Validation

### Rodando BD com Docker
```bash
docker run -d --name medi-voli-mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=vollmed_api -e MYSQL_USER=test -e MYSQL_PASSWORD=test mysql:5.7
```