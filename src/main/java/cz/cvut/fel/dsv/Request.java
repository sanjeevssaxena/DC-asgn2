package cz.cvut.fel.dsv;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
public class Request implements Serializable {

    private final int fromClock;
    private final String identifier;

}
