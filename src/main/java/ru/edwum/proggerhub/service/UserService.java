package ru.edwum.proggerhub.service;

import lombok.RequiredArgsConstructor;
import ru.edwum.proggerhub.repository.UserRepository;

@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;
}
