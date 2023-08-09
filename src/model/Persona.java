package model;

public class Persona {

    private String name;
    private int edad;
    private float money;

    public Persona() {
    }

    public Persona(String name, int edad, float money) {
        this.name = name;
        this.edad = edad;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }


    @Override
    public String toString() {
        return "Nombre "+ name + ", edad= " + edad + ", saldo= " + money + " euros";
    }
}
