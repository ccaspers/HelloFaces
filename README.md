# HelloFaces

Simple JSF demo. Contains a single managed bean, whose state can be altered and used for 
rendering. This is achieved with two views that are connected to each other via navigation rules.

To store the bean's state, a session is used.

For simplicity, all libraries are included as jar-files in the *lib*-Folder.


# How to use?

1. `git clone https://github.com/ccaspers/HelloFaces.git` or `svn checkout https://github.com/ccaspers/HelloFaces`
2. Open Eclipse
3. File -> New -> Dynamic Web Project
4. Enter Name
5. **Uncheck** Use default location, click browse and select the cloned folder
6. choose a target runtime. (You should configure Tomcat 8.0 or similar)
7. In **Configuration** click **Modify** and select **JavaServer Faces v2.2 Project" from the 
dropdown. Press Ok.
9. Click Next three times
10. Make sure, that **Disable Library Configuration** is selected on the last page.
11. **Uncheck** *Configure JSF servlet in deployment descriptor*
12. Click Finish
