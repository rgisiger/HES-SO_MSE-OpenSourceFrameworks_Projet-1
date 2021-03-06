package ch.heigvd.gamification.to;

import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * This is a Transfer Object, which will be used to send data to the client.
 * Instances of this class will be created from JPA entities, but will not
 * expose all attributes. The class must have an empty constructor, as well as
 * getters and setters for properties (this is required for the JAXB marshalling
 * to work properly). That is also why we have the @XmlRootElement annotation at
 * the class level.
 *
 * @author Khaled Basbous
 */

@XmlRootElement
public class PublicPlayerTO {

    private Long id;
    
    private String firstName;
    private String lastName;
    private String email;
    
    private Integer numberOfPoints;
    
    private Collection<PublicBadgeTO> badges;
    
    public PublicPlayerTO() {
    }

    public PublicPlayerTO(Long id, String firstName, String lastName, String email, Integer numberOfPoints, List<PublicBadgeTO> badges/*, PublicApplicationTO application*/) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.numberOfPoints = numberOfPoints;
        this.badges = badges;
        //this.applicationTO = application;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getNumberOfPoints() {
        return numberOfPoints;
    }

    public void setNumberOfPoints(Integer numberOfPoints) {
        this.numberOfPoints = numberOfPoints;
    }

    public Collection<PublicBadgeTO> getBadges() {
        return badges;
    }

    public void setBadges(Collection<PublicBadgeTO> badges) {
        this.badges = badges;
    }

}
