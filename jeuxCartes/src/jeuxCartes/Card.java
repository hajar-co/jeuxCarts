package jeuxCartes;
import java.util.Objects;

public class Card {

	 private String Name;
	 private Integer Value;
	
 
	public Card(String name, Integer value) {
		this.setName(name);
		this.setValue(value);
	}
	
	public String getName() 
	{
		return this.Name;
	}
	public void setName(String name) {
		this.Name = name;
	}

	public Integer getValue() {
		return this.Value;
	}

	public void setValue(Integer value) {
		this.Value = value;
	}

	@Override
	public String toString() {
		return "[" + Name + ", " + Value + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Name, Value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card o = (Card) obj;
		return this.getName() == o.getName() && this.getValue() == o.getValue();
	}
	
	
	
}
