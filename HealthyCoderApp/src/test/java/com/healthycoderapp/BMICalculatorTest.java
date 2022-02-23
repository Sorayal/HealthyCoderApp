package com.healthycoderapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class BMICalculatorTest {

  // Three steps of tests AAA: Arrange, Act, Assert
  @Test
  void shouldReturnTrueWhenDietRecommended() {
    // given
    double weight = 89.0;
    double height = 1.72;

    // when
    boolean recommended = BMICalculator.isDietRecommended(weight, height);

    //then
    assertTrue(recommended);
  }

  @Test
  void shouldReturnFalseWhenDietRecommended() {
    // given
    double weight = 50.0;
    double height = 1.92;

    // when
    boolean recommended = BMICalculator.isDietRecommended(weight, height);

    //then
    assertFalse(recommended);
  }

  @Test
  void shouldThrowArithmeticExceptionWhenHeightZero() {
    // given
    double weight = 50.0;
    double height = 0.0;

    // when
    // Executable is needed because method won´t reach the end, this will parse while the program runs.
    Executable executable = () -> BMICalculator.isDietRecommended(weight, height);

    //then
    assertThrows(ArithmeticException.class, executable);
  }
}