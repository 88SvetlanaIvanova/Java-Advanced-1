package rabbits;

import java.util.ArrayList;
import java.util.List;

public class Cage {
   private String	name;
   private int	capacity;
   private List<Rabbit> data;

    public Cage(String name, int capacity) {
       this.name = name;
       this.capacity= capacity;
       this.data = new ArrayList<>();
    }


    public String	getName(){
     return this.name;
 }
public int getCapacity(){
     return this.capacity;
}


public void 	add(Rabbit rabbit) {
        if (this.capacity > this.data.size()){
            this.data.add(rabbit);
        }
    // method - adds an entity to the data if there is room for it
}
public boolean	removeRabbit(String name) {
    int index = -1;
    for (int i = 0; i < this.data.size() ; i++) {

        if (this.data.get(i).getName().equals(name)){
            index = i;
        }

    }
    if (index!= -1){
        this.data.remove(index);
        return true;
    }
    return false;
   // method - removes a rabbit by given name, if such exists, and returns boolean

}
public void 	removeSpecies(String species) {
        List<Integer> indexes = new ArrayList<>();

    for (int i = 0; i < this.data.size() ; i++) {
        if (this.data.get(i).getSpecies().equals(species)) {
            indexes.add(i);

        }
    }
    for (int i = 0; i <indexes.size() ; i++) {
        this.data.remove(indexes.get(i)-i);
    }
    //method - removes all rabbits by given species
}

public Rabbit sellRabbit(String name){
 Rabbit rabbit = null;

    for (int i = 0; i <this.data.size() ; i++) {
        Rabbit rab = this.data.get(i);
        if (rab.getName().equals(name)) {
            rab.setAvailable(false);
            rabbit = rab;
            break;
        }
    }
    return rabbit;

}
    //method - sell (set its available property to false without removing it from the collection)
    //the first rabbit with the given name, also return the rabbit

public List<Rabbit> sellRabbitBySpecies(String species) {
    //method - sells and returns all rabbits from that species as a List
     ArrayList<Rabbit> sold = new ArrayList<>();

    for (int i = 0; i <this.data.size() ; i++) {
    Rabbit rabbit = this.data.get(i);
    if (rabbit.getSpecies().equals(species)){
        rabbit.setAvailable(false);
        sold.add(rabbit);
    }
    }
     return sold;
}

public int	count() {
    // - returns the number of rabbits

    return this.data.size();
}
public String 	report() {
    // - returns a String in the following format, including only not sold rabbits:
  StringBuilder report = new StringBuilder(String.format("Rabbits available at %s:%n", this.name));

    for (Rabbit rabbit:this.data) {
        if (rabbit.isAvailable()){
            report.append(rabbit.toString())
                    .append(System.lineSeparator());
        }

    }
    return  report.toString().trim();

}

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Rabbit> getData() {
        return data;
    }

    public void setData(List<Rabbit> data) {
        this.data = data;
    }
}
