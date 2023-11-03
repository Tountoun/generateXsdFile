package com.gofar.models;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlRootElement(name = "currency")
@XmlEnum(value = String.class)
public enum Currency {
    @XmlEnumValue(value = "CFA")
    CFA,
    @XmlEnumValue(value = "EUR")
    EUR,
    @XmlEnumValue(value = "GBP")
    GBP,
    @XmlEnumValue(value = "PLN")
    PLN
}
