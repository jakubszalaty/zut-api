## Wysłać POST
Na https://www.zut.edu.pl/app-json-proxy/index.php?f=getAuthorization

- body:
    - login
    - password
    - token
    - tokenJpg(niepotrzebne ?)

W celu rejestracji tokenu w systemie

## Następnie można wykorzystać funkcje:

- https://www.zut.edu.pl/app-json-proxy/index.php?f=getMenuStudent
    - body:
        login
        token
- https://www.zut.edu.pl/app-json-proxy/index.php?f=getSearch
    - body:
        login
        token
        name
- https://www.zut.edu.pl/app-json-proxy/index.php?f=getAttendance
    - body:
        login
        token
        gpracownikId
        dydaktykId
        zajeciaElemId
- https://www.zut.edu.pl/app-json-proxy/index.php?f=setAttendances
    - body:
        login
        token
        zajeciaElemId
        gpracownikId
        pracownikId
        status
- https://www.zut.edu.pl/app-json-proxy/index.php?f=getDiploma
    - body:
        login
        token
        przynaleznoscId
        dypTyp
        dypTyp
- https://www.zut.edu.pl/app-json-proxy/index.php?f=getPersonal
    - body:
        login
        token
- https://www.zut.edu.pl/app-json-proxy/index.php?f=getStudy
    - body:
        login
        token
        przynaleznoscId
- https://www.zut.edu.pl/app-json-proxy/index.php?f=getPersonalMini
    - body:
        login
        token
        dydaktykId
        album
- https://www.zut.edu.pl/app-json-proxy/index.php?f=setAttendance
    - body:
        login
        token
        przynaleznoscId
        zajeciaElemId
        status
- https://www.zut.edu.pl/app-json-proxy/index.php?f=    ",
    - body:
        login
        token
- https://www.zut.edu.pl/app-json-proxy/index.php?f=getGrade
    - body:
        login
        token
        listaSemestrowId
- https://www.zut.edu.pl/app-json-proxy/index.php?f=getStudies
    - body:
        login
        token
        przynaleznoscId
        oceny
- https://www.zut.edu.pl/app-json-proxy/index.php?f=getPlan
    - body:
        login
        token
        day
- https://www.zut.edu.pl/app-json-proxy/index.php?f=getNotice
    - body:
        login
        token
        ogloszenieId
        odczyt
- https://www.zut.edu.pl/app-json-proxy/index.php?f=getVacations
    - body:
        login
        token
        rok
- https://www.zut.edu.pl/app-json-proxy/index.php?f=getPayment
    - body:
        login
        token
        przynaleznoscId
