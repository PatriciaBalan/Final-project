package com.project.Tournamently.config;

import com.project.Tournamently.model.User;
import com.project.Tournamently.repository.UserPagingAndSortingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

public class PagingAndSortingRepositoryConfig {

    @Autowired
    public UserPagingAndSortingRepository repository;

    @Bean
    public CommandLineRunner pagingAndSortingData() {
        return args -> {
            loadData();
            paginate();
            sort();
            paginateAndSort();
        };
    }

    private void loadData() {

    }

    private void paginate() {

    }

    private void sort() {

    }

    private void paginateAndSort() {

    }
}
