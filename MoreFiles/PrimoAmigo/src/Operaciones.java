public class Operaciones {

    public int SumaOperaciones(int x, int y){


        return x+y;
    }
    public int SumarDivisor(int num){
        int suma=0;
        for(int divisor=0;divisor<num; divisor++){
            if (num%divisor==0){
                suma+=divisor;
            }
        }
        return  suma;
    }
    public boolean CalcularAmigos(int n1, int n2){
        boolean vol = false;
        if(SumarDivisor(n1)==n2){
            if (SumarDivisor(n2)==n1){
                vol = true;
            }else {
                vol = false;
            }
        }
        return vol;

    }
    public boolean calcularPerfecto(int num){
        if (SumarDivisor(num)==num){
            return true;
        }else {
            return false;
        }


    }



}
