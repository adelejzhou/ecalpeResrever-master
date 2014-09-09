This is a reversed string replacement method (public String ecalpeResrever(…) ) that
takes three String arguments, ‘haystack,’ ‘needle,’ and ‘replacement’.

The method will perform a left-to-right string replacement, followed by reversing the resultant
strings *words*. ie. (“I like cats”, “cat”, “dog”) => “dogs like I”

Example Test Cases 
ecalpeResrever(“ABC”, “A”, “a”).equals(“aBC”);
ecalpeResrever(“AAA AAB BAA”, “AA”, “a”).equals(“Ba aB aA”);
ecalpeResrever(“I Work.”, “Work”, “Play”).equals(“Play. I”);
ecalpeResrever(“Tests are the best!”,”the best!”,”just ok.”).equals(“ok. just are
Tests”);