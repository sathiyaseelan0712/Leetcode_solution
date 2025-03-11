class Solution {
    
    public double conKel(double c){
        return c + 273.15;
    }

    public double conFah(double c){
        return c * 1.80 + 32.00;
    }

    public double[] convertTemperature(double c) {
        double[] arr = new double[2];
        arr[0] = conKel(c);
        arr[1] = conFah(c);
        return arr;
    }
}
