package category;

import core.*;

import javax.persistence.*;
import java.util.*;

/**
 * Created by anthonyhowell on 9/10/15.
 */
@Entity
public class Category extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String label;
    private Set<Category> children;

}
