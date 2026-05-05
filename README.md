Overview:
This is a simple and interactive console-based Number Guessing Game developed using Core Java. 
The application generates a random number, and the player must guess it within a limited number of attempts.

Features:
Random number generation using java.util.Random
User input handling via Scanner
Limited number of attempts (configurable)
Real-time feedback:
"Too High"
"Too Low"
"Correct Guess"
Score tracking system
Replay option for continuous gameplay

How to Play:
1.Run the program.
2.The system generates a random number between 1 and 100.
3.You have 5 attempts to guess the number.
4.After each guess, you’ll receive feedback:
  If your guess is higher → "Too High"
  If your guess is lower → "Too Low"
5.If you guess correctly, you earn a point.
6.After the round, choose whether to play again.

How to Run:
Compile the program: javac NumberGuessingGame.java
Run the program: java NumberGuessingGame

Example Output:
=== Welcome to the Number Guessing Game ===
I have generated a number between 1 and 100.
You have 5 attempts to guess it.

Enter your guess: 50
Too High!
Attempts left: 4
