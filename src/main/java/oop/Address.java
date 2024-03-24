package oop;

public class Address {
    private String country;
    private String city;
    private int zipCode;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (!country.isEmpty())
        {
            this.country = country;
        }
        else
        {
            System.out.println("ERROR: Invalid entry for country");
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if(!city.isEmpty()) {
            this.city = city;
        }
        else {
            System.out.println("ERROR: Invalid entry for city");
        }
    }

    public int zipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        if (zipCode > 0) {
            this.zipCode = zipCode;
        } else {
            System.out.println("ERROR: Invalid entry for zip code");
        }
    }
    // constructor
    public Address(String country, String city, int zipCode) {
        setCountry(country);
        setCity(city);
        setZipCode(zipCode);

    }

    public String printAddress(){
        return String.format( "%s, %s and zip code : %d", country,city, zipCode);
    }
}

