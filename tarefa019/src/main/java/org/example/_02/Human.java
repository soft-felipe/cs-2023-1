package org.example._02;

class Human {
    private String name;
    private String age;
    private Address address;

    public String getFullAddressRefatored() {
        return address.getFullAddress();
    }
}

class Address {
    private String country;
    private String city;
    private String street;
    private String house;
    private String quarter;

    public String getFullAddress() {
        StringBuilder result = new StringBuilder();
        return result
                .append(country)
                .append(", ")
                .append(city)
                .append(", ")
                .append(street)
                .append(", ")
                .append(house)
                .append(" ")
                .append(quarter).toString();
    }
}
