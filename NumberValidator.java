package com.jap.wrapper.wrapper;


public class NumberValidator {

    //validation rules to be written
    public int validateNumber(String input)
    {

        char[] checkarray = input.toCharArray();
        int count = 0;

        for (int i = 0; i < input.length(); i++)
        {
            int k = 65;
            for (k = 65; k < 122; k++)
            {
                if (checkarray[i] == (char) k)
                {
                    count++;
                }

            }
        }

        int result = 0;

        
        if (input==null)
        {
            result = -1;
        }

        else if (input.length()==0)
        {
            result = -1;
        }
		else if (count!=0)
		{
			long input2 = Long.parseLong(input);
		}
        else if (input.length()==10 && count==0) 
        {
            // converting string into int data type
            long input2 = Long.parseLong(input);

            // array created to store value of string after converting to int
            int[] array = new int[input.length()];


            // declaring variables
            int rem = 0;
            int sum = 0;
            long div = input2;

            // checking condition if ISBN number is equal to 10 digits

                int i = input.length() - 1;
                while (div > 0)
                {
                    rem =(int)div % 10;
                    array[i] = rem; 
                    i--;
                    div = div / 10;
                }


            // for loop to apply formula to validate ISBN number
            for (int l = 0, j = 10; l < input.length(); l++, j--) {
                sum = sum + array[l] * j;
            }

            if (sum % 11 == 0)
            {
                result = 1;
            }

            else if (sum % 11 != 0)
            {
                result = 0;
            }
        }

        return result;
    }
}
