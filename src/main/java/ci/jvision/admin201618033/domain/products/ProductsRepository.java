package ci.jvision.admin201618033.domain.products;

import ci.jvision.admin201618033.domain.products.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductsRepository extends JpaRepository<Products, Long> {

    @Query("SELECT p from Products p ORDER BY p.id DESC")
    List<Products> findAllDesc();
}
