@echo off
chcp 1251

:init
 set "batchPath=%~dpnx0"
 set BIN=%~dp0bin\
 set "vbsGetPrivileges=%BIN%\elevator.vbs"
 setlocal EnableDelayedExpansion

 if '%1'=='ELEV' (echo ELEV & shift /1 & goto fileRemove)
 ECHO Set UAC = CreateObject^("Shell.Application"^) > "%vbsGetPrivileges%"
 ECHO args = "ELEV " >> "%vbsGetPrivileges%"
 ECHO For Each strArg in WScript.Arguments >> "%vbsGetPrivileges%"
 ECHO args = args ^& strArg ^& " "  >> "%vbsGetPrivileges%"
 ECHO Next >> "%vbsGetPrivileges%"
 ECHO args = "/c """ + "!batchPath!" + """ " + args >> "%vbsGetPrivileges%"
 ECHO UAC.ShellExecute "%SystemRoot%\System32\cmd.exe", args, "", "runas", 1 >> "%vbsGetPrivileges%"
 "%SystemRoot%\System32\WScript.exe" "%vbsGetPrivileges%" %*
 exit /B

:fileRemove
 del "%vbsGetPrivileges%" 1>nul 2>nul  &  shift /1

sc delete windivert
sc stop windivert
pause