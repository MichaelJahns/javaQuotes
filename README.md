
### Instructions For Use
`git clone` this repository onto your machine

`cd` into this repo

#### For Intellij Users
1. Open Intellij
2. Build Project
3. Edit App's Configuration from the dropdown menu in the top right
4. Paste the path of the desired json in Program Arguments
5. Run app.java using the arrow in the top right
6. The parsed JSON will output to the console

#### For Command Line Users
1. Open your command line
2. Navigate to the repo you've cloned
3. Run `./gradlew run --args <filePath>` where file path is where the json youd like to parse is
  
 ##### example
  `./gradlew run --args src/main/resources/recentquotes.json`

