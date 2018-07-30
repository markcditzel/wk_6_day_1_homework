//Define Class name
public class Bottle {
    public int volume; // Define Class Properties

    // Define intialize / constructor method
    public Bottle(int volume) {
        this.volume = volume;
    }

    // Reduce volume by 10 method
    public int drink() {
        return this.volume = this.volume - 10;
    }
    // empty bottle method
    public int empty() {
        return this.volume = 0;
    }
    // fill bottle to 100 method
    public int fill() {
        return this.volume = 100;
    }

    public int getVolume() {
        return this.volume;
    }

}


