package sapronov.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Table(name = "patient",
uniqueConstraints = {
        @UniqueConstraint(name = "patient_email_unique", columnNames = "email")
})
@Entity(name = "Patient")
public class Patient {
    @SequenceGenerator(
            name = "patient_sequence",
            sequenceName = "patient_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "patient_sequence"
    )
    @Id
    private Long id;
    @Column(nullable = false, updatable = false)
    private String firstname;
    @Column(nullable = false, updatable = false)
    private String surname;
    @Column(nullable = false, updatable = false)
    private String lastname;
    @Column(nullable = false, updatable = false)
    private String email;
    @Column(nullable = false)
    private int age;
    @OneToOne
    private Account account;
}
