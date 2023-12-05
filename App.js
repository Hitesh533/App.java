/*programming principle :-- DRY(Don't Repeat Yourself) */

// var newName = "Hello World";

// for (let i = 0; i <= 0;) {
//     if (i >= 0) {
//         console.log(newName);
//     } else
//         console.log("Hello World !!!");
// }

/*Variable in javascript*/
//Variable can store some information
//we can use that information later
//we can change that information later

//declare a Variable
var nameName = "Hello World !!!";
("use strict"); //if you use this line then it gives error or without declare variable

//Use a Variable
console.log(nameName);

//Cahange a Variable
nameName = "Hitesh";

/*Rules for naming variables*/
//1. you cannot start with number
//example:--
//1value (Invalid)
//value1 (Valid)

//2. you can use only underscore ( _ or $ ) dollar symbol
//first_name (Valid) //snakecase writing
//_firstname (Valid)
//first$name (Valid)
// $firstname (Valid)

//3.you cannot use spaces
//first name (Invalid)

//4.Convention
//start with small letter and use camelCase
//example:-- firstName

/*let keyword in javascript*/
//Always use let when you declare a variable
let firstName = "Hitesh";
console.log(firstName);

/*const keyword in javascript*/
//delare constant (which value can't change, like:-Pi )
const pi = 3.14;
// pi = 3.45;//you can't chagne this vlaue because it declare constant variable here
console.log(pi);

/*String indexing in javascript */
let lastName = "Woon";
console.log(lastName[2]);
console.log(lastName);

//length of String
console.log(lastName.length);

//Last Index : Length - 1;
//it will gives you the last character
console.log(lastName[lastName.length - 1]);

// trim()
// toUpperCase()
//toLowerCase()
//slice()

let first_name = "      Himalaya      ";
console.log(first_name);
console.log(first_name.length);
let newString = first_name.trim();
console.log(newString);
console.log(newString.length);

first_name = first_name.toUpperCase();
console.log(first_name);

first_name = first_name.toLowerCase();
console.log(first_name);

//Start index
//End index
first_name = first_name.slice(2, 5);
console.log(first_name);

/*type of, string to number, number to string conversation*/

//types of operators
// it describe what data type it is (like:- String, number)
let age = 22;
let first_name1 = "hyeeeeen";
console.log(typeof age);
console.log(typeof first_name1);

//data types (Primitive data types)
// String = "hyeeeeen"
// Number = 1,3,5.3,3.2
// Boolean = true
// undefined
// null
// BigInt
// Symbol

//convert number to string
let myString = 22;
console.log(typeof (myString + ""));
//the other way for converting number to string
myString = String(myString);
console.log(typeof myString);

//convert string to number
let myStr = +"22";
console.log(typeof myStr);
//the other way for converting string to number
myStr = Number(myStr);
console.log(typeof myStr);

/*String concatenation in javascript */
// Concatenation means :-- Adding two Strings
let str1 = "Hello";
let str2 = "Bro";

let fullName = str1 + "" + str2;
console.log(str1);
console.log(str2);
console.log(fullName);

let num1 = "22";
let num2 = "21";
let numTotal = num1 + num2;
console.log(num1);
console.log(num2);
console.log(numTotal);

numTotal = +num1 + +num2;
numTotal = Number(num1 + num2);
console.log(num1);
console.log(num2);
console.log(numTotal);

/*Template String in javascript */
let age1 = 22;
let string = "Hyeeeeen";
// //my name is hyeeeeen and my age is 22
// let aboutMe = "My name is "+ string + " and my age is " + age1;
// console.log(aboutMe);

//the other short way of doing this is
let aboutMe = "My name is ${string} and my age is ${age1}";
console.log(aboutMe);

/* Undefined, null, bigint in javascript */
//Undefined
let firstName1; //if you dont assign a value then it is called undefined
console.log(typeof firstName1);

//null
let myVar = null;
console.log(typeof myVar);
console.log(typeof null); // it gives object in terminal but it is actually a null

//bigint
let num = BigInt(22); //use bigint and then write your number between the parenthesis(), to make him bigint
let numl = 435n; //this is also a bigint (use n at the end of number you want ot make him bigint)
console.log(num);
console.log(Number.MAX_SAFE_INTEGER); //it tells us how big number we can store in a variable
console.log(num);
console.log(num1);
console.log(num + num1); // to adding two bigint numbers
//NOTE:-- you can't use bigint with other data types you need another bigint to do  any operation

/* booleans and comparison operator */
let num3 = 45;
let num4 = 52;
console.log(num3 > num4); //it returns a boolean value (true or false)
console.log(num3 >= num4); //it returns a boolean value (true or false) 
console.log(num3 < num4); //it returns a boolean value (true or false)
console.log(num3 <= num4); //it returns a boolean value (true or false) 
console.log(num3 == num4); //it returns a boolean value (true or false)

//== vs ===
let num5 = 7;
let num6 = 7
//== operator
console.log(num5 == num6); //so == only care about value, it didn't care about the data type (either it is a string or number)
//=== operator
console.log(num5 === num6); //so === checks both (value and data type) 

//!= vs !==
//!= not equal to
console.log(num5 != num6); //it only checks values

//!== double not equal to
console.log(num5 !== num6); //it checks both value and data types also

/* if else, truthy or falsy values in javascript */
//falsy values
// false
// ""
// null
// undefined
// 0

//truthy values
// "abc"  
//...-1 or +1... (except zero 0)


//if else condition
let age2 = 16;
if (age2 >= 18) {
    console.log("You can play this game");
} else if (age2 >= 15) {
    console.log("You can play the game but only under guidence of your parents");
} else {
    console.log("You can't play this game");
}

let num7 = 14;
if (num7 % 2 == 0) {
    console.log("Congrats :) This number is even");
} else {
    console.log("OOPS :( This number is not even");
}

//IMPORTANT
/* Ternary operator (conditonal operator) in javascript */
let age3 = 10;
let drink;
if (age3 >= 10) {
    drink = "coffee";
} else {
    drink = "milk";
}
console.log(drink);

//instead of this we can use Ternary operator
drink = age3 >= 10 ? "Coffee" : "milk";
console.log(drink);

//and or operator
let var1 = "hyeeeeen";
let var2 = 18;
if (var1[0] === 'h') {
    console.log("Your name starts with h");
}
if (var2 >= 18) {
    console.log("you are above 18 :)");
}
//and operator
if (var1[0] === 'h' && var2 >= 18) {
    console.log("AND operator works sucessfully");
}
//or operator
if (var1[0] == 'h' || var2 === 22) {
    console.log("Your name starts with h and you'r above 18");
}


// Commented Text
// /*nested if else condition in javascript */
// // winning number 18

