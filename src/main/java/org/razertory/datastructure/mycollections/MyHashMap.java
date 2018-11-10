package org.razertory.datastructure.mycollections;

public class MyHashMap {
    //默认数组初始化大小
    private final static int DEFAULT_INITSIZE = 32;
    //数组当前含量
    private static int COUNT_IN_ARRAY = 0;
    //最大数组大小
    private final static int MAX_SIZE = 1024;

    private Node[] nodes;

    public MyHashMap() {
        this.nodes = new Node[DEFAULT_INITSIZE];
    }

    public MyHashMap(int size) {
        if (size > 0 && size <= MAX_SIZE) {
            size = getBiggerBinary(size);
        } else if (size > MAX_SIZE) {
            size = MAX_SIZE - 1;
        } else {
            throw new IllegalArgumentException("错误的初始化大小： " + size);
        }
        this.nodes = new Node[size + 1];
    }

    /**
     * 进行扩容操作，并进行重新的hash确保调用者能正确获取到value
     * 扩容条件：COUNT_IN_ARRAY > nodes.length
     * @return
     */
    private void expansion() {
        Node[] oldNodes = this.nodes;
        this.nodes = new Node[this.nodes.length << 1];
        for (int i = 0 ; i < oldNodes.length ; i++){
            if (oldNodes[i] != null){
                nodes[this.hash(oldNodes[i].key) & this.nodes.length - 1] = oldNodes[i];
            }
        }
    }

    /**
     * 通过移位或运算，得到当前size当前有效位数（第一个1开始及以后的位数）最大的二进制数
     * @param size
     * @return
     */
    private int getBiggerBinary(int size) {
        size -= 1;
        size |= size >>> 1;
        size |= size >>> 2;
        size |= size >>> 4;
        size |= size >>> 8;
        return size;
    }

    public synchronized void put(String key, Object value) {
        if (!isEmpty(key)) {
            if(COUNT_IN_ARRAY > this.nodes.length){
                this.expansion();
            }
            putInArray(hash(key) & this.nodes.length - 1, key, value);
        } else {
            throw new IllegalArgumentException("错误的keyword： null");
        }
    }

    private void putInArray(int hash, String key, Object value) {
        if (this.nodes[hash] == null) {
            this.nodes[hash] = new Node(key, value);
        } else {
            Node temp = new Node();
            temp.next = this.nodes[hash];
            while (temp.next != null) {
                if (key.equals(temp.next.getKey())) {
                    temp.next.setValue(value);
                    return;
                }
                temp = temp.next;
            }
            temp.next = new Node(key, value);
        }
    }

    public Object getValue(String key) {
        Node temp = this.nodes[hash(key) & this.nodes.length - 1];
        while (temp != null) {
            if (temp.getKey().equals(key)) {
                return temp.getValue();
            }
            temp = temp.next;
        }
        return null;
    }

    private boolean isEmpty(String str) {
        return str == null ? true : false;
    }

    private boolean hasLength(String str) {
        return !"".equals(str) ? true : false;
    }


    private int hash(String key) {
        int hash = key.hashCode(), n = nodes.length;
        return hash >>> 16 & hash;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        Node temp = null;
        for (Node node : this.nodes) {
            temp = node;
            while (temp != null) {
                str.append(temp + ",");
                temp = temp.next;
            }
        }
        return str.toString();
    }

    private class Node {
        private String key;
        private Object value;
        public Node next;

        public Node() {
        }

        public Node(String key, Object value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "key='" + key + '\'' +
                    ", value=" + value +
                    '}';
        }
    }
}

