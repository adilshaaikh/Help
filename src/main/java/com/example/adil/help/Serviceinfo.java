package com.example.adil.help;

public class Serviceinfo {
    public String idno,usname,funame,phoneno,cnic,birthday,adress;

    public Serviceinfo(String idno, String usname, String funame, String phoneno, String cnic, String birthday, String adress) {
        this.idno = idno;
        this.usname = usname;
        this.funame = funame;
        this.phoneno = phoneno;
        this.cnic = cnic;
        this.birthday = birthday;
        this.adress = adress;
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    public String getUsname() {
        return usname;
    }

    public void setUsname(String usname) {
        this.usname = usname;
    }

    public String getFuname() {
        return funame;
    }

    public void setFuname(String funame) {
        this.funame = funame;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
