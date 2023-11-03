# XSD FILE GENERATOR

## Description
This is a simple project for generating xml schema definition file
based on java classes.

## Goal

- Learn how to use jaxb2-maven-plugin for generating xsd files
- Prepare for soap based web services implementation

## Generated Schema

````xml
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema" version="1.0">
    
  <xs:complexType name="country">
    <xs:sequence>
      <xs:element name="area" type="xs:int"/>
      <xs:element minOccurs="0" name="capital" type="xs:string"/>
      <xs:element minOccurs="0" name="currency" type="currency"/>
      <xs:element minOccurs="0" name="ignored" type="xs:string"/>
      <xs:element minOccurs="0" name="name" type="xs:string"/>
      <xs:element name="population" type="xs:int"/>
    </xs:sequence>
  </xs:complexType>
    
  <xs:complexType name="getCountryRequest">
    <xs:sequence>
      <xs:element minOccurs="0" name="name" type="xs:string"/>
    </xs:sequence>
  </xs:complexType>
    
  <xs:complexType name="getCountryResponse">
    <xs:sequence>
      <xs:element minOccurs="0" name="country" type="country"/>
    </xs:sequence>
  </xs:complexType>
    
  <xs:simpleType name="currency">
    <xs:restriction base="xs:string">
      <xs:enumeration value="CFA"/>
      <xs:enumeration value="EUR"/>
      <xs:enumeration value="GBP"/>
      <xs:enumeration value="PLN"/>
    </xs:restriction>
  </xs:simpleType>
    
</xs:schema>
````

## Contact

- Feel free to join at [tountounabela@gmail.com](mailto://tountounabela@gmail.com)