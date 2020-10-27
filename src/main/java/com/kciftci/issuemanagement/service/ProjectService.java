package com.kciftci.issuemanagement.service;

import com.kciftci.issuemanagement.dto.ProjectDto;
import com.kciftci.issuemanagement.entity.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProjectService {

    Project save(Project project);

    ProjectDto getById(Long id);

    List<Project> getByProjectCode(String projectCode);

    List<Project> getByProjectCodeContains(String projectCode);

    Page<Project> getAllPagination(Pageable pageable);

    Boolean delete(Project project);
}
