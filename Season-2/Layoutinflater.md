## Layoutinflater

```java

//only xml code

<include
        layout="@layout/inflate"
        />
        
       // with java add  
        LinearLayout inflateLayout;
        layoutInflater= (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
         View view1=layoutInflater.inflate(R.layout.inflate,inflateLayout);
         
         
         
         //for list view
         
         myListView=findViewById(R.id.myListView);
        Myadapter myadapter=new Myadapter();
        myListView.setAdapter(myadapter);
        
        
       private class Myadapter extends BaseAdapter {
        LayoutInflater layoutInflater;

        @Override
        public int getCount() {
            return 1;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            layoutInflater= (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View myview=layoutInflater.inflate(R.layout.item,viewGroup,false);
            return myview;
        }
    }