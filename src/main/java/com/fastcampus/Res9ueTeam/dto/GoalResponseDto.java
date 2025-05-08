package com.fastcampus.Res9ueTeam.dto;

import com.fastcampus.Res9ueTeam.entity.Goal;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class GoalResponseDto {

    private Long id;
    private Long userId;
    private Long expenseGoal;
    private Long saveGoal;
    private String resolution;
    private LocalDateTime goalDate;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    public static GoalResponseDto fromEntity(Goal goal) {
        return GoalResponseDto.builder()
                .id(goal.getId())
                .userId(goal.getUserId())
                .expenseGoal(goal.getExpenseGoal())
                .saveGoal(goal.getSaveGoal())
                .resolution(goal.getResolution())
                .goalDate(goal.getGoalDate())
                .createdAt(goal.getCreatedAt())
                .updatedAt(goal.getUpdatedAt())
                .build();
    }
}


