package com.fastcampus.Res9ueTeam.entity;
import com.fastcampus.Res9ueTeam.global.common.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Goal extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    @Column(nullable = false)
    private Long userId;
    @Column(nullable = false)
    private Long expenseGoal;
    @Column(nullable = false)
    private Long saveGoal;

    @Column(nullable = false,columnDefinition = "TEXT")
    private String resolution;
    @Column(nullable = false)
    private LocalDateTime goalDate;


}
