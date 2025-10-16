# Using hash-map & arrayList inflate layout

1.  create xml file that you want to inflate
2.  Then create ListView where you want to inlate xml file
3.  in java relation to listView to the id
4.  cretate custom Adapter class

## code in java file

```java

// This is the global 

ListView listView;

ArrayList<HashMap<String,String>> arrayList=new ArrayList<>();
HashMap<String,String> hashMap;

// Under oncreate function

 listView=findViewById(R.id.listView);

  hashMap=new HashMap<>();
        hashMap.put("name","mehedi");
        hashMap.put("phone","01768449468");
        arrayList.add(hashMap);

        hashMap=new HashMap<>();
        hashMap.put("name","Lia");
        hashMap.put("phone","01812572513");
        arrayList.add(hashMap);

        hashMap=new HashMap<>();
        hashMap.put("name","lubna");
        hashMap.put("phone","01765505020");
        arrayList.add(hashMap);

        Myadapter myadapter=new Myadapter();
        listView.setAdapter(myadapter);



// This is the class part
  private class Myadapter extends BaseAdapter{

        LayoutInflater layoutInflater;

        @Override
        public int getCount() {
            return arrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            layoutInflater= (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View myview=layoutInflater.inflate(R.layout.inflate,parent,false);


            TextView username=myview.findViewById(R.id.usersname);
            TextView phoneNumber=myview.findViewById(R.id.phoneNumber);


            HashMap<String,String> hashMap1=arrayList.get(position);
            username.setText(hashMap1.get("name"));
            phoneNumber.setText(hashMap1.get("phone"));
            return myview;
        }
    }
```
