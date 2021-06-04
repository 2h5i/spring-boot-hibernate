package com.example.demo.data.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="user")
@Setter
@Getter
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private @Column(name = "uid") Long uid;
  private @Column(name = "email") String email;
  private @Column(name = "password")String password;
  private @Column(name = "nick") String nick;

  @CreationTimestamp
  private @Column(name = "cdate") Timestamp cdate;

  @UpdateTimestamp
  private @Column(name = "udate") Timestamp udate;
}
