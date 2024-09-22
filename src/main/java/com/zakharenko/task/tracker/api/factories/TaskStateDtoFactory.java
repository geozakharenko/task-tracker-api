package com.zakharenko.task.tracker.api.factories;

import com.zakharenko.task.tracker.api.dto.ProjectDto;
import com.zakharenko.task.tracker.api.dto.TaskStateDto;
import com.zakharenko.task.tracker.store.entities.ProjectEntity;
import com.zakharenko.task.tracker.store.entities.TaskStateEntity;
import org.springframework.stereotype.Component;

@Component
public class TaskStateDtoFactory {

    public TaskStateDto makeProjectDto(TaskStateEntity entity) {
        return TaskStateDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .ordinal(entity.getOrdinal())
                .createdAt(entity.getCreatedAt())
                .build();
    }
}
