const login= document.getElementById('submitButton');
login.addEventListener('click',()=>{
    var email =document.getElementById("email1").value ;
    var password= document.getElementById("password1").value;
    if(email1=="Tonghy@gmail.com" && password=="123456"){
        window.location.assign("task5.html")
        alert("login successfully!")
    }else{
        alert ("invalid Information")
        return;
    }
})