package com.viarzilin.service.impl;

import com.viarzilin.domain.MyNumber;
import com.viarzilin.repo.MyNumberRepo;
import com.viarzilin.service.MyNumberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class MyNumberServiceImpl implements MyNumberService {
    private final MyNumberRepo repo;

    public MyNumber saveMyNumber(MyNumber number) {
        return repo.save(number);
    }
}
