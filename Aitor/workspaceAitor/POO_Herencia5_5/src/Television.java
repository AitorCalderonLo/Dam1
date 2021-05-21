public class Television extends Electrodomestico{
  
    private final static int RESOLUCION_DEF=20;
  
    private int resolucion;
  
    private boolean sintonizadorTDT;
    
    private static double precioAcumulado;
  
    public Television(){
        this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF, RESOLUCION_DEF, false);
    }
  
    public Television(double precioBase, double peso){
        this(precioBase, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF, RESOLUCION_DEF, false);
    }
  
   
    public Television(double precioBase, double peso,String consumoEnergetico, String color, int resolucion, boolean sintonizadorTDT){
        super(precioBase, peso, consumoEnergetico, color);
        this.resolucion=resolucion;
        this.sintonizadorTDT=sintonizadorTDT;
    }
    public double getPrecioAcumulado() {
    	return precioAcumulado;
    }
    
    public double precioFinal(){
        //Invocamos el método precioFinal del método padre
        double plus=super.precioFinal();
  
        //Añadimos el codigo necesario
        if (resolucion>40){
            plus+=precioBase*0.3;
        }
        if (sintonizadorTDT){
            plus+=50;
        }
        this.precioAcumulado += plus;
        return plus;
    }
    public static double getPrecioAcum() {
        return precioAcumulado;
    }
   
  
}