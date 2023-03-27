package com.github.youssfbr.academiadigital.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_avaliacoes")
public class AvaliacaoFisica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    private Aluno aluno;

    @Column(name = "data_da_avaliacao")
    private LocalDateTime dataDaAvaliacao = LocalDateTime.now();

    @Column(name = "peso_atual")
    private Double peso;

    @Column(name = "altura_atual")
    private Double altura;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        AvaliacaoFisica avaliacaoFisica = (AvaliacaoFisica) o;
        return id != null && Objects.equals(id, avaliacaoFisica.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

}
