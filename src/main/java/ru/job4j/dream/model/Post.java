package ru.job4j.dream.model;

import lombok.*;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
public class Post implements Serializable {
    @NonNull
    private int id;
    @NonNull
    private String name;
    private City city;
}
