package EmpresaFinal;
/**
 * 
 * @author Le Pepé
 *
 */
public class Usuario implements IAsesoria {
	
	private int run;
	private String nombre;
	private String fechadenacimiento;
	private String tipoUsuario;
/**
 * Constructor Vacio.
 */
	public Usuario() {
		
	}

	/**
	 * @param run Run.
	 * @param nombre Nombre.
	 * @param fechadenacimiento Fecha de Nacimiento.
	 * @param tipoUsuario Tipo Usuario.
	 */
	
	public Usuario(int run, String nombre, String fechadenacimiento,
			String tipoUsuario) {
		super();
		this.run = run;
		this.nombre = nombre;
		this.fechadenacimiento = fechadenacimiento;
		this.tipoUsuario = tipoUsuario;
	}
	
	/**
	 * @return el run
	 */
	public int getRun() {
		return run;
	}
	/**
	 * @param run el run a establecer
	 */
	public void setRun(int run) {
		this.run = run;
	}
	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return el fechadenacimiento
	 */
	public String getFechadenacimiento() {
		return fechadenacimiento;
	}
	/**
	 * @param fechadenacimiento el fechadenacimiento a establecer
	 */
	public void setFechadenacimiento(String fechadenacimiento) {
		this.fechadenacimiento = fechadenacimiento;
	}
	/**
	 * @return el tipoUsuario
	 */
	public String getTipoUsuario() {
		return tipoUsuario;
	}
	/**
	 * @param tipoUsuario el tipoUsuario a establecer
	 */
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

/**
 * Metodo Mostra Edad
 */
	public void mostrarEdad() {
		String anios = this.fechadenacimiento.substring(6,10);
		int numEntero = Integer.parseInt(anios);
		int mostrarEdad = 2021 - numEntero;
		System.out.println("La Edad del usuario es: "+mostrarEdad+ " años");
	}
	/**
	 * Metodo Analizar Usuario.
	 */
	public void analizarUsuario() {
		System.out.println("El nombre del usuario es: "+ this.nombre + 
				"\nEl RUN del usuario es: "+ this.run);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Usuario [run=");
		builder.append(run);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", fechadenacimiento=");
		builder.append(fechadenacimiento);
		builder.append(", tipoUsuario=");
		builder.append(tipoUsuario);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
