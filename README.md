# text2speech-for-android
this is android text to speech tool

## gradle
```
dependencies {
    compile 'com.liangmayong:text2speech:1.0.1'
}
```
## Speech
```
 //最后一个参数表示播放后是否删除音频文件
 Text2Speech.speech(this, "你有新的消息，请注意查收！", false);
```
## load
```
 Text2Speech.load(this,"你有新的消息，请注意查收！");
```
## preview
![image](https://raw.githubusercontent.com/LiangMaYong/text2speech-for-android/master/preview/preview.png)
## 更新说明
1.0.1 版本：添加中英文识别控制，默认speech调用会自动分词

1.0.0 版本：首次发布
##技术交流
交流：QQ群297798093

email：ibeam@qq.com
##License
```
The MIT License (MIT)

Copyright (c) 2016 LiangMaYong

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
