package org.razertory.datastructure;

public class MyHashMap {
    //数组大小，根据ASCII码中字母A~z跨度，取值57
    private final static int DEFAULT_INITSIZE = 57;

    private static Node[] nodes = new Node[DEFAULT_INITSIZE];

    public MyHashMap() {
    }

    public void put(String key, Object value) {
        if (!isEmpty(key)) {
            putInArray(hash(key), key, value);
        } else {
            throw new RuntimeException("key不能为空");
        }
    }

    private void putInArray(int hash, String key, Object value) {
        if (nodes[hash] == null) {
            nodes[hash] = new Node(key, value);
        } else {
            if (key.equals(nodes[hash].getKey())) {
                nodes[hash].setValue(value);
                return;
            }
            Node temp = nodes[hash];
            while (temp.next != null) {
                if (key.equals(temp.getKey())) {
                    temp.setValue(value);
                    return;
                }
                temp = temp.next;
            }
            temp.next = new Node(key, value);
        }
    }

    public Object getValue(String key) {
        Object ret = null;
        Node temp = nodes[hash(key)];
        while (temp != null) {
            if (temp.getKey().equals(key)) {
                return temp.getValue();
            }
            temp = temp.next;
        }
        return ret;
    }

    private boolean isEmpty(String str) {
        return str == null ? true : false;
    }

    private boolean hasLength(String str) {
        return !"".equals(str) ? true : false;
    }

    //根据首字母的ASCII码值确定索引位置，为空返回34顶替 [ 符号ASCII码空位
    private int hash(String key) {
        return hasLength(key) ? key.getBytes()[0]
                % nodes.length : 34;
    }

    public String toString(){
        StringBuilder str = new StringBuilder();
        Node temp = null;
        for (Node node:nodes) {
            temp = node;
            while (temp != null){
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

