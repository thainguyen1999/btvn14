package btvn14;

public class StudentModify {
    String name;
    String email;
    float point;

    public StudentModify(String name, String email, String poin) {
        this.name = name;
        this.email = email;
        this.point = Float.parseFloat(poin);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }
    public String toString(){
        return(getName() + "-" + getEmail()+"-" +getPoint()+"\n");
    }
}
