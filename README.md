# Java Lab 003

**Instructions:**
1. Fork this repository to your GitHub account.
2. Clone the forked repository locally to your machine.
3. Create a new branch named Feature01.

## Part 1: Printf Format Exploration

**Objective:**
Explore the behavior of the `System.out.printf` function when displaying values with incorrect format specifiers in Java.

**Printf Format Exploration:**
1. Use `printf` to display a value of type `int` using `%f`.
2. Display a `double` using `%d`.
3. Try using two format specifiers but provide only one value.

### **Instructions:**
For each of the issues above, screenshot and add the error images to this repo named **error01.png, error02.png, and error003.png** or simply edit this README.md and use markdown to list the error messages received.

### **Note:**
Your answers to this exercise should be added using Markdown into the project's `README.md` file so that they get committed with the project's code..

### **Error Images**
![error01.png](..%2F..%2FOneDrive%2FPictures%2FScreenshots%2Ferror01.png)
![error02.png](..%2F..%2FOneDrive%2FPictures%2FScreenshots%2Ferror02.png)
![error03.png](..%2F..%2FOneDrive%2FPictures%2FScreenshots%2Ferror03.png)
---

## Part 2: Celsius to Fahrenheit Converter

**Objective:**
Add a Java file to the **src** directory named TempConvert.java, and write a Java program to convert a temperature from Celsius to Fahrenheit.
Remember, all Java programs need a main method because that's where every Java program starts!

**Steps:**
1. Prompt the user for input.
2. Read a `double` value from the keyboard.
3. Calculate the result using the formula: `F = C × 9/5 + 32`.
4. Format the output to one decimal place.
5. Test the program by entering a temperature in Celsius.

**Example Output:**
```mathematica
Enter a temperature in Celsius: 24
24.0 C = 75.2 F
```

**Hint:**
* Be careful not to use integer division!
* Format specifiers would be a great choice for #4!

## Part 3: Seconds to Time Converter

**Objective:**
Write a Java program that converts a total number of seconds to hours, minutes, and seconds.

**Steps:**
1. Prompt the user for input.
2. Read an integer from the keyboard (total number of seconds).
3. Calculate the result using the modulus operator.
4. Use printf to display the output in the format: "5000 seconds = 1 hours, 23 minutes, and 20 seconds".

```mathematica
Enter a total number of seconds: 5000
5000 seconds = 1 hours, 23 minutes, and 20 seconds
```

**Hint:**
* The modulus operator is the remainder operator and will simplify the calculation.

### Submission
Follow these steps for submission:
1. Create a Feature01 branch of your code if you haven't already.
2. Commit your working code to your local copy/Feature01 branch.
3. Push it to your Remote/origin branch (i.e., GitHub: Feature01 -> origin/Feature01).
4. Issue a Pull request to my instructor repo.
5. **Make sure to COPY the Pull request URL and submit it for the lab/assignment in Canvas.**
