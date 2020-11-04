/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT9;

/**
 *
 * @author dinhc
 */
public class Laptop implements Comparable<Laptop> {

    private String brand;
    private String cpu;
    private int ram;
    private String display;
    private int pin;
    private int weight;
    private String color;

    public Laptop(String brand, String cpu, int ram, String display, int pin, int weight, String color) {
        this.brand = brand;
        this.cpu = cpu;
        this.ram = ram;
        this.display = display;
        this.pin = pin;
        this.weight = weight;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int compareTo(Laptop laptop) {
        return this.brand.compareTo(laptop.brand);
    }

    @Override
    public String toString() {
        return brand + "\t" + cpu + "\t" + ram + "\t" + display + "\t" + pin + "\t" + weight + "\t" + color;
    }
}
