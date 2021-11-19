# Assignment 27

In this assignment, you will practice with nested loops and use it to display shapes made of asterisks (\*s). Your program should:

1. Prompt for and get user input for an integer.
2. The inputted integer is the size of the shapes. Your program will display 3 shapes as shown below. The shapes should be displayed by outputting one character at a time (either "\*" or " ").

a. Right triangle.

b. Hollowed "square" (by this I mean same number of asterisks on all sides, but it might not look like a square. If you can make it look like a square, even better).

Challenge: Isosceles triangle.

## Specifications

* Ensure the user inputs an integer of at least 2.
* Only one class is needed.

### Hints

* One requires just a nested `for` loop.
* One will require at least one `if` statement inside the nested loop.
* One will require a little bit of math (maybe not if you make it really messy and long).

### Sample Outputs

```
Enter size: 2
*
**

* *
* *

 *
***
```

```
Enter size: 3
*
**
***

* * *
*   *
* * *

  *
 ***
*****
```

```
Enter size for shapes: 5
*
**
***
****
*****

* * * * *
*       *
*       *
*       *
* * * * *

    *    
   ***   
  *****  
 *******
*********
```

### Grading

As always, your program will be graded on its functionality according to the project specifications and proper code style.

