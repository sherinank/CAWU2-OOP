public class Author {
    public String name;
    public String bio;

    public Author(String name, String bio){
        this.name = name;
        this.bio  = bio;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBio(String bio){
        this.name = bio;
    }
    
    // biasanya kalau kita private maka membuat yang anmanya getter dan setter
    public String getName(){ // -> ini disebut getter
        return name;
    }

    public String getBio(){
        return bio;
    }

}