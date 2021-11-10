package week9; 

public class BoolTest{

private int one;

public BoolTest(int newOne)

{

one = newOne;

}

public int getOne()

{

return one;

}

public boolean isGreater(BoolTest other){

    return one > other.one;

}

}