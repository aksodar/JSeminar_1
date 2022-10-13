package ru.gb.jseminar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class Task3Test {

    private Task3 task;

    @BeforeEach
    void setUp() {
        this.task = new Task3();
    }

    @Test
    void countCaseSuccessful0() {
        double[] data = null;
        int expected = 3;

        assertThat(expected, equalTo(task.count(data)));
    }

    @Test
    void countCaseSuccessful1() {
        double[] data = new double[]{};
        int expected = 0;

        assertThat(expected, equalTo(task.count(data)));
    }

    @Test
    void countCaseSuccessful2() {
        double[] data = new double[]{0, 0, 0};
        int expected = 0;

        assertThat(expected, equalTo(task.count(data)));
    }

    @Test
    void countCaseSuccessful3() {
        double[] data = new double[]{1, 1, 1};
        int expected = 1;

        assertThat(expected, equalTo(task.count(data)));
    }

    @Test
    void countCaseSuccessful4() {
        double[] data = new double[]{1, 0, 0};
        int expected = 1;

        assertThat(expected, equalTo(task.count(data)));
    }

    @Test
    void countCaseSuccessful5() {
        double[] data = new double[]{0, 0, 1};
        int expected = 1;

        assertThat(expected, equalTo(task.count(data)));
    }
}