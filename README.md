# 🧮 **Scientific Calculator**  
A powerful and intuitive **Java-based Scientific Calculator** with a sleek GUI interface to handle all your complex calculations effortlessly. Perfect for students, engineers, and anyone needing advanced math functions.

---

## 📦 **Project Structure**  
The project is neatly organized into packages for logic and UI:

```bash
ScientificCalculator/
├── src/
│   └── com/
│       └── calculator/
│           ├── logic/
│           │   └── CalculatorLogic.java
│           └── ui/
│               └── ScientificCalculatorUI.java
🚀 How to Compile and Run
Ready to calculate? Follow the steps below to get your Scientific Calculator running in no time.

1️⃣ Open Terminal / PowerShell
Make sure you're in the right directory!

bash
Copy
Edit
cd c:\Users\HP\Desktop\Scientific_c\ScientificCalculator\src
2️⃣ Compile the Code
Only compile if you’ve made changes to the Java files. This step is necessary to make the program ready for execution.

bash
Copy
Edit
javac com\calculator\**\*.java
3️⃣ Run the Program
Launch the calculator using the command below:

bash
Copy
Edit
java com.calculator.ui.ScientificCalculatorUI
🛠 Additional Notes
Compilation (javac) is required only if you've made changes to the .java files.

Skip compilation if you didn’t change any code — just run it directly with:

bash
Copy
Edit
java com.calculator.ui.ScientificCalculatorUI
⚡ Optional: Make It Super Easy with a Batch File
Want to save time? Create a batch file (run_calculator.bat) to compile and run everything with a single click. Here’s how:

Create a new file named run_calculator.bat in your project folder.

Add the following code to the batch file:

batch
Copy
Edit
@echo off
cd c:\Users\HP\Desktop\Scientific_c\ScientificCalculator\src
javac com\calculator\**\*.java
java com.calculator.ui.ScientificCalculatorUI
pause
Now, you can simply double-click run_calculator.bat to compile and run your calculator automatically! ⚡


