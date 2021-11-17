package EmpresaFinal;
/**
 * 
 * @author Le Pepé S.A.
 *
 */
public class Profesional  extends Usuario{
	
	
	private String departamento;
	private String titulo;
	private String fechaDeIngreso;
	private int anioExperiencia;

	/**
	 * Constructor Vacio.
	 */
	public Profesional() {
		super();
	}
	
	/**
	 * @param run Run
	 * @param nombre Nombre
	 * @param fechadenacimiento Fecha de Nacimiento
	 * @param tipoUsuario Usuario
	 * @param departamento Departamento
	 * @param titulo Titulo
	 * @param fechaDeIngreso Fecha de Nacimiento
	 * @param anioExperiencia Años de Experiencia
	 */
	public Profesional(int run, String nombre, String fechadenacimiento, 
			String tipoUsuario, String departamento,String titulo, 
			String fechaDeIngreso, int anioExperiencia) {
		super(run, nombre, fechadenacimiento, tipoUsuario);
		this.departamento = departamento;
		this.titulo = titulo;
		this.fechaDeIngreso = fechaDeIngreso;
		this.anioExperiencia = anioExperiencia;
	}
	/**
	 * @return el departamento
	 */
	public String getDepartamento() {
		return departamento;
	}
	/**
	 * @param departamento el departamento a establecer
	 */
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	/**
	 * @return el titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo el titulo a establecer
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return el fechaDeIngreso
	 */
	public String getFechaDeIngreso() {
		return fechaDeIngreso;
	}
	/**
	 * @param fechaDeIngreso el fechaDeIngreso a establecer
	 */
	public void setFechaDeIngreso(String fechaDeIngreso) {
		this.fechaDeIngreso = fechaDeIngreso;
	}
	/**
	 * @return el anioExperiencia
	 */
	public int getAnioExperiencia() {
		return anioExperiencia;
	}
	/**
	 * @param anioExperiencia el anioExperiencia a establecer
	 */
	public void setAnioExperiencia(int anioExperiencia) {
		this.anioExperiencia = anioExperiencia;
	}
	/**
	 * Metodo Analizar Usuario.
	 */
	public void analizarUsuario() {	
		System.out.println("-----------------------------");
		System.out.println("Datos del Profesional.");
		System.out.println("\nEl RUN es: "+ getRun()+"\nEL nombre Usuario:"
				+ getNombre()+"\nFecha de nacimiento es: "
				+ getFechadenacimiento()+ "\nTipo de Usuario: "+getTipoUsuario()
				+"\nTitulo: "+this.titulo+ "\nFecha de ingreso: "
				+ this.fechaDeIngreso);
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Profesional [departamento=");
		builder.append(departamento);
		builder.append(", titulo=");
		builder.append(titulo);
		builder.append(", fechaDeIngreso=");
		builder.append(fechaDeIngreso);
		builder.append(", anioExperiencia=");
		builder.append(anioExperiencia);
		builder.append("]");
		return builder.toString();
	}
	
}
