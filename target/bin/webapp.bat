@REM ----------------------------------------------------------------------------
@REM Copyright 2001-2004 The Apache Software Foundation.
@REM
@REM Licensed under the Apache License, Version 2.0 (the "License");
@REM you may not use this file except in compliance with the License.
@REM You may obtain a copy of the License at
@REM
@REM      http://www.apache.org/licenses/LICENSE-2.0
@REM
@REM Unless required by applicable law or agreed to in writing, software
@REM distributed under the License is distributed on an "AS IS" BASIS,
@REM WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
@REM See the License for the specific language governing permissions and
@REM limitations under the License.
@REM ----------------------------------------------------------------------------
@REM

@echo off

set ERROR_CODE=0

:init
@REM Decide how to startup depending on the version of windows

@REM -- Win98ME
if NOT "%OS%"=="Windows_NT" goto Win9xArg

@REM set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" @setlocal

@REM -- 4NT shell
if "%eval[2+2]" == "4" goto 4NTArgs

@REM -- Regular WinNT shell
set CMD_LINE_ARGS=%*
goto WinNTGetScriptDir

@REM The 4NT Shell from jp software
:4NTArgs
set CMD_LINE_ARGS=%$
goto WinNTGetScriptDir

:Win9xArg
@REM Slurp the command line arguments.  This loop allows for an unlimited number
@REM of arguments (up to the command line limit, anyway).
set CMD_LINE_ARGS=
:Win9xApp
if %1a==a goto Win9xGetScriptDir
set CMD_LINE_ARGS=%CMD_LINE_ARGS% %1
shift
goto Win9xApp

:Win9xGetScriptDir
set SAVEDIR=%CD%
%0\
cd %0\..\.. 
set BASEDIR=%CD%
cd %SAVEDIR%
set SAVE_DIR=
goto repoSetup

:WinNTGetScriptDir
set BASEDIR=%~dp0\..

:repoSetup


if "%JAVACMD%"=="" set JAVACMD=java

if "%REPO%"=="" set REPO=%BASEDIR%\repo

set CLASSPATH="%BASEDIR%"\etc;"%REPO%"\javax\servlet\jstl\1.2\jstl-1.2.jar;"%REPO%"\javax\transaction\jta\1.1\jta-1.1.jar;"%REPO%"\org\springframework\spring-webmvc\4.3.7.RELEASE\spring-webmvc-4.3.7.RELEASE.jar;"%REPO%"\org\springframework\spring-aop\4.3.7.RELEASE\spring-aop-4.3.7.RELEASE.jar;"%REPO%"\org\springframework\spring-beans\4.3.7.RELEASE\spring-beans-4.3.7.RELEASE.jar;"%REPO%"\org\springframework\spring-context\4.3.7.RELEASE\spring-context-4.3.7.RELEASE.jar;"%REPO%"\org\springframework\spring-core\4.3.7.RELEASE\spring-core-4.3.7.RELEASE.jar;"%REPO%"\commons-logging\commons-logging\1.2\commons-logging-1.2.jar;"%REPO%"\org\springframework\spring-expression\4.3.7.RELEASE\spring-expression-4.3.7.RELEASE.jar;"%REPO%"\org\springframework\spring-web\4.3.7.RELEASE\spring-web-4.3.7.RELEASE.jar;"%REPO%"\org\springframework\spring-orm\4.3.7.RELEASE\spring-orm-4.3.7.RELEASE.jar;"%REPO%"\org\springframework\spring-jdbc\4.3.7.RELEASE\spring-jdbc-4.3.7.RELEASE.jar;"%REPO%"\org\springframework\spring-tx\4.3.7.RELEASE\spring-tx-4.3.7.RELEASE.jar;"%REPO%"\org\hibernate\hibernate-core\5.2.9.Final\hibernate-core-5.2.9.Final.jar;"%REPO%"\org\jboss\logging\jboss-logging\3.3.0.Final\jboss-logging-3.3.0.Final.jar;"%REPO%"\org\javassist\javassist\3.20.0-GA\javassist-3.20.0-GA.jar;"%REPO%"\antlr\antlr\2.7.7\antlr-2.7.7.jar;"%REPO%"\org\jboss\spec\javax\transaction\jboss-transaction-api_1.2_spec\1.0.1.Final\jboss-transaction-api_1.2_spec-1.0.1.Final.jar;"%REPO%"\org\jboss\jandex\2.0.3.Final\jandex-2.0.3.Final.jar;"%REPO%"\com\fasterxml\classmate\1.3.0\classmate-1.3.0.jar;"%REPO%"\dom4j\dom4j\1.6.1\dom4j-1.6.1.jar;"%REPO%"\org\hibernate\common\hibernate-commons-annotations\5.0.1.Final\hibernate-commons-annotations-5.0.1.Final.jar;"%REPO%"\org\hibernate\javax\persistence\hibernate-jpa-2.1-api\1.0.0.Final\hibernate-jpa-2.1-api-1.0.0.Final.jar;"%REPO%"\mysql\mysql-connector-java\5.1.39\mysql-connector-java-5.1.39.jar;"%REPO%"\org\postgresql\postgresql\9.4-1206-jdbc42\postgresql-9.4-1206-jdbc42.jar;"%REPO%"\commons-dbcp\commons-dbcp\1.4\commons-dbcp-1.4.jar;"%REPO%"\commons-pool\commons-pool\1.5.4\commons-pool-1.5.4.jar;"%REPO%"\com\google\code\gson\gson\2.3\gson-2.3.jar;"%REPO%"\jpl\beerchallenge\powerhour\0.0.1-SNAPSHOT\powerhour-0.0.1-SNAPSHOT.war
set EXTRA_JVM_ARGUMENTS=
goto endInit

@REM Reaching here means variables are defined and arguments have been captured
:endInit

%JAVACMD% %JAVA_OPTS% %EXTRA_JVM_ARGUMENTS% -classpath %CLASSPATH_PREFIX%;%CLASSPATH% -Dapp.name="webapp" -Dapp.repo="%REPO%" -Dbasedir="%BASEDIR%" launch.Main %CMD_LINE_ARGS%
if ERRORLEVEL 1 goto error
goto end

:error
if "%OS%"=="Windows_NT" @endlocal
set ERROR_CODE=1

:end
@REM set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" goto endNT

@REM For old DOS remove the set variables from ENV - we assume they were not set
@REM before we started - at least we don't leave any baggage around
set CMD_LINE_ARGS=
goto postExec

:endNT
@endlocal

:postExec

if "%FORCE_EXIT_ON_ERROR%" == "on" (
  if %ERROR_CODE% NEQ 0 exit %ERROR_CODE%
)

exit /B %ERROR_CODE%
