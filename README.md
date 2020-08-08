# Globant Enigma
Algorithm developed in Java 11 that solves the enigma launched by Globant on August 6, 2020.

## Challenge 🚀
Goal: **Find the number ABCDEFGHIJ**
#### Rules:
1. ABCDEFGHIJ is a number with its all digits different from each other.
2. AB, EF, IJ, and ABCDEFGHIJ are perfect squares.

## Solution :checkered_flag:
### How to understand the problem
We have ten elements, the ten digits: 0,1,2,3,4,5,6,7,8,9. This is a [combinatory](https://en.wikipedia.org/wiki/Combination) 
without repetition with ten elements from ten. Finally it's 10! (ten factorial), that is, 3'628.800 possible combinations. 
And we have to verify wich of these accomplish with the second rule.

### Steps to solve
1. We must build all possibles combinations.
2. We must get the numbers AB, EF, IJ and ABCDEFGHIJ for each combination.
3. We must calculate square roots for each number. 
4. We must to verify if each square root is an integer number.
5. The case wich all validations from preview step are true, is the result.

## Implemented with 🛠️

* [Java 11](https://www.oracle.com/java/technologies/javase/11-relnotes.html)
  * [Lambdas](https://www.oracle.com/lad/technical-resources/articles/java/expresiones-lambda-api-stream-java.html) - Uses Predicate functional interface as a part to apply and verify perfect squares
  * [Math](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Math.html) - Uses Math library to get square roots.
  * [Recursive Method](https://www.programiz.com/java-programming/recursio) - Uses that to iterate on the same method without use multiple for elements.
  
## Install 🔧
### Requirements
- [JDK 11 or up](https://www.oracle.com/technetwork/es/java/javase/downloads/index.html) - To compile program
- [Git](https://git-scm.com/downloads) - To clone program in your local
- **Optional** IDE or Editor, I like to use [Eclipse](https://www.oracle.com/java/technologies/javase/11-relnotes.html) or [Visual Studio Code](https://visualstudio.microsoft.com/es/downloads/) - To review code
### Compile
1. Clone project in your local
2. - If you have an IDE: Open with your favorite IDE and run Java Program
   - If you have an EDITOR: Open console system and execute:
      Move to folder project, into the package, for example, on windows:
       ```
       cd D:\ANA DUFFO\DEV\Java11\workspace_dev\Globant\src\com\java\globant
       ```
      Compile the GlobantEnigma class:
       ```
       javac GlobantEnigma.java
       ```
       
      Execute the program:
       ```
       java GlobantEnigma
       ```
## Thanks for reading 🎁
Thanks for take the time reading this project.

---
Developed by ❤️ by [AnaMaDuff](https://github.com/Anamaria11) :computer:
