function calculateDaybetweenDates
{
  var date1 = new Date("2016-01-01");
  var date2 = new Date("2016-01-02");
  var diff = date2.getTime() - date1.getTime();
  var days = Math.ceil(diff / (1000 * 3600 * 24));
  console.log(days);
}
//read today date
var today = new Date();
//read date from input
var date = new Date("2016-01-01");
//calculate difference between today and input date
var diff = today.getTime() - date.getTime();
// implement calculation
var days = Math.ceil(diff / (1000 * 3600 * 24));
console.log(days);
