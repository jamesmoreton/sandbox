package com.jamesmoreton;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {

  @Test
  void helloWorld() {
    assertThat(Main.helloWorld()).isEqualTo("Hello World!");
  }
}