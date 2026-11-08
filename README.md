# Simple Operations Program

An introductory Java course project for CS1211 Computer Programming 1, 2024/2025. The accompanying course brief explicitly identifies it as a Practical Project, with a completed App.java submission and oral demonstration. This is a small introductory project, not a capstone or a weekly lab.

## Repository status

This repository currently publishes the project overview. The supporting files described below are prepared locally but have not yet been uploaded to GitHub. File paths describe that prepared package; they are not download links. Build commands require those source files and dependencies.

## Functionality

- Read two integers and print a sequence from the first to the second in increments of five.
- Prompt again if the first value is not smaller than the second.
- Accept a guess and compare it with a newly generated random integer from 1 to 100.
- Print whether the guess is correct, too low or too high.

## Program flow and concepts

1. Read the starting and ending integers with Java's `Scanner`.
2. Check that the first integer is smaller than the second.
3. Use a loop to advance by five and print each value within the range.
4. Read a guess and compare it against a random target from 1 to 100.
5. Use conditional branches to print the result.

The project demonstrates console input, integer comparisons, loops, methods, pseudo-random numbers and branching. The random target is generated for a comparison; this version does not keep one target across a multi-turn guessing game.

## Example behavior

For bounds 10 and 30, the sequence is `10 15 20 25 30`. For bounds that do not differ by a multiple of five, the loop stops at the last value within the range rather than forcing the final bound into the output. A guess of 50 can be too high, too low or correct depending on the generated target.

## Team and source

Team size: 2 members. It was located as App 2.java alongside the course project brief and other drafts. The prepared file is named `App.java` to match its public class and placed under `src/app/` to match its package. Student IDs in the comment were removed; executable code is unchanged. The located files do not establish individual implementation contributions or which draft was ultimately submitted.

## Build and run the original project

Use a JDK supporting Java 8 or later. From the repository directory:

```sh
javac -d out src/app/App.java
java -cp out app.App
```

Example inputs, one per line:

```text
10
30
50
```

The sequence is `10 15 20 25 30`. The guessing result varies because the random target changes on every call.

## Verification and limitations

Compiled and ran with JDK 23.0.2 using the example inputs. The sequence and guessing-message output were checked. There is no persistent game state or repeated guessing loop. Non-integer input is not handled. Re-prompting uses a second Scanner over System.in and may behave unexpectedly with redirected input. The original behavior was not silently repaired. No license was added.
