/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
int diameter = 0;
int getHeight(struct TreeNode* root){
    if( root == NULL) return 0;
    int lw = getHeight(root->left);
    int rw = getHeight(root->right);
    diameter = fmax(diameter,lw+rw);
    return fmax(lw,rw) + 1;
}
int diameterOfBinaryTree(struct TreeNode* root) {
    diameter = 0;
    getHeight(root);
    return diameter; 
}
