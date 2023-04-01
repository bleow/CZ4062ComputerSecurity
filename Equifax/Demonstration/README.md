# cve-2017-5638
cve-2017-5638 Vulnerable site sample

This project aims to demonstrate the CVE-2017-5638 exploitation for educational purpose.
For more informations, see [https://cwiki.apache.org/confluence/display/WW/S2-045](https://cwiki.apache.org/confluence/display/WW/S2-045)

## Getting started

1. Start the docker container :

`docker-compose up`

If you made changes to the docker, run `docker-compose up --build` instead

2. Run the python exploit script from the attacker machine :

`python exploit.py http://localhost:8080/hello "ls -l"`

3. In the case where you encounter an error that your entry-point.sh can't be located
refer to this: https://stackoverflow.com/questions/38905135/why-wont-my-docker-entrypoint-sh-execute