print('hello world')#this line prints hello world
'''this is a multiline comment'''

x = 1 #int
y = 'apple'
z = 1.2 #float
print(z)
#create the list that content apple, banana, cherry
fruits = ['apple', 'banana', 'cherry']
print(fruits)
print(fruits[1])
#change the value from banana to blackcurrant
fruits[1] = 'blackcurrant'
print(fruits)
#loop through the list
for x in fruits:
    print(x)
#check if banana is present in the list
if 'banana' in fruits:
    print('yes, banana is in the fruits list')
#check the length of the list
print(len(fruits))
#add orange to the list
fruits.append('orange')
print(fruits)

