package EmpresaFinal;
/**
 * 
 * @author Le Pepé S.A.
 *
 */
public class Accidente {

	private int idACC;
    private String rutACC;
    private String diaACC;
    private String horaACC;
    private String lugarACC;
    private String origenACC;
    private String consecuenciasACC;
	/**
	 * Constructor vacio
	 */
	public Accidente() {
		super();
	}
	/**
	 * @param idACC Identificador. 
	 * @param rutACC Rut.
	 * @param diaACC Dia.
	 * @param horaACC Hora.
	 * @param lugarACC Lugar.
	 * @param origenACC Origen.
	 * @param consecuenciasACC Consecuencia.
	 */
	public Accidente(int idACC, String rutACC, String diaACC, String horaACC,
			String lugarACC, String origenACC, String consecuenciasACC) {
		super();
		this.idACC = idACC;
		this.rutACC = rutACC;
		this.diaACC = diaACC;
		this.horaACC = horaACC;
		this.lugarACC = lugarACC;
		this.origenACC = origenACC;
		this.consecuenciasACC = consecuenciasACC;
	}
	/**
	 * @return el idACC
	 */
	public int getIdACC() {
		return idACC;
	}
	/**
	 * @param idACC el idACC a establecer
	 */
	public void setIdACC(int idACC) {
		this.idACC = idACC;
	}
	/**
	 * @return el rutACC
	 */
	public String getRutACC() {
		return rutACC;
	}
	/**
	 * @param rutACC el rutACC a establecer
	 */
	public void setRutACC(String rutACC) {
		this.rutACC = rutACC;
	}
	/**
	 * @return el diaACC
	 */
	public String getDiaACC() {
		return diaACC;
	}
	/**
	 * @param diaACC el diaACC a establecer
	 */
	public void setDiaACC(String diaACC) {
		this.diaACC = diaACC;
	}
	/**
	 * @return el horaACC
	 */
	public String getHoraACC() {
		return horaACC;
	}
	/**
	 * @param horaACC el horaACC a establecer
	 */
	public void setHoraACC(String horaACC) {
		this.horaACC = horaACC;
	}
	/**
	 * @return el lugarACC
	 */
	public String getLugarACC() {
		return lugarACC;
	}
	/**
	 * @param lugarACC el lugarACC a establecer
	 */
	public void setLugarACC(String lugarACC) {
		this.lugarACC = lugarACC;
	}
	/**
	 * @return el origenACC
	 */
	public String getOrigenACC() {
		return origenACC;
	}
	/**
	 * @param origenACC el origenACC a establecer
	 */
	public void setOrigenACC(String origenACC) {
		this.origenACC = origenACC;
	}
	/**
	 * @return el consecuenciasACC
	 */
	public String getConsecuenciasACC() {
		return consecuenciasACC;
	}
	/**
	 * @param consecuenciasACC el consecuenciasACC a establecer
	 */
	public void setConsecuenciasACC(String consecuenciasACC) {
		this.consecuenciasACC = consecuenciasACC;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Accidente [idACC=");
		builder.append(idACC);
		builder.append(", rutACC=");
		builder.append(rutACC);
		builder.append(", diaACC=");
		builder.append(diaACC);
		builder.append(", horaACC=");
		builder.append(horaACC);
		builder.append(", lugarACC=");
		builder.append(lugarACC);
		builder.append(", origenACC=");
		builder.append(origenACC);
		builder.append(", consecuenciasACC=");
		builder.append(consecuenciasACC);
		builder.append("]");
		return builder.toString();
	}
}
