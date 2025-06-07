package app;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/product")
@CrossOrigin(origins = "*")
public class ProductController {

  @GetMapping("/{id}")
  ProductDto findById(@PathVariable Long id, HttpServletRequest request){
    return new ProductDto(id, "Product " + id + " jwt-assertion " + request.getHeader("jwt-assertion"));
  }

  @GetMapping("/all")
  List<ProductDto> getAll() {
    return List.of(
        new ProductDto(1L, "Apple watch"),
        new ProductDto(2L, "Iphone"),
        new ProductDto(3L, "Macbook Air")
    );
  }
}
