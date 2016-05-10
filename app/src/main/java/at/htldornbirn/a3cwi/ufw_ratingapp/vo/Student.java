package at.htldornbirn.a3cwi.ufw_ratingapp.vo;

/**
 * Created by David on 20.04.2016.
 */
public class Student {
    private int id;
    private String NName;
    private String VName;
    private String image;

    public Student(int id, String NName, String VName){
        this. id = id;
        this.NName = NName;
        this.VName = VName;
    }

    public String getImage() { return image; }

    public void setImage(String image) {
        this.image = image;
    }

    public String getVName() {
        return VName;
    }

    public void setVName(String VName) {
        this.VName = VName;
    }

    public String getNName() {
        return NName;
    }

    public void setNName(String NName) {
        this.NName = NName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
