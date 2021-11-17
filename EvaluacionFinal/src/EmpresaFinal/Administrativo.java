
package EmpresaFinal;
/**
 * 
 * @author Le Pepé S.A.
 *
 */
public class Administrativo extends Usuario {

	private String nombreSuperior;
	private String area;
	private String experienciaPrevia;
	private String funcion;	
	/**
	 * Constructor Vacio.
	 */
	public Administrativo() {
		super();
	}
	
	/**
	 * @param run Run
	 * @param nombre Nombre
	 * @param fechadenacimiento Fecha de Nacimiento.
	 * @param tipoUsuario Tipo Usurio.
	 * @param nombreSuperior Nombre Superior.
	 * @param area Area.
	 * @param experienciaPrevia Experiencia Previa.
	 * @param funcion Funcion.
	 */
	public Administrativo(int run, String nombre, String fechadenacimiento,
			String tipoUsuario, String nombreSuperior,
			String area, String experienciaPrevia, String funcion) {
		super(run, nombre, fechadenacimiento, tipoUsuario);
		this.nombreSuperior = nombreSuperior;
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
		this.funcion = funcion;
	}
	/**
	 * @return el nombreSuperior
	 */
	public String getNombreSuperior() {
		return nombreSuperior;
	}
	/**
	 * @param nombreSuperior el nombreSuperior a establecer
	 */
	public void setNombreSuperior(String nombreSuperior) {
		this.nombreSuperior = nombreSuperior;
	}
	/**
	 * @return el area
	 */
	public String getArea() {
		return area;
	}
	/**
	 * @param area el area a establecer
	 */
	public void setArea(String area) {
		this.area = area;
	}
	/**
	 * @return el experienciaPrevia
	 */
	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}
	/**
	 * @param experienciaPrevia el experienciaPrevia a establecer
	 */
	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}
	/**
	 * @return el funcion
	 */
	public String getFuncion() {
		return funcion;
	}
	/**
	 * @param funcion el funcion a establecer
	 */
	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}
	/**
	 * Metodo Analizar Usuario.
	 */
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("-----------------------------");
		System.out.println("Datos del Profesional.");
		System.out.println("\nEl RUN es: "+ getRun()+"\nEL nombre Usuario:"
				+ getNombre()+"\nFecha de nacimiento es: "
				+ getFechadenacimiento()+ "\nTipo de Usuario: "+getTipoUsuario()
				+"\nArea: "+this.area+ "\nExperiencia Previa: "
				+ this.experienciaPrevia+ " Años");
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Administrativo [nombreSuperior=");
		builder.append(nombreSuperior);
		builder.append(", area=");
		builder.append(area);
		builder.append(", experienciaPrevia=");
		builder.append(experienciaPrevia);
		builder.append(", funcion=");
		builder.append(funcion);
		builder.append("]");
		return builder.toString();
	}
}
