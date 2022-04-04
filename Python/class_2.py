# Accessing Classs Variables

class employee:
    increment = 1.04
    
    def __init__(self,a,b):
        self.name = a
        self.salary = b
        
    def complete_info(self):
        print ('Employee name is ' + str(self.name) + ' having roll number ' + str(self.roll_no) + ' with trigram ' + str(self.trigram))

    def apply_increment(self):
        print ('New salary of ' + str(self.name) + ' is ' + str(self.salary * self.increment))
        

em1 = employee('satish', 10000)

em1.increment = 1.1
print (em1.apply_increment())
print (em1.increment)
print (employee.increment)
 
