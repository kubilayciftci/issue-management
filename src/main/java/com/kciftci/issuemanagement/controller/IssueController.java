package com.kciftci.issuemanagement.controller;

import com.kciftci.issuemanagement.dto.IssueDto;
import com.kciftci.issuemanagement.service.implementation.IssueServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/issue")
public class IssueController {

    private final IssueServiceImpl issueServiceImpl;

    public IssueController(IssueServiceImpl issueServiceImpl) {
        this.issueServiceImpl = issueServiceImpl;
    }

    @GetMapping("/{id}")
    public ResponseEntity<IssueDto> getById(@PathVariable(value = "id") Long id) {
        IssueDto projectDto = issueServiceImpl.getById(id);
        return ResponseEntity.ok(projectDto);
    }

    //TODO Solve @Valid annotation problem and add it.
    @PostMapping
    public ResponseEntity<IssueDto> createProject(@RequestBody IssueDto issueDto) {
        return ResponseEntity.ok(issueServiceImpl.save(issueDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<IssueDto> updateProject(@PathVariable(value = "id") Long id, @RequestBody IssueDto issueDto) {
        IssueDto update = issueServiceImpl.update(id, issueDto);
        return ResponseEntity.ok(update);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable(value = "id") Long id){
        return ResponseEntity.ok(issueServiceImpl.delete(id));
    }

}
