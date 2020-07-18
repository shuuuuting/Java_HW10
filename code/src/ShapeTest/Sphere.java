/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShapeTest;

public class Sphere extends Shape3D{
    protected double radius;
    public Sphere(double r){
        setRadius(r);
    }
    public void setRadius(double r){
        if(r>=0) radius=r;
    }
    public double getRadius(){
        return radius;
    }
    @Override
    public double getSurfaceArea(){
        return 4*Math.PI*radius*radius;
    }
    @Override
    public double getVolume(){
        return Math.PI*radius*radius*radius*4/3;
    }
    @Override
    public String toString(){
        return String.format("Sphere's radius:%.0f\nSphere's surface area:%.0f\nSphere's volume:%.0f",getRadius(),getSurfaceArea(),getVolume());
    }
}
