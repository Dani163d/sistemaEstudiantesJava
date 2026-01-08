## Sistema de Gestión de Estudiantes (Consola)
Este es un proyecto sencillo desarrollado en Java utilizando Maven para la gestión de dependencias y MySQL como motor de base de datos. La aplicación permite buscar y visualizar estudiantes registrados directamente desde la terminal.

## Funcionalidades
Conexión a base de datos MySQL.

Búsqueda de estudiantes por consola.

## Tecnologías Utilizadas
Lenguaje: Java 17

Gestor de Dependencias: Maven

Base de Datos: MySQL

##  Configuración de la Base de Datos

Para que el sistema funcione correctamente, es necesario recrear la estructura de la base de datos en tu servidor local de MySQL.

1. Localiza la carpeta `bd/` en la raíz de este proyecto.
2. Dentro encontrarás el archivo `estudiante_db.sql`.
3. Importa este archivo en tu cliente de MySQL (Workbench, phpMyAdmin).

Este script creará automáticamente:
* La base de datos (Database).
* La tabla de `estudiantes`.
* Algunos registros de prueba para que puedas probar la búsqueda de inmediato.
