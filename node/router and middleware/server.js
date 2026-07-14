const express = require('express');
const app = express();

const userRoutes = require('./routes/userRoutes');
const middleware = require('./middleware/errorHandler');
const auth = require('./middleware/auth');

app.use('/', auth,userRoutes);

app.get('/health', (req, res) => {
    res.send('Hello, World!');
});

app.use(middleware);
app.listen(3000, () => {
    console.log('Server is running on port 3000');
});


