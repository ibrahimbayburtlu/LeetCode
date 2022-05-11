/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */


int rangeSumBST(struct TreeNode* root, int low, int high){

    int a,b,c;
    
    a=0,b=0,c=0;
    
    if(root ->left !=NULL)
        a = rangeSumBST(root ->left,low,high);
    if(root->right !=NULL)
        b = rangeSumBST(root->right,low,high);
    if(low <= root ->val && root->val <= high)
        c = root->val;
    return a + b + c;
    
}