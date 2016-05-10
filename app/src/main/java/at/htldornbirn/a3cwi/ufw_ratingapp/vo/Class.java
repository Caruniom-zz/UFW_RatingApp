package at.htldornbirn.a3cwi.ufw_ratingapp.vo;

/**
 * Created by David on 20.04.2016.
 */
public class Class {
    private int id;
    private String name;
    private String kvName;
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getKVname() {
        return kvName;
    }

    public void setKVname(String KVname) {
        this.kvName = KVname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Class(int id, String name, String kvName){
        this.id = id;
        this.name = name;
        this.kvName= kvName;

    }
}
