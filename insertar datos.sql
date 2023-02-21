-- Creacion de tabla bancolombia con columnas---
CREATE TABLE APPX_employee
(
id int,
firstname varchar(255),
lastname varchar(255),
department_id varchar(255),
salary varchar (255),
educationlevel_id varchar (255),
);

CREATE TABLE APPX_departament
(
id int,
department_name varchar(255),
department_city varchar(255),

);


create table APPX_educationlevel
(
id int ,
description varchar(255),
);
--------------------------------------------------------------------------------------------------------------------------------

--Insertar datos--
USE [bancolombia]
GO

INSERT INTO [dbo].[APPX_departament]
           ([id]
           ,[department_name]
           ,[department_city])
     VALUES
           (1, 'Antioquia', 'itagui')
GO
-------------------------------------------------------------------------------------------------------------------------------------------------

--Crear tabla employee--
CREATE TABLE employee 
(
id int,
name varchar(50)
);
-------------------------------------------------------------------------------------------------------------------------------------------------
-- Isertar datos--
USE [bancolombia]
GO
INSERT INTO [dbo].[employee]
([id],
[name])
VALUES(5, 'Varichara5')
GO
-------------------------------------------------------------------------------------------------------------------------------------------------
-- Instrucción para borrar registro con id=5 de la tabla empleado--
USE [bancolombia]
DELETE FROM [dbo].[employee]
WHERE id=5
GO
-------------------------------------------------------------------------------------------------------------------------------------------------
-- Listar datos de la tabla employee--
/****** Script for SelectTopNRows command from SSMS  ******/
SELECT [id]
      ,[name]
  FROM [bancolombia].[dbo].[employee]

 -------------------------------------------------------------------------------------------------------------------------------------------------
--6. Obtener nombre, apellido, salario, para los empleados mayor a igual a 50000 y menor o igual a 100000. Mostrar resultados ordenados por nombre
SELECT APPX_employee.firstname, APPX_employee.lastname, APPX_employee.salary
FROM APPX_employee
WHERE APPX_employee.salary >= 500 AND APPX_employee.salary <= 100000 
ORDER BY APPX_employee.firstname ASC

SELECT APPX_employee.firstname, APPX_employee.lastname, APPX_employee.salary
FROM APPX_employee
WHERE APPX_employee.salary BETWEEN 500 AND 100000 
ORDER BY APPX_employee.firstname ASC



 -------------------------------------------------------------------------------------------------------------------------------------------------
--7. Se tiene la tabla usuarios con los datos que se muestran a continuación, al ejecutar la siguiente consulta que se obtiene:
SELECT name, email, COUNT(*) as CountOf
FROM usuarios2
GROUP BY name, email
HAVING COUNT(*) > 1

 -------------------------------------------------------------------------------------------------------------------------------------------------


  -------------------------------------------------------------------------------------------------------------------------------------------------
--13. Listado de departamentos que tienen 2 o mas empleados 

SELECT APPX_departament.department_name, COUNT (APPX_employee.id) AS CANTIEMPLE
FROM APPX_departament
INNER JOIN APPX_employee
ON  APPX_departament.id= APPX_employee.department_id
GROUP BY APPX_departament.department_name,APPX_employee.department_id
HAVING COUNT (APPX_employee.department_id)>1
ORDER BY APPX_departament.department_name ASC

--Ver las tablas--
SELECT*
FROM APPX_departament

SELECT*
FROM APPX_employee



 ---------------------------------------------------------------------------------------------------------------------------------------------------
 --14.  Conteo de personas por departamento, suma de los sueldos por departamento, 
 -- Mostrar el nombre del departamento, la cuenta y la suma, ordenados por la suma de los sueldos de manera asc

 SELECT APPX_departament.department_name, COUNT (APPX_employee.department_id) as Cant_departamento, SUM (APPX_employee.salary) as Cant_salario
 FROM APPX_departament
 INNER JOIN APPX_employee
 ON APPX_departament.id = APPX_employee.department_id
 GROUP BY APPX_departament.department_name
 ORDER BY SUM (APPX_employee.salary) 


----------------------------------------------------------------------------------------------------------------------------------------------------

 ----------------------------------------------------------------------------------------------------------------------------------------------------


