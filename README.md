# Minesweeper Simulation

This Java program generates random Minesweeper game boards, demonstrating the classic 1960s puzzle game logic where players deduce mine locations based on numerical clues.

## About Minesweeper

Minesweeper is played on an m×n grid where:
- Some cells contain hidden mines (marked with `*`)
- Other cells show numbers indicating how many adjacent mines exist
- Players use these numbers to logically determine safe cells

## Program Usage

Compile and run the program with:
```bash
javac Minesweeper.java
java Minesweeper m n k
```

Where:
- `m` = number of rows
- `n` = number of columns
- `k` = number of mines to place

## Example Output

```bash
~/Desktop/arrays> java Minesweeper 9 9 10
0  1  *  1  0  0  0  1  *  
1  3  2  2  0  0  0  1  1  
*  2  *  1  0  0  1  1  1  
1  2  2  2  1  0  1  *  1  
0  1  2  *  1  0  1  1  1  
1  2  *  3  3  1  1  0  0  
1  *  3  *  2  *  1  0  0  
1  1  2  1  2  1  1  0  0  
0  0  0  0  0  0  0  0  0 
```

## How It Works

The program:
1. Creates an m×n grid with exactly k mines placed at random positions
2. For each non-mine cell, calculates the count of adjacent mines (including diagonals)
3. Prints the board with:
   - Asterisks (`*`) for mines
   - Numbers for mine counts
   - Two spaces between each cell for readability

## Implementation Details

Key features of `Minesweeper.java`:
- Random mine placement ensuring exactly k mines
- Efficient neighbor checking for all 8 surrounding cells
- Clean grid formatting with proper spacing
- Input validation for grid dimensions and mine count

## Applications

Understanding this simulation helps with:
- Game development fundamentals
- Grid-based algorithm design
- Probability calculations for random distributions
- Array manipulation techniques



License

This project is open-source under the MIT License.
