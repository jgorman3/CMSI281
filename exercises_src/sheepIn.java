//my solution --- passed 75% of tests
//public boolean sleepIn(boolean weekday, boolean vacation) {
//  if ((weekday == false) && (vacation == false)) {
//    return true;
//  }
//  else if ((weekday == true) && (vacation == false)) {
//    return false;
//  }
//  else if ((weekday == false) && (vacation == true)) {
//    return true;
//  }
//  else if ((weekday == true) && (vacation == true)) {
//    return false;
//  }
//  return false;
//}

//their solution
public boolean sleepIn(boolean weekday, boolean vacation) {
  if (!weekday || vacation) {
    return true;
  }
  return false;
}
