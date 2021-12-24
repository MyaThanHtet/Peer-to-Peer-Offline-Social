package d.d.meshenger;


import java.io.Serializable;

public class Contact implements Serializable{
    enum State{ONLINE, OFFLINE, PENDING}

    private long id;
    private String address;
    private String name;
    private String photo;
    private String identifier;
    private String info;

    public boolean recent = false;

    private State state = State.PENDING;

    public Contact(int id, String address, String name, String info, String photo, String identifier) {
        this.id = id;
        this.address = address;
        this.name = name;
        this.photo = photo;
        this.identifier = identifier;
        this.info = info;
    }

    public Contact(String address, String name, String info, String photo, String identifier) {
        this.id = -1;
        this.address = address;
        this.name = name;
        this.photo = photo;
        this.identifier = identifier;
        this.info = info;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public long getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoto() {
        return photo;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
