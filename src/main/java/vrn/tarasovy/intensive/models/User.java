package vrn.tarasovy.intensive.models;

import vrn.tarasovy.intensive.enums.Role;

import javax.persistence.*;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column
    String login;
    @Column
    String password;
    @Column
    @Enumerated(EnumType.STRING)
    Role role;
}
