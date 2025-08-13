# Enhanced Switches

A simple Java program that demonstrates the use of enhanced switch expressions (introduced in Java 14) to determine whether a given day is a weekday or weekend.

## Features

- Uses modern Java switch expressions with arrow syntax (`->`)
- Multiple case labels in a single case statement
- User input validation
- Console-based interaction

## Requirements

- Java 14 or higher (for enhanced switch expressions)
- Java Development Kit (JDK) installed
- Command line access

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/IsaacDev14/Java-enhanced-Switches.git
cd Java-enhanced-Switches
```

### How to Run

1. **Compile the program:**
   ```bash
   javac EnhancedSwitches.java
   ```

2. **Run the program:**
   ```bash
   java EnhancedSwitches
   ```

3. **Enter a day name when prompted:**
   ```
   Please Enter the name of the day: Monday
   ```

## Usage Example

```
Please Enter the name of the day: Friday
Its a weekday🤦‍♂️

Please Enter the name of the day: Saturday
Its a Weekday😁😀

Please Enter the name of the day: Holiday
Holiday is not valid day
```

## Program Logic

- **Weekdays** (Monday through Friday): Displays "Its a weekday🤦‍♂️"
- **Weekends** (Saturday, Sunday): Displays "Its a Weekday😁😀" 
- **Invalid input**: Shows the entered text followed by "is not valid day"

## Code Highlights

- **Enhanced Switch Expression**: Uses the modern arrow syntax (`->`) instead of traditional `case:` statements
- **Multiple Case Labels**: Groups multiple days in a single case (e.g., `"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"`)
- **Input Handling**: Uses `Scanner` to read user input from the console
- **Resource Management**: Properly closes the Scanner after use

## Notes

- Day names are case-sensitive (e.g., "monday" will not match "Monday")
- The program expects exact spelling of day names
- Contains a small typo in the weekend message ("Its a Weekday" instead of "Its a Weekend")

## Java Version Compatibility

This program requires Java 14 or later due to the use of enhanced switch expressions. For older Java versions, you would need to use traditional switch statements with `case:` and `break` statements.
