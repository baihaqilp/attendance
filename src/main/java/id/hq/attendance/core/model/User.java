package id.hq.attendance.core.model;

import id.hq.attendance.core.constant.Role;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "EMAIL",nullable = false,unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String name;
    @Enumerated(EnumType.STRING)
    private Role role;
    @Column(nullable = false)
    private String createdBy;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @Column(nullable = false)
    private String updatedBy;
    @UpdateTimestamp
    private LocalDateTime updatedAt;
}

