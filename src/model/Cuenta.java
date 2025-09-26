package model;
import TipoCuenta;

public class Cuenta {
    private String nombreBamco;
    private double saldoActual
    private TipoCuenta TipoCuenta;

    public Cuenta(String nombreBamco, double saldoActual, TipoCuenta TipoCuenta){
        this.nombreBamco=nombreBamco;
        this.saldoActual=saldoActual;
        this.TipoCuenta = TipoCuenta;

        
    }



    
    public TipoCuenta getTipocuenta{
        return TipoCuenta
    }

    public String getnombreBamco(){
        return nombreBamco;

    }
    public void setnombreBamco(String nombre){
        this.nombre=nombreBamco;
    }

    public double saldoActual(){
        return saldoActual;
    }

    public void setsaldoActual(){
        return saldoActual;
    }
    
    retirarDineroCuenta(double saldoActual){
        this.saldoActual = saldoActual-monto
        if (saldoActual < dinero){
            System.out.println("saldo insuficiente")
        }
    }

    public depositarDineroCuenta(double monto){
        this.saldoActual = saldoActual + dinero;

    }
    }



    
}
