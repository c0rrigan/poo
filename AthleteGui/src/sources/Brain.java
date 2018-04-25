
package sources;

public class Brain {
    private long Neuronas;

    public Brain() {
        Neuronas = 86000000000L;
     
    }

    @Override
    public String toString() {
        return "Número de neuronas"+Neuronas;
    }
    public void perderNeuronas(int n){
        Neuronas-=n;
    }
    public void ganarNeuronas(int n){
        Neuronas+=n;
    }
}
