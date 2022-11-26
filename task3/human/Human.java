package ru.mirea.task3.human;

public class Human {
    private class Head{
        private String colorHair;
        private String colorEyes;
        private String defects;
        public Head(){
            this.colorHair = "";
            this.colorEyes="";
            this.defects="";
        }
        public void setColorHair(String colorHair){
            this.colorHair=colorHair;
        }
        public String getColorHair() {
            return colorHair;
        }
        public void setColorEyes(String colorEyes) {
            this.colorEyes = colorEyes;
        }
        public String getColorEyes() {
            return colorEyes;
        }
        public void setDefects(String defects) {
            this.defects = defects;
        }
        public String getDefects() {
            return defects;
        }
        public String toString(){
            return "hair: "+this.colorHair+" - Eyes: "+this.colorEyes+" - Defects: "+this.defects;
        }
    }
    private class Legs{
        private int legSize;

        public Legs(){
            this.legSize=0;
        }
        public void setLegSize(int legSize) {
            this.legSize = legSize;
        }
        public int getLegSize() {
            return legSize;
        }
        public String toString(){
            return "Leg size: "+this.legSize;
        }
    }
    private class Hands {
        private int handLength;

        public Hands(){
          this.handLength=0;
        }
        public void setHandLength(int handLength) {
            this.handLength = handLength;
        }
        public int getHandLength() {
            return handLength;
        }
        public String toString(){
            return "Hand length: "+this.handLength;
        }
    }
    private Head head;
    private Legs legs;
    private Hands hands;

    public Human(){
        this.head = new Head();
        this.legs = new Legs();
        this.hands = new Hands();
    }
    public void setHeadhair(String colorHair){
        this.head.setColorHair(colorHair);
    }
    public void setHeadEyes(String colorEyes){
        this.head.setColorEyes(colorEyes);
    }
    public void setHeadDef(String defects){
        this.head.setDefects(defects);
    }

    public Head getHead() {
        return this.head;
    }
    public void setLegs(int legSize){
        this.legs.setLegSize(legSize);
    }
    public Legs getLegs(){
        return this.legs;
    }
    public void setHands(int handLength){
        this.hands.setHandLength(handLength);
    }
    public Hands getHands(){
        return this.hands;
    }
    public String toString(){
        return this.head +"\n" + this.legs +"\n"+this.hands;
    }
}
