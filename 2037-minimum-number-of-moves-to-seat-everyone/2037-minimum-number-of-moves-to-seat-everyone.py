class Solution:
    def minMovesToSeat(self, seats: List[int], students: List[int]) -> int:
        seats.sort()
        students.sort()
        total = 0
        for i in range(len(seats)):
            total += abs(seats[i]-students[i])
        return total
    