package EmpresaFinal;
import java.util.ArrayList;
/**
 * 
 * @author Le Pepé
 *
 */
public class Contenedor  {

	//Aqui estamos creando listas
	static ArrayList<IAsesoria> instancia = new ArrayList<IAsesoria>();	
	static ArrayList<Capacitacion> listacapa = new ArrayList<Capacitacion>();
/**
 * Constructor Vacio
 */
	public Contenedor() {
		super();
		// TODO Auto-generated constructor stub
	}
	/** *
	 * Metodo Almacenar Cliente.
	 * @param cl Cliente
	 */
		public void GuardarCliente(Cliente cl) {
			instancia.add(cl);
		}
	/** *
	 * Metodo Almacenar Profesional.
	 * @param pro Profesional
	 */
		public void GuardarProfesional(Profesional pro) {
			instancia.add(pro);
		}
	/** *
	 * Metodo Almacenar Administrativo.
	 * @param adm Administrativo
	 */
		public void GuardarAdministrativo(Administrativo adm) {
			instancia.add(adm);
		}
	/** *
	 * Metodo Almacenar Capacitación.
	 * @param capa Capacitacion
	 */
		public void GuardarCapacitacion(Capacitacion capa) {
			listacapa.add(capa);
		}
	/** *
	 * Metodo Eliminar Usuario. 
	 * @param i Run 
	 */
		public void EliminarUsuario(int i) {

			instancia.removeIf(Usuario -> ((Usuario) Usuario).getRun() == i);

		}
		/**
		 * Metodo Listar Usuario.
		 */
		public void ListarUsuario() {
			for (IAsesoria ia : instancia) {
				ia.analizarUsuario();
			}
		}
	/** *
	 * Metodo Listar Usuario por Tipo.
	 * @param a Indicador Clase que resive.
	 */
		public void ListarUsuarioPorTipo(Class a) {
			for (int i = 0; i < instancia.size(); i++) {
				if (instancia.get(i).getClass().equals(a)) {
					System.out.println(instancia.get(i));
				}
			}
		}
		/**
		 * Metodo Listar Capacitacion.
		 */
		public void ListarCapacitaciones() {
			for (int i = 0; i < listacapa.size(); i++) {

				System.out.println(listacapa.get(i));

			}
		}
}
