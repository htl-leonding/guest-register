package at.htl.register.control;

import at.htl.register.entity.Guest;
import io.quarkus.runtime.Startup;
import io.quarkus.runtime.StartupEvent;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

@ApplicationScoped
public class InitBean {

    @Inject
    GuestRepository guestRepository;

    @Inject
    Logger logger;

    void onStart(@Observes StartupEvent event) {

        Guest dagobert = new Guest(
                "Dagobert",
                "Duck",
                "123-456",
                "dago@entenhausen.com"
        );

        System.out.println(dagobert);

        dagobert = guestRepository.save(dagobert);

        logger.info(dagobert);
    }

}
