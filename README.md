[![Travis](https://img.shields.io/travis/Deletescape-Media/Primitives.svg)](https://travis-ci.org/Deletescape-Media/Primitives)
[![Codecov](https://img.shields.io/codecov/c/github/Deletescape-Media/Primitives.svg)](https://codecov.io/gh/Deletescape-Media/Primitives)
[![Codacy grade](https://img.shields.io/codacy/grade/09d4fe9b4a904a8aa34c49d7c130410e.svg)](https://www.codacy.com/app/deletescape/Primitives)
[![Github All Releases](https://img.shields.io/github/downloads/Deletescape-Media/Primitives/total.svg)](https://github.com/Deletescape-Media/Primitives/releases)

#Deletescape Primitives

* Dreaming of a simple way to convert `byte[]` to `int[]`? **How about that:**
```java
    int[] example = PrIntArray.from(new byte[] { 1, 2, 3 });
```
* You need to concatenate two `char` arrays? **Simple!**
```java
    char[] pt1 = new char[] { 'h', 'e', 'l' };
    char[] pt2 = new char[] { 'l', 'o' };
    char[] result = PrCharArray.concatAll(pt1, pt2);
```
* `String.join()` doesn't work for your `int` array? **It might not, but the following sure does!**
```java
    int[] input = new int[]{ 3, 2, 1 };
    String result = PrIntArray.join(";", input);
```

**Primitives is everything you need to work with primitive types in Java!**