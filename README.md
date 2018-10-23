# Java Code Lab
![](https://img.shields.io/badge/Algorithm-WIP-orange.svg) ![](https://img.shields.io/badge/maven-3.5.x-green.svg) ![](https://img.shields.io/badge/junit-4.11-green.svg)

Java 实现的数据结构、算法、设计模式、系统设计以及计算机科学相关代码，包括对应的 Junit 测试用例。[背景](http://razertory.me/datastructure/2018/06/01/start-my-coding-project.html)

# 目录

## 字符串
* [x] [Java 中 String 的 equals 和 ==](./src/main/java/org/razertory/datastructure/string/StringEqual.java)
* [x] [KMP 算法](./src/main/java/org/razertory/datastructure/string/KMP.java)

## 链表
* [x] [删除链表中的重复元素](./src/main/java/org/razertory/datastructure/linkedlist/DeleteDups.java)
* [x] [判断链表是否成环](./src/main/java/org/razertory/datastructure/linkedlist/LinkedListLoop.java)

## 栈
* [x] [O(1) 获得最小值的栈](./src/main/java/org/razertory/datastructure/stack/StackWithMin.java)
* [x] [移动汉诺塔问题](./src/main/java/org/razertory/datastructure/stack/Hannotower.java)
* [x] [记录栈的最大容量](./src/main/java/org/razertory/datastructure/stack/StackCapacity.java)
* [x] [栈的集合](./src/main/java/org/razertory/datastructure/stack/SetOfStacks.java)
* [x] [滑动窗口算法 (双循环法)](./src/main/java/org/razertory/datastructure/queue/SlidingWindow.java)

## 队列

## 排序
* [x] [冒泡排序](./src/main/java/org/razertory/datastructure/sort/BubbleSort.java)
* [x] [插入排序](./src/main/java/org/razertory/datastructure/sort/BubbleSort.java)
* [x] [插入排序优化版](./src/main/java/org/razertory/datastructure/sort/BubbleSort.java)
* [x] [归并排序](./src/main/java/org/razertory/datastructure/sort/BubbleSort.java)
* [x] [快速排序](./src/main/java/org/razertory/datastructure/sort/BubbleSort.java)
* [x] [第 K 大的数 （快排实现）](./src/main/java/org/razertory/datastructure/sort/KthBigest.java)
* [x] [选择排序](./src/main/java/org/razertory/datastructure/sort/BubbleSort.java)

## 树

## 搜索

## 图

## 网络 IO

## 并发

## 动态规划
* [x] [硬币找零](./src/main/java/org/razertory/datastructure/dp/Coin.java)
* [x] [是否存在子集合](./src/main/java/org/razertory/datastructure/dp/SubsetSum.java)

## 设计模式
### 单例模式
* [x] [懒汉](./src/main/java/org/razertory/datastructure/designPatterns/singleton/classic/Singleton.java)
* [x] [饿汉](./src/main/java/org/razertory/datastructure/designPatterns/singleton/statics/Singleton.java)
* [x] [静态内部类](./src/main/java/org/razertory/datastructure/designPatterns/singleton/staticInnerClass/Singleton.java)
* [x] [synchronized 线程安全](./src/main/java/org/razertory/datastructure/designPatterns/singleton/threadSafety/Singleton.java)
* [x] [volatile 线程安全](./src/main/java/org/razertory/datastructure/designPatterns/singleton/threadSafetyVolatile/Singleton.java)

# FAQ
*谁适合这个项目？*

处于打基础的黄金时间的在校大学生，正在准备找工作的求职者，自我提高的在职者。

*为什么用 Java？*

使用人数多，年龄分布广，不管是工龄 10+ 的程序员还是在校大学生，都可以驾驭。

*为什么准备大量的测试代码？*

三个原因：第一，证明算法是对的，不管是作者自己实现的，还是摘录他人的。第二，方便做性能测试，只需要控制入口大小就可以测出性能，用于比较。第三，方便用户 debug，对于很多人来说如果要理解程序的执行流程，最好的方式就是 debug。

> Have fun testing & debugging

# License
The MIT License (MIT)

Copyright (c) 2015-present Dan Abramov

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

