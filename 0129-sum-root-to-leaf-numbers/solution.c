/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
void sumPath(struct TreeNode* root, int res, int *psum){
    if(root == NULL) return ;
    if(!root->left && !root->right) *psum += res*10+root->val;
    sumPath(root->left, res*10+root->val,psum);
    sumPath(root->right, res*10+root->val,psum);
}
int sumNumbers(struct TreeNode* root) {
    int sum = 0;
    sumPath(root,0,&sum);
    return sum;
}
