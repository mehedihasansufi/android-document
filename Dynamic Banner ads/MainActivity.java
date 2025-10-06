

  AdView adView;





private void showBannerAdd() {


        // Create a new ad view.
        adView = new AdView(this);
        adView.setAdUnitId(getString(R.string.test_id_banner));
// Request an anchored adaptive banner with a width of 360.
        adView.setAdSize(AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(this, 360));

// Replace ad container with new ad view.
        lay_add.removeAllViews();
        lay_add.addView(adView);


        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
    }
