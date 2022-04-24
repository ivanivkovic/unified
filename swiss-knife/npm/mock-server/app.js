const http = require('http')

const server = http.createServer(function(request, response) {
	
	var body = ''
	
	console.log("Incoming request: \n")

	console.log(request.method + " " + request.url)
	
	console.log("\nHTTP Headers:")
	console.log(request.rawHeaders)
	
	request.on('data', function(stream){
		body += stream
		
		console.log("\nHTTP Body:")
		console.log(body)
		
		console.log("\n")
	})

	request.on('end', function() {
		response.writeHead(200, {'Content-Type': 'application/json'})
		response.end('{"response": "Request received."}')
	})
})


const port = 3000
const host = '127.0.0.1'

server.listen(port, host)
console.log(`Listening at http://${host}:${port}`)
