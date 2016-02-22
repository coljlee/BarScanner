# BarScanner
New repository to get Android Studio to cooperate.

INSTRUCTIONS FOR CLONING FROM GITHUB TO ANDROID STUDIO:
0.  File->New->Project from Version Control->Github 
0.     - NOTE: When the project is first cloned, it WILL fail! The volley submodule will not be loaded.
0.  View files using Project view (top left dropdown menu, make sure Project tab is open)
0. Make sure that the volley directory is empty (delete all files inside if not)
0. Open up Android Studio's terminal (bottom left tab)
0.  Run the command: git submodule update --init --recursive
0.  Tools->Android->Sync Project with Gradle Files
