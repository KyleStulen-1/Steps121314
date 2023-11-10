##ragular expressoin of firstname

^(?=.{1,40}$)[a-zA-Z]+(?:[-'\s][a-zA-Z]+)*$


ragular expression Details

^ - a start of a string
(?=.{1,40}$) - there must be 1 to 40 chars other than line break chars in the string
[a-zA-Z]+ - 1 or more ASCII letters
(?: - starto of a non-capturing group repeated 0 or more times matching sequences of
[-'\s] - a -, ' or whitespace
[a-zA-Z]+ - 1+ ASCII letters
)* - end of the grouping
$ - end of string