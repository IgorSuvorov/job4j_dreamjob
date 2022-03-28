package ru.job4j.dream.model;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Post implements Serializable {
    @NonNull
    private int id;
    @NonNull
    private String name;
    private City city;
}

