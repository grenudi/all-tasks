package com.huvave.demo;

import com.huvave.demo.entity.Main;
import org.springframework.data.repository.Repository;

public abstract class repository implements Repository<Main, Integer> {
    public abstract Main findByLabelLike(String label);
}
