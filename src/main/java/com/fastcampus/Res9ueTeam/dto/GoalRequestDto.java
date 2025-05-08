package com.fastcampus.Res9ueTeam.dto;

import com.fastcampus.Res9ueTeam.entity.Goal;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.catalina.User;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class) // ✅ snake_case 요청 대응
public class GoalRequestDto {

    private Long userId;            // ✅ 프론트에서는 user_id로 보냄
    private Long expenseGoal;
    private Long saveGoal;
    private String resolution;
    private LocalDateTime goalDate;

    // ✅ DTO → Entity 변환
    public Goal toEntity() {
        return Goal.builder()
                .userId(this.userId)
                .expenseGoal(this.expenseGoal)
                .saveGoal(this.saveGoal)
                .resolution(this.resolution)
                .goalDate(this.goalDate)
                .build();
    }
}
