

public class Brother extends Family {
    boolean beards;
    boolean married;
    double height;
    

    public Brother(boolean beards, boolean married, double height, int age, String sex, String name){
        super(name, sex, age);
        this.beards = beards; 
        this.married = married;
        this.height = height;
    }
    /**
     * @return the beards
     */
    public boolean isBeards() {
        return this.beards;
    }

    /**
     * @param beards the beards to set
     */
    public void setBeards(boolean beards) {
        this.beards = beards;
    }

    /**
     * @return the married
     */
    public boolean isMarried() {
        return this.married;
    }

    /**
     * @param married the married to set
     */
    public void setMarried(boolean married) {
        this.married = married;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return this.height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(float height) {
        this.height = height;
    }

    void cries(){
        System.out.println("They do cry when " + this.married);
    }
    
 }
