package org.example;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "purchaselist")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Purchase {

    @EmbeddedId
    private PurchaselistKey id;

    @Column (name = "subscription_date")
    private LocalDateTime subscriptionDate;

    private Integer price;
}
