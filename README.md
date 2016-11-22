[![Travis](https://img.shields.io/travis/Deletescape-Media/Primitives.svg)](https://travis-ci.org/Deletescape-Media/Primitives)
[![Codecov](https://img.shields.io/codecov/c/github/Deletescape-Media/Primitives.svg)](https://codecov.io/gh/Deletescape-Media/Primitives)
[![Codacy grade](https://img.shields.io/codacy/grade/09d4fe9b4a904a8aa34c49d7c130410e.svg)](https://www.codacy.com/app/deletescape/Primitives)
[![Github All Releases](https://img.shields.io/github/downloads/Deletescape-Media/Primitives/total.svg)](https://github.com/Deletescape-Media/Primitives/releases)

#Deletescape Primitives

* Dreaming of a simple way to convert `byte[]` to `int[]`?<br>
**How about that:**
```java
    int[] example = PrIntArray.from(new byte[] { 1, 2, 3 });
```
* You need to concatenate two `char` arrays?<br>
**Simple!**
```java
    char[] pt1 = new char[] { 'h', 'e', 'l' };
    char[] pt2 = new char[] { 'l', 'o' };
    char[] result = PrCharArray.concatAll(pt1, pt2);
```
* `String.join()` doesn't work for your `int` array?<br>
**It might not, but the following code sure does!**
```java
    int[] input = new int[]{ 3, 2, 1 };
    String result = PrIntArray.join(";", input);
```

>**Primitives is everything you'll ever need to work with primitive types!**

## Quick Start

### Installation

1. Download the binary jar file from the [latest release on GitHub](https://github.com/Deletescape-Media/Primitives/releases/latest)
* Additionally download the source and/or javadoc jar if needed
* Add the binary jar to your projects classpath 