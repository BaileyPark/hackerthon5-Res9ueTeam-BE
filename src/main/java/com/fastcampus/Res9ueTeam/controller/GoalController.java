package com.fastcampus.Res9ueTeam.controller;

import com.fastcampus.Res9ueTeam.dto.GoalRequestDto;
import com.fastcampus.Res9ueTeam.dto.GoalResponseDto;
import com.fastcampus.Res9ueTeam.service.GoalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/goals")
public class GoalController {
    private final GoalService goalService;

    @PostMapping
    public ResponseEntity<GoalResponseDto> saveGoal(@RequestBody GoalRequestDto dto) {
        GoalResponseDto response = goalService.saveGoal(dto);
        return ResponseEntity.ok(response);
    }

}