// //18 your guess is right( you won the game)
// //15 too low
// //25 too high

// let winningNumber = 18;
// let userGuess = +prompt("Guess your number ");
// if (userGuess === 18) {
//     console.log("Congrats:) You won the game ");
// } else {
//     if (userGuess < 18) {
//         console.log("Too low try again :(");
//     } else {
//         if (userGuess > 18) {
//             console.log("Too high try again");
//         } else {
//             console.log("Better luck next time");
//         }
//     }
// }
// console.log(userGuess);

// /*if else if condition in javascript */
// //if
// //else if
// //else if
// //else if
// //else
// let tempInDegree = 15;
// tempInDegree = prompt("What's the weather in your city") //prompts are use for userinput in javascript
// if (tempInDegree < 0) {
//     console.log("Extremely cold outside");
// } else if (tempInDegree < 16) {
//     console.log("It's cold outside");
// } else if (tempInDegree < 25) {
//     console.log("Weathe is okay :)");
// } else if (tempInDegree < 35) {
//     console.log("Let's go for swim :)");
// } else if (tempInDegree < 45) {
//     console.log("Turn on AC");
// } else {
//     console.log("Too hot!!! outside let's stay at home");
// }

// /*switch statement in javascript */
// let day = 0;
// day = +prompt("Enter your day (Mon, Tue.....)")
// switch (day) {
//     case 1:
//         console.log("Monday :)");
//         break;
//     case 2:
//         console.log("Tuesday :)");
//         break;
//     case 3:
//         console.log("Wednesday :)");
//         break;
//     case 4:
//         console.log("Thursday :)");
//         break;
//     case 5:
//         console.log("Friday :)");
//         break;
//     case 6:
//         console.log("Saturday :)");
//         break;
//     case 7:
//         console.log("Sunday :)");
//         break;
//     default:
//         console.log("Invalid day");
//         break;
// }

// /*While loop in javascript */
// let i = 0;
// i = prompt("Enter your number");
// while (i <= 9) {
//     console.log(i);
//     i++;
// }
// console.log("Current vlaue of i :" + i);
// console.log(`Current value of i is ${i}`); // Allways use backtick(``) with ${''}
// console.log("Your while loop execute successfully");

// /*while loop example in javascript */
// let index = 0;
// let total = 0;
// // Print sum of all numbers from 1 to 100;
// while (index <= 100) {
//     total = total + index;
//     console.log(total);
//     index++
// }
// //the short way of adding natural numbers (This method is fast because it takes constant time and other one is taking linear time)
// let num8 = +prompt("Enter your number ");
// let total1 = (num8 * (num8 + 1)) / 2
// console.log(total1);

// /*for loop in javascript */

// for (let i = 0; i <= 10; i++) {
//     console.log(i);
// }
// console.log(i);
// //when we use let in for loop then we can't use print(console.log) statement outside of for loop to display the value
// // but when we use var in for loop then we can use print (console.log) statement outside of for loop to display the value
// for (var i1 = 10; i1 >= 0; i1--) {
//     console.log(i1);
// }
// console.log(`the value of i1 is : ${i1}`); //both print the value of i1
// console.log("the value of i1 is : " + i1); //both print the value of i1

// // print the sum of 100 natural numbers using foor loop
// let num9 = 0;
// let total2 = +prompt("Enter your number to sum");
// for (let i = 0; i <= total2; i++) {
//     num9 = num9 + i;
// }
// console.log(num9);

// /*Break and contnue keyword in javascript */
// for (let i = 0; i <= 10; i++) {
//     if (i === 5687) {
//         continue; //if you use continue then it continue the loop although it meets the condition
//         // break;//if you use break then it break the loop when it meets the conditon
//         //NOTE :-- //either you use contunue or break the number you enter in your condition it not gonna print in the console
//     }
//     console.log(i);
// }
// console.log("Your break keyword works");

// /* Do while loop in javascript */
// //dowhile loop:-- in this it run at least 1 time then it checks while condition for further run the code
// let i2 = +prompt("Enter your number for do while loop");
// do {
//     console.log(i2);
//     i2++;
// } while (i2 <= 9);














/* Arrays in javascript */
// it is a reference datatypes (we can call all reference type an object)

//how to create array
let array = ['apple', 'guava', 'pineapple', 'mango', 'grapes', 'cherry'];
console.log(array);

let number = [1, 2, 3, 4, 5];
console.log(number);

let mixed = [1, 2, 3, 4.5, 502.43, "New String", "mixed array", null, undefined];
console.log(mixed);
mixed[2] = "mango";
mixed[5] = 546.334;
mixed[9] = null;
console.log(mixed);
console.log(typeof mixed);
console.log(Array.isArray(mixed));

let obj = {}; //this is called object literals
console.log(typeof obj);
console.log(obj);
console.log(Array.isArray(obj));

//array push pop
array = ['apple', 'guava', 'pineapple', 'mango', 'grapes', 'cherry'];
console.log(array);
//push method
//it adds value in the last of an array list
array.push("banana");
console.log(array);
let popedElement = array.pop(); //it only remove last element from the array list OR it also return that element
console.log(array);
console.log(array.pop());
console.log("popedElement is: " + popedElement);

//array shift unshift
//undhift :-- it adds value from starting in the array list
array = ['apple', 'guava', 'pineapple', 'mango', 'grapes', 'cherry'];
var shift = console.log(array.unshift("banana", "lichi", "dragonfruit"));
shift = console.log(array.unshift("oranges"));
console.log(array);
//shift :-- it removes value from starting in the array list
shift = console.log(array.shift());
shift = console.log(array.shift());
console.log(array);
shift = console.log(array.shift());
shift = console.log(array.shift());
shift = console.log(array.shift());
shift = console.log(array.shift());
shift = console.log(array.shift());
console.log(array);
console.log(shift);

//NOTE :-- push, pop is faster then the shift, unshift mehtod

/* Primitive vs Reference data types in javascript */
//primitive data types 
let num10 = 10;
let num11 = num10;
console.log("Value of num10 is :-- ", num10);
console.log("Value of num11 is :-- ", num11);
num10++;
console.log("After incrimenting num10");
console.log("Value of num10 is :-- ", num10);
console.log("Value of num11 is :-- ", num11);

//Reference data types 
let array1 = ["Item1", "Item2"];
let array2 = array1;
console.log("Value of array1 is ", array1);
console.log("Value of array2 is ", array2);
array1.push("Item3");
console.log("After pushing element to array1 ")
console.log("Value of array1 is ", array1);
console.log("Value of array2 is ", array2);

