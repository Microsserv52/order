package Microsserv52.order;

import java.util.List;

import Microsserv52.OrderItem;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;

public record OrderIn(
    @NotEmpty List<@Valid OrderItem> items
) {}
