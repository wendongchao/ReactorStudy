package com.flux;

import com.po.ClientUser;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author wendongchao
 * @ClassName FluxDemo01
 * @Date 2022/4/15 14:08
 */
public class FluxDemo01 {
    public  static void main(String[] args) {
        FluxDemo01 fluxDemo01 = new FluxDemo01();
        System.out.println(fluxDemo01.allUserList());
        fluxDemo01.allUserStream().forEach(i -> System.out.println(i));
        Flux<ClientUser> flux = fluxDemo01.allUserFlux();
        flux.subscribe(i -> System.out.println(i));
    }

    /**
     * list创建
     * @param
     * @return {@link List< ClientUser>}
     * @date 2022/4/15 15:10
     */
    public List<ClientUser> allUserList() {
        return Arrays.asList(new ClientUser("felord.cn", "reactive"),
                new ClientUser("Felordcn", "Reactor"));
    }

    /**
     * stream创建
     * @param
     * @return {@link Stream< ClientUser>}
     * @date 2022/4/15 14:14
     */
    public Stream<ClientUser> allUserStream() {
        return  Stream.of(new ClientUser("felord.cn", "reactive"),
                new ClientUser("Felordcn", "Reactor"));
    }

    /**
     * flux创建
     * @param  
     * @return {@link Flux< ClientUser>}
     * @date 2022/4/15 15:19
     */
    public Flux<ClientUser> allUserFlux(){
        return Flux.just(new ClientUser("felord.cn", "reactive"),
                new ClientUser("Felordcn", "Reactor"));
    }
}
