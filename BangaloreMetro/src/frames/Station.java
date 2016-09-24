package frames;

public class Station {
    private String name;
    private String code;
    private int id;
    private int before;
    private int after;

    public Station() {
    }

    public Station(String name, int id, int before, int after,String code) {
        this.name = name;
        this.id = id;
        this.before = before;
        this.after = after;
        this.code=code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public int getBefore() {
        return before;
    }

    public void setBefore(int before) {
        this.before = before;
    }

    public int getAfter() {
        return after;
    }

    public void setAfter(int after) {
        this.after = after;
    }
    
    
    
}
