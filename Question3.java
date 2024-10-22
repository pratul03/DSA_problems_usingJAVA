

/**
 * sum of all nodes having grandparents as even values
 *          6
 *        /   \
 *       7     8
 *      / \   / \
 *     2   7 1   3
 *    /   / \     \
 *   9   1   4     5
 *
 *   The problem asks you to find the sum of all nodes in a binary tree where the grandparent node has an even value. A grandparent node is a node that is two levels above a given node in the tree.
 *
 * Problem Breakdown:
 * Grandparent Node: A node is considered a grandparent of another node if there is exactly one node between them (i.e., the grandparent is two levels above the node).
 * Sum Requirement: We need to sum up all nodes that have a grandparent with an even value.
 * Approach:
 * Traverse the Tree: Use a depth-first search (DFS) or breadth-first search (BFS) to traverse the binary tree.
 * Check Grandparent: For each node, check if its grandparent exists and whether its value is even.
 * Accumulate Sum: If a node has an even-valued grandparent, add its value to the total sum.
 * Time Complexity:
 * The time complexity will be O(n), where n is the number of nodes in the binary tree, as we need to visit each node exactly once.
 * */

public class Question3 {

}
