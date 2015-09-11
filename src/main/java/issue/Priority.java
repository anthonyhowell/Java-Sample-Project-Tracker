package issue;

import core.*;

import javax.persistence.*;

/**
 * Created by anthonyhowell on 9/10/15.
 */
@Entity
public class Priority extends BaseEntity {

    Integer ordinal;
    String name;
    String description;
    String color;

}
