/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */

void inorder(struct TreeNode* root,int* res,int* i){
    if(root == NULL){
        return;
    }
    inorder(root->left,res,i);
    res[(*i)++] = root->val;
    inorder(root->right,res,i);
}
int* inorderTraversal(struct TreeNode* root, int* returnSize) {
    int* res = (int*)malloc(sizeof(int)*100);
    int ind =0;
    inorder(root,res,&ind);
    *returnSize = ind;
    return res;
}
