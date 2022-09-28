# exam_iessystem
Examen de ingreso IES Systems

1. Se requieres una base de datos, para este ejemplo se usao MyQSL se puede construir con el siguiente script

CREATE SCHEMA `mydb` ;

CREATE TABLE `mydb`.`Album` (
  `IdAlbum` INT NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(45) NOT NULL,
  `FechaCreacion` DATETIME NOT NULL,
  PRIMARY KEY (`IdAlbum`));


CREATE TABLE `mydb`.`Fotografia` (
  `IdFotografia` INT NOT NULL AUTO_INCREMENT,
  `IdAlbum` INT NULL,
  `Url` VARCHAR(200) NOT NULL,
  `Descripcion` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`IdFotografia`),
  INDEX `IdAlbum_idx` (`IdAlbum` ASC) VISIBLE,
  CONSTRAINT `IdAlbum`
    FOREIGN KEY (`IdAlbum`)
    REFERENCES `mydb`.`Album` (`IdAlbum`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
    
    2. En el archivo application.properties tienen que cambiar los siguientes parametros para aaceder a la DB segun sea el caso
    spring.datasource.url=jdbc:mysql://localhost:3306/mydb
    spring.datasource.username=
    spring.datasource.password=
    
    3. Al levantar el proyecto se puede acceder de manera local al Swagger y realizar pruebas desde la siguiente liga
    http://localhost:8080/swagger-ui/index.html
    
    
    Nota: los test de Swagger ya tienen un ejemplo del JSON que se puede enviar.
