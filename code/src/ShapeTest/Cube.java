/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShapeTest;

public class Cube extends Shape3D{
    protected double side;
    public Cube(double l){
        setSide(l);
    }
    public void setSide(double l){
        if(l>=0) side=l;
    }
    public double getSide(){
        return side;
    }
    @Override
    public double getSurfaceArea(){
        return 6*side*side;
    }
    @Override
    public double getVolume(){
        return side*side*side;
    }
    @Override
    public String toString(){
        return String.format("Cube's side:%.0f\nCube's surface area:%.0f\nCube's volume:%.0f",getSide(),getSurfaceArea(),getVolume());
    }
}

