package com.rak.dsa.stacks;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StackRakImplTest {
    private StackRak stackRak;

    @Test
    void testArrayImpl() throws Exception{
        stackRak = new StackRakArrayImpl();
        assertThrows(Exception.class, () -> stackRak.pop());
        stackRak.push(10);
        stackRak.push(20);
        stackRak.push(30);
        stackRak.push(40);
        stackRak.push(50);

        assertThat(stackRak.size()).isEqualTo(5);

        assertThat(stackRak.pop()).isEqualTo(50);


        stackRak.push(60);
        assertThat(stackRak.pop()).isEqualTo(60);
        assertThat(stackRak.pop()).isEqualTo(40);
        assertThat(stackRak.pop()).isEqualTo(30);
        stackRak.push(50);
        assertThat(stackRak.size()).isEqualTo(3);
    }

    @Test
    void testLinkedListImpl() throws Exception{
        stackRak = new StackRakLinkedListImpl();
        assertThrows(Exception.class, () -> stackRak.pop());
        stackRak.push(10);
        stackRak.push(20);
        stackRak.push(30);
        stackRak.push(40);
        stackRak.push(50);

        assertThat(stackRak.size()).isEqualTo(5);

        assertThat(stackRak.pop()).isEqualTo(50);


        stackRak.push(60);
        assertThat(stackRak.pop()).isEqualTo(60);
        assertThat(stackRak.pop()).isEqualTo(40);
        assertThat(stackRak.pop()).isEqualTo(30);
        stackRak.push(50);
        assertThat(stackRak.size()).isEqualTo(3);
    }
}