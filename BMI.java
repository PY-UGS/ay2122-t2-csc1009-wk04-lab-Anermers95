public class BMI{
    private double weight,height;

    BMI()
    {
        weight = 0;
        height = 0;
    }

    BMI(double weight, double height)
    {
        this.weight = weight;
        this.height = height;
    }

    double getWeight()
    {
        return this.weight;
    }

    double getHeight()
    {
        return this.height;
    }

    void setWeight(double weight)
    {
        this.weight = weight;
    }

    void setHeight(double height)
    {
        this.height = height;
    }

    double getBMI()
    {
        double weightKG = getWeight()/2.2046;
        double heightM = getHeight()*0.0254;

        return weightKG/Math.pow(heightM, 2);
    }

    String getBMICatagory()
    {
        if(getBMI() < 18.5)
            return "UnderWeight";
        else if (18.5 <= getBMI() && getBMI() <25.0)
            return "Normal";
        else if (25.0 <= getBMI() && getBMI() <30.0)
            return "Overweight";
        else if (30.0 <= getBMI())
            return "Obese";
            
        return "Error";
    }
}