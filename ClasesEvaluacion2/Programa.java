/**
 * Main
 * @author René Calfin Olate
 */

package ClasesEvaluacion2;
import java.text.NumberFormat;
import java.util.Locale;


public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// se crean 3 variables que sumaran los valores
		double totalElectrodomesticos=0;
        double totalTelevisores=0;
        double totalLavadoras=0;
        
        // cargamos configuracion de ubicacion para valores
        Locale chileLocale = new Locale("es","CL");
        
        // Creamos instancias cf(para mostrar un valor en formato $ Chileno y nf antepone un tag $Chi
        NumberFormat cf = NumberFormat.getCurrencyInstance(chileLocale);
        NumberFormat nf = NumberFormat.getNumberInstance(chileLocale);
		//Crea un array de Electrodomésticos de 10 posiciones.
		Electrodomestico tienda[] = new Electrodomestico[10]; 
		//Asigna a cada posición un objeto de las clases anteriores con los valores que desees.
		tienda[0] = new Televisor(250000.0, 3, 45, "negro", 'A', true);	  
        tienda[1]=new Televisor(260000.0, 7.0);
        tienda[2]=new Televisor(350000.0, 10.0);
        tienda[3] = new Televisor(450000.0, 3, 65, "gris", 'C', true);       
        tienda[4]=new Lavadora(150000.0, 10.0, "blanco", 'D', 25.0);
        tienda[5]=new Lavadora(344000.0, 21.0);
        tienda[6]=new Lavadora(32000.0, 21.0);
        tienda[7]=new Lavadora(150000.0, 45.0);
        tienda[8] = new Televisor(150000.0, 3, 32, "blanco", 'c', false);
        tienda[9] = new Televisor(250000.0, 3, 45, "negro", 'A', true); 
        
        
        for(int i=0;i<tienda.length;i++){
           //uso operador instanceof.
   
            if(tienda[i] instanceof Electrodomestico){
            	totalElectrodomesticos+=tienda[i].precioFinal();
            }
            if(tienda[i] instanceof Lavadora){
            	totalLavadoras+=tienda[i].precioFinal();
            }
            if(tienda[i] instanceof Televisor){
            	totalTelevisores+=tienda[i].precioFinal();
            }
        }
        
       //mostrar el precio de cada clase,
        //Se carga libreria Number format y locale para para imprimir números y fechas en formato Chileno 
        System.out.printf("El precio total de las lavadoras es de: $ %s \n",nf.format(totalLavadoras));
        System.out.printf("El precio total de las televisiones es de: $ %s \n",nf.format(totalTelevisores));
        System.out.printf("El precio total de electrodomesticos es: $ %s\n",nf.format(totalElectrodomesticos));

        
	}
	
	

}
