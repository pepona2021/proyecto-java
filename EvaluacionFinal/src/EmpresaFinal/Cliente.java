package EmpresaFinal;
/**
 * 
 * @author Le Pepé S.A.
 *
 */
public class Cliente extends Usuario{

	private int Rut;
	private String direccion;
	private String comuna;
	private int cantidadEmpleados;
	private int telefono;
	private String razonSocial;
	
	/**
	 * Constructor Vacio
	 */
	
	public Cliente() {
	}
	
	/**
	 * @param rut Rut
	 * @param direccion Direccion.
	 * @param comuna Comuna.
	 * @param cantidadEmpleados Cantidad Empleados
	 * @param telefono Telefono.
	 * @param razonSocial Razon Social.
	 */
	public Cliente(int rut, String direccion, String comuna, int cantidadEmpleados, int telefono, String razonSocial) {
		super();
		Rut = rut;
		this.direccion = direccion;
		this.comuna = comuna;
		this.cantidadEmpleados = cantidadEmpleados;
		this.telefono = telefono;
		this.razonSocial = razonSocial;
	}



	/**
	 * @return el rut
	 */
	public int getRut() {
		return Rut;
	}
	/**
	 * @param rut el rut a establecer
	 */
	public void setRut(int rut) {
		this.Rut = rut;
	}
	/**
	 * @return el direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion el direccion a establecer
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return el comuna
	 */
	public String getComuna() {
		return comuna;
	}
	/**
	 * @param comuna el comuna a establecer
	 */
	public void setComuna(String comuna) {
		this.comuna = comuna;
	}
	/**
	 * @return el cantidadEmpleados
	 */
	public int getCantidadEmpleados() {
		return cantidadEmpleados;
	}
	/**
	 * @param cantidadEmpleados el cantidadEmpleados a establecer
	 */
	public void setCantidadEmpleados(int cantidadEmpleados) {
		this.cantidadEmpleados = cantidadEmpleados;
	}
	/**
	 * @return el telefono
	 */
	public int getTelefono() {
		return telefono;
	}
	/**
	 * @param telefono el telefono a establecer
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	/**
	 * @return el razonSocial
	 */
	public String getRazonSocial() {
		return razonSocial;
	}
	/**
	 * @param razonSocial el razonSocial a establecer
	 */
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	/**
	 * Metodo Analizar Usuario
	 * No hay Retorno.
	 */
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("-----------------------------");
		System.out.println("Datos del Cliente.");
		System.out.println("\nEl RUN es: "+ getRun()
		+"\nEL nombre Usuario: "+ getNombre()
		+"\nFecha de nacimiento es: "
		+ getFechadenacimiento()+"\nTipo de Usuario: "+getTipoUsuario()
		+"\nLa direccion es: "+ this.direccion+ "\nLa comuna es: "+this.comuna);
		
		
	}
	/**
	 * Metodo Obtener Nombre.
	 * No hay  Retorno
	 */
	public void obtenerNombre() {	
		System.out.println("La razon social es: "+ this.razonSocial);
		}
	/**
	 * Metodo Obtener Nombre Usuario.
	 * No hay Retorno.
	 */
	public void obtenerNombreUsuario() {
		System.out.println("El nombre del usuario es: " + getNombre());
		
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [Rut=");
		builder.append(Rut);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append(", comuna=");
		builder.append(comuna);
		builder.append(", cantidadEmpleados=");
		builder.append(cantidadEmpleados);
		builder.append(", telefono=");
		builder.append(telefono);
		builder.append(", razonSocial=");
		builder.append(razonSocial);
		builder.append("]");
		return builder.toString();
	}
	
}
