package com.mono;

import com.po.ClientUser;
import reactor.core.publisher.Mono;

import java.util.Optional;

/**
 * @author wendongchao
 * @ClassName MonoDemo01
 * @Date 2022/4/15 15:37
 */
public class MonoDemo01 {

    public final static boolean isAuthenticated = false;

    public static void main(String[] args) {
        MonoDemo01 monoDemo01 = new MonoDemo01();
        System.out.println(monoDemo01.currentUser());
        System.out.println(monoDemo01.currentUserOptional());
        System.out.println(monoDemo01.currentUserMono());

    }

    /**
     * 传统
     * @param  
     * @return {@link ClientUser}
     * @date 2022/4/15 15:38
     */
    public ClientUser currentUser() {
        return isAuthenticated ? new ClientUser("felord.cn", "reactive") : null;
    }

    /**
     * Optional
     * @param
     * @return {@link Optional< ClientUser>}
     * @date 2022/4/15 15:39
     */
    public Optional<ClientUser> currentUserOptional() {
        return isAuthenticated ? Optional.of(new ClientUser("felord.cn", "reactive"))
                : Optional.empty();
    }

    /**
     * Mono
     * @param
     * @return {@link Mono< ClientUser>}
     * @date 2022/4/15 15:41
     */
    public Mono<ClientUser> currentUserMono() {
        return isAuthenticated ? Mono.just(new ClientUser("felord.cn", "reactive"))
                : Mono.empty();
    }
}
