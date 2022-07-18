#Sample Statistical Functions
Grades <- c(99, 89, 90,91,80,83,95)
names(Grades) <- c("Jose", "Balong","Dodong","Sadam","Kanor","Neneng","Badong")
barplot(Grades)

#Sample for Mathematical Operations and Vectors
#basic operation Samples
1+1 
2*2
3-3
4/4

#colon operator
1:5

# function
c(2, 4, 5, 6) 
c(2, 4, 6, 8) / 2 #vectorized demo

#Sample for object oriented paradigm

Student <- c(name = "Imran Comaad", age = 20, IdNumber = "211012")
class(s) <- "It Student"
print(s)

#Sample for Functional Programming

math <- function(x, y, z){
return(x+y-z)
}
print(math(1, 2, 3))

#Sample for Looping with while
x = 1
while (x < 10) {
  print(x)
  x = x+1
}