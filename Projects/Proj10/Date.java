// Fig. 8.5: Time2.java
// Time2 class declaration with overloaded constructors.  

public class Date
{
	private int secondsSinceMidnight; // 0 - 86399 Minutes Since Midnight

   // Time2 no-argument constructor: 
   // initializes each instance variable to zero
   public Date()
   {
      this(0, 0, 0); // invoke constructor with three arguments
   } 

   // Time2 constructor: hour supplied, minute and second defaulted to 0
   public Date(int hour) 
   { 
      this(hour, 0, 0); // invoke constructor with three arguments
   } 

   // Time2 constructor: hour and minute supplied, second defaulted to 0
   public Date(int hour, int minute) 
   { 
      this(hour, minute, 0); // invoke constructor with three arguments
   } 

   // Time2 constructor: hour, minute and second supplied
   public Date(int hour, int minute, int second) 
   { 
      if (hour < 0 || hour >= 24)
         throw new IllegalArgumentException("hour must be 0-23");

      if (minute < 0 || minute >= 60)
         throw new IllegalArgumentException("minute must be 0-59");

      if (second < 0 || second >= 60)
         throw new IllegalArgumentException("second must be 0-59");

      this.secondsSinceMidnight = hour * 3600; // Hour
      this.secondsSinceMidnight += minute * 60; // Minute
      this.secondsSinceMidnight += second; // Second
   } 

   // Time2 constructor: another Time2 object supplied
   public Date(Time2 time)
   {
      // invoke constructor with three arguments
      this(time.getHour(), time.getMinute(), time.getSecond());
   } 

   // Set Methods
   // set a new time value using universal time; 
   // validate the data
   public void setTime(int hour, int minute, int second)
   {
      if (hour < 0 || hour >= 24)
         throw new IllegalArgumentException("hour must be 0-23");

      if (minute < 0 || minute >= 60)
         throw new IllegalArgumentException("minute must be 0-59");

      if (second < 0 || second >= 60)
         throw new IllegalArgumentException("second must be 0-59");

      this.secondsSinceMidnight = hour * 3600; // Hour
      this.secondsSinceMidnight += minute * 60; // Minute
      this.secondsSinceMidnight += second;  // Second
   } 

   // validate and set hour 
   public void setHour(int hour) 
   { 
      if (hour < 0 || hour >= 24)
         throw new IllegalArgumentException("hour must be 0-23");

      this.secondsSinceMidnight = hour * 3600;  // Hours into Seconds
   } 

   // validate and set minute 
   public void setMinute(int minute) 
   { 
      if (minute < 0 || minute >= 60)
         throw new IllegalArgumentException("minute must be 0-59");

      this.secondsSinceMidnight += minute * 60; // Minutes into Seconds
   } 

   // validate and set second 
   public void setSecond(int second) 
   { 
      if (second < 0 || second >= 60)
         throw new IllegalArgumentException("second must be 0-59");

       this.secondsSinceMidnight += second;  // Seconds into Seconds
   } 

   // Get Methods
   // get hour value
   public int getHour() 
   {
	  int hours = 0;
	  hours = this.secondsSinceMidnight / 3600; // Unconverting Hour
      return hours; 
   } 

   // get minute value
   public int getMinute() 
   { 
	   int hours = 0;
	   int minutes = 0;
	   int tempHours = 0;
	   int tempMins = 0;
	   hours = this.secondsSinceMidnight / 3600;
	   tempHours = hours * 3600;
	   tempMins = this.secondsSinceMidnight - tempHours;
	   minutes = tempMins / 60;
	   
	   return minutes; 
   } 

   // get second value
   public int getSecond() 
   { 
	   int hours = 0;
	   int minutes = 0;
	   int seconds = 0;
	   int tempHours = 0;
	   int tempMins = 0;
	   int tempSecs = 0;
	   hours = this.secondsSinceMidnight / 3600;
	   tempHours = hours * 3600;
	   tempMins = this.secondsSinceMidnight - tempHours;
	   minutes = tempMins / 60;
	   tempSecs = minutes * 60;
	   seconds = tempMins - tempSecs;
	   
      return seconds; 
   } 

   // convert to String in universal-time format (HH:MM:SS)
   public String toUniversalString()
   {
      return String.format(
         "%02d:%02d:%02d", getHour(), getMinute(), getSecond());
   } 

   // convert to String in standard-time format (H:MM:SS AM or PM)
   public String toString()
   {
      return String.format("%d:%02d:%02d %s", 
         ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
         getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
   } 
} // end class Time2