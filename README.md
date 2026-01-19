# 💡 Smart Light Controller

**Smart Light Controller** is an Android application designed to give users intuitive control over smart lighting systems. The app provides a seamless interface to manage individual lights, allowing users to toggle power, adjust brightness, and customize colors.

Based on the current implementation, the application features a detailed control screen for individual lights.

## 📱 Features

The **LightDetailFragment** currently implements the following core functionalities:

* **⚡ On/Off Control:** A toggle switch allows users to instantly turn a selected light on or off.
* **🔆 Brightness Adjustment:** A precise seek bar enables users to set the specific brightness level.
* **🎨 Dynamic Color Selection:**
    * A dedicated button opens a custom **HSV (Hue, Saturation, Value)** color picker dialog.
    * Real-time preview of the color selection.
* **🚀 Dynamic UI:** Built with modern Android components and **View Binding** for robust and efficient interaction.

## 🛠️ How It Works

The core logic is currently encapsulated within `LightDetailFragment.kt`:

1.  **Light Identification:** The fragment receives a `lightId` to identify the specific target light and updates the UI accordingly.
2.  **Power Status:** A `MaterialSwitch` handles the state. Toggling it triggers a Toast message confirming the new status (e.g., "Light is ON").
3.  **Brightness Control:** A `SeekBar` manages intensity. The selected level is confirmed via a Toast message upon release.
4.  **Color Picker Logic:**
    * Tapping **"Change Color"** triggers `showHsvColorPicker()`.
    * This dynamically builds an `AlertDialog` with three sliders (Hue, Saturation, Value).
    * A **preview view** updates instantly as sliders move.
    * Upon confirmation, the button background updates to reflect the chosen color.

## 📦 Dependencies

The project relies on the standard Android Jetpack suite:

* **AndroidX Libraries:**
    * `core-ktx` (Kotlin extensions)
    * `appcompat` (Backward compatibility)
    * `constraintlayout` (Flexible UI layouts)
    * `lifecycle` (UI component lifecycles)
    * `navigation` (In-app navigation)
* **Google Material Design:** For modern UI components like Switches and Dialogs.
* **ViewBinding:** For type-safe view interaction.

## 🔮 Future Development

The following features are planned for upcoming releases:

- [ ] **Networking Layer:** Integrate `Retrofit` to communicate with actual smart light hardware or APIs.
- [ ] **Data Persistence:** Implement `Room` or `Jetpack DataStore` to save light states locally.
- [ ] **Dashboard:** Develop a main screen (Recycler View) to manage a list of all available lights.
- [ ] **Architecture Refactor:** Move control logic into a `ViewModel` to separate concerns (MVVM) and improve testability.

---
*This project is currently under active development.*
