# FlexibleViewDemo
**引入**

 1. 第一步
  
   
  
```
 allprojects {
      repositories {
        ...
        maven { url 'https://jitpack.io' }
      }
    }
```
      
  
 1. 第二步
  
    
  
```
dependencies {
	        implementation 'com.github.CY12:FlexibleViewDemo:Tag'
	}
```
  
**使用方式**  
  		
  
 1. 动态创建View
  
      
  
	```
		TextView textView = new TextView(this);
	    textView.setText("RelativeLayout动态添加VIEW");
	    textView.setTextSize(20);
	    FlexibleViewTools.withRelative(textView,relative).setGravity(RelativeViewPart.CENTER_IN_PARENT);// relative 是textView放在该布局下的viewgroup
	```
          
  
 2. 已经存在的View
  
        TextView textView1 = new TextView(this);
        textView1.setText("FlexibleViewTools rlRelative");
        textView1.setTextSize(20);
        FlexibleViewTools.withRelative(textView1,rlRelative).setGravity(RelativeViewPart.CENTER_IN_PARENT);

        FlexibleViewTools.withRelative(tvRelative).setTop(100).setGravity(FlexibleViewTools.ALIGN_TOP).setGravity(FlexibleViewTools.CENTER_HORIZONTAL);// 设置RelativeLayout 下view上边距100，横向居中  

        FlexibleViewTools.withLinear(tvLinear).setLeft(200).setTop(100);//设置LinearLayout下view的左边距和上边距200

