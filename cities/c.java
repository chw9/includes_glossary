HashMap<String, Integer> majorCities = new HashMap<String, Integer>();

    majorCities.put("New York", 1624);
    majorCities.put("London", 43);
    
    for ( String city : majorCities.keySet() ) {
    
      System.out.println(city + " was founded in " + majorCities.get(city));
      
      }
  
// comment
