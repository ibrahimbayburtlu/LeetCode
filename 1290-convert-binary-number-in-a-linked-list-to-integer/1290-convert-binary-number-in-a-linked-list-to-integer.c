/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


int getDecimalValue(struct ListNode* head){
    struct ListNode* temp=head;
    int count=0; // For counting no. of nodes so to calculate 2's power.
    while(temp!=NULL){
        count++;
        temp=temp->next;
    }
    
    int i= count-1;// For 2's power
    int result=0;
    temp=head;
    while(temp!=NULL){
        result=result+(pow(2,i)*(temp->val)); // Main Logic
        i--;
        temp=temp->next;
    }
    
    return result;
}