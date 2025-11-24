# TextEditor
The TextEditor is a lightweight, offline text editor built using Java (TM)25.0.1. It incorporates GUI framework using Java Swing and AWT. It implements modular MVC(Model-View-Controller) architecture, featuring file operations(Open/Save) and clipboard manipulation
## Features:
**1. File management:** Create new windows, open existing text files, and save changes to local disk.
**2.Clipboard Support:** Standard Cut,Copy and Paste functionality.
**3.Text Manipulation:**"Select ALL" and seamless text editing.
**4.Error Handling:** Robust handling of 'IOException' and file access errors.
**5.Modular Design:** Code is split into 5 distinct classes separating logic, UI, and data.
## Tech uses:
**Language:** JAVA SE( JDK 17)
**GUI Framework:** Swing, AWT.
**Architecture:** MVC(Model-View-Controller)
## Project Structure
This project follows a strict package structure for modularity.
```text
/texteditor
  ├── Main.java             # Entry point of the application
  ├── EditorWindow.java     # View: Handles the GUI (JFrame, Menus)
  ├── EditorController.java # Controller: Handles user actions & listeners
  ├── FileService.java      # Model: Handles File I/O (Reader/Writer)
  └── AppConstants.java     # Utilities: Static configuration strings

