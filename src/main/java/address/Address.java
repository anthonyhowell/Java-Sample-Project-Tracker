package address;

import core.*;

import javax.persistence.*;

/**
 * Created by anthonyhowell on 9/10/15.
 */
@Entity
public class Address extends BaseEntity {

    static final long serialVersionUID = 1L;

    String street;
    String street2;
    String city;
    String province;

    @Embedded
    ZipCode zipCode;

    @Embedded
    Country country;

}
