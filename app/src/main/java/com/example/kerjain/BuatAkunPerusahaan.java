<?xml version="1.0" encoding="utf-8"?>
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="fill_parent"
    android:layout_height="fill_parent"
    tools:context=".BuatAkunPerusahaan"
    >

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_marginLeft="32dp"
        android:layout_marginRight="32dp"
        android:orientation="vertical"
        >

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content">

            <TextView
                android:id="@+id/buatakun"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginTop="16dp"
                android:textColor="#003B60"
                android:text="Buat Akun"
                android:textSize="32sp"/>

            <View
                android:layout_width="100dp"
                android:layout_height="5dp"
                android:layout_below="@id/buatakun"
                android:background="#34ABA1"/>

            <ImageView
                android:layout_width="60dp"
                android:layout_height="50dp"
                android:layout_alignParentRight="true"
                android:layout_marginTop="16dp"
                android:layout_marginRight="0dp"
                android:src="@drawable/companylogo" />

        </RelativeLayout>


        <EditText
            android:id="@+id/namaperusahaan"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="24dp"
            android:ems="8"
            android:hint="Nama Perusahaan*"
            android:inputType="textCapSentences|textPersonName"
            android:singleLine="true"
            android:textSize="20sp" />

        <EditText
            android:id="@+id/emailperusahaan"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="16dp"
            android:ems="8"
            android:hint="Alamat Email Perusahaan*"
            android:inputType="textEmailAddress"
            android:singleLine="true"
            android:textSize="20sp" />

        <EditText
            android:id="@+id/namapenanggungjawab"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="24dp"
            android:ems="8"
            android:hint="Nama Penanggung Jawab*"
            android:inputType="textCapSentences|textPersonName"
            android:singleLine="true"
            android:textSize="20sp" />


        <EditText
            android:id="@+id/nomorktp"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="16dp"
            android:ems="8"
            android:hint="No. KTP*"
            android:inputType="numberSigned"
            android:singleLine="true"
            android:maxLength="16"
            android:textSize="20sp" />

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="16dp"
            android:text="Lampirkan Foto KTP Penanggung Jawab"
            android:textColor="@android:color/black"
            android:textSize="18sp" />

        <RelativeLayout
            android:layout_width="wrap_content"
            android:layout_height="wrap_content">

            <ImageView
                android:layout_width="66dp"
                android:layout_height="63dp"
                android:layout_marginTop="8dp"
                android:background="@drawable/roundedborder" />

            <ImageView
                android:id="@+id/lampiranfotoktppenanggungjawab"
                android:layout_width="54dp"
                android:layout_height="52dp"
                android:layout_marginLeft="8dp"
                android:layout_marginTop="15dp"
                android:layout_marginRight="10dp"
                android:src="@drawable/insertimage" />
        </RelativeLayout>

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="16dp"
            android:text="No. Telepon*"
            android:textColor="@android:color/black"
            android:textSize="18sp" />

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content">

            <TextView
                android:id="@+id/kodenomortelp"
                android:layout_width="wrap_content"
                android:layout_height="match_parent"
                android:text="+62"
                android:textSize="30dp" />

            <EditText
                android:id="@+id/nomortelpon"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_alignBottom="@+id/kodenomortelp"
                android:layout_marginBottom="-11dp"
                android:layout_toRightOf="@+id/kodenomortelp"
                android:ems="10"
                android:inputType="phone"
                android:maxLength="12"
                android:singleLine="true"
                android:textSize="30sp" />

        </RelativeLayout>


        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="16dp"
            android:text="Pilih Provinsi*"
            android:textColor="@android:color/black"
            android:textSize="18sp" />

        <Spinner
            android:id="@+id/provinsi"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="8dp"
            android:background="@android:drawable/btn_dropdown"
            android:dropDownWidth="wrap_content"
            android:spinnerMode="dropdown" />

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="8dp"
            android:text="Pilih Kota / Kabupaten*"
            android:textColor="@android:color/black"
            android:textSize="18sp" />

        <Spinner
            android:id="@+id/kotakabupaten"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="8dp"
            android:background="@android:drawable/btn_dropdown"
            android:dropDownWidth="wrap_content"
            android:spinnerMode="dropdown" />

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="8dp"
            android:text="Pilih Kecamatan*"
            android:textColor="@android:color/black"
            android:textSize="18sp" />

        <Spinner
            android:id="@+id/kecamatan"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="8dp"
            android:background="@android:drawable/btn_dropdown"
            android:dropDownWidth="wrap_content"
            android:spinnerMode="dropdown" />

        <EditText
            android:id="@+id/kodepos"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="24dp"
            android:ems="8"
            android:hint="Kode Pos"
            android:inputType="numberSigned"
            android:singleLine="true"
            android:maxLength="5"
            android:textSize="20sp" />

        <EditText
            android:id="@+id/alamatlengkap"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="24dp"
            android:ems="8"
            android:hint="Alamat Lengkap"
            android:inputType="textMultiLine|textPostalAddress"
            android:textSize="20sp" />

        <EditText
            android:id="@+id/nomornpwp"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="24dp"
            android:ems="8"
            android:hint="No. NPWP*"
            android:inputType="numberSigned"
            android:singleLine="true"
            android:maxLength="16"
            android:textSize="20sp" />

        <EditText
            android:id="@+id/nomorsiup"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="24dp"
            android:ems="8"
            android:hint="No. SIUP"
            android:inputType="numberSigned"
            android:singleLine="true"
            android:maxLength="16"
            android:textSize="20sp" />

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="16dp"
            android:text="Lampirkan Foto Gedung Perusahaan"
            android:textColor="@android:color/black"
            android:textSize="18sp" />

        <RelativeLayout
            android:layout_width="wrap_content"
            android:layout_height="wrap_content">

            <ImageView
                android:layout_width="66dp"
                android:layout_height="63dp"
                android:layout_marginTop="8dp"
                android:background="@drawable/roundedborder" />

            <ImageView
                android:id="@+id/lampiranfotogedungperusahaan"
                android:layout_width="54dp"
                android:layout_height="52dp"
                android:layout_marginLeft="8dp"
                android:layout_marginTop="15dp"
                android:layout_marginRight="10dp"
                android:src="@drawable/insertimage" />
        </RelativeLayout>


        <Button
            android:id="@+id/masuk"
            android:layout_width="250dp"
            android:layout_height="60dp"
            android:layout_gravity="center_horizontal"
            android:layout_marginTop="16dp"
            android:layout_marginBottom="8dp"
            android:background="@drawable/roundedbuttonblue"
            android:text="Submit"
            android:textColor="#003B60"
            />

    </LinearLayout>
</ScrollView>
