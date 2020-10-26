package com.kciftci.issuemanagement.service;

import com.kciftci.issuemanagement.dto.IssueDto;
import com.kciftci.issuemanagement.util.TPage;
import org.springframework.data.domain.Pageable;

public interface IssueService {

    IssueDto save(IssueDto issue);

    IssueDto getById(Long id);

    TPage<IssueDto> getAllPagination(Pageable pageable);

    Boolean delete(IssueDto issue);
}
