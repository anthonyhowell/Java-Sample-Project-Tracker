package issue;

import core.*;

import javax.persistence.*;

/**
 * Created by anthonyhowell on 9/10/15.
 */
@Entity
public class Status extends BaseEntity {

    Integer ordinal;
    String name;
    String description;

}
