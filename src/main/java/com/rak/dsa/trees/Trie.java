package com.rak.dsa.trees;

public class Trie {
    private TrieNode root;

    public Trie(TrieNode root) {
        this.root = root;
    }

    public void insert(String word){
        TrieNode cur = this.root;
        for(int i=0; i< word.length(); i++){
            char c = word.charAt(i);
            if(!cur.children.containsKey(c)){
                cur.children.put(c, new TrieNode());
            }
            cur = cur.children.get(c);
        }
        cur.isWord = true;
    }
}
