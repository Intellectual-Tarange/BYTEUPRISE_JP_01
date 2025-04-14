# 🚀 BYTEUPRISE_JP_01 - **Scientific Calculator**

Welcome to the **Scientific Calculator**! A powerful, user-friendly Java application for performing both basic and scientific calculations. Whether you're solving simple math problems or diving into advanced functions like trigonometry and logarithms, this calculator has you covered!

## 🔥 Features

- **Basic Operations**: Addition, subtraction, multiplication, division
- **Scientific Operations**: Trigonometric, logarithmic, and exponential functions
- **User-Friendly GUI**: Simple interface for easy interaction
- **Fast and Efficient**: Lightweight and responsive for smooth calculations

## 📦 Project Structure

Here's how the project is structured:

```plaintext
BYTEUPRISE_JP_01/
├── src/
│   └── com/
│       └── calculator/
│           ├── logic/                 # Contains the core logic of the calculator
│           │   └── CalculatorLogic.java
│           └── ui/                    # Contains the user interface (GUI)
│               └── ScientificCalculatorUI.java
├── LICENSE                          # License information for this project
├── README.md                        # Project instructions and documentation
└── ...
🚀 How to Get Started
Follow these steps to run your Scientific Calculator on your system:

1. Clone the Repository (Optional)
If you haven't already, clone the repository to your local machine:

bash
Copy
Edit
git clone https://github.com/Intellectual-Tarange/BYTEUPRISE_JP_01.git
2. Navigate to the Project Directory
Open Terminal or PowerShell, and navigate to the root directory of your project:

bash
Copy
Edit
cd C:\Users\HP\Desktop\task_02\BYTEUPRISE_JP_01
3. Compile the Java Files
Now, compile all the necessary .java files. This will create .class files inside the bin directory:

bash
Copy
Edit
javac src\com\calculator\logic\*.java src\com\calculator\ui\*.java -d bin
4. Run the Calculator
After compiling, you can start the Scientific Calculator with this command:

bash
Copy
Edit
java -cp bin com.calculator.ui.ScientificCalculatorUI
That's it! You're now ready to perform some awesome calculations. 💡

🛠️ Notes
Recompiling: If you make any changes to the code, don't forget to recompile using the javac command.

Running: Once compiled, simply run it with the java command. You can skip recompiling if no changes are made.

⚡ Optional: Automate the Process with a Batch File (Windows Only)
Want to make things easier? Create a batch file that compiles and runs the program with just one click! 🎯

Create a file called run_calculator.bat in your project folder.

Add the following content:

batch
Copy
Edit
@echo off
cd C:\Users\HP\Desktop\task_02\BYTEUPRISE_JP_01
javac src\com\calculator\logic\*.java src\com\calculator\ui\*.java -d bin
java -cp bin com.calculator.ui.ScientificCalculatorUI
pause
Now, you can double-click the run_calculator.bat file to launch the calculator instantly! 🎉

📄 License
This project is licensed under the MIT License. You can freely use, modify, and distribute it as long as you retain the license. See the LICENSE file for more details.

🤝 Contact
Author: Parth Tarange

GitHub Profile: Intellectual-Tarange
