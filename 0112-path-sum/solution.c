/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
void sumPath(struct TreeNode* root, int res,int *flag,int t){
    if(root == NULL) return ;
    if(!root->left && !root->right) {
    res += root->val;
    if(res==t){
        *flag = 1;
        return;
    }
    res = 0;
    }sumPath(root->left, res+root->val,flag,t);
    sumPath(root->right, res+root->val,flag,t);
}

bool hasPathSum(struct TreeNode* root, int t) {
    int flag = 0;
    sumPath(root,0,&flag,t);
    if(flag !=0) return true;
    return false;
}
