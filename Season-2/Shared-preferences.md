## Shared preferences

```java

 SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    
    //introduce
    
    sharedPreferences=getSharedPreferences(getString(R.string.app_name),MODE_PRIVATE);
        editor=sharedPreferences.edit();
        
        
        //for save data
        
         buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=edName.getText().toString();

                editor.putString("name",""+name);
                editor.apply();

            }
        });
        
        
        //for find data
        
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=sharedPreferences.getString("name","default");
                display.setText(""+name);
            }
        });