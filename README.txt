This kata is about implementing PERT estimates.

These estimates comprise three numbers:
- optimistic estimate: if absolutely everything goes right, should have less than a 1% chance to happen
- nominal estimate: the estimate with the greatest chance of success
- pessimistic estimate: if absolutely everything goes wrong, should also have lessn than a 1% chance to happen

Given these three numbers, we can describe a task estimate in terms of probability:
m = (o + 4n + p)/6 is the expected duration of the task
s = (p-o)/6 is the standard deviation of this probability distribution 

Search the internet for more information on PERT (Program Evaluation and Review Technique) or read Uncle Bob's book "The Clean Coder", chapter 10.