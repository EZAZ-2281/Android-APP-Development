activity_main.xml 
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity"
    android:orientation="vertical">

    <TextView
        android:layout_width="match_parent"
        android:layout_height="80dp"
        android:text="Hello World"
        android:textSize="30dp"
        android:background="@drawable/custom_style"
        android:textColor="@color/black"
        android:layout_margin="20dp"
        android:gravity="center"/>


</LinearLayout>  
```
custom_style.xml 
```
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android"
    android:shape="rectangle"
    >

    <gradient
        android:startColor="#FFC107"
        android:endColor="#FF5722"
        android:angle="90"
        />
    <stroke
        android:width="4dp"
        android:color="#0787ED"
        />
    <corners
        android:radius="10dp"
        />
</shape>
```
