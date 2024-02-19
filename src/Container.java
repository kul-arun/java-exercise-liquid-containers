public class Container {

    private final String name;
    private int volume;

    public Container(String name) {
        this.name = name;
        this.volume = 0;
    }

    public void add(int amount) {
        if (amount < 0) {
            return ;
        }
        this.volume += amount;
        if (this.volume > 100) {
            this.volume = 100;
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
            return ;
        }
        this.volume -= amount;
        if (this.volume < 0) {
            this.volume = 0;
        }
    }

    public void move(Container other, int amount) {
        if (amount < 0) {
            return ;
        }
        if (amount > this.volume) {
            amount = this.volume;
        }
        this.remove(amount);
        other.add(amount);
    }

    public String toString() {
        return this.name + ": " + this.volume + "/100";
    }

}