package Monster;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import Monster.Monster;
import static java.lang.System.*;

public class Zombie implements Monster {

    int size = 0;
    String name="";
    
    Zombie(int size,String name){
        this.size = size;
        this.name = name;
    }

    public int getHowBig() {
        return size;
    }

    public String getName() {
        return name;
    }

    public boolean isBigger(Monster other) {
        return(this.getHowBig()>other.getHowBig());
    }

    public boolean isSmaller(Monster other) {
        return(this.getHowBig()<other.getHowBig());
    }

    public boolean namesTheSame(Monster other) {
        return(this.getName().equals(other.getName()));
    }
    public String toString(){
        return(this.getName()+" "+this.getHowBig());
    }
	//add instance variables	

	//add a constructor
	//add code to implement the Monster interface
	//add a toString
}
