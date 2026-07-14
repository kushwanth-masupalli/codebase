require('dotenv').config()
const express = require('express');
const app = express();
const connectToDb = require('./database/connetToDB');
const User = require('./database/User');
const bcrypt =require('bcrypt')


app.use(express.json());

connectToDb();


app.get('/', (req, res) => {
    res.json({
        message: "Welcome to the server"
    });
})


app.post('/signup', async (req, res) => {
    const username = req.body.username;
    const password = req.body.password;

    const bcrypt = require('bcrypt');

    const hashedPassword = await bcrypt.hash(password, 10);
    const user1 = new User({
        username: username,
        password: hashedPassword
    });
    try {
        const savedUser = await User.create(user1);
        res.status(201).json(savedUser);
    } catch (err) {
        res.status(500).json({
            error: err.message
        });
    }

});



app.post("/api",async (req,res) => {
          const username = req.body.username;
          const password = req.body.password;


          const user1 = await User.findOne({username});
          if(!user1){
             res.json({
                messsage:"user not found enter wrong userame"
             });
          }
          else{
              
              if(await bcrypt.compare(user1.password,password)){
                
                 res.json({
                    message:"enter wrong password try again"
                 });
              }else{
                res.json({
                    messsage:"api is accessbile"
                })
              }
          }
})


app.listen(process.env.PORT, () => {
    console.log("server started at " + process.env.PORT);
})