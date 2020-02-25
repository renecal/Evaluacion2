/**
 * Clase Televisor
 * 
 * @author Ren� Calfin Olate
 * @version 1.00001b
 */

package ClasesEvaluacion2;

public class Televisor extends Electrodomestico {
	//Sus atributos son resoluci�n (en pulgadas) y sintonizador TDT (booleano)
	private int resolucionTv;
	private boolean sintonizador;
	
	// Por defecto, la resoluci�n ser� de 20 pulgadas y el sintonizador ser� false.
	private final static int RESOLUCIONTV_DEAFULT = 20; 
	private final static boolean SINTONIZADOR_DEFAULT = false;
	
 
	//adem�s de los atributos heredados.
	//Un constructor por defecto.
	public Televisor() {
		this(PRECIO_BASE_DEAFULT, PESO_DEAFULT, RESOLUCIONTV_DEAFULT, COLOR_DEFAULT, CONSUMO_ENERGETICO_DEFAULT, SINTONIZADOR_DEFAULT);
		
		// TODO Auto-generated constructor stub
		
	} 
	//Un constructor con el precio y peso. El resto por defecto.
	public Televisor(double dPrecioBase, double dpeso) {
		this( dPrecioBase, dpeso, RESOLUCIONTV_DEAFULT, COLOR_DEFAULT, CONSUMO_ENERGETICO_DEFAULT, false);
		
		// TODO Auto-generated constructor stub
		
	}

	//Un constructor con la resoluci�n, sintonizador TDT y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre.
	public Televisor(double dPrecioBase, double dpeso, int resolucionTv, String sColor, char cConsumoEnergetico, boolean sintonizador) {
		super(dPrecioBase,dpeso, sColor, cConsumoEnergetico);
		// TODO Auto-generated constructor stub
		this.resolucionTv = resolucionTv;
		this.sintonizador =  sintonizador;
	}

	//M�todo get de resoluci�n y sintonizador TDT.
	public int getResolucionTv() {
		return resolucionTv;
	}


	public void setResolucionTv(int resolucionTv) {
		this.resolucionTv = resolucionTv;
	}


	public boolean isSintonizador() {
		return sintonizador;
	}


	public void setSintonizador(boolean sintonizador) {
		this.sintonizador = sintonizador;
	}
	

	//si tiene una resoluci�n mayor de 40 pulgadas, se incrementara el precio un 30% y si tiene un sintonizador TDT incorporado, aumentara 50 �. 
	// Recuerda que las condiciones que hemos visto en la clase Electrodom�stico tambi�n deben afectar al precio.	
	public double precioFinal() {
		double precioAdicionales = super.precioFinal(); 
//		System.out.println("precios adicionales: "+precioAdicionales);
		double precioEntrada = precioAdicionales;
		if (resolucionTv > 40) {
			precioAdicionales = precioAdicionales*1.30;
//   System.out.println(precioAdicionales-precioEntrada);
		}
		
		
		if (sintonizador) {
			precioAdicionales = precioAdicionales+50;
		}
		return precioAdicionales; 		
	}
	
	
	
}
