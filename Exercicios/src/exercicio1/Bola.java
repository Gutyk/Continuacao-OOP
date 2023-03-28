package exercicio1;

public class Bola {
    //variaveis
    String cor;
    double raio;

    public Bola(String cor, double raio) {
        this.cor = cor;
        this.raio = raio;
    }

    public String retornarDados() {
        return cor+ "\n" + raio;
    }

    public Bola maiorBola(Bola bola2, Bola bola3) {
        if(raio > bola2.raio && raio > bola3.raio){
            return this;
        }
        else if(bola2.raio > bola3.raio){
            return bola2;
        }
        return bola3;
    }
}