/* clone array, concat, spread operator in javascript */
//clone array
array1 = ["Item1", "Item2"];
// array2 = array1;//if you use this then it prints same array here also
array2 = ["Item1", "Item2", "Item3"]; //it print different array because you assign a different array list 
array1.push("Item3", "Item4");
console.log(array1);
console.log(array1 === array2);
console.log(array2);
array2 = array1.slice(1, 3);
console.log(array2);

//concat 
array1 = ["Item1", "Item2", "Item3", "Item4"];
array1 = [];
console.log(array1);

//spread operator
array1 = [...array1];


/* for loop in array in javascript */
array1 = ["apple", "mango", "grapes", "guava"];
for (let i3 = 0; i3 <= 9; i3++) {
    console.log(i3);
}
console.log(array1.length);
console.log(array1[2]);
console.log(array1[array1.length - 1]);

let fruits = [];
for (let i4 = 0; i4 < array1.length; i4++) {
    fruits.push(array1[i4].toUpperCase());
    fruits.push(array1[i4].toLowerCase());
}
console.log(fruits);
console.log(fruits.length);

//use const for creating array
const fruit = ["apple", "guava", "mango", "oranges"];
console.log(fruit);
fruit.push("banana", "watermelon");
console.log(fruit);

/* while loop in array in javascript */
const fruit1 = ["apple", "guava", "mango", "oranges"];
const fruit2 = [];
let i4 = 0;
while (i4 < fruit1.length) {
    fruit2.push(fruit1[i4].toUpperCase());
    console.log(fruit1[i4]);
    fruit1.pop();
    i4++;
    console.log(fruit1.pop());

}
console.log(fruit1);
console.log(fruit2);

/* for of loop in array in javascript */
//NOTE :-- we use this loop when we need a normal array vlaue
let fruit3 = ["apple", "guava", "mango", "oranges"];
fruit3 = [];
for (let fruit of fruit3) {
    console.log(fruit.toUpperCase());
    fruit3.push(fruit.toUpperCase());
}
console.log(fruit3);

/* for in loop in array in javascript */
fruit3 = ["apple", "guava", "mango", "oranges"];
fruit3 = [];
for (let fruit in fruit3) {
    console.log(fruit3[fruit].toUpperCase());
    fruit3.push(fruit3[fruit].toUpperCas3());
}
console.log(fruit3);

// NOTE:--normally we use for loop or for of loop in an array in javascript

/* Array destructuring in javascript */
//it comes in ER6(javascript versions) and it is widely useful
const myArray = ["value1", "value2", "value3"];
// let myVar1 = myArray[0];
// let myVar2 = myArray[1];
// console.log("Value of myVar1 is : " , myVar1);
// console.log("Value of myVar2 is : " , myVar2);

let [myVar1, myVar2, ...myNewArray] = myArray;
myVar1 = "Value Changed";
console.log("Value of myVar1 : ", myVar1);
console.log("Value of myVar2 : ", myVar2);
console.log(myNewArray);

/* Intro to objects in javascript */
// Objects :-- it is a Reference type 
//Writing method of an object :--[Object name = property]
//Arrays are good but not sufficient for real world data
//objects store key value pairs and objects don't have index

//how to create objects
//you can create an objct in two ways:-
//first way
// const person ={name:"Hyeeeeen", age:22, Address: "NewYork"};

//second way 
const person = {
    name: "hyeeeeen",
    age: 22,
    Address: "United States of America",
    Hobbies: ["Study newspaper", "Playing cricket", "Singing", "Dancing"]
};
console.log(person);

//how to access data from objects
console.log(person.name);
console.log(person.age);
console.log(person.Address);
console.log(person.Hobbies);

//how to add key value pair to objects
// person.gender = "female";
// console.log(person);
person.gender = "female";
console.log(person);
person['section'] = "A";
console.log(typeof person);
console.log(person.Hobbies[2]); // write a number[here] to find the exact element of an object

/* dot vs bracket notation in javascript */
//Dot notation
person.bloodgroup = "B+";
console.log(person.bloodgroup);
//Breacket notation
//first use
let person1 = {
    name: "Hyeeeeen",
    age: 22,
    Address: "NewYork",
    //you can give values in songle quote (like this:--'name': "hitesh")
    'person Hobbies': ["swimming", "opera singer", "martial artist"]
};
console.log(person1);
//second use
const key = "Email";
person1 = {
    name: "Hyeeeeen",
    age: 22,
    Address: "NewYork",
    "person1 Hobbies": ["swimming", "opera singer", "martial artist"]
};
person1[key] = "alfabetagamagmail.com";
console.log(person1);
console.log(person1.key);

/* How to iterate objects in javascript */
person1 = {
    name: "Hyeeeeen",
    age: 22,
    Address: "NewYork",
    //you can give values in songle quote (like this:--'name': "hitesh")
    'person1 Hobbies': ["swimming", "opera singer", "martial artist"]
};
//for in loop
for (const key in person1) {
    // console.log(key);
    console.log(person1[key]);
    console.log(`${key} : ${person1[key]}`);
    console.log(key, ":", person1[key]);
}

//object keys
console.log(Object.keys(person1));
let val = Array.isArray(Object.keys(person1));
console.log(val);
//we can use forof loop also
for (let key of Object.keys(person1)) {
    console.log(person1[key]);
    console.log(key, ":", person1[key]);
    console.log(`${key} : ${person1[key]}`);
}

/* Computed Properties in javascript */
const key1 = "objkey1";
const key2 = "objkey2";

const value1 = "myvalue1";
const value2 = "myvalue2";

//first method
// const object = {
//     [key1] : value1,
//     [key2] : value2
// };
// console.log(object);
//second method
let object1 = {};
object1[key1] = value1;
object1[key2] = value2;
console.log(object1);

/* spread operator in javascript */
//spread operator in an Array
array1 = [1, 2, 3];
array2 = [4, 5, 6];
let newArray = [...array1, ...array2];
console.log(newArray);
newArray = [...'12345678909212'];
console.log(newArray);
//spread operator in an object
//you can't duplicate or clone a key (each key has different name) 
const object = {
    key1: "value5",
    key2: "value2",
    key3: "value100",
};
const object2 = {
    key3: "value10",
    key4: "value9",
    key1: "value89",
};
console.log(object);
console.log(object2);

let newObject = {
    ...object,
    ...object2,
    key69: "value69"
};
console.log(newObject);
newObject = {
    ...object2,
    ...object,
    key69: "value69"
};
console.log(newObject);

/* object destructuring in javascript */
let band = {
    bandName: "Queen",
    famousSong: "Somebody to love",
    year: 1968,
    anotherFamousSong: "Heaven",
};
console.log(band['bandName']);
console.log(band['famousSong']);
console.log(band.bandName);
console.log(band.famousSong);
let bandName = band.bandName;
let famousSong = band.famousSong;
// console.log(bandName);
// console.log(famousSong);
console.log(bandName, famousSong);

