------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: 03.09 Online Purchase / BuyMovieTickets.java
PURPOSE OF PROJECT: The purpose of this program is to write a code that 
will print an e-Receipt based on the information that you provide during 
the input of the Scanner class. This code must be a variety of all that we 
learned during Module 3, so that it can truly test whether or not students 
know how to use and operate different types of codes to get the expected 
output/result. This incorporation includes parsing, scanner class, replace 
string features, input string features per line of input or more, basic 
mathematical calculations based on double values, basic print statements 
with additional input of variable definitions and sometimes the further 
continuation of the print statements, and the creation of string variables 
for different multi-use interconnected incorporation.
VERSION or DATE: 2/25/21
AUTHOR: Anish Gupta
------------------------------------------------------------------------
POST MORTEM REVIEW (PMR):
Wow! By far, this has been the most longest, complex, and straining code 
I have ever written. This took me a lot of time to successfully write and
compile so that I could get my desired output in the running of the program
via the terminal window. More specifically, I had some troubles while trying
to conceal the debit or credit card number in the final e-Receipt print output,
but after a couple trial and errors I finally figured it out. I created only
one string input value for the card number, and then I divided that string
input to a new string in which the first blocks of numbers on the card equalled
that newly formed string via the substring method, and created another string 
to equal the last block of numbers on the card also via the substring method. 
After that I created another string labeled as concealment of the first blocks
of numbers of the card by equalling that to the first blocks of numbers on the
card string and replacing all numbers (1,2,3,4,5,6,7,8,9,0) by a "#" for hidden
numerical identity. After that, I then made a print statement in which I wrote 
whatever words were needed, and then concatenated the very new concealed first
blocks of numbers on the card string with the addition of the last block of
numbers on the card string for a full and final successive result where the 
beginning blocks of numbers on the card were concealed/hidden with a "#" and
the last block of numbers on the card were showing/unhidden/not concealed.