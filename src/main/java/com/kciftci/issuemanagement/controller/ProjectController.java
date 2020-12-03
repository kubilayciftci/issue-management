package com.kciftci.issuemanagement.controller;

import com.kciftci.issuemanagement.dto.ProjectDto;
import com.kciftci.issuemanagement.service.implementation.ProjectServiceImpl;
import com.kciftci.issuemanagement.util.ApiPaths;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(ApiPaths.ProjectPaths.PROJECT_PATH)
@Api(value = ApiPaths.ProjectPaths.PROJECT_PATH, description = "User APIs")
@Slf4j
public class ProjectController {

    private final ProjectServiceImpl projectServiceImpl;

    public ProjectController(ProjectServiceImpl projectServiceImpl) {
        this.projectServiceImpl = projectServiceImpl;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "get by id operation", response = ProjectDto.class)
    public ResponseEntity<ProjectDto> getById(@PathVariable(value = "id") Long id) {
        log.info("Project Controller->GetById");
        log.debug("Project Controller->GetByID->Param:" + id);
        ProjectDto projectDto = projectServiceImpl.getById(id);
        return ResponseEntity.ok(projectDto);
    }

    //TODO Solve @Valid annotation problem and add it.
    @PostMapping
    @ApiOperation(value = "create project operation", response = ProjectDto.class)
    public ResponseEntity<ProjectDto> createProject(@RequestBody ProjectDto projectDto) {
        return ResponseEntity.ok(projectServiceImpl.save(projectDto));
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "update project operation", response = ProjectDto.class)
    public ResponseEntity<ProjectDto> updateProject(@PathVariable(value = "id") Long id, @RequestBody ProjectDto projectDto) {
        ProjectDto update = projectServiceImpl.update(id, projectDto);
        return ResponseEntity.ok(update);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "delete project operation", response = Boolean.class)
    public ResponseEntity<Boolean> delete(@PathVariable(value = "id") Long id) {
        return ResponseEntity.ok(projectServiceImpl.delete(id));
    }
}
