
package ec.edu.espol.solid;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author sam sung
 */
public class D {
    
    public interface CustomerDao {

        Optional<Customer> findById(int id);

        List<Customer> findAll();

    }
    
    public class Customer {

        private final String name;

        public Customer(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Customer{" + "name=" + name + '}';
        }
    }
    
    
    
    public class SimpleCustomerDao implements CustomerDao {

        private Map<Integer, Customer> customers = new HashMap<>();

        public SimpleCustomerDao(Map<Integer, Customer> customers) {
            this.customers = customers;
        }

        @Override
        public Optional<Customer> findById(int id) {
            return Optional.ofNullable(customers.get(id));
        }

        @Override
        public List<Customer> findAll() {
            return new ArrayList<>(customers.values());
        }
    }
    
    public class CustomerService {

        private final CustomerDao customerDao;

        public CustomerService(CustomerDao customerDao) {
            this.customerDao = customerDao;
        }

        public Optional<Customer> findById(int id) {
            return customerDao.findById(id);
        }

        public List<Customer> findAll() {
            return customerDao.findAll();
        }
    }
    
    /*
    Referencia
    https://github.com/eugenp/tutorials/tree/master/patterns-modules/dip/src/main/java/com/baeldung/dip
    */
 
}

