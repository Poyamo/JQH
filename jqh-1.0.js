function write(a){
  document.write(a);
}
function save(a,b){
  localStorage.setItem(a,b);
}
function load(a,b){
  var Saved_file = "saved";
  if(a==Saved_file){
  localStorage.getItem(a);
  }
}
function style_write(a,b){
  document.write(a).style.color= b;
}

function make(a,b,c,d){
  if(a=="txt_element"){
    var para=document.createElement(b);
var node=document.createTextNode(c);
para.appendChild(node);

var element=document.getElementById(d);
element.appendChild(para);
  }
  if(a=="anthor_element"){
    const newDiv = document.createElement("div");
    const parent = document.querySelector("body");
parent.appendChild(newDiv);
  }
}
function styleingbyId(a,b){
  if(a=="height"){
    document.getElementById(a).style.height = b;
  }
  if(a=="width"){
    document.getElementById(a).style.width = b;
  }
  if(a=="color"){
    document.getElementById(a).style.color = b;
  }
  if(a=="bg_color"){
    document.getElementById(a).style.backgroundColor = b;
  }
}
function createE(b,a,c){
if(b=="create by var"){
  var c = document.createElement(a);
}else{
  document.createElement(a);
}
}
function queryS(a,b,c){
  if(a=="create by var"){
    var c = document.querySelector(b);
  }else{
    document.querySelector(b);
  }
}
document.write("JQH VERSION 1.3 B.E.T.A ==>");
function if(a,b,c){
  if(a){
    b;
  }else{
    c;
  }
}