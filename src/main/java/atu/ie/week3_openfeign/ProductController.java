package atu.ie.week3_openfeign;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductController {
    private List<Product> products = new ArrayList<>();
    private ProductService productService;
    private Communication communication;

    @GetMapping("/getDetails")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();

    }
    @PostMapping("/postDetails")
    public Product addProduct(@Valid @RequestBody Product product) {
        return productService.addProduct(product);
    }

    @PutMapping("/update/{id}")
    public Product updateProduct(@Valid  @PathVariable long id, @RequestBody Product product) {
        return productService.updateProduct(id, product);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@Valid @PathVariable long id) {
        productService.deleteProduct(id);
    }
    @PostMapping ("/confirm")
    public String GetDetailsForFirstProduct(@RequestBody Product product) {
        return communication.someDetails(product);

    }
}
