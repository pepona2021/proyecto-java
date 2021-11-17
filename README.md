# proyecto-java

PROBLEMA

Compañía de Asesorías en Prevención de Riesgos Laborales plantea el siguiente problema: 

La empresa no posee un sistema de información que le permita administrar toda la cantidad de
información que se genera, ni controlar las actividades y el recurso humano. Existen problemas
con la planificación de las visitas, generalmente los profesionales están en terreno por lo 
que no están disponibles para informarles sus actividades futuras. No existe registro del  
profesional que ha estado con mayor actividad ni se sabe dónde está cada uno.
           
Solicitud

El sistema debe permitir la planificación de actividades y el control de ejecución de éstas, 
la gestión de clientes, la coordinación entre la empresa, los profesionales 
y los clientes para la respuesta temprana ante incidentes de seguridad. Además, se requiere que 
el sistema genere reportes.

SOLUCION

Consultora Le Pepé S.A., implentara un sistema en Java, el cual consta de un menu principal, 
con las opciones principales de:


                 ("Menu Principal     ")
		 ("===================== ")
		 ("1. Almacenar Usuario. ")
		 ("2. Eliminar Usuario.  ")
		 ("3. Listar             ")
		 ("4. salir              ")
		 ("Selecciones su opción : ")

La opción 1 del Menu Principal: desplegara un submenu el cual indicara que tipo de usuario desea ingresar

                 ("MENU DE OPCIONES            ")
		 ("============================")
		 ("1. Almacenar Cliente.       ")
		 ("2. Almacenar Profesional.   ")
		 ("3. Almacenar Administrativo.")
		 ("4. Almacenar Capacitación.  ")
		 ("Selecciones su opción     : ")

La opción 1 del submenu de opciones pedira los datos del cliente:
-Run.
-Nombre de usuario.
-Fecha Nacimiento.
-Rut de empresa.
-Direccion.
-Comuna.
-Cantidad de empleados.
-Telefono.
-Razon Social.

Una vez ingresados, pedira si desea ingresar accidentes, si dice que sí, solicitara:
-¿Cuántos accidentes desea ingresar?.
-Un ID de accidente.
-Dia, Hora, Lugar, Origen y Consecuencia.

Luego consultara ¿Cuántas visitas desea registar?
-ID Visitas.
-Dia y Hora de la visita.
-Comentario.

A continuacion preguntará  ¿Cuántas revisiones desea agendar para la visita? y 
pedirá la siguiente información.
-ID Revision.
-Nombre de la Revisión.
-Detalle de la Revisión.
-Estado de Revisión.(Donde indicara alguno de los estados presentados posteriormente)
1.-Revisión esta sin problemas.
2.-Su revisión tiene observaciones.
3.-Su revisión no aprueba.

La opción 2 del submenu de opciones,Ingreso de Profesional.
-Run.
-Nombre de usuario.
-Fecha Nacimiento.
-Años de experiencia.
-Departamento.
-Titulo.
-Fecha de Ingreso.

La opción 3 del submenu de opciones,Ingreso de Administrativo.
-Run.
-Nombre de usuario.
-Fecha Nacimiento.
-Area.
-Experiencia Previa.
-Funcion

La opción 4 de submenu de opciones,Ingresar Capacitacion.
- Identificador.
- RUT cliente.
- Día.
- Hora.
- Lugar.
- Duración.
- Cantidad de asistentes.

La opción 2 del Menu Principal, desplegará un procedimiento el cual indicará que usuario desea eliminar, 
ingresando el Run de este con formato 11111111, sin guion ni digito verificador.

La opción 3 del Menu Principal, desplegará un sumbenu de listar, el cual segun la opción mostrara por pantalla
la informacion anteriormente ingresada de los usuarios y capacitaciones.
 


   	     ("MENU DE OPCIONES")
   	     ("=====================================   ")
   	     ("1: Listar Usuarios.                     ")
   	     ("2: Listar Usuarios por Tipo.            ")
   	     ("3: Listar Capacitaciones.               ")
   	     ("Selecciones su opción :                 ")


La opción 4 del Menu Principa, se saldra del menu, dando por terminado la ejecucion del sistema


Gracias por su preferencia, esperamos verlos pronto.

Consultora Le Pepé S.A.