let {
    bandName1,
    famousSong1,
    ...restPro
} = band;
bandName = "led Zepplin";
console.log(bandName, ':)', famousSong, restPro);
let {
    bandName: var3,
    famousSong: var4
} = band;
console.log(var3);
console.log(var4);

/* objects inside an array in javascript */
//very useful in real world application
const users = [{
        userId: 1,
        firstName1: 'hyeeeeen',
        gender: 'female'
    },
    {
        userId: 2,
        firstName2: 'hitesh',
        gender: 'male'
    },
    {
        userId: 3,
        firstName3: 'unknown',
        gender: 'other'
    },
];
//first method by using forin loop
for (const key in users) {
    console.log(users[key].userId, users[key].firstName1, users[key].gender);
}
//second method by using forof loop
for (const user of users) {
    console.log(user.userId, user.firstName2, user.gender);
}

/* Nested destructuring in javascript */
[{
    firstName1,
    userId
}, , {
    gender,
    firstName3
}] = users;
console.log(firstName1, userId);
console.log(firstName3, gender);

// /* function in javascript */
// // function Wishes() {
// //     console.log("Happy birthday to you ........")
// // }
// // Wishes();

// let number1 = +prompt("Enter your number1 to add");
// let number2 = +prompt('Enter your number2 to add');
// let number3 = +prompt('Enter your number3 to add');

// function Addtwonumber() {
//     // console.log(number1 + number2 );
//     return number1 + number2 + number3;
// }
// Addtwonumber();
// let returnvalue = Addtwonumber();
// console.log(Addtwonumber());
// console.log(returnvalue);

// //undefined + undefined = NaN (Not a number)
// console.log(undefined + undefined);

// //check odd or even by using function
// number = +prompt('Enter your number to check odd or even');

// function isEven() {
//     return number % 2 === 0;
// }
// console.log(isEven());

// //print a Input String firstCharacter by using function
// let inputString = prompt('Enter your String or firstname to print first Character');

// function firstword() {
//     return inputString[5];
// }
// console.log(firstword(inputString));

//find a target in an array and then print it by using function
function findTarget(array, target) {
    for (let i = 0; i < array.length; i++) {
        if (array[i] === target) {
            return i;
        }
    }
    return -1;
}

const myarray = [1, 45, 35, 354, 847, 1.8, 343, 98, 787, 34];
const value = findTarget(myarray, 787);
console.log(value);

/* function Expression in javascript */
let Wishes = function () {
    console.log("Happy birthday to you ........")
}
Wishes();

/* Arrow function in javascript */
//to use arrow function:-- First remove function word then after this arrows () write equal and greater then sign (lke this => )
const Wishes1 = () => {
    console.log("Happy birthday to you ........")
}
Wishes1();

const isEven1 = number => number % 2 === 0;
console.log(isEven1(44));

const findTarget1 = (array, target) => {
    for (let i = 0; i < array.length; i++) {
        if (array[i] === target) {
            return i;
        }
    }
    return -1;
}

const myarray1 = [1, 45, 35, 354, 847, 1.8, 343, 98, 787, 34];
const valuex = findTarget(myarray, 847);
console.log(valuex);

/* Hoisting intro in javascript */
//normal function
Hello();

function Hello() {
    console.log('Hoisting intro');
}

//function Expression 
const Hello1 = function () {
    console.log('Hoisting intro');
}

Hello1();

//Arrow function
Hello = () => {
    console.log('Hoisting intro');
}
Hello();

//for example you can't access value before initialization
// console.log(varValue);
// const varValue = 'Example for hoisting intro';

/* Function inside function in javascript */
const app = () => {
    const myfunc = () => {
        console.log('Hello from (Function app inside a function myFunc)');
    }
    const addTwo = (num1, num2) => {
        return num1 + num2;
    }
    const mul1 = (num1, num2) => {
        return num1 * num2;
    }

    console.log('function inside app value');
    myfunc();
    console.log(addTwo(500, 500));
    console.log(mul1(500, 500));
}
app();

/*Lexical scope in javascript */
myVar = "Value1";

function app1() {

    function myFunc() {
        const myFunc2 = () => {
            console.log('Hello lexical scope', myVar);
        }
        const myVar = "Value 59 of a variable inside a function";
        console.log("inside myFunc", myVar);
        myFunc2();
    }
    console.log('Lexical loop in javascript');
    console.log(myVar);
    myFunc();
}
app1();

/* Block scope vs function scope in javascript */

//let and const are block scope
//you can't access (let,const) variables outside of a block 
{
    let firstName = "hyeeeeen";
    console.log(firstName);
} {
    // let firstname = "hitesh";

    const firstname = "hitesh";
    console.log(firstName);
}

//var is a function scope
{
    var firstName2 = "happy";
    console.log(firstName2);
}

function myapp() {
    if (true) {
        var firstName = "hyeeeeen";
        console.log('This is inside if statement : ', firstName);
    }
    console.log('This is inside function : ', firstName);
}
myapp();

//seeagain 
/* Default parameters in javascript */

function addTwo(a, b = 0) {
    return a + b;
}
const ans = addTwo(4);
console.log(ans);

// const vari = +prompt('Enter your first number to add');
// const vari1 = +prompt('Enter your second number to add');
// function addTwo(vari, vari1){
//     return (vari+vari1);
// }
// const answ = addTwo(vari, vari1);
// console.log(answ);

/* Rest parameters in javascript */
function addNum(a, b, ...c) {
    console.log(`Value of a is ${a}`)
    console.log(`Value of b is ${b}`)
    console.log(`Value of c is ${c}`)
    // return a+b+c;
    return a / b * c;
}
const newvar = addNum(57, 56, 98.25);
console.log(newvar);

function addAll(...numbers) {
    let total = 0;
    for (let number of numbers) {
        total = total + number;
        // console.log(total);
    }
    console.log(`Elements in an Array numbers is : ${numbers}`);
    console.log(Array.isArray(numbers));
    return total;
}
const newvar1 = addAll(4, 15, 435, 34, 54);
console.log(newvar1);

/*param(parameter destructuring in javascript) */
//We use this in objects and it is most used in react language

const person2 = {
    firstName: "Hitesh",
    age: 22,
    gender: "male",
}
// function printdetails(obj){
//     console.log(obj.firstName, obj.age, obj.gender);
// }
function printdetails({
    firstName,
    gender,
    age
}) {
    console.log(firstName, age, gender);
}
printdetails(person2);

/* callback function in javascript */
// function myfunc(a){
//     console.log(a);
//     console.log('HEllO BOY :)');
// }
// function myNewfunc(b) {
//     console.log(2*5);
// }
// myfunc([1,2,5.6]);
// myfunc(myNewfunc);
// myNewfunc(myfunc);

