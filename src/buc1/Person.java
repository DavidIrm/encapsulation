package buc1;

public class Person {
    public String nume;
    private long cnp;
    private char gender;

    public Person(String nume, long cnp) {
        this.nume = nume;
        this.cnp = cnp;
    }

    public long getCnp(boolean canReadCnno) {
        if (canReadCnno == true){
            return cnp;
    }
    return 0;
}

    public void setCnp(long cnp) {
        this.cnp = cnp;
    }

    public Person(){}

    public String getNume() {
        return nume;
        //e o chestie safe
        //String numeCopie=new String(nume)
    }

    public void setNume(String nume) {
        this.nume = nume;
    }


    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
