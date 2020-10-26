package com.kciftci.issuemanagement.service.implementation;

import com.kciftci.issuemanagement.dto.IssueDto;
import com.kciftci.issuemanagement.entity.Issue;
import com.kciftci.issuemanagement.repository.IssueRepository;
import com.kciftci.issuemanagement.service.IssueService;
import com.kciftci.issuemanagement.util.TPage;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class IssueServiceImpl implements IssueService {

    private final IssueRepository issueRepository;
    private final ModelMapper modelMapper;

    public IssueServiceImpl(IssueRepository issueRepository, ModelMapper modelMapper) {
        this.issueRepository = issueRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public IssueDto save(IssueDto issue) {
        if (issue.getDate() == null)
            throw new IllegalArgumentException("Issue date cannot be null");

        Issue issueMap = modelMapper.map(issue, Issue.class);
        issueMap = issueRepository.save(issueMap);
        return modelMapper.map(issueMap, IssueDto.class);
    }

    @Override
    public IssueDto getById(Long id) {
        return null;
    }

    @Override
    public TPage<IssueDto> getAllPagination(Pageable pageable) {

        Page<Issue> data = issueRepository.findAll(pageable);
        TPage<IssueDto> page = new TPage<>();
        IssueDto[] issueDtos = modelMapper.map(data.getContent(), IssueDto[].class);
        page.setStat(data, Arrays.asList(issueDtos));
        return page;
    }

    @Override
    public Boolean delete(IssueDto issue) {
        return null;
    }
}
