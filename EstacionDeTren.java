public class EstacionDeTren
{
    private String ciudad; 
    private TicketMachine maquinaUno;
    private TicketMachine maquinaDos;
    /**
     * Constructor de la estacion de tren
     */
    
    public EstacionDeTren(String nombreCiudad, int precioUno, int precioDos)
    {
    ciudad = nombreCiudad;
   // maquinaUno = new TicketMachine(precioUno);
    //maquinaDos = new TicketMachine(precioDos);
    }
    /**
     * simula la venta de un billete en la maquina 1
     */
    public void ventabilleteMaquinaUno()
    {
        maquinaUno.insertMoney(500);
        maquinaUno.printTicket();
    }
    /**
     * simula la venta de un billete en la maquina 2
     */
    public void ventabilleteMaquinaDos()
    {
        maquinaDos.insertMoney(600);
        maquinaDos.printTicket();
    }
    
    /**
     * Devuelve el total de dinero recaudado por las maquinas d ela estacion hasta el momento.
     */
    public int totalRecaudadoUno()
    {
        
          return maquinaUno.getTotal();
           
      }
      
    public int totalRecauudado()
    {
        
          return maquinaUno.getTotal() + maquinaDos.getTotal();
           
      }
      
  
      
      /**
       * imprime por pantalla la cantidad
       * reqeurida por la maquina1 por la 2 y el total de ambas        
     */
    public void imprimirTotales()
    {
    System.out.println("La cantidad recaudada en maquina 1 es " + maquinaUno.getTotal() + "yuanes");
    System.out.println("La cantidad recaudada en maquina 2 es " + maquinaDos.getTotal() + "yuanes");
    System.out.println("La cantidad recaudada total es " + (maquinaUno.getTotal() + maquinaDos.getTotal()) + "yuanes");
}
}




