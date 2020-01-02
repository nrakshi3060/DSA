package com.rak.dsa.queues;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class QueueArrayImplTest {
    private Queue q;

    @BeforeEach
    void setUp() {
        q = new QueueArrayImpl();
    }

    @Test
    void testQueueImplUsingArray() throws Exception{

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        assertThat(q.size()).isEqualTo(3);
        assertThat(q.dequeue()).isEqualTo(1);

        q.enqueue(4);

        assertThat(q.dequeue()).isEqualTo(2);
        assertThat(q.dequeue()).isEqualTo(3);
        assertThat(q.dequeue()).isEqualTo(4);

        q.enqueue(5);
        assertThat(q.size()).isEqualTo(1);
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(11);
        q.enqueue(12);
        q.enqueue(13);
        q.enqueue(14);
        q.enqueue(15);
        q.enqueue(16);
        q.enqueue(17);
        q.dequeue();
        q.enqueue(18);
    }
}