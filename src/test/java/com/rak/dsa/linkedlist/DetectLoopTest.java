package com.rak.dsa.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DetectLoopTest {
    private DetectLoop detectLoop;

    @BeforeEach
    void setUp() {
        detectLoop = new DetectLoop();
    }

    @Test
    void checkWhetherLoopExistsOrNot() {
        SinglyLinkedListNode head1 = createLinkedListWithLoop(new SinglyLinkedListNode("1"));
        SinglyLinkedListNode head2 = createLinkedListWithLoop1(new SinglyLinkedListNode("1"));
        assertThat(detectLoop.checkWhetherLoopExistsOrNot(head1)).isTrue();
        assertThat(detectLoop.checkWhetherLoopExistsOrNot(head2)).isFalse();
        assertThat(detectLoop.checkWhetherLoopExistsOrNot(null)).isFalse();
    }

    private SinglyLinkedListNode createLinkedListWithLoop(SinglyLinkedListNode head){
        head.next = new SinglyLinkedListNode("2");
        head.next.next = new SinglyLinkedListNode("3");
        head.next.next.next = new SinglyLinkedListNode("4");
        head.next.next.next.next = head.next;
        return head;
    }

    private SinglyLinkedListNode createLinkedListWithLoop1(SinglyLinkedListNode head){
        head.next = new SinglyLinkedListNode("2");
        head.next.next = new SinglyLinkedListNode("3");
        head.next.next.next = new SinglyLinkedListNode("4");
        return head;
    }
}