package ch.heigvd.gamification.services.to;

import ch.heigvd.gamification.model.Application;
import ch.heigvd.gamification.to.PrivateApplicationTO;
import ch.heigvd.gamification.to.PublicApplicationTO;
import javax.ejb.Local;

/**
 *
 * @author Khaled Basbous
 */
@Local
public interface ApplicationsTOServiceLocal {
    // TODO: Warning - Update proprety in description when class application is complete
    /**
     * This method builds a TO instance from a JPA entity instance. In this
     * particular case, the only thing that we do is get rid of the ... property
     * (which is available in the JPA entity but should not be communicated to
     * clients).
     *
     * @param source the JPA entity
     * @return the TO
     */
    public PublicApplicationTO buildPublicApplicationTO(Application source);
    
    public PublicApplicationTO buildPublicSummaryApplicationTO(String name, String description);
    
    // TODO: Warning - Update proprety in description when class application is complete
    /**
     * This method updates an existing JPA entity by merging the state of the
     * provided TO instance. We do not touch the ... property, but replace
     * the other properties.
     *
     * @param existingEntity the existing entity that we want to update
     * @param newState a TO that contains new state (subset of the entity state)
     * @return the updated employee entity
     */
    public void updateApplicationEntity(Application existingEntity, PrivateApplicationTO newState);

}
