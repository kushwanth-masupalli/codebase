const express = require('express')
const app = express()


app.get('/', (req, res) => {
  res.send('docker bro ')
})


app.listen(3000,()=>{
    console.log("server  is up")
})

