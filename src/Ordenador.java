

/**Ampliar:    Crear atributo static
 *             método static mostrarGarantia()
 * 
 * @author ape
 */
public class Ordenador {
    //atributos
  private  String marca;
   private String procesador;
  private  String pantalla;
  
 private   boolean ordenadorEncendido;
    
//private      static final int garantia=2;
     //Constructores  
    public Ordenador(){        
    }
   
    public Ordenador(String marca, String procesador, String apagado){
        System.out.println("\nESTADO DEL ORDENADOR:" +"\nMarca  "+ marca +"\nProcesador  "+procesador+"\n"+apagado);
    }   
      
      
    //metodos
    void encenderOrdenador(){
        if(ordenadorEncendido == true){
            System.out.println("El ordenador ya está encendido");
        }else{  //si no está encendido, encenderlo
            ordenadorEncendido = true; 
            System.out.println("\nEl ordenador se ha encendido");
        }
    }
    void mostrarEstado(){
        System.out.println("\nESTADO DEL ORDENADOR:" +"\nMarca  "+ marca +"\nProcesador  "+procesador+"\nPantalla  "+pantalla+"\n");
        if(ordenadorEncendido == true){
            System.out.println("\nEl ordenador está encendido.");
        }else{  //si no está encendido...
            System.out.println("El ordenador está apagado");
        }
    }
    void apagarOrdenador(){
        if(ordenadorEncendido == true){
            ordenadorEncendido = false;
            System.out.println("El ordenador se ha apagado.\n");
        }
    }
   
    void asignarPantalla(String pantalla){
        System.out.println(pantalla);
        
    }
//    static public void mostrarGarantia(){
//         
//       System.out.println("Todos los ordenadores tiene de  garantía: "+ garantia);
//
//}

    
}
