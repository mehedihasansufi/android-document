
       ConnectivityManager connectivityManager= (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
       NetworkInfo networkInfo=connectivityManager.getActiveNetworkInfo();


         if(networkInfo!=null && networkInfo.isConnected() ){
          
       }