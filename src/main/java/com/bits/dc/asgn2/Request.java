package com.bits.dc.asgn2;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
public class Request implements Serializable {

    private final int senderClock;
    private final ID senderId;

}
