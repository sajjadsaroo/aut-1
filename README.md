# Survey Form Application

## Overview
This is a simple Java-based survey application using Swing for the graphical user interface. The program allows users to input their information, answer survey questions, and navigate through multiple pages.

## Features
- **Main Page:** A start screen with a button to begin the survey.
- **Information Page:** Users enter their name, age, email, and familiarity level with similar programs.
- **Questions Page:** A series of multiple-choice questions about the application's UI and usability.
- **Thank You Page:** Displays a thank you message after completing the survey.

## Requirements
- Java Development Kit (JDK) 8 or later

## How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/sajjadsaroo/aut-1
   cd /aut-1
   ```
2. Compile the Java files:
   ```bash
   javac -d . Main.java packages/*.java
   ```
3. Run the application:
   ```bash
   java Main
   ```

## Project Structure
```
project-root/
│-- Main.java
│-- packages/
│   │-- informationPage.java
│   │-- questionsPage.java
│   │-- thankYouPage.java
```

## Notes
- The application uses `JFrame` and `JPanel` to create a multi-page UI experience.
- Navigation between pages is handled by removing and adding panels dynamically.
- Future improvements may include data persistence and enhanced styling.

## Contributors:
- Sajjad sarookhani
- Amir Pesarakloo
