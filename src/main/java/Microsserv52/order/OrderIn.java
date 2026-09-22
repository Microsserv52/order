package Microsserv52.order;

import java.util.List;

import Microsserv52.OrderItem;
import lombok.Builder;

@Builder 
public record OrderIn (
    List<OrderItem> items
) {

}
