# Java Code Lab
![](https://img.shields.io/badge/Algorithm-WIP-orange.svg) ![](https://img.shields.io/badge/maven-3.5.x-green.svg) ![](https://img.shields.io/badge/junit-4.11-green.svg)

Java 实现的数据结构、算法、设计模式、系统设计以及计算机科学相关代码，包括对应的 Junit 测试用例。

# 目录

## 字符串
* [Java 中 String 的 equals 和 ==](./src/main/java/org/razertory/datastructure/string/StringEqual.java)
* [KMP 算法](./src/main/java/org/razertory/datastructure/string/KMP.java)

## 排序
* [冒泡排序](./src/main/java/org/razertory/datastructure/sort/BubbleSort.java)
* [插入排序](./src/main/java/org/razertory/datastructure/sort/BubbleSort.java)
* [插入排序优化版](./src/main/java/org/razertory/datastructure/sort/BubbleSort.java)
* [归并排序](./src/main/java/org/razertory/datastructure/sort/BubbleSort.java)
* [快速排序](./src/main/java/org/razertory/datastructure/sort/BubbleSort.java)
* [第 K 大的数 （快排实现）](./src/main/java/org/razertory/datastructure/sort/KthBigest.java)
* [选择排序](./src/main/java/org/razertory/datastructure/sort/BubbleSort.java)

## BFS 广度优先搜索
* [广度遍历二叉树](./src/main/java/org/razertory/datastructure/bfs/Tree.java)

## DFS 深度优先搜索
* [深度遍历二叉树](./src/main/java/org/razertory/datastructure/dfs/Tree.java)

## 动态规划
* [硬币找零](./src/main/java/org/razertory/datastructure/dp/Coin.java)
* [是否存在子集合](./src/main/java/org/razertory/datastructure/dp/SubsetSum.java)
* [三种方式实现斐波那契](./src/main/java/org/razertory/datastructure/dp/Fibonacci.java) 递归 / 迭代 / 结果缓存

# 高级数据结构
* [哈希表 HashMap](./src/main/java/org/razertory/datastructure/mycollections/MyHashMap.java)
* B-树 / B+树
* 布隆过滤器
* LRU 缓存

# DSL
* JSON 解析器

# FAQ
*谁适合这个项目？*

处于打基础的黄金时间的在校大学生，正在准备找工作的求职者，自我提高的在职者。

*为什么用 Java？*

使用人数多，年龄分布广，不管是工龄 10+ 的程序员还是在校大学生，都可以驾驭。

*为什么准备大量的测试代码？*

三个原因：第一，证明算法是对的，不管是作者自己实现的，还是摘录他人的。第二，方便做性能测试，只需要控制入口大小就可以测出性能，用于比较。第三，方便用户 debug，对于很多人来说如果要理解程序的执行流程，最好的方式就是 debug。

> Have fun coding and testing

# License
The MIT License (MIT)

