package com.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author wendongchao
 * @ClassName ClientUser
 * @Date 2022/4/15 14:09
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientUser {
    private String name;
    private String type;
}
