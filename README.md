# ProgressLine
---

---
###Demo

![NumberProgressBar](http://ww3.sinaimg.cn/mw690/610dc034jw1efyrd8n7i7g20cz02mq5f.gif)

[Download Demo](https://github.com/daimajia/NumberProgressBar/releases/download/v1.0/NumberProgressBar-Demo-v1.0.apk)

###Usage
---

#### Gradle

```groovy
dependencies{
  compile 'com.daimajia.numberprogressbar:library:1.2@aar'
}
```

#### Maven

```xml
<dependency>
    <groupId>com.daimajia.numberprogressbar</groupId>
    <artifactId>library</artifactId>
    <version>1.2</version>
    <type>apklib</type>
</dependency>
```

Use it in your own code code:

```java
<com.daimajia.numberprogressbar.NumberProgressBar
		android:id="@+id/number_progress_bar"
		android:layout_width="wrap_content"
		android:layout_height="wrap_content"
	/>
```

I made some predesign style.U can use them via `style` property.

![Preset](http://ww1.sinaimg.cn/mw690/610dc034jw1efyslmn5itj20f30k074r.jpg)

Use the preset style just like below:

```java
<com.daimajia.numberprogressbar.NumberProgressBar
		android:id="@+id/number_progress_bar"
		style="@style/NumberProgressBar_Default"
	/>
```

In the above picture,the style is:

`NumberProgressBar_Default`
`NumberProgressBar_Passing_Green`
`NumberProgressBar_Relax_Blue`
`NumberProgressBar_Grace_Yellow`
`NumberProgressBar_Warning_Red`
`NumberProgressBar_Funny_Orange`
`NumberProgressBar_Beauty_Red`
`NumberProgressBar_Twinkle_Night`

U can get some more beautiful color from [kuler](https://kuler.adobe.com)

###Bulid

run `gradlew.bat assembleDebug` (Win)

or

run `./gradlew assembleDebug` (Mac/Linux)

###Attributes

There are several attributes u can set:

![](http://ww2.sinaimg.cn/mw690/610dc034jw1efyttukr1zj20eg04bmx9.jpg)

The **readched area** and **unreached area**:

* color
* height

The **text area**:

* color
* text size
* visibility
* distance between **reached area** and **unreached area**

The **bar**:
* max progress
* current progress

for example, the default style:

```java
	<com.daimajia.numberprogressbar.NumberProgressBar
	        android:layout_width="wrap_content"
	        android:layout_height="wrap_content"
	        
	        custom:progress_unreached_color="#CCCCCC"
	        custom:progress_reached_color="#3498DB"
	        
	        custom:progress_unreached_bar_height="0.75dp"
	        custom:progress_reached_bar_height="1.5dp"
	        
	        custom:progress_text_size="10sp"
	        custom:progress_text_color="#3498DB"
	        custom:progress_text_offset="1dp"
	        custom:progress_text_visibility="visible"
	        
	        custom:max="100"
	        custom:progress="80"
	         />
```


 















