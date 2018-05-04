package quinto.alexander.funciones;

/**
 * Created by alexa on 03/05/2018.
 */

public class Funciones {
    private int valor;
    private int exponente;
    private String resultado;

    public Funciones(int valor, int exponente) {
        this.valor = valor;
        this.exponente = exponente;
    }

    public Funciones(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getExponente() {
        return exponente;
    }

    public void setExponente(int exponente) {
        this.exponente = exponente;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "El Resultado es >> " +
               resultado;
    }

    public void exponente(){
        double total=1;
        for (int i=1;i<=exponente;i++){
            total*=valor;
        }
        resultado= String.valueOf(total);
        toString();
    }
    public void factorial(){
        resultado=String.valueOf(calcularFactorial(this.valor));
        toString();
    }
    public int calcularFactorial(int val){
        if(val==0)
                return 1;
        else{
            return val*calcularFactorial(val-1);
        }
    }
    public void primo(){
        int cont=0;
       for (int i=1;i<=this.valor;i++){
           int mod=this.valor % i;
           if(mod==0){
                cont++;
           }
       }
        if(cont <= 2)
        {
            resultado="El numero es Primo";
        }else{
            resultado="El numero no es Primo";
        }
        toString();
    }
}
