package EmpresaFinal;

import java.util.InputMismatchException;
import java.util.MissingResourceException;
import java.util.Scanner;
/**
 * 
 * @author Le Pepé S.A.
 * @version 1.0
 */
public class PrincipalMainMenu {

/**
 * 	Esta App es un sistema de planificación de actividades
 *  y el control de ejecución.
 * @param args No retorna nada
 */

	public static void main(String[] args) {
	   Cliente cliente1 = new Cliente();
	   Profesional profesional1 = new Profesional();
	   Administrativo administrativo1 = new Administrativo();
	   Contenedor contenedor = new Contenedor();
	   Capacitacion capacitacion1 = new Capacitacion();
	   Accidente accidente1 = new Accidente();
	   VisitaEnTerreno visitaEnTerreno1 = new VisitaEnTerreno();
	   Revision revision1 = new Revision();
		
	   
	   //usuario
	   int runUsuario =0;
	   String nombreUsuario;
	   String fechaNacimientoUsuario;
	   boolean continua;
		 
	   // Cliente
	   String RutCliente;
	   int rutRut=0;
	   String direccionCliente;
	   String comunaCliente;
	   int cantidadEmpleadosCliente;
	   int telefonoCliente;
	   String razonSocialCliente;
		 
	   //Administrativo
	   String nombreSuperiorAdministrativo;
	   String areaAdministrativo;
	   String experienciaPreviaAdministrativo;
	   String funcionAdministrativo;	
		 
	   //Profesional
	   String departamentoProfesional;
	   String tituloProfesional;
	   String fechaDeIngresoProfesional;
	   int anioExperienciaProfesional;
	   
	   //Capacitacion
	   String idCapacitacion;
	   String diaSemana;
	   String horaCapacitacion;
	   String lugarCapacitacion;
	   String duracionCapa;
	   int cantidadAsis;
	   
	   //Accidente
	   String respuesta;
	   int numeroAccidente;
	   int accidenteACC;
	   String dia_ACCIDENTE;
	   String hora_ACCIDENTE;
	   String accidenteIngresado;
	   String origen_ACCIDENTES;
	   String consecuencia_ACCIDENTES;
	   
	   
	   //visita terreno
	   int registroTerreno;
	   int visitaTerreno;
	   String diaVisita;
	   String lugarVisita;
	   String comentarioVisita;
	   
	   //revision visita
	   int cantidadVisita;
	   int idaRevision;
	   int estadoRevision;
	   
	   //menu y comprobacion
       Boolean comprobar = true;
	   Boolean salir =false;    
	   String opc;
	   String opc1;
	   String continuar="s";
	   
	   //variable eliminar Usuario
	   int eliminarUsuario;
	   
	   //Menu Principal
	   while(!salir) {
	     Scanner ingreso = new Scanner(System.in);
	      menuPrincipal();
	      //menu principal
	      opc = ingreso.next();//opcion de menu principal
	       switch(opc){
	         case "1":
	           while(continuar.equals("s") ) {
	             //menu Almacenar 
	        	   menuAlmacenar();
	        	   opc1 = ingreso.next();//opcion de menu de Almacenar
	        	    switch(opc1){
	        	      case "1":
	        	    	  System.out.print("Ingreso Cliente\n"); 
	        	    	  System.out.println("----------------");
	        	    	  do {
	     					 //Se implementa la excepción por ingreso incorrecto
	        	    		  //de caracteres especiales.
	     					try {
	     						continua = false;
	     						System.out.println("Ingrese su RUN, menor a "
	     						+ "99999999, Sin guión ni digito verificador:");
	     						runUsuario = ingreso.nextInt();
	     						ingreso.nextLine();
	     						
	     						if (runUsuario > 99999999) {
	     							System.out.println("El RUN ingresado es "
	     								+ "inválido,intente nuevamente.");
	     							continua = true;
	     						}
	     					} catch (InputMismatchException ime) {

	     						System.out.println("¡Atención!, Solo puede "
	     								+ "ingresar 8 números enteros");
	     						ingreso.nextInt();
	     						continua = true;
	     					}
	     				} while (continua);
	        	    	  cliente1.setRun(runUsuario);
	        	    	  //validacion nombre
	    	                        
	        	    	  do {
	      					System.out.println("Ingrese su nombre,"
	      							+ " mín10 y máx50 caracteres:");

	      					nombreUsuario = ingreso.nextLine();

	      					if (nombreUsuario.length() < 10 || 
	      							nombreUsuario.length() > 50){
	      						System.out.println("El nombre es inválido,"
	      								+ " intente nuevamente");
	      					}
	      				}while(nombreUsuario.length() < 10 || 
	      						nombreUsuario.length() > 50);
	        	    	  cliente1.setNombre(nombreUsuario);
 
	        	    	  //validar fecha que no este vacio
	        	    	  while (comprobar==true) {	
	        	    		  do {
	        						System.out.println("Ingrese su fecha de "
	        						+ "nacimiento, en formato (DD/MM/AAAA)");
	        						fechaNacimientoUsuario= ingreso.nextLine();

	        						if (fechaNacimientoUsuario.length() < 10 ||
	        							fechaNacimientoUsuario.length() > 10) {
	        							System.out.println("La fecha no es "
	        								+ "correcta, intente nuevamente.");
	        						}
	        					} 
	        					while (fechaNacimientoUsuario.length() < 10 || 
	        							fechaNacimientoUsuario.length() > 10);		 
	      					if (fechaNacimientoUsuario.length()==0) {									
	      					System.out.println("Por favor ingrese  fecha de "
	      				    + "Nacimiento: (DD/MM/AAAA)");}
	      					else {
	      					comprobar = false;}
	      					cliente1.setFechadenacimiento(fechaNacimientoUsuario);
	      				  }
	        	    	  cliente1.setTipoUsuario("Cliente");
	        	    	  System.out.println("Tipo de Usuario: Cliente");
	    	                        
	        	    	  //Datos Cliente
	        	    	  do {
	      					System.out.println("Ingrese el RUT del cliente, "
	      				+ "menor a 99999999. Sin guión ni digito verificador:");

	      					rutRut = ingreso.nextInt();
	      					ingreso.nextLine();

	      					if (rutRut > 99999999) {
	      						System.out.println("El RUT ingresado es inválido,"
	      								+ " intente nuevamente.");
	      					}
	      				} while (rutRut  > 99999999);
	        	    	  cliente1.setRut(rutRut);
	    	                        		
	        	    	  do {
	      					System.out.println("Ingrese dirección del cliente,"
	      							+ " máximo 70 caracteres:");

	      					direccionCliente = ingreso.nextLine();

	      					if (direccionCliente.length() > 70) {

	      						System.out.println("La longitud es inválida,"
	      								+ " intente nuevamente.");
	      					}

	      				} while (direccionCliente.length() > 70);
	        	    	  cliente1.setDireccion(direccionCliente);
	    	                        		
	        	    	  do {
	      					System.out.println("Ingrese comuna del cliente,"
	      							+ " máximo 50 caracteres:");

	      					comunaCliente= ingreso.nextLine();

	      					if (comunaCliente.length() > 50) {

	      						System.out.println("La comuna es inválida,"
	      								+ " intente nuevamente.");
	      					}

	      				} while (comunaCliente.length() > 50);
	        	    	  cliente1.setComuna(comunaCliente);
	    	                        		
	        	    	  System.out.println("Ingrese Cantidad de Empleados");
	        	    	  cantidadEmpleadosCliente= ingreso.nextInt();
	        	    	  cliente1.setCantidadEmpleados
	        	    	  (cantidadEmpleadosCliente);
	    	                        		
	        	    	  System.out.println("Ingrese Telefono");
	        	    	  telefonoCliente= ingreso.nextInt();
	        	    	  cliente1.setTelefono(telefonoCliente);
	    	                        		
	        	    	  System.out.println("Ingrese Razon Social");
	        	    	  ingreso.nextLine();
	        	    	  
	        	    	  razonSocialCliente = ingreso.nextLine();
	        	    	  cliente1.setRazonSocial(razonSocialCliente);
	        	    	  cliente1.analizarUsuario();
	        	    	  cliente1.obtenerNombre();
	        	    	  cliente1.obtenerNombreUsuario();
	        	    	  cliente1.mostrarEdad();
	        	    	  
	        	    	  System.out.println
	        	    	  ("¿Desea ingresar accidentes?(s/n)");
	      				respuesta = ingreso.nextLine();

	      				if (respuesta.equals("s")) {

	      					System.out.println
	      					("Cuántos accidentes desea registrar?");
	      					
	      					numeroAccidente = ingreso.nextInt();
	      					ingreso.nextLine();

	      					for (int i = 0; i < numeroAccidente; i++) {

	      						do {

	      							System.out.println("Ingrese identificador"
	      									+ " de accidente");
	      							;
	      							accidenteACC = ingreso.nextInt();
	      							ingreso.nextLine();

	      							if (accidenteACC < 1) {
	      							 System.out.println("Campo obligatorio");
	      							}
	      						} while (accidenteACC  < 1);

	      						accidente1.setIdACC(accidenteACC);

	      						System.out.println("El accidente será ingresado"
	      								+ "para el cliente con el RUT: " + " " 
	      								+ cliente1.getRut());

	      						System.out.println("\nIngrese día del accidente, "
	      								+ "Ejemplo: Lunes");
	      						
	      						dia_ACCIDENTE = ingreso.nextLine();
	      						accidente1.setDiaACC(dia_ACCIDENTE);

	      						System.out.println("Ingrese hora del accidente,"
	      								+ " Ejemplo: HH:MM");
	      					
	      						hora_ACCIDENTE = ingreso.nextLine();
	      						accidente1.setHoraACC(hora_ACCIDENTE);

	      						do {

	      							System.out.println("Ingrese lugar del "
	      									+ "accidente");

	      							accidenteIngresado = ingreso.nextLine();
	      							if (accidenteIngresado.length() < 1) {
	      								System.out.println("Campo obligatorio");
	      							}
	      							
	      						} while (accidenteIngresado.length() < 1);
	      						accidente1.setLugarACC(accidenteIngresado);

	      					
								do {

	      							System.out.println("Ingrese origen de "
	      									+ "accidente");

	      							origen_ACCIDENTES = ingreso.nextLine();
	      							if (origen_ACCIDENTES.length() > 100) {
	      								System.out.println(" Máximo 100 "
	      										+ "caracteres");
	      							}
	      						} while (origen_ACCIDENTES.length() > 100);

	      						accidente1.setOrigenACC(origen_ACCIDENTES);

	      						do {
	      							System.out.println("Ingrese consecuencias");

	      							consecuencia_ACCIDENTES = ingreso.nextLine();

	      							if (consecuencia_ACCIDENTES.length() > 100) {
	      								System.out.println("Máximo 100 "
	      										+ "caracteres");
	      							}
	      						} while (consecuencia_ACCIDENTES.length() > 100);

	      						accidente1.setConsecuenciasACC
	      						(consecuencia_ACCIDENTES);

	      						System.out.println(
	      								"El identificador de accidente es" + 
	      						" " + accidenteACC + " " + "el dia del "
	      								+ "accidente es:" + " "+ dia_ACCIDENTE 
	      								+ " " + " la hora del accidente es: ");
	      						System.out.println(" " + hora_ACCIDENTE + " " 
	      						+ "el lugar del accidente es: " 
	      						+ " " + accidenteIngresado + " el origen del"
	      								+ " accidente es: "
	      					    + " " + origen_ACCIDENTES + " " 
	      						+"la consecuencia del accidente es: " + " " 
	      					    + consecuencia_ACCIDENTES);

	      					}

	      				}

	      				System.out.println("Cuántas visitas desea registrar?");
	      				registroTerreno = ingreso.nextInt();
	      				
	      				ingreso.nextLine();
	      				for (int i = 0; i < registroTerreno; i++) {

	      					do {
	      						System.out.println("Ingrese ID de la visita: ");

								visitaTerreno = ingreso.nextInt();
	      						ingreso.nextLine();

	      						if (visitaTerreno< 1) {

	      							System.out.println("El ID no es válido,"
	      									+ " intente nuevamente");
	      						}

	      					} while (visitaTerreno < 1);

	      					visitaEnTerreno1.setId(visitaTerreno);

	      					System.out.println("La visita será ingresada "
	      					+ "para el cliente RUT: " 
	      					+ cliente1.getRut());

	      					System.out.println("Ingrese día de la visita "
	      							+ "Ejemplo 'lunes' ");
	      				
	      					diaVisita= ingreso.nextLine();
	      					visitaEnTerreno1.setDiaVT(diaVisita);

	      					do {
	      						System.out.println("Ingrese hora en formato"
	      								+ " HH:MM");

	      						hora_ACCIDENTE = ingreso.nextLine();

	      						if (hora_ACCIDENTE.length() < 5) {
	      							System.out.println("El formato ingresado "
	      									+ "es inválido,"
	      									+ " intente nuevamente.");
	      						}
	      					} while (hora_ACCIDENTE.length() < 5);
	      					visitaEnTerreno1.setHoraVT(hora_ACCIDENTE);

	      					do {
	      						System.out.println("Ingrese lugar de la "
	      								+ "visita:");

	      						lugarVisita = ingreso.nextLine();

	      						if (lugarVisita.length() < 1) {

	      							System.out.println("El campo lugar no "
	      									+ "puede estar vacío.");
	      						}

	      					} while (lugarVisita.length() < 1);

	      					visitaEnTerreno1.setLugarVT(lugarVisita);

	      					do {
	      						System.out.println("Ingrese comentarios: ");

	      						comentarioVisita = ingreso.nextLine();

	      						if (comentarioVisita.length() > 100) {

	      							System.out.println("Máximo 100 caracteres");
	      						}

	      					} while (comentarioVisita.length() > 100);

	      					visitaEnTerreno1.setComentariosVT(comentarioVisita);

	      					System.out.println("El id de la visita es" + " " 
	      					+ visitaTerreno 
	      							+ " " + " el día de la visita será: "
	      							+ " " + diaVisita + " " + " la hora será "
	      							+ hora_ACCIDENTE 
	      							+ " " + "el lugar de la visita será en "
	      							+ lugarVisita);

	      					System.out.println("Comentarios: " 
	      					+ comentarioVisita);

	      					System.out.println("Cuántas revisiones desea"
	      							+ " agendar para la visita?");
	      					cantidadVisita = ingreso.nextInt();
	      					ingreso.nextLine();

	      					for (int j = 0; j < cantidadVisita; j++) {

	      						
								do {
	      							System.out.println("Ingrese identificador"
	      									+ " de la revisión.");

	      							idaRevision = ingreso.nextInt();
	      							ingreso.nextLine();

	      							if (idaRevision < 1) {

	      								System.out.println("Campo obligatorio");
	      							}

	      						} while (idaRevision < 1);

								revision1.setIDVisita(idaRevision);

	      						do {
	      							System.out.println("Ingrese identificador"
	      									+ " de la visita en terreno");

	      							idaRevision = ingreso.nextInt();
	      							ingreso.nextLine();

	      							if (idaRevision < 1) {

	      								System.out.println("Campo obligatorio");
	      							}

	      						} while (idaRevision < 1);

	      						revision1.setIDVisita(idaRevision);

	      						do {
	      							System.out.println("Ingrese nombre de la "
	      									+ "revisión");

	      							accidenteIngresado = ingreso.nextLine();

	      							if (accidenteIngresado.length() < 10 || 
	      									accidenteIngresado.length() > 50) {

	      								System.out.println("Mínimo 10 y Máximo"
	      										+ "50 caracteres.");
	      							}

	      						} while (accidenteIngresado.length() < 10 ||
	      								accidenteIngresado.length() > 50);

	      						revision1.setNombre_alusivo_revision
	      						(accidenteIngresado);

	      						do {
	      							System.out.println("Ingrese detalle de la"
	      									+ " revisión");

	      							accidenteIngresado = ingreso.nextLine();

	      							if (accidenteIngresado.length() > 100) {

	      								System.out.println("Largo Máximo 100 "
	      										+ "caracteres");
	      							}

	      						} while (accidenteIngresado.length() > 100);

	      						revision1.setDetallesRevision
	      						(accidenteIngresado);

	      						System.out.println("Ingrese estado de revisión:"
	      								+ "1- Sin problemas  "
	      								+ "2- Con observaciones "
	      								+ "3- No aprueba ");

	      						estadoRevision = ingreso.nextInt();
	      						ingreso.nextLine();

	      						if (estadoRevision == 1) {
	      							System.out.println("Su revisión esta sin "
	      									+ "problemas");
	      						}
	      						if (estadoRevision == 2) {
	      							System.out.println("Su revisión tiene "
	      									+ "observaciones");
	      						}
	      						if (estadoRevision == 3) {
	      							System.out.println("Su revisión no aprueba");

	      						}

	      						revision1.setEstado(estadoRevision);

	      					}

	      				}
	      				contenedor.GuardarCliente(cliente1);
	      				break;
	      				
	      				//Ingreso Profesional.  
	    	          case "2":
	    	              System.out.print("Ingresar Profesional\n ");
	    	              System.out.println("---------------------");
	    	              do {
	    						// Se implementa la excepción por ingreso
	    	            	  //incorrecto de caracteres especiales.
	    						try {
	    							continua = false;
	    							System.out.println("Ingrese su RUN, menor a"
	    						+ " 99999999.Sin guión ni digito verificador:");
	    							runUsuario = ingreso.nextInt();
	    							ingreso.nextLine();

	    							if (runUsuario > 99999999) {
	    								System.out.println("El RUN ingresado "
	    								+ "es inválido, intente nuevamente.");
	    								continua = true;
	    							}

	    						} catch (InputMismatchException ime) {

	    							System.out.println("¡Atención! Sólo puede"
	    									+ " ingresar 8 números enteros");
	    							ingreso.nextLine();
	    							continua = true;
	    						}
	    					} while (continua);
	    	              profesional1.setRun(runUsuario);
	    	                        
	    	              do {  System.out.println("---------------------");
  						        System.out.println("Ingrese su nombre, mínimo "
  								+ "10 y máximo 50 caracteres:");

  						        nombreUsuario = ingreso.nextLine();

  						     if (nombreUsuario.length() < 10 || 
  						         nombreUsuario.length() > 50) {

  							    System.out.println("La longitud del nombre "
  							    		+ "no es válida, intente nuevamente.");
  						     }

	    	              } while (nombreUsuario.length() < 10 || 
  							nombreUsuario.length() > 50);
	    	              
	    	              profesional1.setNombre(nombreUsuario);
	    	                        
	    	              do {
	    						System.out.println("Ingrese su fecha de"
	    							+ " nacimiento en formato (DD/MM/AAAA) ");

	    						fechaNacimientoUsuario= ingreso.next();
	    						if (fechaNacimientoUsuario.length() < 10) {
	    							System.out.println("Fecha inválida, intente"
	    									+ " nuevamente.");
	    						}
	    					} while (fechaNacimientoUsuario.length() < 10);
	    	              profesional1.setFechadenacimiento
	    	              (fechaNacimientoUsuario);
	    	                        
	    	              profesional1.setTipoUsuario("Profesional");
	    	              System.out.println("Tipo de Usuario: Profesional");
	    	             
	    	              //Datos Prefesional
	    	              
	    	              System.out.println("\nIngrese Departamento");
	    	              ingreso.nextLine();
	    	              departamentoProfesional = ingreso.nextLine();
	    	              profesional1.setDepartamento
	    	              (departamentoProfesional);
	    	              
	    	              do {
	    						System.out.println("Ingrese título profesional,"
	    								+ " mínimo.10 y máximo.50 caracteres");

	    						tituloProfesional= ingreso.nextLine();

	    						if (tituloProfesional.length() < 10 || 
	    								tituloProfesional.length() > 50) {

	    							System.out.println("Título inválido, "
	    									+ "intente nuevamente.");
	    						}

	    					} while (tituloProfesional.length() < 10 ||
	    							tituloProfesional.length() > 50);
	    	              profesional1.setTitulo(tituloProfesional);
	    	                        
	    	              do {
	    						System.out.println("Ingrese fecha de ingreso "
	    								+ "en formato DD/MM/AAAA");

	    						fechaDeIngresoProfesional = ingreso.next();

	    						if (fechaDeIngresoProfesional.length() < 10) {
	    							System.out.println("Fecha es inválida, "
	    									+ "intente nuevamente.");
	    						}
	    					} while (fechaDeIngresoProfesional.length() < 10);
	    	              profesional1.setFechaDeIngreso
	    	              (fechaDeIngresoProfesional);
	    	                        
	    	              System.out.println("Ingrese años de Experiencia");
	    	              anioExperienciaProfesional = ingreso.nextInt();
	    	              profesional1.setAnioExperiencia
	    	              (anioExperienciaProfesional);
	    	                        
	    	              profesional1.analizarUsuario();
	    	              contenedor.GuardarProfesional(profesional1);
	    	              break;	    	             	 
	    	          case "3":
	    	        	  //Ingreso Administrativo.
	    	        	  System.out.print("Ingresar Administrativo\n");
	    	        	  System.out.println("---------------------");
	    	        	  do {
	    						// Se implementa la excepción por ingreso 
	    	        		  //incorrecto de caracteres especiales.
	    						try {
	    							continua = false;
	    							System.out.println("Ingrese su RUN,"
	    			                + " menor a 99999999. Sin guión ni digito"
	    			                + " verificador:");
	    							runUsuario = ingreso.nextInt();
	    							ingreso.nextLine();

	    							if (runUsuario > 99999999) {
	    								System.out.println("El RUN ingresado es"
	    									+ " inválido, intente nuevamente.");
	    								continua = true;
	    							}

	    						} catch (InputMismatchException ime) {

	    							System.out.println("Sólo puede ingresar "
	    									+ "8 números enteros");
	    							ingreso.nextLine();
	    							continua = true;

	    						}

	    					} while (continua);
	    	        	  administrativo1.setRun(runUsuario);
	    	                        
	    	        	  do {
	    						System.out.println("Ingrese su nombre, mínimo"
	    								+ " 10 y máximo 50 caracteres.");

	    						nombreUsuario = ingreso.nextLine();

	    						if (nombreUsuario.length() < 10 || 
	    								nombreUsuario.length() > 50) {

	    							System.out.println("La longitud del nombre"
	    								+ " no es válida, intente nuevamente.");
	    						}

	    					} while (nombreUsuario.length() < 10 || 
	    							nombreUsuario.length() > 50);
	    	        	  administrativo1.setNombre(nombreUsuario);
	    	                        
	    	        	  do {
	    						System.out.println("Ingrese fecha de ingreso "
	    								+ "en formato DD/MM/AAAA");

	    						fechaNacimientoUsuario = ingreso.next();

	    						if (fechaNacimientoUsuario.length() < 10) {
	    							System.out.println("Fecha es inválida, "
	    									+ "intente nuevamente.");
	    						}
	    					} while (fechaNacimientoUsuario.length() < 10);
	    	        	  administrativo1.setFechadenacimiento
	    	        	  (fechaNacimientoUsuario);
	    	                        
	    	        	  administrativo1.setTipoUsuario("Administrativo");
	    	        	  System.out.println("Tipo de Usuario: Administrativo");
	    	        	  
	    	        	  //Datos Administrativo
	    	                       
	    	        	  System.out.println("Ingrese Nombre de Superior");
	    	        	  ingreso.nextLine();
	    	        	  nombreSuperiorAdministrativo = ingreso.nextLine();
	    	        	  administrativo1.setNombreSuperior
	    	        	  (nombreSuperiorAdministrativo);
	    	               		 
	    	        		do {
	    						System.out.println("Ingrese área administrativo, "
	    								+ "mínimo 5 y máximo 20 caracteres");

	    						areaAdministrativo = ingreso.nextLine();

	    						if (areaAdministrativo.length() < 5 || 
	    								areaAdministrativo.length() > 20) {

	    							System.out.println("Campo es inválido, "
	    									+ "intente nuevamente.");
	    						}

	    					} while (areaAdministrativo.length() < 5 || 
	    							areaAdministrativo.length() > 20);
	    	        	  administrativo1.setArea(areaAdministrativo);
	    	               		
	    	        	  do {
	    						System.out.println("Ingrese experiencia previa, "
	    								+ "máximo 100 caracteres");

	    					experienciaPreviaAdministrativo = ingreso.nextLine();

	    					if (experienciaPreviaAdministrativo.length() > 100) {

	    					 System.out.println("Experiencia ingresada es "
	    					 		+ "inválida, intente nuevamente.");
	    						}

	    					} while (experienciaPreviaAdministrativo.length() > 100);
	    	        	  administrativo1.setExperienciaPrevia
	    	        	  (experienciaPreviaAdministrativo);
	    	               		
	    	        	  System.out.println("Ingrese Funcion");
	    	        	  funcionAdministrativo = ingreso.nextLine();
	    	        	  administrativo1.setFuncion(funcionAdministrativo);
	    	        	  administrativo1.analizarUsuario();
	    	        	  contenedor.GuardarAdministrativo(administrativo1);
	    	              break;
	    	          case "4":
	    					System.out.println("Se almacenará la capacitación "
	    							+ "para el siguiente cliente: \n");
	    					cliente1.analizarUsuario();
	    					int capacitacion;
	    					System.out.println("Cuántas capacitaciones desea"
	    							+ " registrar?");
	    					capacitacion = ingreso.nextInt();
	    					ingreso.nextLine();

	    					for (int i = 0; i < capacitacion; i++) {

	    						do {
	    							System.out.println("Ingrese numero "
	    									+ "identificador, Ejemplo 0001");

	    							idCapacitacion = ingreso.nextLine();

	    							if (idCapacitacion.length() < 1) {
	    								System.out.println("El ID es "
	    							+ "obligatorio,intente nuevamente.");
	    							}
	    						} while (idCapacitacion.length() < 1);

	    						capacitacion1.setId(idCapacitacion);

	    						do {
	    							System.out.println("Ingrese RUT del cliente");

	    							RutCliente = ingreso.nextLine();

	    							if (RutCliente.length() < 1) {
	    								System.out.println("El RUT es "
	    								+ "obligatorio, intente nuevamente.");
	    							}
	    						} while (RutCliente.length() < 1);

	    						capacitacion1.setRut(rutRut);

	    						do {
	    							System.out.println("Ingrese día de la "
	    						+ "capacitación en minúscula, ejemplo lunes:");

	    							diaSemana = ingreso.nextLine();

	    							if ("lunes" != diaSemana.intern() 
	    									&& "martes" != diaSemana.intern() 
	    									&& "miercoles" != diaSemana.intern()
	    									&& "jueves" != diaSemana.intern() 
	    									&& "viernes" != diaSemana.intern() 
	    									&& "sabado" != diaSemana.intern()
	    									&& "domingo" != diaSemana.intern()){
	    								System.out.println("Debe ingresar el "
	    							+ "día en minuscula, intente nuevamente.");
	    							}
	    						} while ("lunes" != diaSemana.intern() 
	    								&& "martes" != diaSemana.intern() 
	    								&& "miercoles" != diaSemana.intern()
	    								&& "jueves" != diaSemana.intern() 
	    								&& "viernes" != diaSemana.intern() 
	    								&& "sabado" != diaSemana.intern()
	    								&& "domingo" != diaSemana.intern());

	    						capacitacion1.setDia(diaSemana);

	    						do {
	    							System.out.println("Ingrese hora en formato"
	    									+ " HH:MM");

	    							horaCapacitacion = ingreso.nextLine();

	    							if (horaCapacitacion.length() < 5) {
	    								System.out.println("El formato "
	    										+ "ingresado es inválido, "
	    										+ "intente nuevamente.");
	    							}
	    						} while (horaCapacitacion.length() < 5);

	    						capacitacion1.setHora(horaCapacitacion);

	    						do {
	    							System.out.println("Ingrese el lugar, "
	    									+ "entre 10 y 50 caracteres:");

	    							lugarCapacitacion = ingreso.nextLine();

	    							if (lugarCapacitacion.length() < 10 || 
	    									lugarCapacitacion.length() > 50) {

	    								System.out.println("La longitud del "
	    							+ "lugar es inválida, intente nuevamente.");
	    							}

	    						} while (lugarCapacitacion.length() < 10 ||
	    								lugarCapacitacion.length() > 50);

	    						
								capacitacion1.setLugar(lugarCapacitacion);

	    						do {
	    							System.out.println("Ingrese duración, "
	    									+ "máximo 70:");

	    							duracionCapa = ingreso.nextLine();

	    							if (duracionCapa.length() > 70) {

	    								System.out.println("Duración inválida, "
	    										+ "intente nuevamente.");
	    							}

	    						} while (duracionCapa.length() > 70);

	    						capacitacion1.setDuracion(duracionCapa);

	    						do {
	    							System.out.println("Ingrese cantidad de "
	    						+ "asistentes, mayor que 0 y menor a 1000:");

	    							cantidadAsis = ingreso.nextInt();   						

	    						if (cantidadAsis < 0 || cantidadAsis > 1000) {

	    								System.out.println("La cantidad es "
	    								+ "inválida, intente nuevamente");
	    							}

	    					} while (cantidadAsis < 0 || cantidadAsis > 1000);

	    						capacitacion1.setCantidadAsistente(cantidadAsis);

	    						capacitacion1.mostrarDetalles();

	    						contenedor.GuardarCapacitacion(capacitacion1);
	    						
	    					}
	    					
	    					break;

	    	          default :System.out.println("OPCIÓN INCORRECTA");
	        	    }
	    	              System.out.println("¿Desea agregar otro Usuario "
	    	              		+ " (s/n)?");
	    	              continuar =ingreso.next();
	    	              salir=false;
	           }
	            	  
	                      break;
	                      
	         case "2":
	        	 //Eliminar Usuario
	           System.out.print("Eliminar Usuario");
	           System.out.print("");
	           System.out.println("Ingrese RUN del usuario sin digito "
	           		+ "verificador para eliminar");
						
	           eliminarUsuario = ingreso.nextInt();
				ingreso.nextLine();

				contenedor.EliminarUsuario(eliminarUsuario);

				System.out.println("\n\nEl usuario con RUN: " 
				+ eliminarUsuario + " ha sido eliminado exitosamente.");
				System.out.println(" ");
	           salir=false;
	           break;
	           
	         case "3":
	        	 
	        	 continuar="s";
	        	 opc1="";
	        	 
	        	 while(continuar.equals("s") ) {
	        		menuListado();
	        	    opc1 = ingreso.next();
	        	    //opcion de menu de listar    	
	        	    switch(opc1){
		    	      case "1":
		    	    	  //Listar Usuario.
		    	    	  System.out.println(" Listar Usuarios.");
		    	    	  contenedor.ListarUsuario();
		    	    	  break;
		    	      case "2":
		    	    	  //Listar Tipo Usuario.
		    	    	  menuListarPorTipo();
		    	    	  
		    	          break;	    	             	 
		    	      case "3":
		    	    	  //Listar Capacitacion
		    	    	  contenedor.ListarCapacitaciones();
		    	    	  
		    	    	  break;
		    	    	  
		    	      default :System.out.println("OPCIÓN INCORRECTA");
		            }
		    	              System.out.println("¿Desea seguir en el menu "
		    	              		+ "Listado (s/n)?");
		    	              continuar =ingreso.next();
	        	 }
	        	 
	            	   salir =false;
	            	   	
	                   break;
	               //Salir del Menu.    
	              case "4":
	            	   System.out.print("Gracias por trabajar con nosotros");
	            	   salir =true;
	            	   break;
	            	 
	              default : System.out.println("OPCIÓN INCORRECTA");
	       }	      
	    }
	}	
	/**
	 * Menu Lista por Tipo.
	 */
	  private static void menuListarPorTipo() {
		// TODO Auto-generated method stub
		  Contenedor contenedor = new Contenedor();
		  Scanner ingreso = new Scanner(System.in);
		  //variable de listado
		   String listar;
		  System.out.print("Listar Usuarios por Tipo ");
    	  do {

				System.out.println("Ingrese tipo de usuario a listar");
				listar = ingreso.nextLine();

				if ("Profesional" != listar.intern() && 
						"Administrativo" != listar.intern()
						&& "Cliente" != listar.intern()) {

					System.out.println("Tipo de usuario no existe");
				}

			} while ("Profesional" != listar.intern() && 
					"Administrativo" != listar.intern()
					&& "Cliente" != listar.intern());

			if (listar.equals("Profesional")) {
				contenedor.ListarUsuarioPorTipo
				(EmpresaFinal.Profesional.class);
			}

			if (listar.equals("Administrativo")) {
				contenedor.ListarUsuarioPorTipo
				(EmpresaFinal.Administrativo.class);
			}

			if (listar.equals("Cliente")) {
				contenedor.ListarUsuarioPorTipo
				(EmpresaFinal.Cliente.class);
			}
			
	}
	 