console.log('second function');

function myNewfunc(b) {
    console.log(2 * 5);
    // const name = "hitesh";
    console.log('HEllO BOY :)');
    console.log(`My name is ${b}`);
}

function myfunc(a) {
    console.log(a);
    console.log('Callback function');
    a('hii');
}
// myfunc([1,2,5.6]);
myfunc(myNewfunc);
// myNewfunc(myfunc);

/* function returning function in javascript */
console.log('Hey there !!!');

function myfunction() {
    function hello() {
        const arrayvalue = [...[1.3, 5.2, 5, 8, 9, {
            name: 'hitesh',
            age: 22,
            gender: 'male'
        }]];
        console.log(arrayvalue);
        console.log('Hii :)');
        return "hello boy ;)";
    }
    return hello;
}
const answer = myfunction();
console.log(answer());

/* for each method in javascript*/
const number1 = [1, 5, 8, 6];

function arrayvalue(number, index) {
    console.log('index is ', index);
    console.log(`${number}*2 = ${number*2}`);
}
for (let i = 0; i < number1.length; i++) {
    // console.log(i);
    arrayvalue(number1[i], i);
}

console.log('This is by calling fuction seperately (again and again)');
arrayvalue(number1[0], 0);
arrayvalue(number1[1], 1);
arrayvalue(number1[2], 2);
arrayvalue(number1[3], 3);

console.log('using for each(It will call function automatically agian and again )');
number1.forEach(arrayvalue);

number1.forEach(function (number1, index) {
    console.log(`Index is ${index} and the value is ${number1*2}`);
});

const users1 = [{
        firstname: "hyeeeeen",
        age: 23,
        gender: 'female'
    },
    {
        firstname: "hitesh",
        age: 22,
        gender: 'male'
    },
    {
        firstname: "happy",
        age: 22,
        gender: 'male'
    },
];
//get firstname of each array by map method:-----
const userName = users1.map((user) => {
    return user.firstname;
});
console.log(userName);

//by using foreach loop:------ 
users1.forEach((user) => {
    console.log(user.firstname, user.age, user.gender);
});
//by using forof loop:-------
for (const user of users1) {
    console.log(user.firstname, user.age, user.gender);
}

// /* map method in javascript*/
//Map method:-- it creates a new array and stores result values in the form of array
const number4 = [5, 42, 6, 1, 6, 4, 989, 999];
// // firstmethod we use function:-----
// const square = function (number) {
//     return number * number; //always use return otherwise 
//     // console.log(number * number);// if you use print method then it gives you undefiend
// }
// const squarenumber = number4.map(square);
// console.log(squarenumber);

// // second method we use function expression:-----
// const squarenumber1 = number4.map(function(number){
//     return number * number;
// });
// console.log(squarenumber1);

//third method we use arrow function:-----
const squarenumber3 = number4.map((number, index) => {
    return `index: ${index} ,square: ${number * number}`;
});
console.log(squarenumber3);

// /* filter method in javascript*/
//Filter method :-- It filter the result and then give in the form of a seperate array
const number5 = [2, 36, 677, 4, 7, 1];
//function to filter even numbers:-----
const isEven = function (numberx) {
    return numberx % 2 === 0;
};
//function to filter odd numbers:-----
const isOdd = (numberx) => {
    return numberx % 2 !== 0;
};
console.log(number5.filter(isEven));
console.log(number5.filter(isOdd));

// /* reduce method in javascript */
const number6 = [132, 53, 32, 65, 4, 15, 999];
//
const reduce = (accumulator, Currentvalue) => {
    return accumulator + Currentvalue;
    //      132         +   53      =   reutrn:185
    //      185         +   32      =   return:217
}
console.log(number6.reduce(reduce));

const userCart = [{
        productId: 1,
        productName: "mobile",
        price: 50000
    },
    {
        productId: 2,
        productName: "laptop",
        price: 150000
    },
    {
        productId: 3,
        productName: "watch",
        price: 15000
    },
    {
        productId: 4,
        productName: "shoes",
        price: 40000
    },
]
const cartValue = userCart.reduce((totalprice, Currentvalue) => {
    return totalprice + Currentvalue.price;
    //totalprice       + currentvalue       = return
    //  0              + {price: 50000}     = 50000
    //  50000          + {price:150000}     = 200000
}, 0)
console.log(cartValue);

/* sort method in javascript */
const number7 = [23.4, 35, 372, 567, 9999, 3626, 2, 97];
//sort in ascending order
number7.sort((a, b) => a - b); //when you add return (a-b) then it sorting in increasing order
console.log(number7);
//sort in descending order
number7.sort((a, b) => b - a); //when you add return (b-a) then it sorting in descending order   
console.log(number7);

const product = [{
        productId: 1,
        productName: "mobile",
        productprice: 5000
    },
    {
        productId: 2,
        productName: "laptop",
        productprice: 15000
    },
    {
        productId: 3,
        productName: "shirts",
        productprice: 25000
    },
    {
        productId: 4,
        productName: "shoes",
        productprice: 35000
    },
];
//LowToHigh price sorting:-----
const LowToHigh = product.slice(0).sort((a, b) => {
    return a.productprice - b.productprice;
});
console.log(LowToHigh);
//HighToLow price sorting:-----
const HighToLow = product.sort((a, b) => {
    return b.productprice - a.productprice;
});
console.log(HighToLow);
//check product prices <30000 by using every mehtod
console.log("Check prices by using every method")
console.log(product.every((cartItem) => cartItem.productprice < 30000));

/* find method in javasc;ript */
//find method:-- it find the first exact length of string in an array
const myArray1 = ["Hello", "hiii", "Ok", "Thanks", "See ya"];
// //find method by using function:---
// function isLength(string){
//     return string.length === 6 ;
// };
//find method by using arrow function
// const arrrayans = myArray1.find(isLength);
const arrrayans = myArray1.find((string) => string.length === 6);
console.log(arrrayans);

const usersx = [{
        userId: 1,
        userName: "Hitesh"
    },
    {
        userId: 2,
        userName: "Hyeeeeen"
    },
    {
        userId: 3,
        userName: "Kirti"
    },
    {
        userId: 4,
        userName: "Monia"
    }
];
const userAns = usersx.find((user) => user.userId === 2);
console.log(userAns);

/* every method in javascript */
//every method :---> return true/false(boolean)  Note- it applies to all numbers in an array
//callback function :---> return true/false(boolean); Note- it applies to any number in an array

// const number8 = [2,4,54,6,87,896,23];
const number8 = [2, 4, 54, 6, 88, 68, 644];

const number8ans = number8.every((number) => number % 2 === 0);
console.log(number8ans);

