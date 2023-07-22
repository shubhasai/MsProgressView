# MsProgressView
[![](https://jitpack.io/v/shubhasai/MsProgressView.svg)](https://jitpack.io/#shubhasai/MsProgressView)

MsProgressView is an Android library that provides customizable circular and horizontal progress views to display ongoing tasks, loading animations, or any other progress indication purposes.

## Features

- Circular Progress View: A customizable circular progress view with various styles and animation options.
- Horizontal Progress View: A customizable horizontal progress view for linear progress display.
- Fill Progress View: A customizable fill progress view with various shapes (circle, heart, cloud, upload, hour clock) and animation options.
- Easy Integration: Simple integration with your Android project using Gradle or Maven.
- Customizable Appearance: Customize the colours, sizes, and other attributes to match your app's design.
- Progress Indicators: Show progress in percentages or any other appropriate format.

<img src="https://github.com/shubhasai/MsProgressView/assets/78340623/1031bb99-8c32-46e6-acc7-161b7d95f75c" alt="Image" width="180" height="300">


## Integration 
You can install the library by adding the following dependency to your project:

Step 1: Add this to setting.gradle file
```gradle
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

Step 2: Add this to your App Level Gradle File: (Replace the Tag with the Latest Version of the MsProgressView)
```gradle
dependencies {
	        implementation 'com.github.shubhasai:MsProgressView:Tag'
	}
```

## Examples

1. Horizontal Progress View:
   ```kotlin
   HorizontalProgress(percentage =0.5f,
                            number = 100,
                            modifier = Modifier
                            .padding(16.dp))
   ```
   Preview:
   
   <img src="https://github.com/shubhasai/MsProgressView/assets/78340623/98ef0059-e6a9-4be9-b8d7-fa6c36b127d8" alt="Image" width="150" height="300">
2. Circular Progress View:
   ```kotlin
   CircularProgress(percentage =0.85f,
                            number = 100,
                            modifier = Modifier
                            .padding(16.dp))
   ```
   Preview:
   
   <img src="https://github.com/shubhasai/MsProgressView/assets/78340623/4e70b452-aa24-4656-9ada-864a8fe1374d" alt="Image" width="150" height="300">

   ## More Customization :

   1. Horizontal Progress View:
      
        | Parameter           	| Purpose                                   	| Default Value   	|
        |---------------------	|-------------------------------------------	|-----------------	|
        | Modifier            	| Modifier for the composable function      	| Modifier        	|
        | percentage          	| Progress percentage value                 	| Float           	|
        | number              	| Max Progress value in Integer                 | Int             	|
        | fontSize            	| Font size for the text                    	| 28.sp           	|
        | width               	| Width of the progress view                	| 350.dp          	|
        | height              	| Height of the progress view               	| 50.dp           	|
        | color               	| Color of the progress indicator           	| Color.Blue      	|
        | animDuration        	| Duration of the animation in milliseconds 	| 1000            	|
        | animDelay           	| Delay before the animation starts         	| 0               	|
        | radius              	| Corner radius of the progress view        	| 20.dp           	|
        | backgroundColor     	| Background color of the progress view     	| Color.LightGray 	|
        | textColor           	| Color of the text                         	| Color.Black     	|
        | percentageTextColor 	| Color of the percentage text              	| Color.White     	|
        | percentageTextSize  	| Font size for the percentage text         	| 20.sp           	|


   2. Circular Progress View:

      | Parameter      | Purpose                                | Value         |
      |----------------|----------------------------------------|---------------|
      | Modifier       | Modifier for the composable function   | Modifier      |
      | percentage     | Progress percentage value              | Float         |
      | number         | Max Progress value in Integer          | Int           |
      | fontSize       | Font size for the text                 | 28.sp         |
      | radius         | Radius of the circular progress view   | 50.dp         |
      | color          | Color of the progress indicator        | Color.Blue    |
      | strokeWidth    | Width of the progress indicator        | 8.dp          |
      | animDuration   | Duration of the animation (in ms)      | 1000          |
      | animDelay      | Delay before the animation starts      | 0             |
      | capRounded     | Whether to use rounded line cap        | true          |
      | startAngle     | Starting angle of the progress arc     | -90f          |
      | maxAngle       | Maximum angle of the progress arc      | 360f          |
      | textColor      | Color of the text                      | Color.Black   |
      | useCenter      | Whether to include centre in the arc   | false         |

## New Features (Version: 1.0.3)
1. Circular Fill Progress
2. Heart Fill Progress
3. HourGlass Fill Progress
4. Upload Fill Progress
5. CloudUpload Fill Progress
Examples:
```kotlin
Column {
                        HorizontalProgress(percentage =0.85f,
                            number = 100,
                            modifier = Modifier
                                .padding(16.dp))
                        CircularProgress(percentage =0.85f,
                            number = 100,
                            modifier = Modifier
                            .padding(16.dp))
                        
                        CircularFillProgress(percentage = 0.65f, number =100, viewSize = 100.dp,
                            modifier = Modifier
                                .padding(16.dp)
                                .size(100.dp), textColor = Color.White, fillColor = Color.Blue, fontSize = 14.sp, animDuration = 2000)
                        Row() {
                            HeartFillProgress(percentage = 0.75f, number =100, viewSize = 100.dp,
                                modifier = Modifier
                                    .padding(16.dp)
                                    .size(100.dp), fontSize = 14.sp, textColor = Color.White, fillColor = Color.Red, animDuration = 2000)
                            HourGlassFillProgress(percentage = 0.8f, viewSize = 100.dp,
                                modifier = Modifier
                                    .padding(16.dp)
                                    .size(100.dp), animDuration = 2000)
                        }
                        Row() {
                            UploadFillProgress(percentage = 0.5f, viewSize = 100.dp,
                                modifier = Modifier
                                    .padding(16.dp)
                                    .size(100.dp), animDuration = 2000)
                            CloudUploadFillProgress(percentage = 0.5f, viewSize = 100.dp,
                                modifier = Modifier
                                    .padding(16.dp)
                                    .size(100.dp), animDuration = 2000)
                        }
                        
                    }
```
### Preview:
https://github.com/shubhasai/MsProgressView/assets/78340623/f1e261b8-3b04-4126-b0fc-8b6e16b9f67d

