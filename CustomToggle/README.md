Custom Toggle
=============

1. Taruh file image on / off di drawable
2. File drawable:
	- pilih.xml untuk animasi selector nya
	- custom_off / custom_on in xml fungsinya buat scale ukuran gambar
3. MainActivity.java
	StateListDrawable star = (StateListDrawable) togglebe.getBackground();
	star.setLevel(1000);
