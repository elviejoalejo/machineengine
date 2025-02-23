ECHO OFF

SET ITERATIONS=2

FOR /L %%i IN (1,1,%ITERATIONS%) DO (
	for /f %%J in ('powershell Get-Random -Minimum 100 -Maximum 700') do (
		Echo Ejecucion #%%i/%ITERATIONS%, initialThreadPool=%%J
		ECHO on
		CALL jmeter -J initialThreadPool=%%J -n -t ".\ASR-01 Latencia.jmx" -l .\output\ASR-01-log%%i.csv
		ECHO OFF
	)
)
PAUSE