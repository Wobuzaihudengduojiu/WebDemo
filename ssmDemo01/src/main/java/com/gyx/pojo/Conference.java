package com.gyx.pojo;


import lombok.*;

import java.util.List;

@NoArgsConstructor
@ToString
@AllArgsConstructor
@Builder
@Setter
@Getter
public class Conference {

    private String theme;

    private List<Boss> bosses;

}
