package io.codeka.gaia.teams.repository;

import io.codeka.gaia.teams.Team;
import io.codeka.gaia.teams.User;
import io.codeka.gaia.test.MongoContainer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.annotation.DirtiesContext;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.assertj.core.api.Assertions.assertThat;

@DataMongoTest
@Testcontainers
@DirtiesContext
class UserRepositoryIT {

    @Container
    private static MongoContainer mongoContainer = new MongoContainer();

    @Autowired
    private UserRepository userRepository;

    @Test
    void user_shouldBeSaved(){
        // given
        var sam = new User("Samantha Carter", new Team("SG-1"));

        // when
        userRepository.save(sam);

        // then
        var result = userRepository.findById("Samantha Carter");
        assertThat(result).isNotNull()
                .isPresent()
                .hasValueSatisfying(user -> {
                    assertThat(user.getUsername()).isEqualTo("Samantha Carter");
                });
    }

}