outerLoop: for (int i = 0; i < 5; i++) {
  innerLoop: for (int j = 0; j < 3; j++) {
    if (i == 2 && j == 1) {
      break outerLoop;    // Breaks out of the outer loop
    }
    if (i == 1 && j == 0) {
      continue innerLoop; // Skips the current iteration of the inner loop and continues with the next iteration
    }
    System.out.println("i = " + i + ", j = " + j);
  }
}
