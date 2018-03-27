package pei.java.design.pattern.lab.memento;

import java.util.List;

import org.junit.Test;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import static org.junit.Assert.*;

import java.util.ArrayList;

/**
 * 
 * @author pei
 *
 */
public class MementoDemo {

    @Test
	public void testName() throws Exception {
		
        List<Originator.Memento> savedStates = new ArrayList<Originator.Memento>();
 
        Originator originator = new Originator();
        
        originator.setState("S1");
        assertTrue(originator.getState().equals("S1"));

        originator.setState("S2");
        savedStates.add(originator.saveToMemento());
        assertTrue(originator.getState().equals("S2"));
        
        originator.setState("S3");
        savedStates.add(originator.saveToMemento());
        assertTrue(originator.getState().equals("S3"));
        
        originator.setState("S4");
        assertTrue(originator.getState().equals("S4")); 
        
        originator.restoreFromMemento(savedStates.get(1));
        assertTrue(originator.getState().equals("S3"));
        
        originator.restoreFromMemento(savedStates.get(0));
        assertTrue(originator.getState().equals("S2"));
    }

}


@Setter @Getter
class Originator {
	
    private String state;
 
    public Memento saveToMemento() {
        return new Memento(state);
    }
 
    public void restoreFromMemento(Memento memento) {
        state = memento.getState();
    }
    
    @AllArgsConstructor @Getter
    public static class Memento {
        private final String state;
    }
}
 