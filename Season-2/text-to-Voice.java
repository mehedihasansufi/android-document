 
 //Declaration of the text to Speach

 
 //Initialization
 
 textToSpeech = new TextToSpeech(MainActivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {

            }
        });


         textToSpeech.speak(""+edit_text.getText().toString(),TextToSpeech.QUEUE_FLUSH,null,null);

