class Voice{
    public void prepareVoice(){
        Animal[] animals=new Animal[5];
        animals[0]=new Cow();
        animals[1]=new Goat();
        animals[2]=new Pig();
        animals[3]=new Lion();
        animals[4]=new Tiger();
        hear(animals);
    }
    void hear(Animal[] animals){
        for(int i=0;i<5;i++)
        animals[i].makeVoice();
    }
}