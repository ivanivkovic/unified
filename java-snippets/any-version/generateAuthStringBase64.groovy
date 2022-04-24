/**
 * Performs Basic base64 encoded authorization
 *
 * @param String user
 * @param String password
 *
 * @return String Auth string
 */
String generateAuthString(String username, String password){
	return 'Basic ' + Base64.getEncoder().encodeToString((username + ':' + password).getBytes())
}