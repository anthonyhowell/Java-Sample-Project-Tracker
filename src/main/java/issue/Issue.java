package issue;

import asset.*;
import core.*;
import org.joda.time.*;
import project.*;
import user.*;

import javax.persistence.*;
import java.util.*;

/**
 * Created by anthonyhowell on 9/10/15.
 */
@Entity
public class Issue extends BaseEntity {

    Project project;

    Type type;

    User reporter;
    User assignee;

    DateTime dateDue;

    String summary;
    String description;
    String environment;

    Priority priority;
    Status status;
    Resolution resolution;

    Long timeOriginalEstimate;
    Long timeEstimate;
    Long timeSpent;

    Set<User> usersWatching;

    Set<Asset> attachments;
    Set<WorkLog> workLog;

}
