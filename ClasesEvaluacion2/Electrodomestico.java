/**
 * Clase Super Clase Electrodomestico
 * @author René Calfin Olate
 * @version 1.00000b
 */

package ClasesEvaluacion2;


public class Electrodomestico {
	//Sus atributos son precio base, color, consumo energético (letras entre A y F) y peso.
	protected double dPrecioBase;
	protected   String sColor;
	protected  char cConsumoEnergetico;
	protected double dpeso;
//Por defecto, el color será blanco, el consumo energético será F, el precioBase es de $100.000 y el peso de 5 kg. Usar constantes para ello.
	protected final  static String COLOR_DEFAULT = "blanco";
	protected final static char CONSUMO_ENERGETICO_DEFAULT = 'F';
	protected final static double PRECIO_BASE_DEAFULT = 100000;
	protected final static double PESO_DEAFULT = 5;
	
	// constructor por defecto
	public Electrodomestico() {
		this(PRECIO_BASE_DEAFULT, PESO_DEAFULT, COLOR_DEFAULT, CONSUMO_ENERGETICO_DEFAULT);
		
		// TODO Auto-generated constructor stub
		
	}

	// Un constructor con el precio y peso. El resto por defecto.
	public Electrodomestico(double dPrecioBase, double dpeso) {
	this(dPrecioBase, dpeso, COLOR_DEFAULT, CONSUMO_ENERGETICO_DEFAULT);
	}

	//Un constructor con todos los atributos.
	public Electrodomestico(double dPrecioBase, double dpeso , String sColor, char cConsumoEnergetico ) {
		this.dPrecioBase = dPrecioBase;
		this.dpeso = dpeso; 
		comprobarColor(sColor);
		comprobarConsumoEnergetico(cConsumoEnergetico);
		
	}
	
	
	// getter precio base
	public double getdPrecioBase() {
		return dPrecioBase;
	}

	// setter precio base
	public void setdPrecioBase(double dPrecioBase) {
		if (dPrecioBase >= 0.0) {
			
			this.dPrecioBase = dPrecioBase;
		}else {
			this.dPrecioBase = PRECIO_BASE_DEAFULT;
		}
		
	}

	// getter color
	public String getsColor() {
		return sColor;
	}

	/**
	 * Se agrega color por defecto si el color no esta dentro de la lista
	 * @param sColor
	 * 
	 */
	public void setsColor(String sColor) {
		String[] colores= {"blanco","negro","rojo",
				"azul","gris"};
		for (int i = 0; i < colores.length; i++) {
			if (colores[i].equalsIgnoreCase(sColor)) {
				//System.out.println("Esta dentro de la lista");
				this.sColor = sColor;
			}else {
				//System.out.println("Cambiando Color.");
				this.sColor = COLOR_DEFAULT;
			}
		}
	}

	
	public char getcConsumoEnergetico() {
		return cConsumoEnergetico;
	}


	public void setcConsumoEnergetico(char cConsumoEnergetico) {
		this.cConsumoEnergetico = cConsumoEnergetico;
	}


	public double getDpeso() {
		return dpeso;
	}


	public void setDpeso(double dpeso) {
		this.dpeso = dpeso;
	}

	/**
	 * Se comprueba consumo energetico, si no es efectiva se agrega como por defecto F.
	 * @param letra char
	 * @return letra char
	 */
	public char comprobarConsumoEnergetico(char letra) {
		String letraConsumo=Character.toString(letra);
	    //Colores disponibles
        String lestrasConsumo[]={"a", "b", "c", "d", "e"};
        boolean encontrado=false;
  
        for(int i=0;i<lestrasConsumo.length && !encontrado;i++){
              
            if(lestrasConsumo[i].equalsIgnoreCase(letraConsumo)){
                encontrado=true;
                this.cConsumoEnergetico = letra;
                }             
        }           
        if(!encontrado){
            this.cConsumoEnergetico= CONSUMO_ENERGETICO_DEFAULT;
        }
		return letra;
	
			
	}
	
	/**
	 * metodo para comprobar color
	 * @param color
	 * @return color
	 */
	public String comprobarColor(String color) {
        //Colores disponibles
        String colores[]={"blanco", "negro", "rojo", "azul", "gris"};
        boolean encontrado=false;
  
        for(int i=0;i<colores.length && !encontrado;i++){
              
            if(colores[i].equals(color)){
                encontrado=true;
                this.sColor=color;
                }             
        }          
        if(!encontrado){
            this.sColor=COLOR_DEFAULT;
        }
		return color;
		
	}
	

	
	/**
	 * @apiNote Suma un valor según consumo energetico, luego suma un valor según su tamaño
	 * @return double preciofinal
	 */
	public double precioFinal() {
		char letraMayuscula = Character.toUpperCase(cConsumoEnergetico);
		double precioVariable = 0;
		
		switch (letraMayuscula) {
		case 'A':
			precioVariable = precioVariable + 100;
			break;
		case 'B':
			precioVariable = precioVariable + 80;
			break;
		case 'C':
			precioVariable = precioVariable + 60;
			break;
		case 'D':
			precioVariable = precioVariable + 50;
			break;
		case 'E':
			precioVariable = precioVariable + 30;
			break;
		case 'F':
			precioVariable = precioVariable + 10;
			break;
		
		}
		
		if (dpeso >= 0 && dpeso <= 19) {
			precioVariable = precioVariable+10;
		}
		else if(dpeso >= 20 && dpeso <= 49) {
			precioVariable = precioVariable+50;
		}else if(dpeso >= 50 && dpeso <= 79) {
			precioVariable = precioVariable+80;
		}else if(dpeso > 80) {
			precioVariable = precioVariable+80;
		}
		return dPrecioBase + precioVariable; 
		
	}
	


	@Override
	public String toString() {
		return "Electrodomestico [dPrecioBase=" + dPrecioBase + ", sColor=" + sColor + ", cConsumoEnergetico="
				+ cConsumoEnergetico + ", dpeso=" + dpeso + "]";
	}

	
	
	
	
	
	

}
