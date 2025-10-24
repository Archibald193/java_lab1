public class Dean implements Comparable<Dean> {
    private String NameFaculty;
    private String Room;
    private String corps;
    private String Telephone;
    private String NameDean;
    
    public Dean(String NameFaculty, String Room, String corps, String Telephone, String NameDean) {
        this.NameFaculty = NameFaculty;
        this.Room = Room;
        this.corps = corps;
        this.Telephone = Telephone;
        this.NameDean = NameDean;
    }

    public String getNameFaculty() {
        return NameFaculty;
    }
    public void setNameFaculty(String NameFaculty) {
        this.NameFaculty = NameFaculty;
    }

    public String getRoom() {
        return Room;
    }
    public void setRoom(String Room) {
        this.Room = Room;
    }

    public String getCorps() {
        return corps;
    }
    public void setCorps(String corps) {
        this.corps = corps;
    }

    public String getTelephone() {
        return Telephone;
    }
    public void setTelephone(String Telephone) {
        this.Telephone = Telephone;
    }

    public String getNameDean() {
        return NameDean;
    }
    public void setNameDean(String NameDean) {
        this.NameDean = NameDean;
    }

    @Override
    public String toString() {
        return "Деканат {" +
                "Факультет='" + NameFaculty + '\'' +
                ", Аудитория='" + Room + '\'' +
                ", Корпус='" + corps + '\'' +
                ", Телефон='" + Telephone + '\'' +
                ", Декан='" + NameDean + '\'' +
                '}';
    }

    @Override
    public int compareTo(Dean other) {
        return this.NameFaculty.compareTo(other.getNameFaculty());
    }
}
