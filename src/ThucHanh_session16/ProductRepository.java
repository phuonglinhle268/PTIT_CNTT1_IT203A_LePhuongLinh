package ThucHanh_session16;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository implements IRepository<Product> {

    private List<Product> listProduct = new ArrayList<>();
    private Map<String, Product> searchProduct = new HashMap<>();

    @Override
    public boolean add(Product item) {
        if (item == null){
            return false;
        }
        if (searchProduct.containsKey(item.getId())){
            return false;
        }
        listProduct.add(item);
        searchProduct.put(item.getId(), item);
        return true;
    }

    @Override
    public boolean removeById(String id) {
        Product p = searchProduct.get(id);
        if (p == null){
            return false;
        }

        listProduct.remove(p);
        searchProduct.remove(id);
        return true;
    }

    @Override
    public Product findById(String id) {
        return searchProduct.get(id);
    }

    @Override
    public List<Product> findAll() {
        return listProduct;
    }
}
