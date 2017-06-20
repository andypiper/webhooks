var security = require('./security');

var consumer_secret = "secret";
var crc_token = "Message";

var hash = security.get_challenge_response(crc_token, consumer_secret);

console.log('sha256=' + hash);
