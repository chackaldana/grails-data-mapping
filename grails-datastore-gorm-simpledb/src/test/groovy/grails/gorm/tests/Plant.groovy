package grails.gorm.tests

import grails.persistence.Entity

/**
 * Test entity for testing AWS SimpleDB.
 *
 * @author Roman Stepanenko
 * @since 0.1
 */
@Entity
class Plant implements Serializable {
    String id
    boolean goesInPatch
    String name

    static mapping = {
        domain 'Plant'
    }
}