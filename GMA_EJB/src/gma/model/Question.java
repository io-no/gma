package gma.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Question
 *
 */
@Entity
public class Question implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	private int id;
	private String text;

	public Question() {}
    public Question(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
   
}
