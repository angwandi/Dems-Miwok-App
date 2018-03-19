package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

/*
//Create an array of words
//Not need for anymore as we will use ArrayList for better performance and save memory when used with Adapter and listView
String[] words = new String[10];
words[0] = "one";
words[1] = "two";
words[2] = "three";
words[3] = "four";
words[4] = "five";
words[5] = "six";
words[6] = "seven";
words[7] = "eight";
words[8] = "nine";
words[9] = "ten";
//Create a list of word using ArrayList
// Create a list of single words

ArrayList<String> words = new ArrayList<>();
words.add("one");
words.add("two");
words.add("three");
words.add("four");
words.add("five");
words.add("six");
words.add("seven");
words.add("eight");
words.add("nine");
words.add("ten");
CREATING A list of double words using the list_item and the Word class
*/

        ArrayList<Word> words = new ArrayList<>();

//        //Creating a Word object and add to the list
//        Word w = new Word("one","lutti");
//        words.add(w);

        // or :
        words.add(new Word("one","lutti"));
        words.add(new Word("two","otiiko"));
        words.add(new Word("three","tolookosu"));
        words.add(new Word("four","oyyisa"));
        words.add(new Word("five","massoka"));
        words.add(new Word("six","temmoka"));
        words.add(new Word("seven","kenekaku"));
        words.add(new Word("eight","kawinta"));
        words.add(new Word("nine","wo'e"));
        words.add(new Word("ten","na'aacha"));

        //Log.v("","" + words.get(0)); : to check if the list was created properly

//        //connect to the LinearLayout
//        LinearLayout rootView = findViewById(R.id.rootView);

//        //adding words manually to the rootView LinearLayout

//        TextView wordView = new TextView(this); //TextView using only one constructor: TextView Public method
//        wordView.setText(words.get(0));
//        rootView.addView(wordView);


//        //USING while LOOP WHICH IS EASIER TO ADD WORDS TO THE LINEARLAYOUT ROOTVIEW USING THE ARRAYLIST
//
//        // Create a variable to keep track of the current index position
//        int index = 0;
//
//        // Keep looping until we've reached the end of the list (which means keep looping
//        // as long as the current index position is less than the length of the list)
//        while (index < words.size()) {
//
//            // Create a new TextView
//            TextView wordView = new TextView(this);
//
//            // Set the text to be word at the current index
//            wordView.setText(words.get(index));
//
//            // Add this TextView as another child to the root view of this layout
//            rootView.addView(wordView);
//
//            // Increment the index variable by 1
//            index++;
//        }


        //USING for LOOP WHICH IS EASIER TO ADD WORDS TO THE LINEARLAYOUT ROOTVIEW USING THE ARRAYLIST

        // Keep looping until we've reached the end of the list (which means keep looping
        // as long as the current index position is less than the length of the list).
        // The index variable keeps track of our current position in the list and
        // increments by 1 each time the code in the loop is executed.
//
//        for (int index = 0; index < words.size(); index++) {
//
//            // Create a new TextView
//            TextView wordView = new TextView(this);
//
//            // Set the text to be word at the current index
//            wordView.setText(words.get(index));
//
//            // Add this TextView as another child to the root view of this layout
//            rootView.addView(wordView);
//        }


//
        //USING ArrayAdapter AND ListView for memory management
//
////         Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
////         adapter knows how to create layouts for each item in the list, using the
////         simple_list_item_1.xml layout resource defined in the Android framework.
////         This list item layout contains a single {@link TextView}, which the adapter will set to
////         display a single word.
//
////        ArrayAdapter<String> itemsAdapter =
////                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, words); //Constructor with 3 inputs
//
//
//        //Using the Word class and the list_item
//        ArrayAdapter<Word> itemsAdapter =
//                new ArrayAdapter<>(this,R.layout.list_item, words);
//
//
//        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
//        // There should be a {@link ListView} with the view ID called list, which is declared in the
//        // word_list.xml file.
//        ListView listView = findViewById(R.id.list);
//
//        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
//        // {@link ListView} will display list items for each word in the list of words.
//        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
//        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
//
//        listView.setAdapter(itemsAdapter);
//



        //USING WordAdapter

        WordAdapter Adapter =
                new WordAdapter(this,words);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(Adapter);





//        //USING GridView
//
//        ArrayAdapter<String> itemsAdapter =
//                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, words); //Constructor with 3 inputs
//
//        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
//        // There should be a {@link ListView} with the view ID called list, which is declared in the
//        // word_listyout file.
//        GridView gridView = findViewById(R.id.list);
//
//        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
//        // {@link ListView} will display list items for each word in the list of words.
//        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
//        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
//
//        gridView.setAdapter(itemsAdapter);

    }
    }

