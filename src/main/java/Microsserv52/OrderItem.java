package Microsserv52;

import java.util.UUID;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public record OrderItem(
    @NotNull UUID idProduct,
    @NotNull @Min(1) Integer quantity
) {
}
