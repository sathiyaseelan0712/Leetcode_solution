/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */

int count(struct TreeNode* root){
    if(root == NULL){
        return 0;
    }
    return 1+count(root->left) + count(root->right);
}
int countNodes(struct TreeNode* root) {
    return count(root);
}
