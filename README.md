This project allows you to choose the item from the list of products.

User can add and remove the item to the cart and can see the cart information in the shopping cart screen.


Installing

Steps to run the project using the command line:

Get the project locally:
git clone https://github.com/Kiran0004/Shoppingcart.git

Navigate to the /app folder and execute assemblDebug command from Gradle Wrapper:
./gradlew assembleDebug After the build, app-debug.apk can be found inside your project dir using this path app/build/outputs/apk/debug/
Using adb install project directly to a device or emulator using the command below:
adb install app/build/outputs/apk/debug/app-debug.apk
You can also use Android Studio for that purpose either: VSC -> Git -> Clone Insert URL https://github.com/Kiran0004/Shoppingcart.git

and press Clone button. Android Studio will clone and build the project after you are good to run the App pressing Run button at the top with the default configuration. Project tech stack

Kotlin


Architecture components

Gson

picasso

