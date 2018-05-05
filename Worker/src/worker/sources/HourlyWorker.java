/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worker.sources;

/**
 *
 * @author alumno
 */
public class HourlyWorker extends Worker{

    /**
     * @return the hours
     */
    public Byte getHours() {
        return hours;
    }

    /**
     * @param hours the hours to set
     */
    public void setHours(Byte hours) {
        this.hours = hours;
    }
    private Byte hours;
    public HourlyWorker(String name, short workerSince,Byte workedHours) {
        super(name, workerSince);
        this.hours = workedHours;
    }

    @Override
    public void assignSalary() {
        this.setSalary(2000*getHours()+3000);
    }
    @Override
    public String toString() {
        return super.toString()+" Worked Hours"+getHours();
    }
    
    
}
