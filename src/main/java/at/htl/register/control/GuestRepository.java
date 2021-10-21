package at.htl.register.control;

import at.htl.register.entity.Guest;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@ApplicationScoped
public class GuestRepository {

    @Inject
    EntityManager em;

    @Transactional
    public Guest save(Guest guest) {
        return em.merge(guest);
    }
}
