package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        // create a `counter`
        int counter = 0;
        // while `counter` is less than length of array
            // begin loop
        while (counter < personArray.length) {


            Person currentPerson = personArray[counter];
            String stringRepresentation = currentPerson.toString();
            result += stringRepresentation;
            counter++;
        }


                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop
        return result;
    }



    public String forLoop() {
        String result = "";
        for (int i =0; i< personArray.length;i++)
        // identify initial value
        // identify terminal condition
        // identify increment
        {
            Person currentPerson;
            currentPerson = personArray[i];
            String stringRepresentation = currentPerson.toString();
            result = result + stringRepresentation;
        }
        // use the above clauses to declare for-loop signature
            // begin loop
        //for (int i = 0);
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }



    public String forEachLoop() {
        String result = "";

        // identify array's type
        //Person currentPerson
        // identify array's variable-name
         //       personArray
        // use the above discoveries to declare for-each-loop signature
            // begin loop
        for ( Person currentPerson    : personArray)
        {
            String stringRepresentation = currentPerson.toString();
            result = result + stringRepresentation;
        }
                // get `string Representation` of `currentPerson`

                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
