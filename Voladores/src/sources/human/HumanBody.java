package sources.human;

public class HumanBody {
    Heart heart;
    Brain brain;
    String colorPiel;

    public HumanBody() {
        this.colorPiel = "";
        heart = new Heart();
        brain = new Brain();
    }
    
    public HumanBody(String color) {
        colorPiel = color;
        heart = new Heart();
        brain = new Brain();
    }
    
    final public void desvelarse(int horas){
        brain.perderNeuronas(horas*10000);
    }
    final public void correr(){
        heart.subirBpm(20);
    }
    final public void dormir(){
        heart.bajarBpm(20);
        brain.ganarNeuronas(1000);
    }
    public void setColor(String s){
        colorPiel = s;
    }

    public String getColor(){
        return colorPiel;
    }
    @Override
    public String toString() {
        return "Color de Piel:"+colorPiel+"\n"+brain.toString()+"\n"+heart.toString();
    }
    
}
