class deque_ended:
    def __init__(self, size):
        self.size = size
        self.arr = [None] * size
        self.front = -1
        self.rear = -1

    # Insert from rear
    def insertRear(self, value):
        if self.rear == self.size - 1:
            print("Overflow at Rear")
            return

        if self.front == -1:
            self.front = 0

        self.rear += 1
        self.arr[self.rear] = value

    # Insert from front
    def insertFront(self, value):
        if self.front == 0:
            print("No space at Front")
            return

        if self.front == -1:
            self.front = self.rear = 0
            self.arr[self.front] = value
            return

        self.front -= 1
        self.arr[self.front] = value

    # Delete from front
    def deleteFront(self):
        if self.front == -1:
            print("Underflow")
            return

        print("Deleted Front:", self.arr[self.front])
        self.front += 1

        if self.front > self.rear:
            self.front = self.rear = -1

    # Delete from rear
    def deleteRear(self):
        if self.rear == -1:
            print("Underflow")
            return

        print("Deleted Rear:", self.arr[self.rear])
        self.rear -= 1

        if self.front > self.rear:
            self.front = self.rear = -1

    # Display deque
    def display(self):
        if self.front == -1:
            print("Deque is empty")
            return

        print("Deque:", end=" ")
        for i in range(self.front, self.rear + 1):
            print(self.arr[i], end=" ")
        print()


# -------------------------
# MAIN (TEST IN VS CODE)
# -------------------------

dq = Deque(5)

dq.insertRear(10)
dq.insertRear(20)
dq.insertFront(5)
dq.insertRear(30)

dq.display()

dq.deleteFront()
dq.display()

dq.deleteRear()
dq.display()