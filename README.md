# CountLines Project

This project provides a command-line tool to count physical lines and lines of code in Java source files and directories.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

You need to install the following tools and configure their dependencies:

1. **Java** (versions 7 or 8)
    ```sh
    java -version
    ```
    Should return something like:
    ```sh
    java version "1.8.0"
    Java(TM) SE Runtime Environment (build 1.8.0-b132)
    Java HotSpot(TM) 64-Bit Server VM (build 25.0-b70, mixed mode)
    ```

2. **Maven**
    - Download Maven from [here](http://maven.apache.org/download.html)
    - Follow the installation instructions [here](http://maven.apache.org/download.html#Installation)

    Verify the installation:
    ```sh
    mvn -version
    ```
    Should return something like:
    ```sh
    Apache Maven 3.2.5 (12a6b3acb947671f09b81f49094c53f426d8cea1; 2014-12-14T12:29:23-05:00)
    Maven home: /Users/dnielben/Applications/apache-maven-3.2.5
    Java version: 1.8.0, vendor: Oracle Corporation
    Java home: /Library/Java/JavaVirtualMachines/jdk1.8.0.jdk/Contents/Home/jre
    Default locale: es_ES, platform encoding: UTF-8
    OS name: "mac os x", version: "10.10.1", arch: "x86_64", family: "mac"
    ```

3. **Git**
    - Install Git by following the instructions [here](http://git-scm.com/book/en/v2/Getting-Started-Installing-Git)

    Verify the installation:
    ```sh
    git --version
    ```
    Should return something like:
    ```sh
    git version 2.2.1
    ```

### Installing

1. Clone the repository and navigate into the project directory:
    ```sh
    git clone https://github.com/alexandrac1420/LOC-Counting_Alexandra-Cortes.git

    cd countlines
    ```

2. Build the project:
    ```sh
    mvn package
    ```

    Should display output similar to:
    ```sh
    [INFO] --- jar:3.3.0:jar (default-jar) @ countlines ---
    [INFO] Building jar: C:\Users\alexa\countlines\target\countlines-1.0-SNAPSHOT.jar
    [INFO] BUILD SUCCESS
    ```

3. Run the application:
    ```sh
    java -cp target/countlines-1.0-SNAPSHOT.jar edu.escuelaing.arsw.ASE.app.CountLines <parameter> <filename/directory>
    ```
    For example 
    ```sh
    java -cp target/countlines-1.0-SNAPSHOT.jar edu.escuelaing.arsw.ASE.app.CountLines phy src/test/java/edu/escuelaing/arsw/ASE/app/resources
    ```

    The output should be:
    ```sh
    File: ExampleFile.java, Lines of code: 9
    File: ExampleFile1.java, Lines of code: 14
    ```
![alt text](https://github.com/alexandrac1420/LOC-Counting_Alexandra-Cortes/blob/master/Pictures/image.png)
![alt text](https://github.com/alexandrac1420/LOC-Counting_Alexandra-Cortes/blob/master/Pictures/image-1.png)

## The Readme Describing the Project. Include the LOC/h

This project provides a utility for counting physical lines and lines of code in Java source files and directories. It is designed to facilitate code analysis and metric gathering during software development.

## The Readme Describing the Project. Include the LOC/h

This project provides a utility for counting physical lines and lines of code in Java source files and directories. It is designed to facilitate code analysis and metric gathering during software development.

### Performance Metrics (LOC/h)
![alt text](https://github.com/alexandrac1420/LOC-Counting_Alexandra-Cortes/blob/master/Pictures/image-3.png)
The Lines of Code per hour (LOC/h) metric for this project is calculated based on the following data:

- Total LOC: 51 + 43 + 21 + 39 + 6 + 6 = 166
- Hours invested in project: 10
- LOC/h = Total LOC / Hours invested
- LOC/h = 166 / 10
- LOC/h = 16.6

This metric provides an approximate average of 16.6 Lines of Code generated per hour during the development of this project.

## Test Report - CountLines

### Author
Name: Alexandra Cortes Tovar

### Date
Date: 16/06/2024

### Summary
This report details the unit tests performed for the classes CountLines, CountLinesPhy, and CountLinesLoc. Various scenarios were tested to verify the correct functionality of counting physical lines and lines of code.

### Tests Conducted

1. **Test `testCountLines_phy`**
   - **Description**: Test to verify the count of physical lines in a specific file.
   - **File Used**: ExampleFile.java
   - **Command Executed**: `java CountLines phy src/test/java/edu/escuelaing/arsw/ASE/app/Resources/ExampleFile.java`
   - **Expected Result**: The program is expected to print "File: ExampleFile.java, Physical lines: 9".
   - **Outcome**: The result matched the expected outcome.

2. **Test `testCountLines_loc`**
   - **Description**: Test to verify the count of lines of code in a specific file.
   - **File Used**: ExampleFile.java
   - **Command Executed**: `java CountLines loc src/test/java/edu/escuelaing/arsw/ASE/app/Resources/ExampleFile.java`
   - **Expected Result**: The program is expected to print "File: ExampleFile.java, Lines of code: 6".
   - **Outcome**: The result matched the expected outcome.

3. **Test `testCountLinesDirectory_phy`**
   - **Description**: Test to verify the count of physical lines in an entire directory.
   - **Directory Used**: `src/test/java/edu/escuelaing/arsw/ASE/app/Resources`
   - **Command Executed**: `java CountLines phy src/test/java/edu/escuelaing/arsw/ASE/app/Resources`
   - **Expected Results**:
     - "File: ExampleFile.java, Physical lines: 9".
     - "File: ExampleFile1.java, Physical lines: 14".
   - **Outcome**: Both results matched the expected outcomes.

4. **Test `testCountLinesDirectory_loc`**
   - **Description**: Test to verify the count of lines of code in an entire directory.
   - **Directory Used**: `src/test/java/edu/escuelaing/arsw/ASE/app/Resources`
   - **Command Executed**: `java CountLines loc src/test/java/edu/escuelaing/arsw/ASE/app/Resources`
   - **Expected Results**:
     - "File: ExampleFile.java, Lines of code: 6".
     - "File: ExampleFile1.java, Lines of code: 6".
   - **Outcome**: Both results matched the expected outcomes.

### Conclusions

All unit tests conducted produced expected results and successfully validated the functionalities implemented in the CountLines, CountLinesPhy, and CountLinesLoc classes. No significant errors were found during testing, indicating that the tested code functions as designed.

### Recommendations

It is recommended to keep these tests updated as the project evolves and functionalities related to line counting are modified. Additionally, consider adding more tests for edge cases or specific situations that may arise during real-world use of the program.

## Design Metaphor

### Title
CountLines

### Author
Alexandra Cortes Tovar

### Date
12/06/2024

### Class Diagram

![alt text](https://github.com/alexandrac1420/LOC-Counting_Alexandra-Cortes/blob/master/Pictures/image-2.png)

### Description of Class Diagram

#### Class `CountLines`
- **Description**: This class handles counting physical lines and lines of code in individual files and directories.
- **Operations**:
  - `public static void main(String[] args) throws IOException`: Main method that initiates the program. It receives input parameters, validates them, and performs line counting based on the provided parameter (`phy` or `loc`).
  - `private static void findFiles(File directory, List<File> files)`: Private method that recursively searches for files in a given directory and adds them to a list.

#### Class `CountLinesPhy`
- **Description**: This class specifically handles counting physical lines in a file.
- **Operations**:
  - `public static void countPhysicalLines(File file)`: Static method that counts and prints the number of physical lines in the given file.

#### Class `CountLinesLoc`
- **Description**: This class specifically handles counting lines of code in a file.
- **Operations**:
  - `public static void countLinesOfCode(File file)`: Static method that counts and prints the number of lines of code in the given file.
  - `private static int countLinesOfCode(BufferedReader br) throws IOException`: Private method used by `countLinesOfCode(File file)` to perform the actual line of code counting using a `BufferedReader`.

#### Relationships Between Classes
- `CountLines` utilizes the `CountLinesPhy` and `CountLinesLoc` classes to delegate the tasks of counting physical lines and lines of code, respectively. This is done within the `main` method of `CountLines`, where the type of count (`phy` or `loc`) is selected and the corresponding operation is called based on the provided parameter.


## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* [Git](http://git-scm.com/) - Version Control System



## Versioning

I use [GitHub](https://github.com/) for versioning. For the versions available, see the [tags on this repository](https://github.com/alexandrac1420/LOC-Counting_Alexandra-Cortes.git).

## Authors

* **Alexandra Cortes Tovar** - [alexandrac1420](https://github.com/alexandrac1420)


## License

This project is licensed under the GNU License - see the [LICENSE.md](LICENSE.md) file for details.



