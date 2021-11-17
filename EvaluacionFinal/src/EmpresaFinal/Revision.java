package EmpresaFinal;
/**
 * 
 * @author Le Pepé S.A.
 *
 */
public class Revision {
	
	
	private int IDRevision;
	private int IDVisita;
	private String nombre_alusivo_revision;
	private String detallesRevision;
	private int estado;
	/**
	 * Constructor Vacio.
	 */
	public Revision() {
		
	}
	/**
	 * @param iDRevision Identificador Revision.
 	 * @param iDVisita Visita.
	 * @param nombre_alusivo_revision Nombre Alusivo.
	 * @param detallesRevision Detalle.
	 * @param estado Estado.
	 */
	public Revision(int iDRevision, int iDVisita, 
			String nombre_alusivo_revision, String detallesRevision,
			int estado) {
		super();
		IDRevision = iDRevision;
		IDVisita = iDVisita;
		this.nombre_alusivo_revision = nombre_alusivo_revision;
		this.detallesRevision = detallesRevision;
		this.estado = estado;
	}
	/**
	 * @return el iDRevision
	 */
	public int getIDRevision() {
		return IDRevision;
	}
	/**
	 * @param iDRevision el iDRevision a establecer
	 */
	public void setIDRevision(int iDRevision) {
		IDRevision = iDRevision;
	}
	/**
	 * @return el iDVisita
	 */
	public int getIDVisita() {
		return IDVisita;
	}
	/**
	 * @param iDVisita el iDVisita a establecer
	 */
	public void setIDVisita(int iDVisita) {
		IDVisita = iDVisita;
	}
	/**
	 * @return el nombre_alusivo_revision
	 */
	public String getNombre_alusivo_revision() {
		return nombre_alusivo_revision;
	}
	/**
	 * @param nombre_alusivo_revision el nombre_alusivo_revision a establecer
	 */
	public void setNombre_alusivo_revision(String nombre_alusivo_revision) {
		this.nombre_alusivo_revision = nombre_alusivo_revision;
	}
	/**
	 * @return el detallesRevision
	 */
	public String getDetallesRevision() {
		return detallesRevision;
	}
	/**
	 * @param detallesRevision el detallesRevision a establecer
	 */
	public void setDetallesRevision(String detallesRevision) {
		this.detallesRevision = detallesRevision;
	}
	/**
	 * @return el estado
	 */
	public int getEstado() {
		return estado;
	}
	/**
	 * @param estado el estado a establecer
	 */
	public void setEstado(int estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Revision [IDRevision=");
		builder.append(IDRevision);
		builder.append(", IDVisita=");
		builder.append(IDVisita);
		builder.append(", nombre_alusivo_revision=");
		builder.append(nombre_alusivo_revision);
		builder.append(", detallesRevision=");
		builder.append(detallesRevision);
		builder.append(", estado=");
		builder.append(estado);
		builder.append("]");
		return builder.toString();
	}
}
