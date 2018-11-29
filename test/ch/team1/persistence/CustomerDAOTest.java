package ch.team1.persistence;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class CustomerDAOTest {

    private CustomerDAO customerDAO;


    private final String CUSTOMER_FIRSTNAME_1 = "vorname";
    private final String CUSTOMER_LASTNAME_1 = "nachname";

    @Before
    public void setUp() throws Exception {

        customerDAO = new CustomerDAO();
        customerDAO.setFirstName(CUSTOMER_FIRSTNAME_1);
        customerDAO.setLastName(CUSTOMER_LASTNAME_1);

    }

    @Test
    public void getFirstName() {
        assertThat(customerDAO.getFirstName(), is(CUSTOMER_FIRSTNAME_1));
    }

    @Test
    public void getLastName() {
        assertThat(customerDAO.getLastName(), is(CUSTOMER_LASTNAME_1));
    }

}