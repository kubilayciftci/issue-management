package com.kciftci.issuemanagement.repository;

import com.kciftci.issuemanagement.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssueRepository extends JpaRepository<Issue, Long> {


}
