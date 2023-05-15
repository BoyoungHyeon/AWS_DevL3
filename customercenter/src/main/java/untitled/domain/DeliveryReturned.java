package untitled.domain;

import java.util.*;
import lombok.Data;
import untitled.infra.AbstractEvent;

@Data
public class DeliveryReturned extends AbstractEvent {

    private String userId;
    private Long orderId;
    private String productName;
    private Integer qty;
    private Long productId;
    private String status;
    private String courier;
}
