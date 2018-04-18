

package Main;

//@author Radames J Halmeman  - rjhalmeman@gmail.com
public class Entidade {
    private double Valor;
    private String resultado;
    private String Insuficiente;
    private String Regular;
    private String Bom;
    private String Otimo;

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public String getResultado(){
        if(Valor>=0 && Valor<50){
            resultado=Insuficiente;
            return resultado;
        }
        if(Valor>=50 && Valor<65){
            resultado=Regular;
            return resultado;
        }
        if (Valor>=65 && Valor<85) {
            resultado=Bom;
            return resultado;
        }
        if (Valor>=85 && Valor<=100) {
            resultado=Otimo;
            return resultado;
        }
        return resultado;
    }
    public String getInsuficiente() {
        return Insuficiente;
    }

    public void setInsuficiente(String Insuficiente) {
        this.Insuficiente = Insuficiente;
    }
    public String getRegular(){
        return Regular;
    }
    
    public void setRegular (String Regular){
        this.Regular = Regular;
    }
    
    public String getBom (){
        return Bom;
    }
    
    public void setBom (String Bom){
        this.Bom = Bom;
        
    }public String getOtimo (){
        return Otimo;
    }
    
    public void setOtimo (String Otimo){
        this.Otimo = Otimo;
    }
    
}
