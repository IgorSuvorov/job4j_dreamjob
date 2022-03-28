package ru.job4j.dream.model;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Post implements Serializable {
    private int id;
    private String name;
    private City city;
}

