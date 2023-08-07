# RMIDS
RMI APPLICATION 


# RMI (REMOTE METHOD INVOCATION)

RMI Calculator
RMI stands for Remote Method Invocation. It is a mechanism that allows an object residing in one system (JVM) to access/invoke an object running on another JVM. RMI is used to build distributed applications; it provides remote communication between Java programs. It is provided in the package java.
calculator do this function in server 
min 
max 
lcm
gcd
in server and return the resualt in client
the opreation over
import java.rmi; will do the conntection with port
that here we use 1022 or 1023





## Acknowledgements

 - [Awesome Readme Templates](https://www.cs.uic.edu/~troy/fall04/cs441/rmi/calc/index.html
 - [Awesome README](https://github.com/matiassingers/awesome-readme)
 - [How to write a Good readme](https://bulldogjob.com/news/449-how-to-write-a-good-readme-for-your-github-project)


Compiling the code
Use javac to compile all 4 programs.
 > javac Calculator.java
 > javac CalculatorImpl.java
 > javac CalculatorServer.java
 > javac CalculatorClient.java
Now use rmic to create the stub and skeleton class files.
 > rmic CalculatorImpl
Running the RMI System
Note: The following is copied directly from the jGuru page.
You are now ready to run the system! You need to start three consoles, one for the server, one for the client, and one for the RMIRegistry.

Start with the Registry. You must be in the directory that contains the classes you have written. From there, enter the following:

 > rmiregistry
If all goes well, the registry will start running and you can switch to the next console.

In the second console start the server hosting the CalculatorService, and enter the following:

 > java CalculatorServer
It will start, load the implementation into memory and wait for a client connection.

In the last console, start the client program.

 > java CalculatorClient
## Appendix

To enable secure RMI for register-to-store server communication:

Prepare the Key Store and truststores using the keytool utility described in Appendix E.

For the store server, add the following properties to the
<pos_install_directory>\server\pos\config\
posfoundation.properties file:

EnabledCipherSuites=<cipher_suites_to_use>

For example:

EnabledCipherSuites=TLS_RSA_WITH_RC4_128_SHA
If the EnabledCipherSuites property is not defined, the defaults are used.


Note:

It is recommended that the default cipher suites provided by Java are used.
EncryptValets=true

This causes the RMI communication between Manager/Technician pairs to be secured.

javax.net.ssl.keyStore=$KEYSTORE_FILE$

This points to the Key Store that contains the private keys and public certificates for the server. For example:

javax.net.ssl.keyStore=$JAVA_HOME\\jre\\lib\\security\\<keystore_name>
javax.net.ssl.keyStorePassword=!$KEYSTORE_PASSWORD$

This is the encrypted password for the Key Store. For example:

javax.net.ssl.keyStorePassword=!changeit

Note:

The Key Store password follows the same convention for encryption as the other passwords.
For the register, add the following properties to the
<pos_install_directory>client\pos\config\
posfoundation.properties file:

EnabledCipherSuites=<cipher_suites_to_use>


Note:

The cipher suites selected for the register have to match the ones selected for the store server.
EncryptValets=true

This causes the RMI communication between Manager/Technician pairs to be secured.

javax.net.ssl.trustStore=$TRUSTSTORE_FILE$

This points to the trust store that contains the public certificates for the client. For example:

javax.net.ssl.trustStore=$JAVA_HOME\jre\lib\security\<truststore_nam
## Badges




## faisal a1730744

- [a1730744@adelaide.edu.au]https://github.com/FAISAL   a1730744@ADELAIDE.EDU.AU## Color Reference

| Color             | Hex                                             --------------------------------------------------
CalculatorImplementionInterface.java
RMICalculatorClient.java
RMICalculatorServer.java
-------------------------------------------

## Documentation

[Java rmi]https://www.google.com/search?q=java.rmi&sca_esv=554452367&sxsrf=AB5stBgYGZFxkn4Xpgd5bcDeCLM-mHCDdA%3A1691418645936&source=hp&ei=FQDRZIyGN7aYseMPqaSg2Ag&iflsig=AD69kcEAAAAAZNEOJTkd2fHR5vn4fBRAWbdQF-B2KUr-&ved=0ahUKEwjM5Li84cqAAxU2TGwGHSkSCIsQ4dUDCAs&uact=5&oq=java.rmi&gs_lp=Egdnd3Mtd2l6IghqYXZhLnJtaTIHECMYigUYJzIFEAAYgAQyBRAAGIAEMgUQABiABDIFEAAYgAQyBRAAGIAEMgUQABiABDIFEAAYgAQyBRAAGIAEMgUQABiABEixJ1AAWLQfcAB4AJABAJgB_AKgAe4SqgEFMi01LjO4AQPIAQD4AQHCAgQQIxgnwgIREC4YgAQYsQMYgwEYxwEY0QPCAg0QLhiKBRjHARjRAxhDwgILEC4YigUYsQMYgwHCAgcQABiKBRhDwgINEAAYigUYsQMYgwEYQ8ICCBAAGIoFGJEC&sclient=gws-wiz


## Environment Variables

To run this project, you will need to add the following environment variables to your .env file

`API_KEY`

`ANOTHER_API_KEY`


## 🚀 faisal 
I'm a student in MASTER COMPUTER ..



## Deployment

To deploy this project run

> javac CalculatorImplementionInterface.java
 > RMICalculatorClient.java
 > javac CalculatorServer.java
 

