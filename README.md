# Multithreaded-Stats-Calculator

This is a multi-threaded program, Stats.java, in Java that calculates various statistical values for a list of numbers. This program (think of it as the "parent" thread) will prompt the user to provide a single line of input consisting of an arbitrarily long series of numbers and will then create three separate worker threads: one will determine the average of the numbers, the second will determine the maximum value, the third will determine the minimum value, the fourth will determine the median, and the fifth will determine the standard deviation. For example, suppose your program is passed the integers

90 81 78 95 79 72 85

The program will report (in this order):

The average value is: 82
The minimum value is: 72
The maximum value is: 95
The median  value is: 81.0
The standard deviation is: 7.199773239059516

The variables representing the average, minimum, maximum, median, and standard deviation values are stored globally (i.e., in memory accessible by all three workers). The worker threads set these values, and the parent thread outputs the values once the workers have provided the results of their calculations and exited (terminated).
