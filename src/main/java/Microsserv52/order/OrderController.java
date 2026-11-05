package Microsserv52.order;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import jakarta.validation.Valid;

public interface OrderController {
    @PostMapping("/orders")
    @ResponseStatus(HttpStatus.CREATED)
    OrderOut create(@Valid @RequestBody OrderIn orderIn);

    @GetMapping("/orders")
    List<OrderOut> findAll();

    @GetMapping("/orders/{id}")
    OrderOut findById(@PathVariable UUID id, @RequestParam(defaultValue = "USD") String currency);
}
