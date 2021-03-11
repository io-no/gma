package gma.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Blacklist
 *
 */
@Entity
public class Blacklist implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	private int id;
	private String word;
	
	public Blacklist() {}
    public Blacklist(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public String getWord() {
        return word;
    }
    public void setWord(String word) {
        this.word = word;
    }
   
}