/*some method in javascript */
//some method:--> if it found at least one number EVEN the it print true otherwise false
const number9 = [23, 47, 77, 2];
console.log(number9.some((number) => {
    return number % 2 === 0
}));

const product1 = [{
        productId: 1,
        productName: "mobile",
        productprice: 5000
    },
    {
        productId: 2,
        productName: "laptop",
        productprice: 15000
    },
    {
        productId: 3,
        productName: "shirts",
        productprice: 25000
    },
    {
        productId: 4,
        productName: "shoes",
        productprice: 35000
    },
    {
        productId: 5,
        productName: "Macbook",
        productprice: 260000
    }
];
console.log(product1.some((price) => {
    return price.productprice > 150000
}));

/* fill method in javascript */
const numbers1 = new Array(200).fill(900);
console.log(numbers1);

const myArray2 = [2, 54, 53, 65, 32, 4, 3];
console.log(myArray2.fill(1000, 2, 5));

/* splice method in javascript */
const myList = ["Item1", "Item2", "Item3", "Item4", "Item5", "Item6"];
//for deleting an item from an array by using the splice method
const newArray1 = myList.splice(1, 3);
console.log("Deleted Items", newArray1);
//for inserting an item into an array by using the splice method
myList.splice(1, 0, "inserted item");
console.log(myList);
//inserting or deleting an item from an array by using sping method
myList.splice(1, 2, "inserted item1", "inserted item2");
console.log(myList);


/* iterables, array like objects in javascript */
// iterables:-- Strings and arrays are iterables in which we can use iterables
//strings and arrays are iterables
const firstName4 = "Hitesh";
for (const character of firstName4) {
    console.log(character);
}

const Items = ["Item1", "Item2", "Item3", "Item4", "Item5"];
for (const item of Items) {
    console.log(item);
}

//array like objects 
// array like objects :---> those have Length property and we can access that also by using the length property
//example --> String
const firstName5 = "hitesh";
console.log(firstName5.length);
console.log(firstName5[2]);

/* set in javascript */
//Sets (it is iterable)
//Sets store data
//Sets also have its own methods
//No index based access
//Order is not guaranteed
//Unique items only, (no duplicates allowed)    like:--Set{[2,3,5,2]};
const numbers2 = new Set([1, 2, 4, 3, 2]);
console.log(numbers2);
// console.log(numbers2[0]);//if you wanted to do index based element then it gives you undefined in Set();
console.log(typeof numbers2);

const Stringval = new Set("hello", "hii", "Hello");
console.log(Stringval);
console.log(typeof Stringval);

const Item = ["Hello", "Hii", "Hey there", "Theanks"];
const set = new Set();
set.add(1);
set.add(34);
set.add(548);
set.add(565);
set.add(943);
if (set.has(1)) {
    console.log("1 is present");
} else {
    "1 is not present"
}
set.add(Item); //it only gives one array
set.add(Item); //it ignores the other array because they are same
// set.add(["Item1","Item2","Item3","Item4"]);//these array are different in memory
// set.add(["Item1","Item2","Item3","Item4"]);//these array are different in memory
for (const number of set) {
    console.log(number);
}
const myArray3 = [1, 2, 3, 2, 5, 3, 4, 4];
const uniqueElements = new Set(myArray3);
console.log(uniqueElements);
console.log(myArray3);
let length = 0;
for (let Elements of uniqueElements) {
    length++;
}
console.log(length);
console.log(set);

/* map data structure in javascript */
// maps:--  map is an iterable
//store data in ordered fashion
//store key value pair(like objects)
//duplicate keys are not allowed like objects

//differences between maps and objects
//objects can only have string or symbol as key
//in map you can use anything as key like array, number, string

// //object literal
// //key --> string
// //key --> symbol
// const personx = {
//     firstname: "hitesh",
//     age: 22,
//     1:"one"
// }
// console.log(personx[1]);
// console.log(personx.firstname, personx.age);

const person3 = new Map();
person3.set('firstname', 'hitesh');
person3.set('age', 22);
person3.set(1, 'one');
person3.set([24, 24, 231, 3], 'onetwothree');
person3.set({
    1: 'one'
}, 'onetwothree');
console.log(person3);
console.log(person3.get('firstname'));
console.log(person3.get('age'));
console.log(person3.get(1));
console.log(person3.keys());
console.log('keyvalues of person3---->');
for (const key of person3.keys()) {
    console.log(key, typeof key, Array.isArray(key));
}
console.log('Values of person3---->');
for (const [key, value] of person3) {
    // console.log(key, typeof key, Array.isArray(key));
    console.log(key, value);
}

const person4 = new Map([
    ['firstname', 'hitesh'],
    ['age', 22],
    ['gender', 'male']
]);
console.log(person4);

//to store data from other location by using map() -->
const person5 = {
    id: 1,
    firstname: 'hitesh'
}
const userInfo = new Map();
userInfo.set(person5, {
    age: 22,
    gender: 'male'
});
console.log(userInfo);
console.log(person5.id);
console.log(userInfo.get(person5).age);

/* clone using Object.assign in javascript */
const obj1 = {
    key1: 'value1',
    key2: 'value2',
}
// const obj2 = obj1.assign({}, obj1);//old verson spread operator
const obj2 = {
    ...obj1
}; //for cloning use spread operator(...) New verson spread operator
obj1.key3 = 'value3';
console.log(obj1);
console.log(obj2);

/* optional channing in javascript */
const user2 = {
    firstName: 'hitesh',
    address: {
        houseNumber: '12345',
        streetNumber: 4
    }
}
console.log(user2.firstName);
console.log(user2?.address?.houseNumber, user2?.address?.streetNumber);

/* create your own methods in javascript */
// methods :-- function indside object
const person6 = {
    firstname: 'hyeeeeen',
    age: 23,
    aboutMe: function () {
        console.log(`person name is ${this.firstname} and person age is ${this.age}`);
        console.log(this); //this means the person9 name object
    }
}
person6.aboutMe();

const personX1 = {
    firstname: 'hitesh',
    age: 22,
    about: userInfo1
}
const personX2 = {
    firstname: 'hyeeeeen',
    age: 23,
    about: userInfo1
}
const personX3 = {
    firstname: 'akansha',
    age: 21,
    about: userInfo1
}

function userInfo1() {
    console.log(`person name is ${this.firstname}`);
}
personX1.about();
personX2.about();
personX3.about();

//both gives window object :----->
console.log(this);
console.log(window);

