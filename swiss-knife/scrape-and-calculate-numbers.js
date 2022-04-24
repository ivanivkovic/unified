// Calculates numbers from class items, returns result
function calculate(classname)
{
	var result = 0;
	var prices = document.getElementsByClassName(classname);

	for(i = 0; i < prices.length; i++){
		result += parseInt(prices[i].innerHTML.replace(" USD", ""));
	}
	
	return result;
}