package com.gofar.models;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "countryResponse")
@XmlType(name = "countryResponse", propOrder = {"country"})
public class GetCountryResponse {

    private Country country;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
