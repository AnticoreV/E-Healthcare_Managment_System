package sapronov.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Setter
@Getter
@Table(name = "account",uniqueConstraints = {
        @UniqueConstraint(name = "patient_login_unique", columnNames = "login")
})
@Entity(name = "Account")
public class Account {
    @SequenceGenerator(
            name = "account_sequence",
            sequenceName = "account_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "account_sequence"
    )
    @Id
    private Long id;
    @Column(nullable = false)
    private String login;
    @Column(nullable = false)
    transient private String password;

}
