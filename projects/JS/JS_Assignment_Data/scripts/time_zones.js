/*
   Assignment  
   Developed By: Anastassia Tarassova
   Developed Date:  28-01-2025

   Function List: Add the list of your functions here.

1) UTCTime() - retrieving UTC time
2) formatTime() - formating time 
3) displayLocalTime() - display time for Montreal (not UTC)
4) declare variables for time offsets for each office
5) considerOffsets() - applying the offsets of various time zones 
6) displayHoustonTime(), displayLondonTime()...... - applying the considerOffsets() a specific offset for each city 
////I could make the 6 functions modular, for sure. That's for another iteration. 
7) start() - calling setInterval() onload for each time display


*/
function UTCTime() {
   let today = new Date(); // new variable for today's date

   return {
      year: today.getUTCFullYear(), // applying date/time methods
      month: today.getUTCMonth() + 1, // compensating months starting at 0
      day: today.getUTCDate(),
      hour: today.getUTCHours(),
      minute: today.getUTCMinutes(),
      second: today.getUTCSeconds(),
   }
}

function formatTime(year, month, day, hour, minute, second) {
   //leading zeroes for date
   month = (month < 10) ? ('O' + month) : month;
   day = (day < 10) ? ('O' + day) : day;

   // transforming 24h format to 12h
   let ampm = (hour < 12) ? 'AM' : 'PM';
   hour = (hour > 12) ? (hour - 12) : hour;

   //leaging zeroes for time
   minute = (minute < 10) ? ('O' + minute) : minute;
   second = (second < 10) ? ('O' + second) : second;

   return year + "/" + month + "/" + day + " " + hour + ":" + minute + ":" + second + ampm;
}

// display local time, as per user's system settings
// makes it more responsive to user's location than basing it on UTC directly
function displayLocalTime() {
   let now = new Date;
   let nowFormatted = formatTime(
      now.getFullYear(),
      now.getMonth() + 1,
      now.getDate(),
      now.getHours(),
      now.getMinutes(),
      now.getSeconds()
   );
   document.getElementById('local-time').value = nowFormatted;
}

// Montreal has same offset as NYC 
let offsets = {
   "houston": -360,
   "newYork": -300,
   "seattle": -480,
   "sydney": -660,
   "tokyo": -540
}

function considerOffsets(UTCTime, offset) {
   let newTime = new Date;
   newTime.setMinutes(newTime.getMinutes() + offset);
   return {
      year: newTime.getUTCFullYear(),
      month: newTime.getUTCMonth() + 1,
      day: newTime.getUTCDate(),
      hour: newTime.getUTCHours(),
      minute: newTime.getUTCMinutes(),
      second: newTime.getUTCSeconds()
   };
}

// HOUSTON
function displayHoustonTime() {
   let houston = considerOffsets(UTCTime(), offsets['houston']);
   let houstonFormatted = formatTime(houston.year, houston.month, houston.day, houston.hour,
      houston.minute, houston.second);
   document.getElementById('time-houston').innerText = houstonFormatted;
}

// LONDON
// London correspond to UTC directly, donesn't need an offset
function displayLondonTime() {
   let london = UTCTime();
   let londonFormatted = formatTime(london.year, london.month, london.day, london.hour,
      london.minute, london.second);
   document.getElementById('time-london').innerText = londonFormatted;
}

// NEW YORK
function displayNewYorkTime() {
   let newYork = considerOffsets(UTCTime(), offsets['newYork']);
   let newYorkFormatted = formatTime(newYork.year, newYork.month, newYork.day, newYork.hour, newYork.minute, newYork.second);
   document.getElementById('time-newYork').innerText = newYorkFormatted;
}

// SEATTLE
function displaySeattleTime() {
   let seattle = considerOffsets(new Date(), offsets['seattle']);
   let seattleFormatted = formatTime(seattle.year, seattle.month, seattle.day, seattle.hour, seattle.minute, seattle.second);
   document.getElementById('time-seattle').innerText = seattleFormatted;
}

// SYDNEY
function displaySydneyTime() {
   let sydney = considerOffsets(new Date(), offsets['sydney']);
   let sydneyFormatted = formatTime(sydney.year, sydney.month, sydney.day, sydney.hour, sydney.minute, sydney.second);
   document.getElementById('time-sydney').innerText = sydneyFormatted;
}

// TOKYO
function displayTokyoTime() {
   let tokyo = considerOffsets(new Date(), offsets['tokyo']);
   let tokyoFormatted = formatTime(tokyo.year, tokyo.month, tokyo.day, tokyo.hour, tokyo.minute, tokyo.second);
   document.getElementById('time-tokyo').innerText = tokyoFormatted;
}

// Set interval to update time every second
function start() {
   setInterval(function () {
      displayLocalTime();
      displayHoustonTime();
      displayLondonTime();
      displayNewYorkTime();
      displaySeattleTime();
      displaySydneyTime();
      displayTokyoTime();
   }, 1000); // Update every second
}

// Start updating the time when the page is loaded
window.onload = start;
