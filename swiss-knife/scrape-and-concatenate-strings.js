// Calculates numbers from class items, returns result
function concatenate(classname)
{
	var result = 0;
	var prices = document.getElementsByClassName(classname);

	for(i = 0; i < prices.length; i++){
		result += prices[i].innerHTML + " \n";
	}
	
	return result;
}