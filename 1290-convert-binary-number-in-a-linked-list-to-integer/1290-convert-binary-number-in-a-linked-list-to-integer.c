/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


int getDecimalValue(struct ListNode* head){
    struct ListNode* temp=head;
    int count = 0;
    int total =0;
    while(temp!=NULL){
        count++;
        temp = temp->next;
    }
    temp = head;
    int i = count -1;
    while(temp!=NULL){
        total +=(pow(2,i)*(temp->val));
        i--;
        temp = temp->next;
    }
    return total;
}
    
    