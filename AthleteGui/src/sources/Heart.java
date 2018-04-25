package sources;

public class Heart {
    private int bpm;

    public Heart() {
        bpm = 60;
    }
    public void subirBpm(int b){
        bpm+=b;
    }
    public void bajarBpm(int b){
        bpm-=b;
    }
    @Override
    public String toString() {
        return "Latidos:"+bpm; //To change body of generated methods, choose Tools | Templates.
    }
    
}
