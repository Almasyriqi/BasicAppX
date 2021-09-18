package org.aplas.basicappx;

public class Temperature {

    private double celcius;

    public Temperature() {
        this.celcius = 0;
    }

    public void setCelcius(double celcius) {
        this.celcius = celcius;
    }

    public void setFahrenheit(double farenheit){
        celcius = 5 * (farenheit - 32) / 9;
    }

    public void setKelvins(double kelvin){
        celcius = kelvin - 273.15;
    }

    public double getCelcius() {
        return celcius;
    }

    public double getFahrenheit(){
        return  (9 * celcius / 5) + 32;
    }

    public double getKelvins(){
        return celcius + 273.15;
    }

    public double convert(String oriUnit, String convUnit, double value){
        if(oriUnit.equals("°C")){
            if (convUnit.equals("°F")){
                return getFahrenheit();
            } else if(convUnit.equals("K")){
                return getKelvins();
            } else {
                return celcius;
            }
        } else if(oriUnit.equals("°F")){
            if(convUnit.equals("°C")) {
                setFahrenheit(value);
                return celcius;
            } else if(convUnit.equals("K")){
                setFahrenheit(value);
                return getKelvins();
            } else {
                return value;
            }
        } else if(oriUnit.equals("K")){
            if(convUnit.equals("°C")){
                setKelvins(value);
                return celcius;
            } else if(convUnit.equals("°F")){
                setKelvins(value);
                return getFahrenheit();
            } else {
                return value;
            }
        } else {
            return celcius;
        }
    }
}
