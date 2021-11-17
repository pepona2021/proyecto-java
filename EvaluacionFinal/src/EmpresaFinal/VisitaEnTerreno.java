package EmpresaFinal;
/**
 * 
 * @author Le Pepé S.A.
 *
 */
public class VisitaEnTerreno {

	private int id;
	private String rutVT;
	private String diaVT;
	private String horaVT;
	private String lugarVT;
	private String comentariosVT;
	/**
	 * Constructor Vacío
	 */
	public VisitaEnTerreno() {
		super();
	}

	/**
	 * @param id Identificador Vista a Terreno.
	 * @param rutVT Rut.
	 * @param diaVT Dia.
	 * @param horaVT Hora.
	 * @param lugarVT Lugar.
	 * @param comentariosVT Comentarios.
	 */
	public VisitaEnTerreno(int id, String rutVT, String diaVT, String horaVT, 
			String lugarVT, String comentariosVT) {
		super();
		this.id = id;
		this.rutVT = rutVT;
		this.diaVT = diaVT;
		this.horaVT = horaVT;
		this.lugarVT = lugarVT;
		this.comentariosVT = comentariosVT;
	}

	/**
	 * @return el id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id el id a establecer
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return el rutVT
	 */
	public String getRutVT() {
		return rutVT;
	}

	/**
	 * @param rutVT el rutVT a establecer
	 */
	public void setRutVT(String rutVT) {
		this.rutVT = rutVT;
	}

	/**
	 * @return el diaVT
	 */
	public String getDiaVT() {
		return diaVT;
	}

	/**
	 * @param diaVT el diaVT a establecer
	 */
	public void setDiaVT(String diaVT) {
		this.diaVT = diaVT;
	}

	/**
	 * @return el horaVT
	 */
	public String getHoraVT() {
		return horaVT;
	}

	/**
	 * @param horaVT el horaVT a establecer
	 */
	public void setHoraVT(String horaVT) {
		this.horaVT = horaVT;
	}

	/**
	 * @return el lugarVT
	 */
	public String getLugarVT() {
		return lugarVT;
	}

	/**
	 * @param lugarVT el lugarVT a establecer
	 */
	public void setLugarVT(String lugarVT) {
		this.lugarVT = lugarVT;
	}

	/**
	 * @return el comentariosVT
	 */
	public String getComentariosVT() {
		return comentariosVT;
	}

	/**
	 * @param comentariosVT el comentariosVT a establecer
	 */
	public void setComentariosVT(String comentariosVT) {
		this.comentariosVT = comentariosVT;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VisitaEnTerreno [id=");
		builder.append(id);
		builder.append(", rutVT=");
		builder.append(rutVT);
		builder.append(", diaVT=");
		builder.append(diaVT);
		builder.append(", horaVT=");
		builder.append(horaVT);
		builder.append(", lugarVT=");
		builder.append(lugarVT);
		builder.append(", comentariosVT=");
		builder.append(comentariosVT);
		builder.append("]");
		return builder.toString();
	}
}