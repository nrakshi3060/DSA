package com.rak.dsa.trees;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
    boolean isWord;
    Map<Character, TrieNode> children = new HashMap<>();
}
