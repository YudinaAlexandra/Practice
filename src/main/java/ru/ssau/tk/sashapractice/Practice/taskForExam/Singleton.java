package ru.ssau.tk.sashapractice.Practice.taskForExam;

public class Singleton {
    private static Singleton instance;
    public double element;
    private Singleton(){

    }
    public static Singleton getInstance(){
        if(instance == null){		//если объект еще не создан
            instance = new Singleton();	//создать новый объект
        }
        return instance;		// вернуть ранее созданный объект
    }
    private Singleton(double element){
        this.element = element;
    }
    private double sum(double element, double number){
        return element+number;
    }
    private double multiply(double element, double number){
        return element*number;
    }
    private void setElement(double element){
        this.element = element;
    }
    private double getElement(){
        return element;
    }
    public static void main(String[] args){
        Singleton firstElement = new Singleton(5);
        firstElement.setElement(9);
        System.out.println("Element: "+firstElement.getElement());
        System.out.println("Sum of element and number 160 " + firstElement.sum(firstElement.getElement(), 160));
        System.out.println("Multiply of element and number 2: "+ firstElement.multiply(firstElement.getElement(), 2));
    }
}
