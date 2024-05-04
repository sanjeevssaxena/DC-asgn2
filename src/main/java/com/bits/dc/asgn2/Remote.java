package com.bits.dc.asgn2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
public class Remote {

  private Node node;

  @Setter
  private boolean isRequesting;

}
