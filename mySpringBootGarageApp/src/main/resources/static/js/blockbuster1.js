let obj, dbParam, requestURL, request;
obj ={table:"Films", limit: 20};
dbParam = JSON.stringify(obj);
requestURL = "http://127.0.0.1:8080/api/film";
request = new XMLHttpRequest();
filmDB = request.response;

request.open("GET",requestURL);
request.setRequestHeader('Content-type','application/json');
request.setRequestHeader('Access-Control-Allow-Origin','*');
request.responseType="json";
request.send();

request.onload = function(){
    tableCreation();
}

function tableCreation(){
    let txt="";
    txt +="<table border='5'style='background-color:white' table align='center' bordercolor='white'>";
    txt +="<th>Title</th>";
    txt +="<th>Description</th>";
    txt +="<th>Category</th>";
    txt +="<th>Length</th>";
    txt +="<th>Price</th>";
    txt +="<th>Rating</th>";
    for (let x in filmDB){
        txt += "<tr><td>" + filmDB[x].title + "</td>";
        txt += "<td>" + filmDB[x].description + "</td>";
        txt += "<td>" + filmDB[x].category + "</td>";
        txt += "<td>" + filmDB[x].length + "</td>";
        txt += "<td>" + filmDB[x].price + "</td>";
        txt += "<td>" + filmDB[x].rating + "</td></tr>";
    }
    document.getElementById("Content").innerHTML = txt;
}

function returnMovie(value){
    let requestURL = "http://127.0.0.1:8080/api/film/category/"+value;
    request.open("GET",requestURL);
    request.setRequestHeader('Content-type','application/json');
    request.setRequestHeader('Access-Control-Allow-Origin','*');
    request.responseType="json";
    request.send();
        tableCreation();
}

function returnAll(){
    request.open("GET",requestURL);
    request.setRequestHeader('Content-type','application/json');
    request.setRequestHeader('Access-Control-Allow-Origin','*');
    request.responseType="json";
    request.send();
        tableCreation();
}

function searchTitles(){
    let filmDB2 = request.reponse;
    let txt="";
    txt +="<table border='5'style='background-color:white' table align='center' bordercolor='white'>";
    txt +="<th>Title</th>";
    txt +="<th>Description</th>";
    txt +="<th>Category</th>";
    txt +="<th>Length</th>";
    txt +="<th>Price</th>";
    txt +="<th>Rating</th>";
    let searchInput=document.getElementById("textInput").value
    let searchInput=searchInput.toUpperCase();
        for(let z = 1; z < filmDB2.length; z++){  
            if (filmdDB2.title[z].includes(searchInput)){
                txt += "<tr><td>" + filmDB2[z].title + "</td>";
                txt += "<td>" + filmDB2[z].description + "</td>";
                txt += "<td>" + filmDB2[z].category + "</td>";
                txt += "<td>" + filmDB2[z].length + "</td>";
                txt += "<td>" + filmDB2[z].price + "</td>";
                txt += "<td>" + filmDB2[z].rating + "</td></tr>";
                }
    }
}