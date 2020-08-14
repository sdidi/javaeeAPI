package net.codejava;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/*@Entity
@Table(name="Actor")
@NamedQueries({
    @NamedQuery(name = "Actor.findAll", query = "SELECT a FROM Actor a")
})*/
//@XmlRootElement
@Entity
@Table(name="Actor")
public class Actor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String name;

	private String nickname;
	
	public Actor() {
		
	}
	
	public Actor(int id, String name, String nickname) {
		this.name = name;
		this.nickname = nickname;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	 @Override
	    public String toString() {
	        return "Actor{" + "id=" + id + ", name=" + name + ", nickname=" + nickname + '}';
	    }
	
}
