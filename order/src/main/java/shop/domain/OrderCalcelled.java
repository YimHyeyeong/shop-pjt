package shop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import shop.domain.*;
import shop.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderCalcelled extends AbstractEvent {

    private Long id;
    private String customerid;
    private String productid;
    private Integer qty;
    private String address;

    public OrderCalcelled(Order aggregate) {
        super(aggregate);
    }

    public OrderCalcelled() {
        super();
    }
}
//>>> DDD / Domain Event
