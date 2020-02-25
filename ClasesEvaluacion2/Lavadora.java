/**
 * Clase Lavadora
 * 
 * @author René Calfin Olate
 * @version 1.00001b
 */

package ClasesEvaluacion2;

public class Lavadora extends Electrodomestico {
	//Su atributo es carga
	private double carga;
	//Por defecto, la carga es de 5 kg. Usa una constante para ello.
	private final static double CARGA_DEFAULT = 5;
	//, además de los atributos heredados.
	
	//Un constructor por defecto.
	public Lavadora() {
		this(PRECIO_BASE_DEAFULT, PESO_DEAFULT, COLOR_DEFAULT, CONSUMO_ENERGETICO_DEFAULT, CARGA_DEFAULT);
		
		// TODO Auto-generated constructor stub
		
	} 
	//Un constructor con el precio y peso. El resto por defecto.
	public Lavadora(double dPrecioBase, double dpeso) {
		this( dPrecioBase, dpeso, COLOR_DEFAULT, CONSUMO_ENERGETICO_DEFAULT, CARGA_DEFAULT);
		
		// TODO Auto-generated constructor stub
		
	}
	//Un constructor con la carga y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre.	
	public Lavadora(double dPrecioBase, double dpeso, String sColor, char cConsumoEnergetico, double carga) {
		super(dPrecioBase,  dpeso, sColor, cConsumoEnergetico);
		// TODO Auto-generated constructor stub
		this.carga = carga;
	}
	//Método get de carga.
	public double getCarga() {
		if (carga > 5) {
			return carga;
		} else {
			return CARGA_DEFAULT;
		}
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}



	
	/**
	 * precioFinal():, si tiene una carga mayor de 30 kg, aumentara el precio 50 €, sino es así no se incrementara el precio.
	 *  Llama al método padre y añade el código necesario. Recuerda que las 
	 * condiciones que hemos visto en la clase Electrodoméstico también deben afectar al precio.
	 * @return double precioAdicionales
	 */
	public double precioFinal() {

		double precio=super.precioFinal();
		if (carga > 30) {
			precio = precio + 50;
		}

		return precio;
	}

}
