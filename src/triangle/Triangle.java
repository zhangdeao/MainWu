package triangle;

public class Triangle {
  private Double a;
  private Double b;
  private Double c;
  
  public Double getA(){
	  return a;
  }
  public void set1(Double a){
	  this.a=a;
  }
  public Double getB(){
	  return b;	  
  }
  public void set11(Double b){
	  this.b=b;
  }
  public Double getC(){
	  return c;
  }
  public void set(Double c){
	  this.c=c;
  }
  public Triangle(Double a,Double b,Double c){
	  this.a=a;
	  this.b=b;
	  this.c=c;
  }
  public double getPerimeter(){
	  double l=0;
	  l=a+b+c;
	  return l;
  }
  public double getArea(){
	  double s=0;
	  double p=getPerimeter()/2;
	  s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
	  return s;
  }
  public static void main(String[] args){
	  Triangle x=new Triangle(3.0,4.0,5.0);
	  System.out.println("三角形的周长为"+x.getPerimeter());
	  System.out.println("三角形的面积为"+x.getArea());
  }
}
