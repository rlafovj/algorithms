package kaupOOP;

public class Person {
    private String name;
    private double height;
    private double weight;
    private double bmi;
    private String bodyMass;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return ("이름 : "+name);
    }
    public void createHeight(){
        double height = (150 + (Math.random() * 50));
        this.height = height;
    }

    public double getHeight(){
        return this.height;
    }

    public void createWeight(){
        double weight = (30 + (Math.random() * 69));
        this.weight = weight;
    }

    public double getWeight(){
        return this.weight;
    }

    public double getBmi(){
        return this.bmi;
    }

    public String getBodyMass(){
        return this.bodyMass;
    }
    public void createBmi(double height, double weight){
        this.bmi = weight / ((height /100)*(height /100));
    }

    public void createBodyMass(){
        String bodyMass = null;
        if(bmi < 18.5){
            bodyMass = "저체중";
        } else if (bmi >= 18.5 && bmi < 23) {
            bodyMass = "정상";
        } else if (bmi >= 23 && bmi < 25) {
            bodyMass = "위험체중";
        } else if (bmi >= 25 && bmi < 30) {
            bodyMass = "1단계 비만";
        } else bodyMass = "2단계 비만";

        this.bodyMass = bodyMass;
    }
}