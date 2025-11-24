
### 1. Problem Statement
> **The Problem:** Modern text editing solutions often fall into two extremes: they are either too simple (like basic Notepad, which lacks organizational structure) or too complex (like IDEs or Word Processors, which are resource-heavy and slow to load).
>
> **The Need:** Users require a **lightweight, offline desktop application** that launches instantly and provides essential text manipulation features—such as file management and clipboard operations—without the bloat, internet dependency, or licensing costs of commercial editors.

### 2. Scope of the Project
The scope of this project is to develop a **Desktop Graphical User Interface (GUI)** application using Java.
* **In-Scope:**
    * Building a window-based interface using Java Swing/AWT.
    * Implementing local file system access to Read and Write text files (`.txt`).
    * Creating a robust architecture (MVC) to separate logic from design.
    * Providing standard OS-level clipboard integration (Cut/Copy/Paste).
* **Out-of-Scope:**
    * Cloud storage integration or real-time collaboration.
    * Rich text formatting (Bold, Italic, Images, Fonts) – *The focus is strictly on plain text.*
    * Syntax highlighting or code compilation features.

### 3. Target Users
* **Students & Learners:** For taking quick notes or drafting assignments without distractions.
* **Software Developers:** For manipulating configuration files, JSON/XML snippets, or writing quick scripts without launching a heavy IDE.
* **General PC Users:** For creating to-do lists, writing logs, or viewing `README` files offline.

### 4. High-Level Features
1.  **File Management System:**
    * **Open:** Load existing text files from any directory on the local hard drive.
    * **Save:** Persist changes to the disk with automatic `.txt` extension handling.
    * **New Window:** Open multiple independent instances for multitasking.
2.  **Clipboard Operations:**
    * Seamless integration with the OS clipboard to **Cut**, **Copy**, and **Paste** text between applications.
3.  **Editor Controls:**
    * **Select All** capability for bulk editing.
    * Scrollable text area supporting large files.
4.  **Robust Error Handling:**
    * User-friendly popup alerts (JOptionPanes) for File Not Found or Access Denied errors, preventing application crashes.
