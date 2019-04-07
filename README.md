# Java Codelab
![](https://img.shields.io/badge/maven-3.5.x-green.svg) ![](https://img.shields.io/badge/junit-4.11-green.svg)

Java 实现的数据结构/算法以及计算机科学相关的代码和完整的 Junit 测试用例。欢迎 PR

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


> Have fun coding and testing

## 目录

### 排序
* [冒泡排序](./src/main/java/org/razertory/javacodelab/sort/BubbleSort.java)
* [插入排序](./src/main/java/org/razertory/javacodelab/sort/InsertSort.java)
* [插入排序优化版](./src/main/java/org/razertory/javacodelab/sort/InsertOptimizeSort.java)
* [归并排序](./src/main/java/org/razertory/javacodelab/sort/MergeSort.java)
* [快速排序](./src/main/java/org/razertory/javacodelab/sort/QuickSort.java)
* [选择排序](./src/main/java/org/razertory/javacodelab/sort/SelectionSort.java)
* [第 K 大的数](./src/main/java/org/razertory/javacodelab/sort/KthBigest.java) 快速排序法／堆排序法

### 字符串
* [Java 的字符串](./src/main/java/org/razertory/javacodelab/string/StringEqual.java)
* [KMP 算法](./src/main/java/org/razertory/javacodelab/string/KMP.java)
* [回文串算法]

### 栈
* [最小栈](./src/main/java/org/razertory/javacodelab/stack/StackWithMin.java)
* [栈实现队列](./src/main/java/org/razertory/javacodelab/stack/MyQueue.java)

### 队列

### 二叉树
* [二叉树基础](./src/main/java/org/razertory/javacodelab/tree/Tree.java)
* [重建二叉树](./src/main/java/org/razertory/javacodelab/tree/RebuildTree.java)

### 图
* [矩阵表示法](./src/main/java/org/razertory/javacodelab/graph/matrix)
* [临接表表示法](./src/main/java/org/razertory/javacodelab/graph/adjacency)
* [Prim 最小生成树]
* [Kruskal 最小生成树]
* [Floyd 最短路径]
* [Dijkstra 最短路径]

### 广度优先搜索
* [广度遍历二叉树](./src/main/java/org/razertory/javacodelab/bfs/Tree.java)
* [广度遍历图]

### 深度优先搜索
* [深度遍历二叉树](./src/main/java/org/razertory/javacodelab/dfs/Tree.java)
* [深度遍历图]

### 贪心

### 动态规划
* [硬币找零](./src/main/java/org/razertory/javacodelab/dp/Coin.java)
* [是否存在子集合](./src/main/java/org/razertory/javacodelab/dp/SubsetSum.java)
* [三种方式实现斐波那契](./src/main/java/org/razertory/javacodelab/dp/Fibonacci.java) 递归 / 迭代 / 结果缓存

### 高级数据结构
* [二叉搜索树]()
* [二叉堆]()
* [HashMap](./src/main/java/org/razertory/javacodelab/mycollections/MyHashMap.java)
* B树
* B+树
* 布隆过滤器
* LRU 缓存

# 参考
算法导论

Geeks for Geeks

AlgoCasts

July 编程之法

极客时间

Leetcode

Lintcode

# License
The MIT License (MIT)

