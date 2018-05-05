/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worker.sources;

import java.util.Comparator;

/**
 *
 * @author deckard
 */
public class WorkerComparator implements Comparator<Worker>{

    @Override
    public int compare(Worker o1, Worker o2) {
        return o1.getName().compareToIgnoreCase(o2.getName());
    }
    
}
