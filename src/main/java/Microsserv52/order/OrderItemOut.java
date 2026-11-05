package Microsserv52.order;

import java.math.BigDecimal;
import java.util.UUID;

public record OrderItemOut(
    UUID id,
    UUID idProduct,
    Integer quantity,
    BigDecimal total
) {}
