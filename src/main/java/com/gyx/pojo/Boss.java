package com.gyx.pojo;


import lombok.*;
import org.springframework.stereotype.Service;

import java.util.Optional;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
public class Boss {

    private String name;

    private String company;

    private String hobby;

    private Car car;



}
