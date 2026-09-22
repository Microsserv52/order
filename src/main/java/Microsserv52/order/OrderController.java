package Microsserv52.order;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(
    name = "order",
    url = "http://order:8080"
)
public interface OrderController {

    @PostMapping("/orders")
    public ResponseEntity<OrderOut> create(
        @RequestBody OrderIn orderIn
    );
}
