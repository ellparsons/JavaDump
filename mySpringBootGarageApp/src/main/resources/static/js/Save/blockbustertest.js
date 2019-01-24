let obj ={table:"Films", limit: 20};
let dbParam = JSON.stringify(obj);
let requestURL = "http://127.0.0.1:8080/api/film"
let request = new XMLHttpRequest();
request.open("GET",requestURL);
request.setRequestHeader('Content-type','application/json');
request.setRequestHeader('Access-Control-Allow-Origin','*');
request.responseType="json"
request.send();

request.onload = function(){ 
    let jsonString = request.response;
    let txt="";
    txt +="<table border='5'style='background-color:#aac4ef' table align='center' bordercolor='grey'>"
    txt +="<th>Title</th>"
    txt +="<th>Description</th>"
    txt +="<th>Category</th>"
    txt +="<th>Length</th>"
    txt +="<th>Price</th>"
    txt +="<th>Rating</th>"
    for (x in jsonString){
        txt += "<tr><td>" + jsonString[x].title + "</td>";
        txt += "<td>" + jsonString[x].description + "</td>";
        txt += "<td>" + jsonString[x].category + "</td>";
        txt += "<td>" + jsonString[x].length + "</td>";
        txt += "<td>" + jsonString[x].price + "</td>";
        txt += "<td>" + jsonString[x].rating + "</td></tr>";
    }
    txt +="<table>"
    let myH1=document.createElement('h1');
    document.getElementById("Content").innerHTML = txt;
}

function returnMovie(){
    input=document.getElementById("actionButton").value;
    let requestURL = "http://127.0.0.1:8080/api/film/category/action"
    request.open("GET",requestURL);
    request.setRequestHeader('Content-type','application/json');
    request.setRequestHeader('Access-Control-Allow-Origin','*');
    request.responseType="json"
    request.send();
    let jsonString = request.response;
    let txt="";
    txt +="<table border='5'style='background-color:#aac4ef' table align='center' bordercolor='grey'>"
    txt +="<th>Title</th>"
    txt +="<th>Description</th>"
    txt +="<th>Category</th>"
    txt +="<th>Length</th>"
    txt +="<th>Price</th>"
    txt +="<th>Rating</th>"
    for (x in jsonString){
            txt += "<tr><td>" + jsonString[x].title + "</td>";
            txt += "<td>" + jsonString[x].description + "</td>";
            txt += "<td>" + jsonString[x].category + "</td>";
            txt += "<td>" + jsonString[x].length + "</td>";
            txt += "<td>" + jsonString[x].price + "</td>";
            txt += "<td>" + jsonString[x].rating + "</td></tr>";
    }
    txt +="<table>"
    let myH1=document.createElement('h1');
    document.getElementById("Content").innerHTML = txt;
}


