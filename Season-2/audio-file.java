  MediaPlayer mediaPlayer;

 //song in my folder

   button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               

                if(mediaPlayer!=null) mediaPlayer.release();
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.music1);
                mediaPlayer.start();
            }
        });


  //song in Server in my own


   button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              
                if(mediaPlayer!=null) mediaPlayer.release();
                mediaPlayer=new MediaPlayer();

                try {
                    mediaPlayer.setDataSource("here is the link of the song ");
                    mediaPlayer.prepare();
                    mediaPlayer.start();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });



