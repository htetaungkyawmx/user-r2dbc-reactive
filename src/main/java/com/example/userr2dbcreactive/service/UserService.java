package com.example.userr2dbcreactive.service;

import com.example.userr2dbcreactive.dto.UserDto;
import com.example.userr2dbcreactive.repository.UserRepository;
import com.example.userr2dbcreactive.util.EntityUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public Flux<UserDto> all() {
        return userRepository.findAll()
                .map(EntityUtil::toDto);
    }
}
