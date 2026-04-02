# SWC3524-Project
Marketing Campaign Optimization (MCOP)

This project applies multiple algorithmic techniques to solve the Marketing Campaign Optimization Problem (MCOP), which is comparable to the Travelling Salesman Problem (TSP). The system is designed to determine the most efficient route for visiting several locations while minimizing the overall cost.

Algorithms Used

Divide and Conquer

Data Structures
Min Heap
Max Heap
Splay Tree
HOW TO RUN

Open the project in any Java IDE such as VS Code, IntelliJ, or Eclipse.

Run the following file:

UPTMMarketingOptimization.java

After execution, the program will display:

The MCOP route along with the total cost
A demonstration of the Splay Tree
Examples of Min Heap and Max Heap operations
SAMPLE OUTPUT

--- MCOP RESULTS ---
Divide & Conquer Route: UPTM -> City B -> City D -> City C -> UPTM | Total Cost: 88

--- SPLAY TREE DEMO ---
First search (10): true
Root after first search: 10
Second search (10): true
Root after second search: 10

--- MIN HEAP DEMO ---
Min Heap: [3, 5, 15, 10]
Removed: 3
After removal: [5, 10, 15]

--- MAX HEAP DEMO ---
Max Heap: [15, 3, 10]
Removed: 15
After removal: [10, 3]

Notes
All functionalities are implemented within a single file: UPTMMarketingOptimization.java
The program utilizes Java’s PriorityQueue to implement heap structures
The Splay Tree is implemented with basic splaying operations for demonstration purposes
The route output may vary slightly, but the total cost remains optimal

by: Altaf Adib Haiqal Bin Azli
