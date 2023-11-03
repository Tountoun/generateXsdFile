package com.gofar.models;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "country")
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(name = "country",
        propOrder = {"name", "capital", "currency", "area", "population"})
public class Country {

    @XmlElement(required = true)
    private String name;
    @XmlElement(required = true)
    private String capital;
    @XmlElement(required = true)
    private Currency currency;
    @XmlElement(required = true)
    private int population;
    @XmlElement(required = true)
    private int area;
    @XmlTransient
    private String ignored;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getIgnored() {
        return ignored;
    }

    public void setIgnored(String ignored) {
        this.ignored = ignored;
    }
}
