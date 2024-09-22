var express = require('express');
var mysql = require('mysql2');
var router = express.Router();
router.get("/", function(req,res){

var con= mysql.createConnection({


    host:"localhost",
username:"root",
password:"seedit",
database:"inputfront"

});

var r = req.query.r;
var p = req.query.p;

con.connect(function(err){
if (err) throw er;

var sql = "insert into info(rno, password) values(?,?)";

con.query(sql, [r,p], function(err, result){
if (err) throw err;
res.send(result);
res.end();
con.end();


});

});
});



module.exports = router;