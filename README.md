# text2speech-for-android
this is android text to speech tool

## gradle
```
dependencies {
    compile 'com.liangmayong:text2speech:1.0.0'
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

##技术交流
交流：QQ群297798093

email：ibeam@qq.com
##License
```
Copyright 2016 LiangMaYong

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
