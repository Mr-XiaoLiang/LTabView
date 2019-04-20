# LTabView

<p align="left">
	<a >
        <img src="https://img.shields.io/badge/language-kotlin-blue.svg">
    </a>
	<a >
        <img src="https://img.shields.io/badge/platform-Android-green.svg">
    </a>
	<a >
        <img src="https://img.shields.io/badge/license-GPL-red.svg">
    </a>
    <a href="https://travis-ci.org/Mr-XiaoLiang/LTabView">
         <img src="https://travis-ci.org/Mr-XiaoLiang/LTabView.svg?branch=master">
    </a>
    <a>
        <img alt="GitHub Releases" src="https://img.shields.io/github/downloads/Mr-XiaoLiang/LTabView/1.0/total.svg">
    </a>
    <a>
        <img alt="GitHub release" src="https://img.shields.io/github/release/Mr-XiaoLiang/LTabView.svg">
    </a>
    <a>
        <img alt="GitHub commit activity" src="https://img.shields.io/github/commit-activity/y/Mr-XiaoLiang/LTabView.svg">
    </a>
    <a>
        <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/Mr-XiaoLiang/LTabView.svg">
    </a>
</p>

----------
_这是一个带有动画的 TabView_
项目起源于一个 Gif 图片，就是下图。（不过没有找到作者，如果你知道的话，请联系我。我增加作者署名，或者侵删。）
出于兴趣，于是有了这个项目。
![原图](https://github.com/Mr-XiaoLiang/LTabView/raw/master/preview/tab-ui-final.gif)

#### 成果
![Tab切换效果](https://raw.githubusercontent.com/Mr-XiaoLiang/LTabView/master/preview/preview1.gif)
![布局切换效果](https://raw.githubusercontent.com/Mr-XiaoLiang/LTabView/master/preview/preview2.gif)
![排版切换效果](https://raw.githubusercontent.com/Mr-XiaoLiang/LTabView/master/preview/preview2.gif)

#### 使用方法

使用方法相对简单，直接通过静态辅助类，绑定到`LTabView`之后，就可以直接开始`addItem`了，得益于`Kotlin`的语法，可以直接链式添加。更多使用，可以参考源码中的`Demo`。

``` kotlin
	val tabHelper = LTabHelper.withExpandItem(tabView)
            .addItem {
                val color = ContextCompat.getColor(this@MainActivity, R.color.purple)
                setIcon(R.drawable.ic_home_black_24dp)
                selectedIconColor = color
                unselectedIconColor = Color.BLACK
                textColor = color
                expandColor = color and 0x60FFFFFF
                text = "Home"
            }.addItem {
                val color = ContextCompat.getColor(this@MainActivity, R.color.pink)
                setIcon(R.drawable.ic_favorite_border_black_24dp)
                selectedIconColor = color
                unselectedIconColor = Color.BLACK
                textColor = color
                expandColor = color and 0x60FFFFFF
                text = "Like"
            }.addItem {
                val color = ContextCompat.getColor(this@MainActivity, R.color.orange)
                setIcon(R.drawable.ic_whatshot_black_24dp)
                selectedIconColor = color
                unselectedIconColor = Color.BLACK
                textColor = color
                expandColor = color and 0x60FFFFFF
                text = "Hot"
            }.addItem {
                val color = ContextCompat.getColor(this@MainActivity, R.color.blue)
                setIcon(R.drawable.ic_person_black_24dp)
                selectedIconColor = color
                unselectedIconColor = Color.BLACK
                textColor = color
                expandColor = color and 0x60FFFFFF
                text = "Center"
            }
        tabHelper.layoutStyle = LTabView.Style.Start
        tabHelper.onSelected {
            textView.text = "selected ：$it"
        }
```



