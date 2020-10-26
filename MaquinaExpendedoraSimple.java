public class MaquinaExpendedoraSimple {
    
    // El precio del billete
    private int precioBillete;
    // La cantidad de dinero que lleva metida el cliente actual
    private int balanceClienteActual;
    // El total de dinero almacenado en la maquina desde su ultimo vaciado
    private int totalDineroAcumulado;
    // La cantidad de dinero que lleva metida la maquina desde que se creo
    private int balanceTotal;
    // El origen del billete
    private String estacionOrigen;
    // El destino del billete
    private String estacionDestino;

    /**
     * Crea una maquina expendedora de billetes de tren con el 
     * precio del billete y el origen y destino dados. Se asume que el precio
     * del billete que se recibe es mayor que 0.
     */
    public MaquinaExpendedoraSimple() {
        precioBillete = 12;
        balanceClienteActual = 0;
        totalDineroAcumulado = 0;
        balanceTotal = 0;
        estacionOrigen = "León";
        estacionDestino = "Madrid";
    }
    
    public MaquinaExpendedoraSimple(int precioDelBillete, String estacionDeDestino) {
        precioBillete = precioDelBillete;
        balanceClienteActual = 0;
        totalDineroAcumulado = 0;
        balanceTotal = 0;
        estacionOrigen = "León";
        estacionDestino = estacionDeDestino;
    }

    /**
     * Cambiar el precio del billete
     */
    public void cambiarPrecioBillete (int itroducirNuevoPrecioBillete) {
        precioBillete = itroducirNuevoPrecioBillete;
    }
    
    /**
     * Reducir el precio del billete
     */
    public void reducirPrecioBillete (int itroducirReduccionDelPrecio) {
        precioBillete = precioBillete - itroducirReduccionDelPrecio;
    }
    
    /**
     * Devuelve el precio del billete
     */
    public int getPrecioBillete() {
        return precioBillete;
    }

    /**
     * Devuelve la cantidad de dinero que el cliente actual lleva introducida
     */
    public int getBalanceClienteActual() {
        return balanceClienteActual;
    }

    /**
     * Simula la introduccion de dinero por parte del cliente actual
     */
    public void introducirDinero(int cantidadIntroducida) {
        balanceClienteActual = balanceClienteActual + cantidadIntroducida;
    }

       /**
     * Simula la introduccion de dinero
     */
    public int getBalanceTotal() {
        balanceTotal = balanceTotal + balanceClienteActual;
        return balanceTotal;
    }
    
    /**
     * Vacia el deposito de dinero
     */
    public void vaciarDepositoDinero() {
        totalDineroAcumulado = 0;
        balanceTotal = 0;
    }
    
    /**
     * Imprime un billete para el cliente actual
     */
    public void imprimirBillete() {
        // Simula la impresion de un billete
        System.out.println("##################");
        System.out.println("# Billete de tren:");
        System.out.println("# De " + estacionOrigen + " a " + estacionDestino);
        System.out.println("# " + precioBillete + " euros.");
        System.out.println("##################");
        System.out.println();

        // Actualiza el total de dinero acumulado en la maquina
        totalDineroAcumulado = totalDineroAcumulado + balanceClienteActual;
        // Queda preparada para el proximo cliente
        balanceClienteActual = 0;
    }
}