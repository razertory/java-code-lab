# Java Code Lab
![](https://img.shields.io/badge/maven-3.5.x-green.svg) ![](https://img.shields.io/badge/junit-4.11-green.svg)

Java 实现的数据结构/算法以及计算机科学相关的代码和完整的 Junit 测试用例。

## 运行

```shell
项目根目录下

# 测试所有
> mvn test 

# 测试指定代码
> mvn test -Dtest=完整类名

例如
# 测试排序算法类
> mvn test -Dtest=org.razertory.javacodelab.sort.SortTest
```

## 目录

### 字符串
* [Java 的字符串](./src/main/java/org/razertory/javacodelab/string/StringEqual.java)
* [最长公共前缀](./src/main/java/org/razertory/javacodelab/string/LongestPrefix.java)
* [无重复字符的最长子串](./src/main/java/org/razertory/javacodelab/string/LongestUniq.java)

### 排序
* [冒泡排序](./src/main/java/org/razertory/javacodelab/sort/BubbleSort.java)
* [插入排序](./src/main/java/org/razertory/javacodelab/sort/InsertSort.java)
* [插入排序优化版](./src/main/java/org/razertory/javacodelab/sort/InsertOptimizeSort.java)
* [归并排序](./src/main/java/org/razertory/javacodelab/sort/MergeSort.java)
* [快速排序](./src/main/java/org/razertory/javacodelab/sort/QuickSort.java)
* [选择排序](./src/main/java/org/razertory/javacodelab/sort/SelectionSort.java)
* 第 K 大的数 [快速排序法／堆排序法](./src/main/java/org/razertory/javacodelab/sort/KthLargest.java)

### 链表
* [反转链表](./src/main/java/org/razertory/javacodelab/linkedlist/ReverseLinkedList.java)

### 栈
* [随时获取最小值的栈](./src/main/java/org/razertory/javacodelab/stack/StackWithMin.java)
* [栈实现队列](./src/main/java/org/razertory/javacodelab/stack/MyQueue.java)

### 二叉树
* 二叉树基础 [最大深度，最小深度](./src/main/java/org/razertory/javacodelab/tree/Tree.java)
* 还原二叉树 [已知先序，中序](./src/main/java/org/razertory/javacodelab/tree/RebuildTree.java)

### 图
* [矩阵表示法](./src/main/java/org/razertory/javacodelab/graph/matrix)
* [临接表表示法](./src/main/java/org/razertory/javacodelab/graph/adjacency)

### 广度优先搜索
* [广度遍历二叉树](./src/main/java/org/razertory/javacodelab/bfs/Tree.java)

### 深度优先搜索
* 深度遍历二叉树[先序，中序，后序](./src/main/java/org/razertory/javacodelab/dfs/Tree.java)

### 动态规划
* 三种方式实现斐波那契[ 递归，迭代，结果缓存](./src/main/java/org/razertory/javacodelab/dp/Fibonacci.java)
* [硬币找零问题](./src/main/java/org/razertory/javacodelab/dp/Coin.java)
* [是否存在子集合](./src/main/java/org/razertory/javacodelab/dp/SubsetSum.java)

### 高级数据结构
* [HashMap](./src/main/java/org/razertory/javacodelab/mycollections/MyHashMap.java)
* [LRU 缓存](./src/main/java/org/razertory/javacodelab/advanced/LRUCache.java)

### Java IO
* [IO 客户端](./src/main/java/org/razertory/javacodelab/io/IOClient.java), [IO服务端](./src/main/java/org/razertory/javacodelab/io/IOServer.java)

# License
The MIT License (MIT)
