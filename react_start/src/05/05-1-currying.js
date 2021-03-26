function multiply(a,b){
	return a * b;
}

function multiplyTwo(a){
	return multiply(a,2);
}

function multiplyX(x) {
	return function (a){
		return multiply(a,x);
	}
}

const multiplyX2 = x => a => multiply(a,x);

const multiplyThree = multiplyX(3);
const multiplyFour = multiplyX(4);

const result1 = multiplyThree(3);
const result2 = multiplyX(4)(3);





//// 커링 한번 더
// => ((x * a) * b) + c
// a = 2 , b = 3, c = 4

const equation = (a,b,c) => x => ((x * a) * b) + c;

const formula = equation(2,3,4);
const x = 10;
console.log(formula(2))

const result = formula(x);

console.log(result)




const multiply2 = (a,b) => a*b;
const add = (a,b) => a + b;

const multiplyX3 = x => a => multiply2(a,2);
const addX = x => a => add(x,a);


const addFour = addX(4);

console.log(addFour(4))