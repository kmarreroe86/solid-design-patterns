package builder;

import java.time.LocalDate;
import java.time.Period;

//The concrete builder for UserWebDTO
//TODO implement builder
public class UserWebDTOBuilder implements UserDTOBuilder {

    private String firstname;

    private String lastname;

    private String age;

    private String address;

    private UserDTO dto;

    @Override
    public UserDTOBuilder withFirstName(String fname) {
        firstname = fname;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lname) {
        lastname = lname;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthday(LocalDate date) {
        Period timeSpan = Period.between(date, LocalDate.now());
        int differenceInYears = timeSpan.getYears();
        age = Integer.toString(differenceInYears);
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address.getHouseNumber() + ", " + address.getStreet() + "\n" + address.getCity() + "\n" +
                address.getCity() + "\n" + address.getState() + "\n" + address.getZipcode();
        return this;
    }

    @Override
    public UserDTO build() {
        dto = new UserWebDTO(firstname + " " + lastname, address, age);
        return dto;
    }

    @Override
    public UserDTO getUserDTO() {
        return dto;
    }
}
