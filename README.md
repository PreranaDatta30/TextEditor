# TextEditor
The TextEditor is a lightweight, offline text editor built using Java (TM)25.0.1. It incorporates GUI framework using Java Swing and AWT. It implements modular MVC(Model-View-Controller) architecture, featuring file operations(Open/Save) and clipboard manipulation
## Features:
* **1. File management:** Create new windows, open existing text files, and save changes to local disk.
* **2.Clipboard Support:** Standard Cut,Copy and Paste functionality.
* **3.Text Manipulation:**"Select ALL" and seamless text editing.
* **4.Error Handling:** Robust handling of 'IOException' and file access errors.
* **5.Modular Design:** Code is split into 5 distinct classes separating logic, UI, and data.
## Tech uses:
**Language:** JAVA SE( JDK 17)
**GUI Framework:** Swing, AWT.
**Architecture:** MVC(Model-View-Controller)
## Project Structure
This project follows a strict package structure for modularity.

## How to run:
This project uses a named package(texteditor), one must compile and run it from th parent directory.
* Clone or Download the repository.
* Open Command Prompt or Terminal.
* Navigate to the folder containing the texteditor folder(eg. cd Desktop/JavaProject)
* Compile the code:
javac texteditor/*.java
* Run the application:
java texteditor.Main

## Screenshots:
*GUI:
<img width="622" height="623" alt="image" src="https://github.com/user-attachments/assets/2b588601-7992-421f-8563-0d0717396bbd" />
*Textual content:
<img width="621" height="618" alt="image" src="https://github.com/user-attachments/assets/dc5d6cdb-de26-4c5b-96c3-9b1a029db0c2" />
*Saving window:
<img width="625" height="440" alt="image" src="https://github.com/user-attachments/assets/0db221b7-be03-486a-9651-34aede36ca4c" />

```text
/texteditor
  ├── Main.java             # Entry point of the application
  ├── EditorWindow.java     # View: Handles the GUI (JFrame, Menus)
  ├── EditorController.java # Controller: Handles user actions & listeners
  ├── FileService.java      # Model: Handles File I/O (Reader/Writer)
  └── AppConstants.java     # Utilities: Static configuration strings









