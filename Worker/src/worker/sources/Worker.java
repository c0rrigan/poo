/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worker.sources;


public class Worker {

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the workerSince
     */
    public short getWorkerSince() {
        return workerSince;
    }

    /**
     * @param workerSince the workerSince to set
     */
    public void setWorkerSince(short workerSince) {
        this.workerSince = workerSince;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
    private String name;
    private String id;
    private short workerSince;
    private double salary;

    public Worker(String name,short workerSince) {
        this.name = name;
        this.workerSince = workerSince;
    }

    public void assignId(){
        this.setId(getName().substring(0, getName().length() / 2));
        this.setId(getId() + getWorkerSince());
    }
    public void assignSalary(){
        this.setSalary(5000);
    }
    @Override
    public String toString() {
        return "Name:"+this.getName()+" Id:"+this.getId()+" Worker Since"+this.getWorkerSince()+" Salary:"+this.getSalary();
    }
    
    
}
