package EmpresaFinal;
/**
 * 
 * @author Le Pepé S.A.
 *
 */
public class Capacitacion extends Usuario {
	
	private String id;
	private int rut;
	private String dia;
	private String hora;
	private String lugar;
	private String duracion;
	private int cantidadAsistente;
	
	/**
	 * Constructor vacio.
	 */
	public Capacitacion() {
		super();
	}
	/**
	 * @param run Run
	 * @param nombre Nombre
	 * @param fechadenacimiento Fecha de Nacimiento.
	 * @param tipoUsuario Tipo Usuario
	 * @param id Identificador
	 * @param rut Rut
	 * @param dia Dia
	 * @param hora Hora
	 * @param lugar Lugar
	 * @param duracion Duracion
	 * @param cantidadAsistente Cantidad Asistente
	 */
	public Capacitacion(int run, String nombre, String fechadenacimiento,
			String tipoUsuario, String id, int rut, String dia, String hora, 
			String lugar, String duracion, int cantidadAsistente) {
		super(run, nombre, fechadenacimiento, tipoUsuario);
		this.id = id;
		this.rut = rut;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantidadAsistente = cantidadAsistente;
	}
	/**
	 * @return el id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id el id a establecer
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return el rut
	 */
	public int getRut() {
		return rut;
	}
	/**
	 * @param rut el rut a establecer
	 */
	public void setRut(int rut) {
		this.rut = rut;
	}
	/**
	 * @return el dia
	 */
	public String getDia() {
		return dia;
	}
	/**
	 * @param dia el dia a establecer
	 */
	public void setDia(String dia) {
		this.dia = dia;
	}
	/**
	 * @return el hora
	 */
	public String getHora() {
		return hora;
	}
	/**
	 * @param hora el hora a establecer
	 */
	public void setHora(String hora) {
		this.hora = hora;
	}
	/**
	 * @return el lugar
	 */
	public String getLugar() {
		return lugar;
	}
	/**
	 * @param lugar el lugar a establecer
	 */
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	/**
	 * @return el duracion
	 */
	public String getDuracion() {
		return duracion;
	}
	/**
	 * @param duracion el duracion a establecer
	 */
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	/**
	 * @return el cantidadAsistente
	 */
	public int getCantidadAsistente() {
		return cantidadAsistente;
	}
	/**
	 * @param cantidadAsistente el cantidadAsistente a establecer
	 */
	public void setCantidadAsistente(int cantidadAsistente) {
		this.cantidadAsistente = cantidadAsistente;
	}
	/**
	 * Metodo Mostrar Detalle.
	 */
	public void mostrarDetalles() {
			
			System.out.println(" La capacitación se llevará a cabo en "
			+ this.lugar +" ,a las "+ this.hora +"hrs del día " + this.dia 
			+" , y durará "+ this.duracion +" minutos.");
		}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Capacitacion [id=");
		builder.append(id);
		builder.append(", rut=");
		builder.append(rut);
		builder.append(", dia=");
		builder.append(dia);
		builder.append(", hora=");
		builder.append(hora);
		builder.append(", lugar=");
		builder.append(lugar);
		builder.append(", duracion=");
		builder.append(duracion);
		builder.append(", cantidadAsistente=");
		builder.append(cantidadAsistente);
		builder.append("]");
		return builder.toString();
	}
	
}
