@rem
@rem Copyright 2015 the original author or authors.
@rem
@rem Licensed under the Apache License, Version 2.0 (the "License");
@rem you may not use this file except in compliance with the License.
@rem You may obtain a copy of the License at
@rem
@rem      https://www.apache.org/licenses/LICENSE-2.0
@rem
@rem Unless required by applicable law or agreed to in writing, software
@rem distributed under the License is distributed on an "AS IS" BASIS,
@rem WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
@rem See the License for the specific language governing permissions and
@rem limitations under the License.
@rem

@if "%DEBUG%" == "" @echo off
@rem ##########################################################################
@rem
@rem  api-pix startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%" == "" set DIRNAME=.
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%..

@rem Resolve any "." and ".." in APP_HOME to make it shorter.
for %%i in ("%APP_HOME%") do set APP_HOME=%%~fi

@rem Add default JVM options here. You can also use JAVA_OPTS and API_PIX_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS=

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if "%ERRORLEVEL%" == "0" goto execute

echo.
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto execute

echo.
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\lib\api-pix-0.1.jar;%APP_HOME%\lib\micronaut-hibernate-validator-3.0.0.jar;%APP_HOME%\lib\micronaut-jackson-xml-2.2.1.jar;%APP_HOME%\lib\micronaut-http-client-2.4.1.jar;%APP_HOME%\lib\micronaut-grpc-client-runtime-2.3.0.jar;%APP_HOME%\lib\micronaut-http-client-core-2.4.1.jar;%APP_HOME%\lib\micronaut-http-server-netty-2.4.1.jar;%APP_HOME%\lib\micronaut-http-server-2.4.1.jar;%APP_HOME%\lib\micronaut-runtime-2.4.1.jar;%APP_HOME%\lib\micronaut-kotlin-runtime-2.3.0.jar;%APP_HOME%\lib\swagger-annotations-2.1.6.jar;%APP_HOME%\lib\micronaut-validation-2.4.1.jar;%APP_HOME%\lib\micronaut-http-netty-2.4.1.jar;%APP_HOME%\lib\micronaut-websocket-2.4.1.jar;%APP_HOME%\lib\micronaut-router-2.4.1.jar;%APP_HOME%\lib\micronaut-http-2.4.1.jar;%APP_HOME%\lib\micronaut-context-2.4.1.jar;%APP_HOME%\lib\micronaut-aop-2.4.1.jar;%APP_HOME%\lib\micronaut-grpc-annotation-2.3.0.jar;%APP_HOME%\lib\micronaut-buffer-netty-2.4.1.jar;%APP_HOME%\lib\micronaut-inject-2.4.1.jar;%APP_HOME%\lib\javax.annotation-api-1.3.2.jar;%APP_HOME%\lib\jackson-datatype-jdk8-2.12.2.jar;%APP_HOME%\lib\jackson-datatype-jsr310-2.12.2.jar;%APP_HOME%\lib\jackson-dataformat-xml-2.12.2.jar;%APP_HOME%\lib\jackson-module-jaxb-annotations-2.12.2.jar;%APP_HOME%\lib\jackson-databind-2.12.2.jar;%APP_HOME%\lib\jackson-annotations-2.12.2.jar;%APP_HOME%\lib\jackson-core-2.12.2.jar;%APP_HOME%\lib\jackson-module-kotlin-2.12.2.jar;%APP_HOME%\lib\kotlin-reflect-1.4.31.jar;%APP_HOME%\lib\kotlin-stdlib-jdk8-1.4.31.jar;%APP_HOME%\lib\caelum-stella-bean-validation-2.1.5.jar;%APP_HOME%\lib\logback-classic-1.2.3.jar;%APP_HOME%\lib\micronaut-core-reactive-2.4.1.jar;%APP_HOME%\lib\micronaut-core-2.4.1.jar;%APP_HOME%\lib\grpc-netty-1.33.1.jar;%APP_HOME%\lib\grpc-protobuf-1.33.1.jar;%APP_HOME%\lib\grpc-stub-1.33.1.jar;%APP_HOME%\lib\spotbugs-annotations-4.0.3.jar;%APP_HOME%\lib\grpc-core-1.33.1.jar;%APP_HOME%\lib\perfmark-api-0.19.0.jar;%APP_HOME%\lib\grpc-protobuf-lite-1.33.1.jar;%APP_HOME%\lib\grpc-api-1.33.1.jar;%APP_HOME%\lib\jsr305-3.0.2.jar;%APP_HOME%\lib\snakeyaml-1.26.jar;%APP_HOME%\lib\slf4j-api-1.7.26.jar;%APP_HOME%\lib\reactive-streams-1.0.3.jar;%APP_HOME%\lib\rxjava-2.2.10.jar;%APP_HOME%\lib\validation-api-2.0.1.Final.jar;%APP_HOME%\lib\kotlin-stdlib-jdk7-1.4.31.jar;%APP_HOME%\lib\kotlin-stdlib-1.4.31.jar;%APP_HOME%\lib\caelum-stella-core-2.1.5.jar;%APP_HOME%\lib\mirror-1.5.jar;%APP_HOME%\lib\netty-handler-proxy-4.1.59.Final.jar;%APP_HOME%\lib\netty-codec-http2-4.1.59.Final.jar;%APP_HOME%\lib\netty-codec-http-4.1.59.Final.jar;%APP_HOME%\lib\netty-codec-socks-4.1.59.Final.jar;%APP_HOME%\lib\netty-handler-4.1.59.Final.jar;%APP_HOME%\lib\netty-codec-4.1.59.Final.jar;%APP_HOME%\lib\netty-transport-4.1.59.Final.jar;%APP_HOME%\lib\netty-buffer-4.1.59.Final.jar;%APP_HOME%\lib\netty-resolver-4.1.59.Final.jar;%APP_HOME%\lib\netty-common-4.1.59.Final.jar;%APP_HOME%\lib\kotlin-stdlib-common-1.4.31.jar;%APP_HOME%\lib\grpc-context-1.33.1.jar;%APP_HOME%\lib\protobuf-java-3.14.0.jar;%APP_HOME%\lib\javax.inject-1.jar;%APP_HOME%\lib\javax.el-3.0.1-b12.jar;%APP_HOME%\lib\config-1.4.1.jar;%APP_HOME%\lib\logback-core-1.2.3.jar;%APP_HOME%\lib\hibernate-validator-6.1.6.Final.jar;%APP_HOME%\lib\guava-29.0-android.jar;%APP_HOME%\lib\error_prone_annotations-2.3.4.jar;%APP_HOME%\lib\animal-sniffer-annotations-1.18.jar;%APP_HOME%\lib\proto-google-common-protos-1.17.0.jar;%APP_HOME%\lib\woodstox-core-6.2.4.jar;%APP_HOME%\lib\stax2-api-4.2.1.jar;%APP_HOME%\lib\annotations-13.0.jar;%APP_HOME%\lib\jakarta.validation-api-2.0.2.jar;%APP_HOME%\lib\jboss-logging-3.3.2.Final.jar;%APP_HOME%\lib\classmate-1.3.4.jar;%APP_HOME%\lib\failureaccess-1.0.1.jar;%APP_HOME%\lib\listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar;%APP_HOME%\lib\checker-compat-qual-2.5.5.jar;%APP_HOME%\lib\j2objc-annotations-1.3.jar;%APP_HOME%\lib\gson-2.8.6.jar;%APP_HOME%\lib\annotations-4.1.1.4.jar;%APP_HOME%\lib\jakarta.xml.bind-api-2.3.2.jar;%APP_HOME%\lib\jakarta.activation-api-1.2.1.jar


@rem Execute api-pix
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %API_PIX_OPTS%  -classpath "%CLASSPATH%" br.com.zup.ApplicationKt %*

:end
@rem End local scope for the variables with windows NT shell
if "%ERRORLEVEL%"=="0" goto mainEnd

:fail
rem Set variable API_PIX_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
if  not "" == "%API_PIX_EXIT_CONSOLE%" exit 1
exit /b 1

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
