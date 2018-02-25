/**
 * DepositoCombustible es una clase que representa el dep�sito de gasolina de un coche
 * Un objeto DepositoCombustible agrupa la informaci�n necesaria para describir el estado del dep�sito:
 * <ul>
 *   <li> depMax   capacidad del dep�sito
 *   <li> depNivel	nivel de gasolina del dep�sito
 * </ul>
 * 
 * class invariante 		0.0 &lt;= depNivel &lt;= depMax
 * 
 * @author IES Seveero Ochoa Team
 * @version 1.0
 *
 */
public class DepositoCombustible {

    private static double depMax;
    private static double depNivel;

   /**
	* DepositoCombustible es el constructor de la clase. 
	* 
	* <hr>
	* <br> precondici�n  depMax &gt; 0.0 and 0.0 &lt;= depNivel &lt;= getTankMax()  
	* <br> postcondici�n depMax &gt; 0.0 and 0.0 &lt;= depNivel &lt;= getTankMax() 
	* <hr>
	* 
	* @param tankMax  es la cantidad de combustible (medida en litros) que cabe en el dep�sito
	* @param tankLevel es la cantidad de combustible (medida en litros) que contiene el dep�sito inicialmente
	* 
	*/ 
	DepositoCombustible(double tankMax, double tankLevel) {
       this.depMax   = tankMax;
       this.depNivel = tankLevel;
    }

   /**
    * getDepositoNivel es un método para obtener informaci�n
    * 
    * @return	la cantidad de combustible en el dep�sito
    */
    public static double getDepositoNivel(){
       return depNivel;
    }

   /**
    * getDepositoMax es un m�todo para obtener informaci�n
    * 
    * @return	la capacidad (en litros) del dep�sito
	*/
	public static double getDepositoMax(){
       return depMax;
    }

   /**
	* estaVacio da informaci�n del estado 
	* 
	* @return 	<code>true</code> si el dep�sito est� vacio 
    *          <code>false</code> en otro caso.
	*/
    public boolean estaVacio(){
      return depNivel == 0;
    }

    /**
	 * estaLleno informaci�n del estado 
	 * 
	 * @return 	<code>true</code> si el dep�sito est� lleno 
     *          <code>false</code> en otro caso.
	 */
    public boolean estaLleno(){
	  return depNivel == depMax;
    }

   /**
	* llenar es un m�todo que efecta cambios a�adiendo combustible al dep�sito
	* 
	* <hr>
	* <br> precondicion 	0.0 &lt; amount &lt;= getDepositoMax() - getDepositoNivel() 
	* <br> postcondicion 	no vacio
	* <br> postcondicion  	depNivel &gt; depNivel_inicial 
	* <hr>
	* 
	* @param amount 	Cantidad de combustible que añade
	* 
	*/
    public void fill(double amount){
       depNivel = depNivel + amount;
    }

   /**
	* consumir es un m�todo que efectua cambios reduciendo el combustible del dep�sito
	* 
    * @param amount cantidad de fuel consumida
    * 
    */
	public void consumir(double amount){
       depNivel = depNivel - amount;
    }
}
