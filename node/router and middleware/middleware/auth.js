const auth = (req, res, next) => {
    console.log("auth middleware is called")
    next();
};

module.exports = auth;