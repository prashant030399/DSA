// var express= require('express');
// var app = express();
// var cors = require('cors');

// var select = require('./select.js');

// app.get('/insert',insert);
// app.get('select',select);

//---------------------------------------------------

var express = require('express');
var mysql = require('mysql2');
var express = express.Router();

router.get("/", function(req,res){

var con = mysql.createConnection({

    host:"localhost",
    username:"root",
    password:"seedit",
    database:"infront"

});


    
var rno = req.query.rno;
var name = req.query.name;
var marks = req.query.marks;

con.connect(function(err){
if (err) throw err;

var con = "insert into table(rno, name , marks) values(?,?,?)";

con.query(sql,[rno, name, marks], function(err, result){
if (err) throw  err;
res.send("inserted");

});
});
});

