/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT10;

/**
 *
 * @author dinhc
 */
public class Supplier {

    private String idSup;
    private String name;
    private String address;
    private String tel;

    public Supplier(String idSup, String name, String address, String tel) {
        this.idSup = idSup;
        this.name = name;
        this.address = address;
        this.tel = tel;
    }

    public String getIdSup() {
        return idSup;
    }

    public void setIdSup(String idSup) {
        this.idSup = idSup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public int hashCode() {
        int hash = (int) (idSup.charAt(0) + idSup.charAt(1));
        return hash;
    }

    public boolean equals(Object obj) {
        return this.idSup.equals(((Supplier) (obj)).idSup);
    }

    @Override
    public String toString() {
        return idSup + " " + name + " " + address + " " + tel;
    }
}
