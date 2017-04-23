# StackTest by Issaree Srisomboon
## My JUnit Tests
* `testCapasityLessThanOne()` Stack's capasity must not less than 1. 
* `testStackSize()` Checking the stack's size after using these methods `push()`, `peek()`, and `pop()`.
* `testnewStackIsEmpty()` Stack must empty and equals 0 for making new stack.
* `testPeekAllElements()` The method `peek()` should always return the same element and not alter the stack.
* `testPeekEmptyStackThrowException()` Throw an exception when peek the empty stack.
* `testPopAllElements()` The method `pop()` should always remove the top element from the stack.
* `testPopEmptyStackThrowException()` Throw an exception when pop the empty stack.
* `testPopOffByOneThrowException()` Cannot pop when already popped more than the elements in the stack.
* `testPushFullStackThrowException()` Throw an exception when push an element to the full stack.
* `testPushNullStackThrowException()` Throw an exception when push null to the stack.
## Results
Test|Result Stack type 0|Result Stack type 1|
|:--:|:-----------------:|:-----------------:|
|`testCapasityLessThanOne()`|Pass|Pass|
|`testStackSize()`|Pass|**Failure**|
|`testnewStackIsEmpty()`|Pass|Pass|
|`testPeekAllElements()`|Pass|**Failure**|
|`testPeekEmptyStackThrowException()`|**Failure**|**Failure**|
|`testPopAllElements()`|Pass|**Failure**|
|`testPopEmptyStackThrowException()`|Pass|Pass|
|`testPopOffByOneThrowException()`|**Error**|**Error**|
|`testPushFullStackThrowException()`|**Failure**|**Failure**|
|`testPushNullStackThrowException()`|Pass|**Failure**|