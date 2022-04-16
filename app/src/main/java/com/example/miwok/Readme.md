This is a tutorial project that I've done on Udacity. It's a Miwok language learning app.
This app has 4 horizontally scrollable tabs with a reference listview that consists 2 image, 2 textviews and audio(if clicked). There are 4 parts(swipable tabs) Colors, Family Members, Numbers and Phrases.
1st created some Fragments where these things I've done:
Adding AudioManager.AudioFoucs class that shares intructions while in runtime with MediaPlayer class.
Nextly I've added multiple types of data within an object type Word in an (ArrayList<Word> words(Word is class-type)) multiple times and accessed it with an ArrayAdapter named WordAdapter.
WordAdapter is configured with getView() to collect data from every "words" objects and store it in a Relative Layout container.
Fragments are also inflating a ListView and WordAdapter is connected with these Fragments with .setAdapter().
Now 2ndly created a CategoryAdapter.java which is extended from FragmentPagerAdapter class.
CategoryAdapter manages position informations while user is swipping, which will redirect to a certain Fragment and I also assigned titles to each fragments.
After that 3rdly, I've added ViewPager and TabLayout feature in activity_main.xml.
Then that CategoryAdapter is connected with this ViewPger with .setAdapter() and used setUpWithViewpager() to connect the TabLayout with this ViewPager.
In this way all those pieces that are scattered throught the entire codebase is now connected with each other in a systematically manner while ensuring that our user is having a good time learning Miwok language.