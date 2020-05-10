public class dog {
    //define the data types

    String breed;
    Double price;
    int weight;

    public dog(
            String inputBreed,
            Double inputPrice,
            int inputWeight){
        this.breed = inputBreed;
        this.price = inputPrice;
        this.weight = inputWeight;
    }

    //create the method
    public Double changeDogPrice(Double newPrice){
        this.price = newPrice;
        return newPrice;
    }


    public String changeDogBreed(String newBreed){
        this.breed = newBreed;
        return newBreed;
    }

    public int changeDogsWeight(int newWeight){
        this.weight = newWeight;
        return newWeight;
    }




}




