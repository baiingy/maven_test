package com.bmy.maven.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName:User
 * Package:com.bmy.maven.pojo
 * Description:
 *
 * @Creat:2024/3/25
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    private Integer id;
    private String username;
    private String password;

}
