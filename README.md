🧮 Scientific Calculator
This is a simple Java Scientific Calculator application with a GUI.

📦 Project Structure
css
Copy
Edit
ScientificCalculator/
└── src/
    └── com/
        └── calculator/
            ├── logic/
            │   └── CalculatorLogic.java
            └── ui/
                └── ScientificCalculatorUI.java
🚀 How to Compile and Run
Open Terminal / PowerShell

Go to the src folder:

bash
Copy
Edit
cd c:\Users\HP\Desktop\Scientific_c\ScientificCalculator\src
Compile the code (only needed if you changed any .java files):

bash
Copy
Edit
javac com\calculator\**\*.java
Run the program:

bash
Copy
Edit
java com.calculator.ui.ScientificCalculatorUI
🛠 Notes
You only need to compile (javac) if you make changes to .java files.

If you did not change any code, you can directly run it using:

bash
Copy
Edit
java com.calculator.ui.ScientificCalculatorUI
⚡ Optional: Make it easier with a Batch File (Windows)
Create a file named run_calculator.bat in your project folder with the following content:

bat
Copy
Edit
@echo off
cd c:\Users\HP\Desktop\Scientific_c\ScientificCalculator\src
javac com\calculator\**\*.java
java com.calculator.ui.ScientificCalculatorUI
pause
Then you can double-click run_calculator.bat to compile and run everything automatically!

📄 License
This project is not free to use.

© 2025 Parth Tarange. All rights reserved.
See LICENSE.txt for more information.

✅ That's it! Happy Calculating!