/* call, apply or bind methods in javascript */
function hello() {
    console.log('hello boy:)');
}
hello();
hello.call();
//we can use call method to call a function in one object to other object
function about(hobby, favBand) {
    console.log(this.firstnamex, this.agex, hobby, favBand);
}
const Users1 = {
    firstnamex: 'hitesh',
    agex: 22,
    // about: function (hobby,favBand) {
    //     console.log(this.firstname, this.age, hobby, favBand);
    // }

}
// Users1.about('piano', 'The beatles');
const Users2 = {
    firstnamex: 'hyeeeeen',
    agex: 23,
}
// Users1.about.call(Users2, "guitar", 'Queen');

//use apply method
about.apply(Users1, ['drum', 'therock']);
about.apply(Users2, ['flute', 'de`silva']);

//use bind method
// bind:-- it stores values in a function and also return that function
const func = about.bind(Users2, "guitar", 'Queen');
func();

const userx = {
    firstname: 'newuser',
    age: 22,
    about: function () {
        console.log(this);
        console.log(this.firstname, this.age);
    }
}
const func1 = userx.about.bind(userx);
// console.log(func1);
func1();

/* arrow function and this in javascript */
//arrow function doesn't have this keyword it takes this keyword from it's surroundings
const userx1 = {
    firstname: 'newuser1',
    age: 22,
    about: () => {
        console.log(this.firstname, this.age);
    }
}
userx1.about.call(userx1);

/* short syntax in javascript */
const userx3 = {
    firstname: 'newuser2',
    age: 22,
    about: function () {
        console.log(this.firstname, this.age);
    }
}
const userx4 = {
    firstname: 'newuser3',
    age: 23,
    about() {
        console.log(this.firstname, this.age);
    }
}
userx4.about.call(userx3); //call is used to print user4 elements in user3
userx3.about.call(userx4); //call is used to print user3 elements in user4

/* create functions to create multiple objects in javascript */

//1. function(that function create object)
//2. add key value pair
//3. return object 

function createUser(firstname, lastname, email, age, address) {
    const userx5 = {};
    userx5.firstname = firstname;
    userx5.lastname = lastname;
    userx5.age = age;
    userx5.email = email;
    userx5.address = address;
    userx5.about = function () {
        return `${this.firstname} is ${this.age} years old`;
    };
    userx5.is18 = function () {
        return this.age >= 18;
    };
    return userx5;
}
const userx6 = createUser('hyeeeeen', 'lye in', 'hyeeeeenlyein@gmail.com', 23, 34322);
console.log(userx6);
console.log(userx6.is18());
const userx7 = createUser('hitesh', 'woon', 'hiteshindia231@gmail.com', 22, 45664);
console.log(userx7);
console.log(userx7.is18());
const userx16 = createUser('hyeeeeen', 'lye in', 'hyeeeeenlyein@gmail.com', 23, 34322);
console.log(userx16);
console.log(userx6.is18());
const userx17 = createUser('hitesh', 'woon', 'hiteshindia231@gmail.com', 22, 45664);
console.log(userx17);
console.log(userx7.is18());
const userx26 = createUser('hyeeeeen', 'lye in', 'hyeeeeenlyein@gmail.com', 23, 34322);
console.log(userx26);
console.log(userx6.is18());
const userx27 = createUser('hitesh', 'woon', 'hiteshindia231@gmail.com', 22, 45664);
console.log(userx27);
console.log(userx7.is18());
console.log(userx27.about());

//second way of doing this is:----
/* store methods in different objects in javascript */
console.log('This is a second way of doing this and it is a short method also');
const userMethods = {
    about: function () {
        return `${this.firstname} is ${this.age} years old`;
    },
    is18: function () {
        return this.age >= 18
    }
}

function newcreateUser(firstname, lastname, email, age, address) {
    const userxx5 = {};
    userxx5.firstname = firstname;
    userxx5.lastname = lastname;
    userxx5.age = age;
    userxx5.email = email;
    userxx5.address = address;
    userxx5.about = userMethods.about;
    userxx5.is18 = userMethods.is18;
    return userxx5;
}
const userxx6 = newcreateUser('hyeeeeen', 'lye in', 'hyeeeeenlyein@gmail.com', 23, 34322);
console.log(userxx6);
console.log(userxx6.about());
console.log(userxx6.is18());
const userxx7 = newcreateUser('hitesh', 'woon', 'hiteshindia231@gmail.com', 22, 45664);
console.log(userxx7);
console.log(userxx7.about());
console.log(userxx7.is18());

/* solution using Object.create in javascript */
const objx1 = {
    key1: 'value1',
    key2: 'value2'
}
//empty object and put value in it :--
// const objx2 = {}
// objx2.key3 = 'value3';
//the other way of putting value in empty object is :--
const objx2 = Object.create(objx1);
objx2.key3 = 'value3';
console.log(objx1.key1, objx1.key2);
console.log(objx2.__proto__); //for print values that stated in prototype


console.log('This is a third way of doing this and it is a short method also');
const userMethods1 = {
    about: function () {
        return `${this.firstname} is ${this.age} years old`;
    },
    is18: function () {
        return this.age >= 18
    }
}

function newcreateUser1(firstname, lastname, email, age, address) {
    const userxX5 = Object.create(newcreateUser1);
    userxX5.firstname = firstname;
    userxX5.lastname = lastname;
    userxX5.age = age;
    userxX5.email = email;
    userxX5.address = address;
    userxX5.about = userMethods.about;
    userxX5.is18 = userMethods.is18;
    return userxX5;
}
console.log(newcreateUser1.prototype);
newcreateUser1.prototype.about = function () {
    return `${this.firstname} is ${this.age} years old`;
}
newcreateUser1.prototype.is18 = function () {
    return this.age >= 18;
}
const userxX6 = newcreateUser1('hyeeeeen', 'lye in', 'hyeeeeenlyein@gmail.com', 23, 34322);
console.log(userxX6);
console.log(userxX6.about());
console.log(userxX6.is18());
const userxX7 = newcreateUser1('hitesh', 'woon', 'hiteshindia231@gmail.com', 22, 45664);
console.log(userxX7);
console.log(userxX7.about());
console.log(userxX7.is18());

/* prototype in javascript */
//__proto__ --> it is like a channing that gives vlaues that stated in prototype
//prototype --> it gives you an free space in the form of empty object{}
function hello() {
    console.log('hello boy ');
}
//in javascript funcion ===> function + object
console.log(hello.name); //it gives you function name
// name property ----> tells function name

//you can add your own properties
hello.myownproperty = 'unique property';
console.log(hello.myownproperty);
//function provides more useful properties

//function gives you free space --> that is object{} which we called prototype
console.log(hello.prototype);
if (hello.prototype) {
    console.log('prototype is present');
} else {
    console.log('prototype is not present');
}

hello.prototype.abc = "abc";
hello.prototype.xyz = "xyz";
hello.prototype.send = function () {
    console.log('This message is for you :-)');
}
console.log(hello.prototype);

