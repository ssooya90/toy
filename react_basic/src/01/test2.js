


 var x = 0;
 var y = 0;
 var ojb = {x,y};

 console.log(ojb);

 var randomKeyString = 'other';

 var combined = {
 	['one' + randomKeyString] : 'some value',
 }

 console.log(combined);