const { createProxyMiddleware } = require("http-proxy-middleware");

module.exports = function (app) {
  app.use(
    "/api",
    createProxyMiddleware({
      target: "http://localhost:9090",
      changeOrigin: true,
    })
  );
};


// const proxy = require('http-proxy-middleware');
//
// module.exports = function(app) {
//     app.use(
//         proxy('/api', {
//             target: 'http://localhost:8080/',
//             changeOrigin: true
//         })
//     );
// };