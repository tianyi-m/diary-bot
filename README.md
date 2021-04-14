# diary-bot
A new way of writing diaries -- by talking to a simple bot.

### Disclaimer
This app is not yet available for download. For a demonstration of how this app works, please see the "How does it work?" section.

### Inspiration
I like to write diaries sometimes, but looking into a blank page, I usually don't know what to say, despite all the stuff that I WANT to say. This is why I want to make this little app. I feel like it would really help if someone asks me some easy prompts for me to answer and rant. This app does exactly that.

### How does it work?

After open the app, it will first ask you to name the diary.
![screenshot1](https://raw.githubusercontent.com/tianyi-m/diary-bot/main/assets/1.png "screenshot1")

Then, it will ask you some simple questions to guide you write out what you have to say.
![screenshot2](https://raw.githubusercontent.com/tianyi-m/diary-bot/main/assets/2.png "screenshot2")
![screenshot3](https://raw.githubusercontent.com/tianyi-m/diary-bot/main/assets/3.png "screenshot3")
![screenshot4](https://raw.githubusercontent.com/tianyi-m/diary-bot/main/assets/4.png "screenshot4")

After that, it will save your diary.
![screenshot5](https://raw.githubusercontent.com/tianyi-m/diary-bot/main/assets/5.png "screenshot5")

You can check all your diaries under the "data" folder.
![screenshot6](https://raw.githubusercontent.com/tianyi-m/diary-bot/main/assets/6.png "screenshot6")
![screenshot7](https://raw.githubusercontent.com/tianyi-m/diary-bot/main/assets/7.png "screenshot7")

### Some future features
I want to add a graphical interface to let the user check their previous diaries. It will be nice to be able to read through your diaries. A graphical interface will make it much easier to access past diaries. 

I also want to add some simple feedbacks after the user has answered each prompt, such as "Sorry to hear that" or "Congradulations", through some sentiment analysis APIs. I feel like it will be more like a relaxing conversation and less rigid. Now the app is mechanical, and it is not very good.

### Compilation requirements and guide
You will need to install Java and JavaFX and add them to your environment path. If you have done that, in Windows, simply open your command prompt, go to the src folder, and type the following command to run it:

java --module-path %PATH_TO_FX% --add-modules javafx.controls DiaryBot
