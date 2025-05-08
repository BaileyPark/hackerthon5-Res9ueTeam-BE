package com.fastcampus.Res9ueTeam.service;

import com.fastcampus.Res9ueTeam.dto.GoalRequestDto;
import com.fastcampus.Res9ueTeam.dto.GoalResponseDto;
import com.fastcampus.Res9ueTeam.entity.Goal;
import com.fastcampus.Res9ueTeam.repository.GoalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

// 📁 service/GoalService.java
@Service
@RequiredArgsConstructor
public class GoalService {

    private final GoalRepository goalRepository;

    public GoalResponseDto saveGoal(GoalRequestDto dto) {

        Goal goal = dto.toEntity();
        Goal saved = goalRepository.save(goal);
        return GoalResponseDto.fromEntity(saved);
    }


}
