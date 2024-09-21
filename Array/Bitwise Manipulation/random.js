// http://localhost:8090/Addteacher


function  Addteacher (){
    axios.get("http://localhost:8090/Addteacher", {
        params : {i:101, n:'Prashant', c:76275, b:'ECE',p:'password'}
    }).then(res => console.log(res.data));
}

export default  Addteacher; 

// -----------------------------------------------------------

function Data() {
    var[x, setx] = useState();
    var[y,sety] = useState();
    var[z,setz] =  useState();

function show1(e){
    setx(e.target.value);
}

function show2(e){
    sety(e.target.value);
}

function add(){
    axios.get("http://localhost:8090/Addteacher" , {
        params : {i:909, n:'Prashant', c:999,b:'ECE', p:'password'}
}).then(res => console.log(res.data));
}


return <>
<input type = 'text' onChange ={show1} />
<input type ='text' onChange= {show2} />
<button OnClick = {add} />
</>

}
// -----------------------------------


function Data()
{
var [x,setx]  = useState();
var [y,sety] = useState();
var [z,setz] = useState();


function show1(e){
    setx(e.target.value);
}

function show2(e){
    sety(e.target.value);
}

function add(){
axios.get("// http://localhost:8090/Addteacher" , {
params : {i:999, n:'Prashant', c:767678, b:'ECE', p:'password'}
}).then(res => console.log(res.data));
}

return <>
<input type ='text' onChange= {show1} />
<input type ='text' onChange= {show2} />
<button onClick ={add} />


</>

}


