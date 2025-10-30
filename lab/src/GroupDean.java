import java.util.Arrays;

public class GroupDean {

    private int groupNumber;
    private Dean[] deaneries;

    public GroupDean() {
        this.groupNumber = 0;
        this.deaneries = new Dean[0];
    }

    public GroupDean(int groupNumber, Dean[] deaneries) {
        this.groupNumber = groupNumber;
        this.deaneries = deaneries;
    }

    public int getGroupNumber() {
        return groupNumber;
    }
    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public Dean[] getDeaneries() {
        return deaneries;
    }
    public void setDeaneries(Dean[] deaneries) {
        this.deaneries = deaneries;
    }
    
    public void addDean(Dean newDean) {
        Dean[] newArray = new Dean[this.deaneries.length + 1];

        for (int i = 0; i < this.deaneries.length; i++) {
            newArray[i] = this.deaneries[i];
        }
        newArray[newArray.length - 1] = newDean;
        this.deaneries = newArray;
    }

    public void removeDean(String facultyName) {
        int remainingCount = 0;
        for (Dean d : this.deaneries) {
            if (!d.getNameFaculty().equals(facultyName)) {
                remainingCount++;
            }
        }

        if (remainingCount == 0) {
            this.deaneries = new Dean[0];
            return;
        }
        Dean[] newArray = new Dean[remainingCount];
        int newIndex = 0;
        for (Dean d : this.deaneries) {
            if (!d.getNameFaculty().equals(facultyName)) {
                newArray[newIndex] = d;
                newIndex++;
            }
        }
        this.deaneries = newArray;
    }

    public Dean getDeanElem(int el) {
        if (el >= 0 && el < this.deaneries.length) {
            return this.deaneries[el];
        } else {
            System.out.println("В массиве всего " + this.deaneries.length + " элементов");
            return null;
        }
    }
    
    public void sortDean() {
        Arrays.sort(this.deaneries);
    }
    
    @Override
    public String toString() {
        String result = "Группа деканатов №" + groupNumber + ":\n";
        for (Dean d : deaneries) {
            result += "  " + d.toString() + "\n";
        }
        return result;
    }
}