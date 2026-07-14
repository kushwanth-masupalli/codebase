const mongoose = require('mongoose')

async function connectToMongodb(){
    try{
        mongoose.connect(process.env.MONGODB_URI);
        console.log("connected to the databaes ");
    }
    catch(err){
        console.error(err);
    }
}

module.exports = connectToMongodb;