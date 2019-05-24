window.onload=function () {
    var cBtn = document.getElementById("codeBtn");
    cBtn.onclick = function () {
        alert("dsadsd");
    }
    // var cSpan = document.getElementById("codeSpan");
    // cSpan.innerText="4564564";
    // var code = document.getElementById("code");
    // //获取验证码
    // var str = "";
    // cBtn.onclick = function () {
    //     //cBtn.innerText = "";
    //     str = "";
    //     var nums = [];
    //     for (var i = 0; i < 4; i++){
    //         var ranNum = parseInt(Math.random()*62);//产生0-61的随机数
    //         if(ranNum >= 0 && ranNum <= 9){
    //             nums.push(String.fromCharCode(ranNum+48))
    //         }else if (ranNum >=10 && ranNum <= 35){
    //             nums.push(String.fromCharCode(ranNum+55))
    //         }else if (ranNum >=36 && ranNum <= 61) {
    //             nums.push(String.fromCharCode(ranNum+61))
    //         }
    //         str = nums[i]+str;
    //     }
    //     cSpan.innerText = str;
    // }
    // //验证 验证码
    // code.onfocus = function(){
    //     code.innerText="验证码不区分大小写";
    // }
    // code.onblur = function () {
    //     var cval = this.value;
    //     if ((cval.toLowerCase() == str.toLowerCase()) == true){
    //         cSpan.innerText = "验证码输入正确";
    //     } else{
    //         cSpan.innerText = "验证码输入错误";
    //     }
    // }
}