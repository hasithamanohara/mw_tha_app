# THA_APP

## Overview
This Android application serves as a Product Management Application tailored for "Cake Bakers". It allows users to add, remove, and edit products within a local database.

### Tasks Covered:
1. **Admin View**:
   - Implemented SQLite Database with a single table to store product details.
   - Developed an activity using RecyclerView and an adapter to display product information.
   - Displayed a random image among different options without storing images in the database.
   - Provided an Edit button leading to a new pre-filled Activity with selected cell information.

2. **Add, Edit, and Update View**:
   - Created an activity with TextViews, EditText fields, and Buttons.
   - Applied logic for pre-filling EditText fields based on Add or Edit invocation.
   - Dynamically displayed buttons (Add, Update, Delete) based on user interaction.

3. **Validations and Alerts**:
   - Implemented mandatory field checks.
   - Applied XML-based validation for the description not exceeding a specific character limit.
   - Configured Price EditText to accept only numbers and limited decimal places.
   - Implemented proper lifecycle methods for application functions.

### How to Run:
1. Download the project zip file.
2. Extract the contents.
3. Open the project in Android Studio.
4. Build and run the application on an Android device or emulator.
