private InterstitialAd mInterstitialAd;
 private static final String TAG= "MainActivity";

//  here is all function //
   AddInitialization();
   loadFullScreenAdd();


//  When you want to show the add

showInterstitialAd();

// function here

         // Load an ad

   private void loadFullScreenAdd (){

        InterstitialAd.load(
                this,
                getString(R.string.test_id_interstitial),
                new AdRequest.Builder().build(),
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        Log.d(TAG, "Ad was loaded.");
                        MainActivity.this.mInterstitialAd = interstitialAd;
                        
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        Log.d(TAG, loadAdError.getMessage());
                        mInterstitialAd = null;
                    }
                }
        );

    }


// Initialize the Google Mobile Ads SDK


private void AddInitialization(){
    new Thread(
            () -> {
                // Initialize the Google Mobile Ads SDK on a background thread.
                MobileAds.initialize(this, initializationStatus -> {});
            })
            .start();
}




// Show the ad


private void showInterstitialAd() {
        if (mInterstitialAd != null) {
            mInterstitialAd.show(MainActivity.this);
        } else {
            Log.d(TAG, "The interstitial ad wasn't ready yet.");
        }
    }

