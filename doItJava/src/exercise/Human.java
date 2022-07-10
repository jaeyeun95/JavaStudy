package exercise;

public class Human {
    private int idx;
    private String name;
    private String phoneNumber;

    public Human(int idx, String name, String phoneNumber) {
        this.idx = idx;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
