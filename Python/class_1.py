class employee:
    def __init__(self,a,b,c):
        self.name = a
        self.roll_no = b
        self.trigram = c
    def complete_info(self):
        print ('Employee name is ' + str(self.name) + ' having roll number ' + str(self.roll_no) + ' with trigram ' + str(self.trigram))

em1 = employee('satish', 14, 'STR1')

print (em1.trigram)
em1.complete_info()
employee.complete_info(em1)
