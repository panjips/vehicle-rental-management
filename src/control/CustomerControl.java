package control;
/**
 * Nama : Made Riksi Purnama Sadnya Agung
 * NPM  : 210711396
 * 
 * Nama : I Made Panji Pusaka Suryeswara
 * NPM  : 210711397
 */
import dao.CustomerDAO;
import java.util.List;
import model.Customer;
import table.TableCustomer;

public class CustomerControl {
    private CustomerDAO cDao = new CustomerDAO();

    
    public List<Customer> showCustomerBySearch(String query){
        List<Customer> list = cDao.showCustomerBySearch(query);
        TableCustomer tableCustomer =  new TableCustomer(list);
        
        return list;
    }
}
