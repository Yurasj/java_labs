package com.lab1_67_java;


record Farm(String location, int amountOfAnimals, int fanPower, int farmAge,
            int ownerAge, int yearOfFounding) {
    private static final String SOME_FARM_LOCATION = "Lviv";

    public Farm() {
        this(SOME_FARM_LOCATION) ;
    }
    public Farm(final String location) {
        this(location, 244);
    }
    public Farm(final String location, final int amountOfAnimals){
        this(location, amountOfAnimals, 43 );
    }

    public Farm(String location, int amountOfAnimals , int fanPower){
        this(location, amountOfAnimals, fanPower, 60, 41, 1962 );
    }

    @Override
    public String toString(){
        return "Location: " + this.location + "\nAmount of animals: " +this.amountOfAnimals +
                "\nFan power: " +this.fanPower + "\nFarm age" + this.farmAge +
                "\nOwner age" + this.ownerAge + "\nYear of founding" + this.yearOfFounding;
    }

    public static String getStaticField() {
        return SOME_FARM_LOCATION;
    }
}
