package com.rak.dsa.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

class SinglyLinkedListTest {
    private SinglyLinkedList linked_list;

    @BeforeEach
    void setUp() {
        linked_list = new SinglyLinkedList();
    }

    @Test
    void testHelperMethods() throws Exception {
        linked_list.prepend("1");
        assertThat(linked_list.toList()).isEqualTo(Collections.singletonList("1"));
        linked_list.append("3");
        linked_list.prepend("2");
        assertThat(linked_list.toList()).isEqualTo(Arrays.asList("2", "1", "3"));

        linked_list = new SinglyLinkedList();
        linked_list.append("1");
        assertThat(linked_list.toList()).isEqualTo(Collections.singletonList("1"));
        linked_list.append("3");
        assertThat(linked_list.toList()).isEqualTo(Arrays.asList("1", "3"));

        linked_list.prepend("2");
        linked_list.prepend("1");
        linked_list.append("4");
        linked_list.append("3");
        assertThat(linked_list.search("1").getValue()).isEqualTo("1");
        assertThat(linked_list.search("4").getValue()).isEqualTo("4");

        linked_list.remove("1");
        assertThat(linked_list.toList()).isEqualTo(Arrays.asList("2", "1", "3", "4", "3"));
        linked_list.remove("3");
        assertThat(linked_list.toList()).isEqualTo(Arrays.asList("2", "1", "4", "3"));
        linked_list.remove("3");
        assertThat(linked_list.toList()).isEqualTo(Arrays.asList("2", "1", "4"));
        String value = linked_list.pop();
        assertThat(value).isEqualTo("2");

        assertThat(linked_list.head.getValue()).isEqualTo("1");

        linked_list.insert("5", 0);
        assertThat(linked_list.toList()).isEqualTo(Arrays.asList("5", "1", "4"));
        linked_list.insert("2", 1);
        assertThat(linked_list.toList()).isEqualTo(Arrays.asList("5", "2", "1", "4"));
        linked_list.insert("3", 6);
        assertThat(linked_list.toList()).isEqualTo(Arrays.asList("5", "2", "1", "4", "3"));

        assertThat(linked_list.size()).isEqualTo(5);
    }
}