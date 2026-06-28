package hellojpa;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;

@Entity
public class Locker {

    @Id @GeneratedValue
    private Long id;

    private String name;

    @OneToOne(mappedBy = "locker")
    private Member member;

}
