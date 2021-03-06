package hirs.data.persist;

import javax.persistence.Entity;

/**
 * This <code>Baseline</code> class is used exclusively for testing purposes.
 */
@Entity
public class TestBaseline extends Baseline {

    /**
     * Creates a new <code>TestBaseline</code> with the set name.
     *
     * @param name name
     */
    public TestBaseline(final String name) {
        super(name);
    }

    /**
     * Default constructor necesessary for Hibernate.
     */
    protected TestBaseline() {
        super();
    }

}
