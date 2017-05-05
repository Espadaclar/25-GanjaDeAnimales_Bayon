
public class Cerdo extends Mamifero implements Vacunable
{  
  private static final int PESO_INICIAL = 15;
  private static final String SONIDO = "Ñoik, ñoik";  
  private static final int PUNTOS_DE_VIDA_GANADOS_POR_VACUNACION = 20;  
 

  public Cerdo (){
  	super(PESO_INICIAL,SONIDO);
  }
  
  public void vacunar() {
    variarPuntosDeVida(PUNTOS_DE_VIDA_GANADOS_POR_VACUNACION);
  }    
  
}
