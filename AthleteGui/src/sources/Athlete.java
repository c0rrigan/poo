/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sources;

/**
 *
 * @author deckard
 */
public class Athlete extends HumanBody{

    /**
     * @return the sport
     */
    public String getSport() {
        return sport;
    }

    /**
     * @param sport the sport to set
     */
    public void setSport(String sport) {
        this.sport = sport;
    }

    /**
     * @return the championWins
     */
    public int getChampionWins() {
        return championWins;
    }

    /**
     * @param championWins the championWins to set
     */
    public void setChampionWins(int championWins) {
        this.championWins = championWins;
    }
    private String sport;
    private int championWins;

    public Athlete() {
        super();
        this.sport = "";
        this.championWins = 0;
    }
    
    
    public Athlete(String color,String sport) {
        super(color);
        this.sport = sport;
        this.championWins = 0;
    }
    
    public void doExcercise(int mins){
        while(mins>0){
            super.correr();
            mins-=5;
        }
    }
    
    public void win(){
        int mins = (int)Math.round(Math.random()*99);
        doExcercise(mins);
        setChampionWins(getChampionWins() + 1);
    }
    public void lose(){
        int mins = (int)Math.round(Math.random()*99);
        doExcercise(mins);
    }

    @Override
    public String toString() {
        return super.toString()+"\nDeporte:"+getSport()+"\nCampeonatos Ganados:"+getChampionWins();
    }
    
}