	  /**
	   * Menu opciones de Listado
	   * No hay Retorno 
	   */
	private static void menuListado() {
		// TODO Auto-generated method stub
	     System.out.print("\n");
   	     System.out.println("\nMENU DE OPCIONES");
   	     System.out.println("=========================");
   	     System.out.println("1: Listar Usuarios.");
   	     System.out.println("2: Listar Usuarios por Tipo.");
   	     System.out.println("3: Listar Capacitaciones.");
   	     System.out.print("Selecciones su opción : ");
	}

	/**
	 * Menu de Almacenar
	 * No hay Retorno
	 */
		private static void menuAlmacenar() {
			// TODO Auto-generated method stub
		  System.out.println("\nMENU DE OPCIONES");
		  System.out.println("================");
		  System.out.println("1. Almacenar Cliente.");
		  System.out.println("2. Almacenar Profesional.");
		  System.out.println("3. Almacenar Administrativo.");
		  System.out.println("4. Almacenar Capacitación.");
		  System.out.print("Selecciones su opción : ");
		}
		
	/**
	 * menu Principal 
	 * no hay retorno
	 */
		public static void menuPrincipal() {
			// TODO Auto-generated method stub
		   System.out.println("\nMenu Principal");
		   System.out.println("================");
		   System.out.println("1. Almacenar Usuario.");
		   System.out.println("2. Eliminar Usuario.");
		   System.out.println("3. Listar");
		   System.out.println("4. salir.");
		   System.out.print("Selecciones su opción : ");
		}
}	
	
		
		
		
		

