package com.zakharenko.task.tracker.api.factories;

import com.zakharenko.task.tracker.api.dto.TaskDto;
import com.zakharenko.task.tracker.api.dto.TaskStateDto;
import com.zakharenko.task.tracker.store.entities.TaskEntity;
import com.zakharenko.task.tracker.store.entities.TaskStateEntity;
import org.springframework.stereotype.Component;

@Component
public class TaskDtoFactory {

    public TaskDto makeProjectDto(TaskEntity entity) {
        return TaskDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .createdAt(entity.getCreatedAt())
                .description(entity.getDescription())
                .build();
    }
}
