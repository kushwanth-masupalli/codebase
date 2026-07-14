const express = require('express');
const router = express.Router();



router.get('/users', (req, res) => {
    res.send('List of users');
});

router.get("/profile", (req, res) => {
    res.send("User profile");
}
);

router.get("/error", (req, res) => {
    const error = new Error("This is a test error");
    error.statusCode = 400;
    throw error;
});



module.exports = router;