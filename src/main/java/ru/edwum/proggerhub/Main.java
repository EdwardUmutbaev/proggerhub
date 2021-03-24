package ru.edwum.proggerhub;

import ru.edwum.di.Container;
import ru.edwum.di.exception.DIException;
import ru.edwum.proggerhub.repository.UserRepository;
import ru.edwum.proggerhub.service.UserService;

public class Main {
    public static void main(String[] args) {
        try {
            Container container = new Container();

            container.register("test", "test");
            container.register(UserRepository.class, UserService.class);
            container.wire();
        } catch (DIException e) {
            e.printStackTrace();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}
