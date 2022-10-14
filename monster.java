import java.lang.ref.SoftReference;

public class Monster {
    private int eyes;
    private String hat;
    private String pet;
    private String pants;
    private String shoes;
    private String name;

    public Monster(){
        eyes = 2;
        hat = "None";
        pet = "None";
        pants = "None";
        shoes = "None";
        name = "John";
    }

    public Monster(int a, String b, String c, String d, String e, String f){
        eyes = a;
        hat = b;
        pet = c;
        pants = d;
        shoes = e;
        name = f;
    }

    public int getEyes(){
        return eyes;
    }

    public String getHat(){
        return hat;
    }

    public String getPet(){
        return pet;
    }

    public String getPants(){
        return pants;
    }

    public String getShoes(){
        return shoes;
    }

    public String getName(){
        return name;
    }

    public void setEyes(int neyes){
        eyes = neyes;
    }

    public void setHat(String a){
        hat = a;
    }

    public void setPet(String a){
        pet = a;
    }

    public void setPants(String a){
        pants = a;
    }

    public void setShoes(String a){
        shoes = a;
    }

    public void setName(String a){
        name = a;
    }

    public String toString(){
        return "A Monster named: " + name + ", he has " + eyes + " number of eyes, wearing a " + hat + " hat and " + pants + " type pants and very cool " + shoes + " shoes with its best friend " + pet + ".";
    }

    public static void main(String[] args){
        Monster bob = new Monster();
        Monster Stephen = new Monster(2, "Party", "Tiny Monster Billy", "Party", "Roller", "Stephen");
        Monster Christine = new Monster(8, "Top", "Attack Squrial", "Carnival", "Tap", "Christine");
        System.out.println(bob);
        System.out.println(Stephen);
        System.out.println(Christine);
    }
}
