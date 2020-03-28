package me.guilherme.csvBatch.batch;

import me.guilherme.csvBatch.model.User;
import me.guilherme.csvBatch.repository.UserRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBWhiter implements ItemWriter<User> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void write(List<? extends User> users) throws Exception {
        System.out.println("Data saved for default for Users: " + users);
        this.userRepository.saveAll(users);
    }
}
