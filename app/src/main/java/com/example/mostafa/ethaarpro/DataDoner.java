package com.example.mostafa.ethaarpro;

import java.io.Serializable;

public class DataDoner implements Serializable {
    String identity, unitnum, name1, name2, name3, name4, telephone, phone, sex
            , address, street, work, status, datedonate, namepatient, heat, weight, heart, status2
    , pressure, diseass, respons, rh, hb, gdl, wbc, rbc, plt, namelab, tech;

    public DataDoner(String identity, String unitnum, String name1, String name2, String name3, String name4, String telephone, String phone, String sex, String address, String street, String work, String status, String datedonate, String namepatient, String heat, String weight, String heart, String status2, String pressure, String diseass, String respons, String rh, String hb, String gdl, String wbc, String rbc, String plt, String namelab, String tech) {
        this.identity = identity;
        this.unitnum = unitnum;
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
        this.name4 = name4;
        this.telephone = telephone;
        this.phone = phone;
        this.sex = sex;
        this.address = address;
        this.street = street;
        this.work = work;
        this.status = status;
        this.datedonate = datedonate;
        this.namepatient = namepatient;
        this.heat = heat;
        this.weight = weight;
        this.heart = heart;
        this.status2 = status2;
        this.pressure = pressure;
        this.diseass = diseass;
        this.respons = respons;
        this.rh = rh;
        this.hb = hb;
        this.gdl = gdl;
        this.wbc = wbc;
        this.rbc = rbc;
        this.plt = plt;
        this.namelab = namelab;
        this.tech = tech;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getUnitnum() {
        return unitnum;
    }

    public void setUnitnum(String unitnum) {
        this.unitnum = unitnum;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public String getName4() {
        return name4;
    }

    public void setName4(String name4) {
        this.name4 = name4;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDatedonate() {
        return datedonate;
    }

    public void setDatedonate(String datedonate) {
        this.datedonate = datedonate;
    }

    public String getNamepatient() {
        return namepatient;
    }

    public void setNamepatient(String namepatient) {
        this.namepatient = namepatient;
    }

    public String getHeat() {
        return heat;
    }

    public void setHeat(String heat) {
        this.heat = heat;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeart() {
        return heart;
    }

    public void setHeart(String heart) {
        this.heart = heart;
    }

    public String getStatus2() {
        return status2;
    }

    public void setStatus2(String status2) {
        this.status2 = status2;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getDiseass() {
        return diseass;
    }

    public void setDiseass(String diseass) {
        this.diseass = diseass;
    }

    public String getRespons() {
        return respons;
    }

    public void setRespons(String respons) {
        this.respons = respons;
    }

    public String getRh() {
        return rh;
    }

    public void setRh(String rh) {
        this.rh = rh;
    }

    public String getHb() {
        return hb;
    }

    public void setHb(String hb) {
        this.hb = hb;
    }

    public String getGdl() {
        return gdl;
    }

    public void setGdl(String gdl) {
        this.gdl = gdl;
    }

    public String getWbc() {
        return wbc;
    }

    public void setWbc(String wbc) {
        this.wbc = wbc;
    }

    public String getRbc() {
        return rbc;
    }

    public void setRbc(String rbc) {
        this.rbc = rbc;
    }

    public String getPlt() {
        return plt;
    }

    public void setPlt(String plt) {
        this.plt = plt;
    }

    public String getNamelab() {
        return namelab;
    }

    public void setNamelab(String namelab) {
        this.namelab = namelab;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    @Override
    public String toString() {
        return name1;
    }
}
