package com.example.lovecompatibility.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "questions")
@Getter
@Setter
@EqualsAndHashCode
@Entity
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Question implements Serializable
{
    private static final long serialVersionUID = 1L;

    /**
     * Primary Key
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", insertable = false, nullable = false)
    private Long id;

    private String name;
}
