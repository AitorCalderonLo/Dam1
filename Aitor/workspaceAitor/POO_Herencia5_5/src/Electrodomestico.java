public class Electrodomestico {
   
    //Constantes
   
   
    protected final static String COLOR_DEF="blanco";
   
    protected final static String  CONSUMO_ENERGETICO_DEF="F";
   
    protected final static double PRECIO_BASE_DEF=100;
   
    protected final static double PESO_DEF=5;
   
    protected double precioBase;
   
   
    protected String color;
  
    protected String  consumoEnergetico;
  
    protected double peso;
   
    public Electrodomestico(){
        this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF);
    }
   
    public Electrodomestico(double precioBase, double peso){
        this(precioBase, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF);
    }
   
    
    public Electrodomestico(double precioBase, double peso, String  consumoEnergetico, String color){
        this.precioBase=precioBase;
        this.peso=peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
    }
    
   
    private void comprobarColor(String color){
   
        //Colores disponibles
        String colores[]={"blanco", "negro", "rojo", "azul", "gris"};
        boolean encontrado=false;
  
        for(int i=0;i<colores.length && !encontrado;i++){
              
            if(colores[i].equals(color)){
                encontrado=true;
            }
              
        }
          
        if(encontrado){
            this.color=color;
        }else{
            this.color=COLOR_DEF;
        }
          
          
    }
      
  
    public void comprobarConsumoEnergetico(String  consumoEnergetico){
        if(consumoEnergetico.equals("A")|| consumoEnergetico.equals("B") || consumoEnergetico.equals("C") || consumoEnergetico.equals("D") || consumoEnergetico.equals("E") || 
        		consumoEnergetico.equals("F"))  
        {
            this.consumoEnergetico=consumoEnergetico;
        }else{
            this.consumoEnergetico=CONSUMO_ENERGETICO_DEF;
        }
          
    }
   
  
    public double getPrecioBase() {
        return precioBase;
    }
    
    public String getColor() {
        return color;
    }
   
   
    public String  getConsumoEnergetico() {
        return consumoEnergetico;
    }
   
    public double getPeso() {
        return peso;
    }
   
    public double precioFinal(){
        double plus=0;
        switch(consumoEnergetico){
            case "A":
                plus+=100;
                break;
            case "B":
                plus+=80;
                break;
            case "C":
                plus+=60;
                break;
            case "D":
                plus+=50;
                break;
            case "E":
                plus+=30;
                break;
            case "F":
                plus+=10;
                break;
        }
   
        if(peso>=0 && peso<19){
            plus+=10;
        }else if(peso>=20 && peso<49){
            plus+=50;
        }else if(peso>=50 && peso<=79){
            plus+=80;
        }else if(peso>=80){
            plus+=100;
        }
   
        return precioBase+plus;
    }
   
    //Constructores
   
   
   
}