/* use prototype in javascript */
function newcreateUser1(firstname, lastname, email, age, address) {
    const userxX5 = Object.create(newcreateUser1.prototype);
    userxX5.firstname = firstname;
    userxX5.lastname = lastname;
    userxX5.age = age;
    userxX5.email = email;
    userxX5.address = address;
    userxX5.about = userMethods.about;
    userxX5.is18 = userMethods.is18;
    return userxX5;
}
console.log(newcreateUser1.prototype);
newcreateUser1.prototype.about = function () {
    return `${this.firstname} is ${this.age} years old`;
}
newcreateUser1.prototype.is18 = function () {
    return this.age >= 18;
}
const userxX8 = newcreateUser1('hyeeeeen', 'lye in', 'hyeeeeenlyein@gmail.com', 23, 34322);
console.log(userxX8);
console.log(userxX8.about());
console.log(userxX8.is18());
const userxX9 = newcreateUser1('hitesh', 'woon', 'hiteshindia231@gmail.com', 22, 45664);
console.log(userxX9);
console.log(userxX9.about());
console.log(userxX9.is18());


/* New keyword in javascript */
//New keyword :---
//1. empty object this = {}
//2. return this
//3. Object.create(createUserX.prototype)

function CreateUserX(firstname, age) {
    this.firstname = firstname;
    this.age = age;
}
CreateUserX.prototype.about = function () {
    console.log(this.firstname, this.age);
}
const userxx1 = new CreateUserX('hitesh', 22);
console.log(userxx1);
console.log(CreateUserX.prototype);
console.log(userxx1.__proto__);
console.log(userxx1.about());
/* hasOwnProperty in javascript */
// hasOwnProperty----> only works with the New keyword
for (let key in userxx1) {
    if (userxx1.hasOwnProperty(key)) {
        console.log(key);
    }
}

/* more about prototype in javascript */
let numbers = new Array(1, 4, 2);
console.log(Array.prototype);
console.log(numbers);

let numbersx = [1, 4, 2, 8, 5];
console.log(Object.getPrototypeOf(numbersx));
console.log(numbersx);

function hellox() {
    console.log('hello');
}
console.log(hellox.prototype);

/* class keywoed in javascript */
class CreateUserX1 {
    constructor(firstname, lastname, email, age, address) {
        console.log("Constructor Called");
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.email = email;
        this.address = address;
    }
    about() {
        return `${this.firstname} is ${this.age} years old`;
    };
    is18() {
        return this.age >= 18;
    };
    func(a) {
        console.log(a);
    };
}
const userxx2 = new CreateUserX1('hyeeeeen', 'lye in', 'hyeeeeenlyein@gmail.com', 23, 34664);
const userxx3 = new CreateUserX1('hitesh', 'woon', 'hiteshindia231@gmail.com', 22, 45664);
const userxx4 = new CreateUserX1('hello', 'lye in', 'hellolyein@gmail.com', 23, 3455);
console.log('email:', userxx2.email, 'lastname:', userxx2.lastname);
console.log('email:', userxx3.email, 'lastname:', userxx3.lastname);
console.log('email:', userxx4.email, 'lastname:', userxx4.lastname);
console.log(Object.getPrototypeOf(userxx2));
userxx2.func("hello boy :)");

/* class practice and extends keyword in javascript */
class Animal {
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }
    eat() {
        console.log(`Basic eat:->${this.name} is eating`);
    }
    isCute() {
        return this.age <= 1;
    }
}
const animal1 = new Animal('lucky', 2);
const animal2 = new Animal('luqe', 1);
console.log(animal1);
console.log(animal2);
animal1.eat();
animal2.eat();
console.log(animal1.isCute());
console.log(animal2.isCute());

// super and extends keyword in javascript
class Dog extends Animal{
    constructor(name, age, speed){
        super(name, age);
        this.speed = speed;
    }
    run(){
        return `${this.name} is running at ${this.speed} kmph`;
    }
    eat(){
        return ` Modified eat:-> ${this.name} is ${this.age} years old`;
    }
}
const dog1 = new Dog('tommy', 1,40);
const dog2 = new Dog('jax',2, 50);
console.log(dog1);
console.log(dog2);
console.log(dog1.run());
console.log(dog2.run());
console.log(dog1.isCute());
console.log(dog2.isCute());
const dog3 = new Animal('tommy', 1);
const dog4 = new Animal('jax',2);
dog3.eat();
dog4.eat();

/* getters and setters in javascript */
class personx {
    constructor(firstname,lastname,age){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }
    //getters-->
    get fullname(){
        return `${this.firstname} ${this.lastname}`;
    }
    set fullname(fullname){
        const[firstname,lastname] = fullname.split(" ");
        this.firstname = firstname;
        this.lastname = lastname;
    }
}
const personx1 = new personx('hitesh','kumar',22);
const personx2 = new personx('hitesh','kumar',22);
console.log(personx1);
console.log(personx2);
// console.log(personx1.fullname());
// console.log(personx2.fullname());
console.log(personx1.firstname,personx1.lastname,':-)' , personx1.age);
console.log(personx2.firstname,personx2.lastname,':-)' , personx2.age);

console.log('\n getters method --------->');
console.log(personx1.fullname);//when you use getter method then you dont need to call a function you just type name of that function
console.log(personx2.fullname);//when you use getter method then you dont need to call a function you just type name of that function

console.log('\n setters method --------->');
console.log(personx1.fullname);
console.log(personx2.fullname);
//using setter method for changing name
personx1.firstname = 'mars';
personx1.lastname = 'siff';
console.log(personx1.fullname);

personx1.fullname = 'clar finn';
console.log(personx1.fullname);

/* static methods and properties in javascript */
class Animals {
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }
    eat() {
        console.log(`Basic eat:->${this.name} is eating`);
    }
    isCute() {
        return this.age <= 1;
    }
    static newX(){
        // console.log('There is a static method here ');
        return 'There is a static method here ';
    }
    static newmethod = 'hello mr.';
}
const animalx1 = new Animals('lucky', 2);
const animalx2 = new Animals('luqe', 1);
console.log(animalx1);
console.log(animalx2);
console.log(Animals.newmethod);
console.log(Animals.newX());

class Dogs extends Animals{
    constructor(name, age, speed){
        super(name, age);
        this.speed = speed;
    }
    run(){
        return `${this.name} is running at ${this.speed} kmph`;
    }
    eat(){
        return ` Modified eat:-> ${this.name} is ${this.age} years old`;
    }
}
const dogx1 = new Dogs('tommy', 1,40);
const dogx2 = new Dogs('jax',2, 50);
console.log(dogx1);
console.log(dogx2);