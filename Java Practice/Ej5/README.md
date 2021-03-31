# JAVA, Ejercicio 5
## Enunciado

![Diagrama de clases, ejercicio 5](https://github.com/utnfrrojava/javaClases/raw/master/enunciados/img/diagramaClases01.png)
De acuerdo al diagrama de clases resolver:

Cargar una lista de empleados (máximo 20) preguntado en cada uno si son administrativos o vendedores y cargar todos los datos respectivos.

* Luego listar los empleados indicando: dni, nombre, apellido y sueldo. 
* El sueldo debe calcularse en el método getSueldo() de la siguiente forma:

Si es administrativo: sueldoBase * ((hsExtra * 1.5)+hsMes) / hsMes
Si es vendedor: sueldoBase + (porcenComision*totalVtas/100)


## Restricciones

* Utilizar un único array para almacenar a todos los empleados.
* No usar colecciones dinámicas.
* Hacer uso de las ventajas de la programación orientada a objetos: herencia, redefinición y polimorfismo.
* Las clases lógicas (las del diagrama) no pueden tener entrada o salida de datos por pantalla de ningún tipo. Esto debe ser realizado por otra clase que cree los objetos de las clases lógicas y les asigne los datos necesarios.

## ToDo:
> Cambiar función getSueldo(), del main a clases Administrativo y Vendedor
