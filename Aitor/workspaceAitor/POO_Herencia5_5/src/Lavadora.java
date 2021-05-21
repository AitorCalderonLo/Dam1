public class Lavadora extends Electrodomestico{
  
    private final static int CARGA_DEF=5;
    private int carga;
    private static double precioAcumulado;
    public Lavadora(){
        this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF, CARGA_DEF);
    }
  
   
    public Lavadora(double precioBase, double peso){
        this(precioBase, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF, CARGA_DEF);
    }
  
  
    public Lavadora(double precioBase, double peso, String consumoEnergetico, String color, int carga){
        super(precioBase,peso, consumoEnergetico,color);
        this.carga=carga;
    }   

  
    public int getCarga() {
        return carga;
    }
    public static double getPrecioAcum() {
        return precioAcumulado;
    }
    public double precioFinal(){
        //Invocamos el método precioFinal del método padre
        double plus=super.precioFinal();
  
        //añadimos el código necesario
        if (carga>30){
            plus+=50;
        }
        precioAcumulado+=plus;
        return plus;
    }
  
   

}