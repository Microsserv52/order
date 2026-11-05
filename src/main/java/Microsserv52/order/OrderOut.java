package Microsserv52.order;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

public record OrderOut(
    UUID id,
    OffsetDateTime date,
    String currency,
    List<OrderItemOut> items,
    BigDecimal total
) {}
