package org.example;


import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "Subscriptions")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Subscription {

    @EmbeddedId
    private SubscriptionKey id;

    @Column (name = "subscription_date")
    private LocalDateTime subscriptionDate;

   // @Column (name = "student_id")
    //private int studentId;

    //@Column (name = "course_id")
    //private int courseId;

}
