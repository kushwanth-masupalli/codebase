const mongoose = require('mongoose');

const student  = mongoose.Schema({
    username :{
        type:String,
        required:true,
        minLength: 5
    },
    age:{
        type:Number,
        required : false,
        min: 2
    },
    address:{
        type:String,
        required : false
    }   
}
);

module.exports = mongoose.model('Student',student);