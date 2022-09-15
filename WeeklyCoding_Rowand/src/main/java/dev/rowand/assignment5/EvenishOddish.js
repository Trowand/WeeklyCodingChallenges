var sum = 0;
var num = 17;
var numString = num + "";

for(var x = 0; x < numString.length; x++){
    sum = sum + Number(numString.charAt(x));
};

if(sum % 2 == 0){
    print("Evenish");
}
else{
    print("Oddish")
}