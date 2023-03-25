const quizDB=[
{
	question:"Q1: JavaScript is the programming language of the _____.",
	a:"Desktop",
    b:"Mobile",
    c:"Web",
    d:"Server",
    ans:"ans3"

},
{
	question:"Q2: Which type of JavaScript language is _____?",
	a:"Object-oriented",
	b:"Object-based",
	c:"Functional programming",
	d:"All of the above",
	ans:"ans2"
},
{
	question:"Q3: In which HTML element, we put the JavaScript code?",
	a:"<javascript>...</javascript>",
	b:"<js>...</js>",
	c:"<script>...</script>",
	d:"<css>...</css>",
	ans:"ans3"
},
{
	question:"Q4: JavaScript code can be written in ____.",
	a:"JavaScript file (.js file)",
	b:"HTML document directly",
	c:"JavaScript file and in HTML document directly",
	d:"In style sheets (.css file)",
	ans:"ans3"
},
{
	question:"Q5: Which is the correct syntax to call an external JavaScript file in the current HTML document?",
	a:"<script src='jsfile.js'></script>",
	b:"<script href=' jsfile.js'></script>",
	c:"<import src=' jsfile.js'></import>",
	d:"<script link='jsfile.js'></script>",
	ans:"ans1"
}
];

const question=document.querySelector('.question');
const option1=document.querySelector('#option1');
const option2=document.querySelector('#option2');
const option3=document.querySelector('#option3');
const option4=document.querySelector('#option4');
const submit=document.querySelector('#submit');

const answers=document.querySelectorAll('.answer');
let questionCount=0;
let score=0;
const loadQuestion=()=>{
	const questionList =quizDB[questionCount];
	question.innerText=questionList.question;
	option1.innerText=questionList.a;
	option2.innerText=questionList.b;
	option3.innerText=questionList.c;
	option4.innerText=questionList.d;

}
loadQuestion();

const getCheckAnswer=()=>{
	let answer;
	answers.forEach((curAnsElem) =>{
		if(curAnsElem.checked){
			answer=curAnsElem.id;
		}
});
return answer;
};


submit.addEventListener('click',()=>{
	const checkedAnswer=getCheckAnswer();
	console.log(checkedAnswer);
	if(checkedAnswer===quizDB[questionCount].ans){
		score++;
	};
questionCount++;

const doselectAll=()=>{
	answers.forEach((curAnsElem)=> curAnsElem.checked=false);
}

if(questionCount<quizDB.length){
	loadQuestion();
}
else{
	showScore.innerHTML=`<h3> You Scored ${score}/${quizDB.length} </h3>
	<button class="btn" onClick="location.reload()">Reload</button>`;
	showScore.classList.remove('scoreArea');
}
});