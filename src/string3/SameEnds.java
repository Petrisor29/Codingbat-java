public String sameEnds(String string) {
  
  String result = "";
  int i = 0;
  int n = string.length();
  
  while(i < n / 2){
    String first = string.substring(0, i + 1);
    String last = string.substring(n - (i + 1));
    
    if(first.equals(last)){
      result = first;
    }
    i++;

  }
  
  return result;
  
  
}
