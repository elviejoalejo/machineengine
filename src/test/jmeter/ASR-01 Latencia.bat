ECHO OFF

SET ITERATIONS=60

FOR /L %%i IN (1,1,%ITERATIONS%) DO (
	for /f %%J in ('powershell Get-Random -Minimum 100 -Maximum 700') do (
		Echo Ejecucion #%%i/%ITERATIONS%, testDuration=%%J
		ECHO on
		CALL jmeter -J testDuration=%%J -n -t "C:\Uniandes\machineengine\src\test\jmeter\ASR-01 Latencia.jmx" -l C:\Uniandes\machineengine\src\test\jmeter\output\ASR-01-log%%i.csv
		ECHO OFF
	)
)
PAUSE