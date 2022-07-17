# Curso de desarrollo de software

## Práctica Calificada 3
[![forthebadge](data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSIyNTUuMTU5OTk5OTk5OTk5OTciIGhlaWdodD0iMzUiIHZpZXdCb3g9IjAgMCAyNTUuMTU5OTk5OTk5OTk5OTcgMzUiPjxyZWN0IGNsYXNzPSJzdmdfX3JlY3QiIHg9IjAiIHk9IjAiIHdpZHRoPSIxNDYuNDU5OTk5OTk5OTk5OTgiIGhlaWdodD0iMzUiIGZpbGw9IiMwMDAwMDAiLz48cmVjdCBjbGFzcz0ic3ZnX19yZWN0IiB4PSIxNDQuNDU5OTk5OTk5OTk5OTgiIHk9IjAiIHdpZHRoPSIxMTAuNjk5OTk5OTk5OTk5OTkiIGhlaWdodD0iMzUiIGZpbGw9IiNENkQ2RDYiLz48cGF0aCBjbGFzcz0ic3ZnX190ZXh0IiBkPSJNMTMuOTUgMTguMDBMMTMuOTUgMTguMDBMMTMuOTUgMTcuNTJRMTMuOTUgMTYuMjggMTQuMzkgMTUuMzJRMTQuODMgMTQuMzcgMTUuNjQgMTMuODZRMTYuNDQgMTMuMzUgMTcuNDkgMTMuMzVRMTguNTMgMTMuMzUgMTkuMzQgMTMuODVRMjAuMTQgMTQuMzUgMjAuNTggMTUuMjlRMjEuMDIgMTYuMjMgMjEuMDMgMTcuNDhMMjEuMDMgMTcuNDhMMjEuMDMgMTcuOTZRMjEuMDMgMTkuMjEgMjAuNTkgMjAuMTZRMjAuMTYgMjEuMTAgMTkuMzUgMjEuNjFRMTguNTUgMjIuMTIgMTcuNTAgMjIuMTJMMTcuNTAgMjIuMTJRMTYuNDYgMjIuMTIgMTUuNjUgMjEuNjFRMTQuODQgMjEuMTAgMTQuNDAgMjAuMTdRMTMuOTUgMTkuMjMgMTMuOTUgMTguMDBaTTE1LjQzIDE3LjQ2TDE1LjQzIDE3Ljk2UTE1LjQzIDE5LjM2IDE1Ljk4IDIwLjEzUTE2LjUzIDIwLjkwIDE3LjUwIDIwLjkwTDE3LjUwIDIwLjkwUTE4LjQ4IDIwLjkwIDE5LjAxIDIwLjE1UTE5LjU0IDE5LjQwIDE5LjU0IDE3Ljk2TDE5LjU0IDE3Ljk2TDE5LjU0IDE3LjUxUTE5LjU0IDE2LjA5IDE5LjAxIDE1LjM0UTE4LjQ3IDE0LjU4IDE3LjQ5IDE0LjU4TDE3LjQ5IDE0LjU4UTE2LjUzIDE0LjU4IDE1Ljk4IDE1LjMzUTE1LjQ0IDE2LjA5IDE1LjQzIDE3LjQ2TDE1LjQzIDE3LjQ2Wk0yNi45NyAyMkwyNS40OSAyMkwyNS40OSAxMy40N0wyOC40OSAxMy40N1EyOS45NyAxMy40NyAzMC43NyAxNC4xM1EzMS41NyAxNC43OSAzMS41NyAxNi4wNUwzMS41NyAxNi4wNVEzMS41NyAxNi45MCAzMS4xNiAxNy40OFEzMC43NSAxOC4wNiAzMC4wMSAxOC4zN0wzMC4wMSAxOC4zN0wzMS45MiAyMS45MkwzMS45MiAyMkwzMC4zNCAyMkwyOC42MyAxOC43MUwyNi45NyAxOC43MUwyNi45NyAyMlpNMjYuOTcgMTQuNjZMMjYuOTcgMTcuNTJMMjguNTAgMTcuNTJRMjkuMjUgMTcuNTIgMjkuNjcgMTcuMTVRMzAuMDkgMTYuNzcgMzAuMDkgMTYuMTFMMzAuMDkgMTYuMTFRMzAuMDkgMTUuNDMgMjkuNzAgMTUuMDVRMjkuMzEgMTQuNjggMjguNTQgMTQuNjZMMjguNTQgMTQuNjZMMjYuOTcgMTQuNjZaTTM1LjcyIDE4LjEzTDM1LjcyIDE4LjEzTDM1LjcyIDE3LjQ2UTM1LjcyIDE1LjUzIDM2LjY1IDE0LjQ0UTM3LjU3IDEzLjM1IDM5LjIzIDEzLjM1TDM5LjIzIDEzLjM1UTQwLjY1IDEzLjM1IDQxLjQ5IDE0LjA1UTQyLjMzIDE0Ljc2IDQyLjUwIDE2LjA4TDQyLjUwIDE2LjA4TDQxLjA1IDE2LjA4UTQwLjgwIDE0LjU0IDM5LjI2IDE0LjU0TDM5LjI2IDE0LjU0UTM4LjI2IDE0LjU0IDM3Ljc1IDE1LjI2UTM3LjIzIDE1Ljk4IDM3LjIxIDE3LjM3TDM3LjIxIDE3LjM3TDM3LjIxIDE4LjAyUTM3LjIxIDE5LjQwIDM3Ljc5IDIwLjE3UTM4LjM4IDIwLjkzIDM5LjQxIDIwLjkzTDM5LjQxIDIwLjkzUTQwLjU1IDIwLjkzIDQxLjAzIDIwLjQyTDQxLjAzIDIwLjQyTDQxLjAzIDE4Ljc1TDM5LjI3IDE4Ljc1TDM5LjI3IDE3LjYyTDQyLjUxIDE3LjYyTDQyLjUxIDIwLjg5UTQyLjA0IDIxLjUwIDQxLjIyIDIxLjgxUTQwLjQwIDIyLjEyIDM5LjM2IDIyLjEyTDM5LjM2IDIyLjEyUTM4LjI5IDIyLjEyIDM3LjQ2IDIxLjYzUTM2LjY0IDIxLjE0IDM2LjE5IDIwLjI0UTM1Ljc0IDE5LjMzIDM1LjcyIDE4LjEzWk00Ny45MCAyMkw0Ni4zNiAyMkw0OS41OCAxMy40N0w1MC45MSAxMy40N0w1NC4xNCAyMkw1Mi42MCAyMkw1MS45MCAyMC4wMUw0OC41OSAyMC4wMUw0Ny45MCAyMlpNNTAuMjUgMTUuMjhMNDkuMDEgMTguODJMNTEuNDggMTguODJMNTAuMjUgMTUuMjhaTTU5LjU4IDIyTDU4LjEwIDIyTDU4LjEwIDEzLjQ3TDU5LjU4IDEzLjQ3TDYzLjM5IDE5LjU0TDYzLjM5IDEzLjQ3TDY0Ljg3IDEzLjQ3TDY0Ljg3IDIyTDYzLjM4IDIyTDU5LjU4IDE1Ljk1TDU5LjU4IDIyWk03MS4xNyAyMkw2OS42OSAyMkw2OS42OSAxMy40N0w3MS4xNyAxMy40N0w3MS4xNyAyMlpNODEuOTMgMjJMNzUuNTggMjJMNzUuNTggMjEuMDRMNzkuOTkgMTQuNjZMNzUuNjEgMTQuNjZMNzUuNjEgMTMuNDdMODEuNzkgMTMuNDdMODEuNzkgMTQuNDFMNzcuMzggMjAuODJMODEuOTMgMjAuODJMODEuOTMgMjJaTTg2Ljk3IDIyTDg1LjQzIDIyTDg4LjY1IDEzLjQ3TDg5Ljk4IDEzLjQ3TDkzLjIxIDIyTDkxLjY3IDIyTDkwLjk3IDIwLjAxTDg3LjY2IDIwLjAxTDg2Ljk3IDIyWk04OS4zMiAxNS4yOEw4OC4wOCAxOC44Mkw5MC41NSAxOC44Mkw4OS4zMiAxNS4yOFpNOTYuOTAgMTguMTlMOTYuOTAgMTguMTlMOTYuOTAgMTcuMzlROTYuOTAgMTYuMTkgOTcuMzMgMTUuMjdROTcuNzUgMTQuMzUgOTguNTUgMTMuODVROTkuMzUgMTMuMzUgMTAwLjQwIDEzLjM1TDEwMC40MCAxMy4zNVExMDEuODEgMTMuMzUgMTAyLjY4IDE0LjEyUTEwMy41NCAxNC44OSAxMDMuNjggMTYuMjlMMTAzLjY4IDE2LjI5TDEwMi4yMCAxNi4yOVExMDIuMTAgMTUuMzcgMTAxLjY3IDE0Ljk2UTEwMS4yMyAxNC41NSAxMDAuNDAgMTQuNTVMMTAwLjQwIDE0LjU1UTk5LjQ0IDE0LjU1IDk4LjkyIDE1LjI2UTk4LjQwIDE1Ljk2IDk4LjM5IDE3LjMzTDk4LjM5IDE3LjMzTDk4LjM5IDE4LjA5UTk4LjM5IDE5LjQ3IDk4Ljg4IDIwLjIwUTk5LjM4IDIwLjkyIDEwMC4zMyAyMC45MkwxMDAuMzMgMjAuOTJRMTAxLjIxIDIwLjkyIDEwMS42NCAyMC41M1ExMDIuMDggMjAuMTQgMTAyLjIwIDE5LjIyTDEwMi4yMCAxOS4yMkwxMDMuNjggMTkuMjJRMTAzLjU1IDIwLjU5IDEwMi42NyAyMS4zNVExMDEuNzkgMjIuMTIgMTAwLjMzIDIyLjEyTDEwMC4zMyAyMi4xMlE5OS4zMSAyMi4xMiA5OC41NCAyMS42M1E5Ny43NiAyMS4xNSA5Ny4zNCAyMC4yNlE5Ni45MiAxOS4zNyA5Ni45MCAxOC4xOVpNMTA5LjU2IDIyTDEwOC4wOCAyMkwxMDguMDggMTMuNDdMMTA5LjU2IDEzLjQ3TDEwOS41NiAyMlpNMTE0LjEwIDE4LjAwTDExNC4xMCAxOC4wMEwxMTQuMTAgMTcuNTJRMTE0LjEwIDE2LjI4IDExNC41NCAxNS4zMlExMTQuOTggMTQuMzcgMTE1Ljc5IDEzLjg2UTExNi41OSAxMy4zNSAxMTcuNjQgMTMuMzVRMTE4LjY4IDEzLjM1IDExOS40OCAxMy44NVExMjAuMjkgMTQuMzUgMTIwLjczIDE1LjI5UTEyMS4xNyAxNi4yMyAxMjEuMTcgMTcuNDhMMTIxLjE3IDE3LjQ4TDEyMS4xNyAxNy45NlExMjEuMTcgMTkuMjEgMTIwLjc0IDIwLjE2UTEyMC4zMSAyMS4xMCAxMTkuNTAgMjEuNjFRMTE4LjcwIDIyLjEyIDExNy42NSAyMi4xMkwxMTcuNjUgMjIuMTJRMTE2LjYxIDIyLjEyIDExNS44MCAyMS42MVExMTQuOTkgMjEuMTAgMTE0LjU0IDIwLjE3UTExNC4xMCAxOS4yMyAxMTQuMTAgMTguMDBaTTExNS41OCAxNy40NkwxMTUuNTggMTcuOTZRMTE1LjU4IDE5LjM2IDExNi4xMyAyMC4xM1ExMTYuNjcgMjAuOTAgMTE3LjY1IDIwLjkwTDExNy42NSAyMC45MFExMTguNjMgMjAuOTAgMTE5LjE2IDIwLjE1UTExOS42OSAxOS40MCAxMTkuNjkgMTcuOTZMMTE5LjY5IDE3Ljk2TDExOS42OSAxNy41MVExMTkuNjkgMTYuMDkgMTE5LjE2IDE1LjM0UTExOC42MiAxNC41OCAxMTcuNjQgMTQuNThMMTE3LjY0IDE0LjU4UTExNi42NyAxNC41OCAxMTYuMTMgMTUuMzNRMTE1LjU5IDE2LjA5IDExNS41OCAxNy40NkwxMTUuNTggMTcuNDZaTTExOC4wNyAxMi45NkwxMTYuOTMgMTIuOTZMMTE4LjA3IDExLjE4TDExOS42OSAxMS4xOEwxMTguMDcgMTIuOTZaTTEyNy4xMiAyMkwxMjUuNjQgMjJMMTI1LjY0IDEzLjQ3TDEyNy4xMiAxMy40N0wxMzAuOTQgMTkuNTRMMTMwLjk0IDEzLjQ3TDEzMi40MSAxMy40N0wxMzIuNDEgMjJMMTMwLjkyIDIyTDEyNy4xMiAxNS45NUwxMjcuMTIgMjJaIiBmaWxsPSIjRkZGRkZGIi8+PHBhdGggY2xhc3M9InN2Z19fdGV4dCIgZD0iTTE2MS4wMyAyMkwxNTguNjUgMjJMMTU4LjY1IDEzLjYwTDE2MS4wMyAxMy42MEwxNjEuMDMgMTYuNzZMMTY0LjI3IDE2Ljc2TDE2NC4yNyAxMy42MEwxNjYuNjQgMTMuNjBMMTY2LjY0IDIyTDE2NC4yNyAyMkwxNjQuMjcgMTguNzJMMTYxLjAzIDE4LjcyTDE2MS4wMyAyMlpNMTcxLjM3IDE3LjgwTDE3MS4zNyAxNy44MFExNzEuMzcgMTYuNTUgMTcxLjk4IDE1LjU1UTE3Mi41OCAxNC41NiAxNzMuNjQgMTQuMDBRMTc0LjcxIDEzLjQzIDE3Ni4wNCAxMy40M0wxNzYuMDQgMTMuNDNRMTc3LjM3IDEzLjQzIDE3OC40MyAxNC4wMFExNzkuNTAgMTQuNTYgMTgwLjEwIDE1LjU1UTE4MC43MSAxNi41NSAxODAuNzEgMTcuODBMMTgwLjcxIDE3LjgwUTE4MC43MSAxOS4wNSAxODAuMTAgMjAuMDRRMTc5LjUwIDIxLjA0IDE3OC40MyAyMS42MFExNzcuMzcgMjIuMTcgMTc2LjA0IDIyLjE3TDE3Ni4wNCAyMi4xN1ExNzQuNzEgMjIuMTcgMTczLjY0IDIxLjYwUTE3Mi41OCAyMS4wNCAxNzEuOTggMjAuMDRRMTcxLjM3IDE5LjA1IDE3MS4zNyAxNy44MFpNMTczLjc3IDE3LjgwTDE3My43NyAxNy44MFExNzMuNzcgMTguNTEgMTc0LjA3IDE5LjA1UTE3NC4zNyAxOS42MCAxNzQuODkgMTkuOTBRMTc1LjQxIDIwLjIwIDE3Ni4wNCAyMC4yMEwxNzYuMDQgMjAuMjBRMTc2LjY4IDIwLjIwIDE3Ny4xOSAxOS45MFExNzcuNzEgMTkuNjAgMTc4LjAxIDE5LjA1UTE3OC4zMSAxOC41MSAxNzguMzEgMTcuODBMMTc4LjMxIDE3LjgwUTE3OC4zMSAxNy4wOSAxNzguMDEgMTYuNTRRMTc3LjcxIDE2IDE3Ny4xOSAxNS43MFExNzYuNjggMTUuNDAgMTc2LjA0IDE1LjQwTDE3Ni4wNCAxNS40MFExNzUuNDAgMTUuNDAgMTc0Ljg5IDE1LjcwUTE3NC4zNyAxNiAxNzQuMDcgMTYuNTRRMTczLjc3IDE3LjA5IDE3My43NyAxNy44MFpNMTg3LjYzIDIyTDE4NS40NCAyMkwxODUuNDQgMTMuNjBMMTg3LjM5IDEzLjYwTDE5MC4zNSAxOC40NUwxOTMuMjMgMTMuNjBMMTk1LjE4IDEzLjYwTDE5NS4yMCAyMkwxOTMuMDIgMjJMMTkzLjAwIDE3LjU1TDE5MC44NCAyMS4xN0wxODkuNzggMjEuMTdMMTg3LjYzIDE3LjY3TDE4Ny42MyAyMlpNMjAyLjE2IDE1LjQ4TDE5OS41OCAxNS40OEwxOTkuNTggMTMuNjBMMjA3LjEwIDEzLjYwTDIwNy4xMCAxNS40OEwyMDQuNTMgMTUuNDhMMjA0LjUzIDIyTDIwMi4xNiAyMkwyMDIuMTYgMTUuNDhaTTIxOC4yMSAyMkwyMTEuNDcgMjJMMjExLjQ3IDEzLjYwTDIxOC4wNiAxMy42MEwyMTguMDYgMTUuNDRMMjEzLjgzIDE1LjQ0TDIxMy44MyAxNi44NUwyMTcuNTYgMTYuODVMMjE3LjU2IDE4LjYzTDIxMy44MyAxOC42M0wyMTMuODMgMjAuMTdMMjE4LjIxIDIwLjE3TDIxOC4yMSAyMlpNMjIyLjU5IDE3LjgwTDIyMi41OSAxNy44MFEyMjIuNTkgMTYuNTQgMjIzLjE5IDE1LjU0UTIyMy43OSAxNC41NSAyMjQuODQgMTMuOTlRMjI1Ljg5IDEzLjQzIDIyNy4yMSAxMy40M0wyMjcuMjEgMTMuNDNRMjI4LjM2IDEzLjQzIDIyOS4yOSAxMy44NFEyMzAuMjEgMTQuMjUgMjMwLjgyIDE1LjAyTDIzMC44MiAxNS4wMkwyMjkuMzEgMTYuMzlRMjI4LjUwIDE1LjQwIDIyNy4zMyAxNS40MEwyMjcuMzMgMTUuNDBRMjI2LjY1IDE1LjQwIDIyNi4xMSAxNS43MFEyMjUuNTggMTYgMjI1LjI4IDE2LjU0UTIyNC45OSAxNy4wOSAyMjQuOTkgMTcuODBMMjI0Ljk5IDE3LjgwUTIyNC45OSAxOC41MSAyMjUuMjggMTkuMDVRMjI1LjU4IDE5LjYwIDIyNi4xMSAxOS45MFEyMjYuNjUgMjAuMjAgMjI3LjMzIDIwLjIwTDIyNy4zMyAyMC4yMFEyMjguNTAgMjAuMjAgMjI5LjMxIDE5LjIyTDIyOS4zMSAxOS4yMkwyMzAuODIgMjAuNThRMjMwLjIxIDIxLjM1IDIyOS4yOSAyMS43NlEyMjguMzYgMjIuMTcgMjI3LjIxIDIyLjE3TDIyNy4yMSAyMi4xN1EyMjUuODkgMjIuMTcgMjI0Ljg0IDIxLjYxUTIyMy43OSAyMS4wNSAyMjMuMTkgMjAuMDVRMjIyLjU5IDE5LjA2IDIyMi41OSAxNy44MFpNMjM3Ljc0IDIyTDIzNS4zNiAyMkwyMzUuMzYgMTMuNjBMMjM3Ljc0IDEzLjYwTDIzNy43NCAxNi43NkwyNDAuOTggMTYuNzZMMjQwLjk4IDEzLjYwTDI0My4zNSAxMy42MEwyNDMuMzUgMjJMMjQwLjk4IDIyTDI0MC45OCAxOC43MkwyMzcuNzQgMTguNzJMMjM3Ljc0IDIyWiIgZmlsbD0iIzAwMDAwMCIgeD0iMTU3LjQ1OTk5OTk5OTk5OTk4Ii8+PC9zdmc+)](https://forthebadge.com)

**TABLA DE CONTENIDO**

- [Principio de responsabilidad única](https://github.com/HOMTechUNI/PC3#principio-de-responsabilidad-%C3%BAnica)
    - [Pregunta 1](https://github.com/HOMTechUNI/PC3#pregunta-1)
    - [Pregunta 2](https://github.com/HOMTechUNI/PC3#pregunta-2)
    - [Pregunta 3](https://github.com/HOMTechUNI/PC3#pregunta-3--overglitch-)
    - [Pregunta 4](https://github.com/HOMTechUNI/PC3#pregunta-4--overglitch-)
- [Principio abierto/cerrado](https://github.com/HOMTechUNI/PC3#principio-abiertocerrado)
    - [Pregunta 5](https://github.com/HOMTechUNI/PC3#pregunta-5)
    - [Pregunta 6](https://github.com/HOMTechUNI/PC3#pregunta-6)
    - [Pregunta 7](https://github.com/HOMTechUNI/PC3#pregunta-7)
    - [Pregunta 8](https://github.com/HOMTechUNI/PC3#pregunta-8)
    - [Pregunta 9](https://github.com/HOMTechUNI/PC3#pregunta-9)
    - [Pregunta 10](https://github.com/HOMTechUNI/PC3#pregunta-10)
    - [Pregunta 11](https://github.com/HOMTechUNI/PC3#pregunta-11)
- [Principio de sustitución de Liskov](https://github.com/HOMTechUNI/PC3#principio-de-sustituci%C3%B3n-de-liskov)
    - [Pregunta 12](https://github.com/HOMTechUNI/PC3#pregunta-12)
    - [Pregunta 13](https://github.com/HOMTechUNI/PC3#pregunta-13)
    - [Pregunta 14](https://github.com/HOMTechUNI/PC3#pregunta-14)
    - [Pregunta 15](https://github.com/HOMTechUNI/PC3#pregunta-15)
    - [Pregunta 16](https://github.com/HOMTechUNI/PC3#pregunta-16)
    - [Pregunta 17](https://github.com/HOMTechUNI/PC3#pregunta-17)
    - [Pregunta 18](https://github.com/HOMTechUNI/PC3#pregunta-18)
- [Principio de segregación de interfaces](https://github.com/HOMTechUNI/PC3#principio-de-segregaci%C3%B3n-de-interfaces)
    - [Pregunta 19](https://github.com/HOMTechUNI/PC3#pregunta-19)
    - [Pregunta 20](https://github.com/HOMTechUNI/PC3#pregunta-20)
    - [Pregunta 21](https://github.com/HOMTechUNI/PC3#pregunta-21)
    - [Pregunta 22](https://github.com/HOMTechUNI/PC3#pregunta-22)
    - [Pregunta 23](https://github.com/HOMTechUNI/PC3#pregunta-23)
    - [Pregunta 24](https://github.com/HOMTechUNI/PC3#pregunta-24)
    - [Pregunta 25](https://github.com/HOMTechUNI/PC3#pregunta-25)
    - [Pregunta 26](https://github.com/HOMTechUNI/PC3#pregunta-26)
    - [Pregunta 27](https://github.com/HOMTechUNI/PC3#pregunta-27)
    - [Pregunta 28](https://github.com/HOMTechUNI/PC3#pregunta-28)
    - [Pregunta 29](https://github.com/HOMTechUNI/PC3#pregunta-29)
    - [Pregunta 30](https://github.com/HOMTechUNI/PC3#pregunta-30)
- [Principio de inversión de dependencias](https://github.com/HOMTechUNI/PC3#principio-de-inversi%C3%B3n-de-dependencia)
    - [Pregunta 31](https://github.com/HOMTechUNI/PC3#pregunta-31)
    - [Pregunta 32](https://github.com/HOMTechUNI/PC3#pregunta-32)
    - [Pregunta 33](https://github.com/HOMTechUNI/PC3#pregunta-33)
    - [Pregunta 34](https://github.com/HOMTechUNI/PC3#pregunta-34)
    - [Pregunta 35](https://github.com/HOMTechUNI/PC3#pregunta-35)
    - [Pregunta 36](https://github.com/HOMTechUNI/PC3#pregunta-36)

### [Principio de responsabilidad única](https://es.wikipedia.org/wiki/Principio_de_responsabilidad_%C3%BAnica)

#### Pregunta 1

Muestra la salida y explica los resultados en función de los métodos entregados

<details>
  <summary>Respuesta</summary>

<ul>

```console
Demostracion sin SRP
Nombre del empleado: Abejita, Jessica
Este empleado tiene 7.5 años de experiencia.
El ID del empleado es: J711
Este empleado es un empleado senior

----

Nombre del empleado: Smart, Chalito
Este empleado tiene 3.2 años de experiencia.
El ID del empleado es: C216
Este empleado es un empleado junior
```

<li>
La salida que se obtiene al ejecutar la clase Cliente son los datos de 2 empleados ,de Jessica Abejita
y de Chalito Smart. Para que esta clase pueda imprimir estos datos creó un métodos llamado
showEmplDetails() cullo parámetro emp es un objeto de clase Empleado, primo muestra la identificación
emp con el método displayEmpDetail(), el cual muestra el nombre y apellido del empleado más los
años de experiencia laboral que tiene, luego imprime el id del empleado usando el método del
emp llamado generateEmptId()  el cual genera un id aleatorio con la primera letra del nombre del
empleado concatenado con un número aleatorio menor a 1000,finalmente imprime si el empleado es senior
o un junior usando el método checkSenioriti() de emp, el cual comprobará si es que el empleado tiene
más de 5 años de experiencia para que el método imprima “senior” , si no es así imprimirá “junior”.

En la función main de Cliente se crea un objeto Empleado llamado jessica, el cual se instancia con
nombre “Jessica”, apellido “Abejita” y con 7.5 años de experiencia por lo que al momento de imprimir
sus datos su id iniciará con el carácter J y se imprimirá que es una empleada senior por tener más
de 5 años de experiencia, después se crea un objeto Empleado llamado chalo, el cual se instancia
con nombre “Chalito”, apellido “Smart” y con 3.2 años de experiencia por lo que al momento de imprimir
sus datos su id iniciará con el carácter C y se imprimirá que es una empleada junior por tener más
de 5 años de experiencia.
</li>
</ul>
</details>

#### Pregunta 2

¿Cuál es el problema con este diseño y las razones posibles del problema?

#### Pregunta 3 [[@Overglitch](https://github.com/Overglitch)]

Modifica la clase Empleado. Agrega dos clases **SeniorityChecker** que contiene el
método **checkSeniority()** y la clase **GeneradorIDEmpleado** contiene el método
**generateEmpId(...)** para generar la identificación del empleado.
Para mejorar la legibilidad del código y evitar torpezas dentro del método **main()**, utiliza el
método estático **showEmpDetail(...)**. Este método llama al método **displayEmpDetail()** de
Empleado, al método generateEmpId() de GeneradorIDEmpleado y al método **checkSeniority()**
de **SeniorityChecker**. Tú entiendes que este método no era necesario, pero hace que el código
del cliente sea simple y fácilmente comprensible.

<details>
  <summary>Respuesta</summary>
<ul>
  <li> Implementación de la clase <b>SeniorityChecker</b> con el método <b>checkSeniority()</b> </li>

```java
public class SeniorityChecker {
    // completar
    public static String checkSeniority(double experienceInYears) {
        return experienceInYears >= 5 ? "Senior" : "Junior";
    }
}
```

  <li> Implementación de la clase <b>GeneradorIDEmpleado</b> con el método <b>generateEmpId(...)</b> </li>

```java
public class GeneradorIDEmpleado {
    //completar
    public static String generateEmpId(String empFirstName) {
        int random = new Random().nextInt(1000);
        return empFirstName.substring(0, 1) + random;
    }
}
```

  <li> Accediendo a los métodos antes mencionados mediante el método <b>showEmpDetail()</b> </li>

```java
    private static void showEmpDetail(Empleado emp){
        // Muestra detalles del empleado
        emp.displayEmpDetail();

        //Genera el ID
        System.out.println("El ID del empleado es:\t"+GeneradorIDEmpleado.generateEmpId(emp.firstName));

        // Verifica el nivel laboral
        System.out.println("Este empleado es un:\t"+"Empleado "+SeniorityChecker.checkSeniority(emp.experienceInYears));
        }
```

</ul>
</details>

#### Pregunta 4 [[@Overglitch](https://github.com/Overglitch)]

Realiza una demostración completa que sigue a SRP. Explica tus resultados

- **Empleado.java**
- **GeneradorIdEmpleado.java**
- **SeniorityChecker.java**
- **Cliente.java**

<details>
  <summary>Respuesta</summary>
<ul>
    <li>Salida del código</li>

```console
Demostracion de SRP

Nombre del empleado:	Jessica, Abejita
Este empleado tiene:	7.5 años de experiencia
El ID del empleado es:	J515
Este empleado es un:	Empleado Senior

*******

Nombre del empleado:	Chalito, Smart
Este empleado tiene:	3.2 años de experiencia
El ID del empleado es:	C941
Este empleado es un:	Empleado Junior
```

Luego de la implementación de clases, la salida es básicamente la misma. Hay un cambio significativo en cómo se obtienen
los datos y cómo la clase Cliente los usa.

En primer lugar, se imprimen los nombres y los años de experiencia del mismo modo en el que se imprimían antes de
implementar el principio de Responsabilidad única. Para obtener el ID del empleado se implementó un método generateEmpId
dentro de la clase GeneradorIDEmpleado que se encarga de otorgar el ID después de solicitar el firstName del empleado.
Luego se evalúa la experiencia del empleado con el método checkSeniority dentro de la clase SeniorityChecker que
solicita los años de experiencia del empleado e imprime Senior si es mayor o igual a 5 y Junior en caso contrario.

Estos cambios hicieron que el código se vea más limpio y accesible a la integración de nuevas funcionalidades sin
alterar las implementadas.
</ul>
</details>

### [Principio abierto/cerrado](https://es.wikipedia.org/wiki/Principio_de_abierto/cerrado)

#### Pregunta 5

¿Por qué no es correcto colocar **displayResult()** y **evaluateDistinction()** en la misma
clase, como la siguiente?

```java
class Estudiante {
    // ….
    public void displayResult() {
        // codigo
    }

    public void evaluateDistinction() {
        // codigo
    }
// …
}
```

Sean los siguientes archivos:

- **Estudiante.java**
- **DistinctionDecider.java**
- **Cliente.java**

#### Pregunta 6

Muestra la salida y explica los resultados en función de los métodos entregados

<details>
  <summary>Respuesta</summary>

```console
sdsgdfsgsdfg
```

</details>

#### Pregunta 7 [[@Overglitch](https://github.com/Overglitch)]

¿Cuál es el problema con este diseño y las razones posibles del problema?
Para abordar este problema, puedes escribir un mejor programa. El OCP se puede lograr de
diferentes maneras, pero la abstracción es el corazón de este principio. Si puedes diseñar tu
aplicación siguiendo el **OCP**, tu aplicación es flexible y extensible. No siempre es fácil
implementar completamente este principio, pero el cumplimiento parcial de **OCP** puede
generarle un mayor beneficio. También observa que comenzó la demostración 3 siguiendo el
**SRP**. Si no sigues el **OCP**, puedes terminar con una clase que realiza varias tareas, lo que
significa que el **SRP** no funciona.
Para la situación actual, puedes dejar la clase Estudiante como está. Pero quieres mejorar el
código. Tú comprendes que en el futuro puedes necesitar considerar una corriente diferente,
como el comercio. ¿Cómo eliges una corriente? Se basa en el tema elegido por un estudiante.
Entonces, en el siguiente ejemplo, haces que la clase **Estudiante** sea abstracta.
**ArteEstudiante** y **CienciaEstudiante** son las clases concretas y se utilizan para proporcionar la
información del *"departamento"*.

<details>
  <summary>Respuesta</summary>
<ul><li> En el caso de la clase Estudiante se viola  </li></ul>
</details>

#### Pregunta 8 [[@Overglitch](https://github.com/Overglitch)]

Debes abordar el método de evaluación para la distinción de una mejor manera.
Por lo tanto, crea la interfaz **DistinctionDecider** que contiene un método llamado
**EvaluationDistinction**.

<details>
  <summary>Respuesta</summary>
<ul>
    <li> Implementación de la interfaz <b>DistinctionDecider</b> con método <b>EvaluationDistinction</b> </li>

```java
public interface DistinctionDecider {
    void evaluateDistinction(Estudiante estudiante);
}
```

</ul>
</details>

#### Pregunta 9 [[@Overglitch](https://github.com/Overglitch)]

Completa el código de **ArtsDistinctionDecider** y **ScienceDistinctionDecider** que
implementan esta interfaz y sobreescriben el método de **evaluateDistinction(...)** para
especificar los criterios de evaluación según sus necesidades. De esta forma, los criterios de
distinción específicos de flujo se envuelven en una unidad independiente.
Debes tener en cuenta que el método de **evaluateDistinction(...)** acepta un parámetro
**Estudiante**. Significa que ahora también puede pasar un objeto **ArtsStudent** o un objeto
**ScienceStudent** a este método.
El código restante es fácil y no debería tener ningún problema para comprender la siguiente
demostración ahora.

#### Pregunta 10 [[@Overglitch](https://github.com/Overglitch)]

Realiza una demostración completa que sigue a OCP. Explica tus resultados

- **Estudiante.java**
- **ArteEstudiante.java**
- **CienciaEstudiante.java**
- **DistinctionDecider.java**
- **ScienceDistinctionDecider.java**
- **ArtsDistinctionDecider.java**
- **Cliente.java**

#### Pregunta 11 [[@Overglitch](https://github.com/Overglitch)]

¿Cuáles son las principales ventajas ahora?

### [Principio de sustitución de Liskov](https://es.wikipedia.org/wiki/Principio_de_sustituci%C3%B3n_de_Liskov)

#### Pregunta 12

Muestra la salida y explica los resultados en función de los métodos entregados

#### Pregunta 13

Ahora supongamos que tienes un nuevo requisito que dice que necesitas admitir
usuarios invitados en el futuro. Puedes procesar la solicitud de pago de un usuario invitado,
pero no muestra su último detalle de pago. Entonces, crea la siguiente clase que implementa la
interfaz de pago de la siguiente manera:

```java
class GuestUserPayment implements Payment {
    String name;

    public GuestUserPayment() {
        this.name = "guest";
    }

    @Override
    public void previousPaymentInfo() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void newPayment() {
        System.out.println("Proceso de la solicitud de pago de " + name);
    }
}
```

#### Pregunta 14

Dentro del método **main()**, utilizas una instancia de usuario invitado e intentas
usar su clase auxiliar de la misma manera, ¿Qué tipo de excepción te encuentras? ¿Cuál es la
solución?

#### Pregunta 15

Todo lo anterior Lo más importante es que viola el **OCP** cada vez que modifica una
clase existente que usa esta cadena *if-else*. Entonces, busquemos una mejor solución.

#### Pregunta 16

En el próximo programa, eliminaremos el método **newPayment()** de la interfaz de
**payment**. Coloca este método en otra interfaz llamada **NewPayment**. Como resultado, ahora
tienes dos interfaces con las operaciones específicas. Dado que todos los tipos de usuarios
pueden generar una nueva solicitud de pago, las clases concretas de **RegisteredUserPayment** y
**GuestUserPayment** implementan la interfaz **NewPayment**.
Pero muestra el último detalle de pago solo para los usuarios registrados. Entonces, la clase
**RegisteredUser** implementa la interfaz **payment**. Dado que **Payment** contiene el método
**previousPaymentInfo()**, tiene sentido elegir un nombre mejor, como **PreviousPaymen** en lugar
de **Payment**. Entonces, ahora verá las siguientes interfaces:

```java
interface PreviousPayment {
    void previousPaymentInfo();
}

interface NewPayment {
    void newPayment();
}
```

Ajuste estos nuevos nombres en la clase auxiliar también. En sección del código debes tener los
siguientes archivos:

- **PreviousPayment.java**
- **NewPayment.java**
- **RegisteredUserPayment.java**
- **GuestUserPayment.java**
- **PaymentHelper.java**
- **Cliente.java**

#### Pregunta 17

¿Cuáles son los cambios clave?

#### Pregunta 18

Ten que aquí el enfoque clave estaba en el principio **LSP**, nada más. Podrías
refactorizar fácilmente el código del cliente usando algún método estático. Por ejemplo realiza
una modificación donde utilizas un método estático para mostrar todas las solicitudes de pago
y utilizar este método siempre que lo necesites.

### Principio de segregación de interfaces

#### Pregunta 19

¿Por qué un usuario necesita cambiar una clase base (o una interfaz)? Para
responder a esto, supongamos que deseas mostrar qué el tipo de fax está utilizando en una fase
de desarrollo posterior.
Tú sabes que existen diferentes variaciones de métodos de **fax**, como *LanFax*, *InternetFax (o
EFax*) y *AnalogFax*. Entonces, antes, el método **SendFax()** no usaba ningún parámetro, pero
ahora necesita aceptar un parámetro para mostrar el tipo de fax que usa. Escribe una jerarquía
de **fax** que puede parecerse a la siguiente:

```java
interface Fax {
    // codigo
}

class LanFax implements Fax {
    @Override
    // codigo
}

class EFax implements Fax {
    @Override
    // codigo
}
```

#### Pregunta 20

Para usar esta jerarquía de herencia, una vez que modificas el método **sendFax()** a
**sendFax(Fax faxType)** en la clase **ImpresoraAvanzada**, exige que cambies la interfaz de
**Impresora** (sí, aquí también rompe el **OCP**).
Cuando actualices **Impresora**, también debes actualizar la clase **impresoraBasica** para
adaptarse a este cambio. ¡Ahora ves el problema!. Explica el problema.

#### Pregunta 21

Si has entendido correctamente el problema. El **ISP** te sugiere que te ocupes de
este tipo de escenario. Explica tu respuesta.

#### Pregunta 22

¿Es conveniente usar e inicializar el siguiente código?

```java
interface Impresora {
    void printDocument();

    void sendFax();
}
```

#### Pregunta 23

Si comienzas tu codificación considerando las impresoras avanzadas que pueden
imprimir y enviar un fax, está bien. Pero en una etapa posterior, si tu programa también
necesita admitir impresoras básicas, ¿Qué código puedes escribir?,
¡Ya has visto que este código puede causarte un problema potencial!
Está bastante claro que una impresora básica no necesita enviar un fax. Pero dado que
**ImpresoraBasica** implementa **Impresora**, debe proporcionar una implementación de **sendFax()**.
Como resultado, cuando **sendFax()** cambia en la interfaz **Impresora**, **ImpresoraBasica** necesita
adaptarse al cambio. El **ISP** sugiere que evites este tipo de situaciones.
En este contexto, Cuando lanzas la excepción e intentas usar código polimórfico de manera
incorrecta, ves el impacto de violar el **LSP**. Una vez que modificas **Impresora**, también viola el
**OCP**.

##### Respuesta

#### Pregunta 24

Comprueba tus respuestas añadiendo dentro de **main()**, el siguiente código
polimórfico:

```java
Impresora impresora=new ImpresoraAvanzada();

        impresora.printDocument();
        impresora.sendFax();

        impresora=new ImpresoraBasica();

        impresora.printDocument();
//impresora .sendFax();
```

Además, no puedes escribir algo como

```java
List<Impresora> impresoras=new ArrayList<Impresora>();

        impresoras.add(new ImpresoraAvanzada());
        impresoras.add(new ImpresoraBasica());

        for(Impresora dispositivo:impresoras){.printDocument();
        // dispositivo.sendFax();
        }
```

En ambos casos, verás excepciones de tiempo de ejecución.

#### Pregunta 25

Reemplaza el segmento de código

```java
for(Impresora dispositivo:impresoras){.printDocument();
        // dispositivo.sendFax();
        }
```

Con una expresión lambda adecuada. Tú eliges cuál quieres usar.
Sean los siguientes archivos:

- **Impresora.java**
- **ImpresoraBasica.java**
- **ImpresoraAvanzada.java**
- **Cliente.java**
- **JerarquiaFax.java**

#### Pregunta 26

Muestra la salida y explica los resultados en función de los métodos entregados.

#### Pregunta 27 [[@Overglitch](https://github.com/Overglitch)]

Supongamos que necesitas admitir otra impresora que pueda imprimir, enviar
faxes y fotocopiar. En este caso, si agregas un método de fotocopiado en la interfaz **Impresora**,
los dos clientes existentes, **ImpresoraBasica** e **ImpresoraAvanzada**, deben adaptarse al cambio.
Busquemos una mejor solución. Hay dos actividades diferentes: una es imprimir unos documentos y la otra es enviar un
fax. Crea dos interfaces llamada **Impresora** y **DispositivoFax**. Impresora contiene el método
**printDocument()** y **DispositivoFax** contiene el método **SendFax()**. La idea es sencilla:

- La clase que desea la función de impresión implementa la interfaz **Impresora** y la clase
  que desea la función de fax implementa la interfaz **DispositivoFax**.
- Si una clase quiere ambas funcionalidades, implementa ambas interfaces.

No debes asumir que el **ISP** dice que una interfaz debe tener solo un método. En este ejemplo
hay dos métodos en la interfaz de **Impresora** y la clase **ImpresoraBasica** necesita únicamente uno de
ellos. Es por eso que ves las interfaces segregadas con solamente un método.
Para terminar esta pregunta, en la sección de **SOLID** del código entregado, completa los
siguientes archivos. No olvides explicar tus resultados.

- **Impresora.java**
- **DispositivoFax.java**
- **ImpresoraBasica.java**
- **ImpresoraAvanzada.java**
- **Cliente.java**

#### Pregunta 28 [[@Overglitch](https://github.com/Overglitch)]

¿Qué sucede si usa un método predeterminado dentro de la interfaz?

#### Pregunta 29 [[@Overglitch](https://github.com/Overglitch)]

¿Qué sucede si proporcionas un método de fax predeterminado en una interfaz?
¡Viste el problema potencial con esto!

#### Pregunta 30 [[@Overglitch](https://github.com/Overglitch)]

¿Qué sucede si usa un método vacío, en lugar de lanzar la excepción?

### [Principio de inversión de dependencia](https://es.wikipedia.org/wiki/Principio_de_inversi%C3%B3n_de_la_dependencia)

#### Pregunta 31 [[@Overglitch](https://github.com/Overglitch)]

Muestra la salida y explica los resultados en función de los métodos entregados

- **InterfaceUsuario.java**
- **OracleDataBase.java**
- **Cliente.java**

#### Pregunta 32 [[@Overglitch](https://github.com/Overglitch)]

El programa es simple, pero ¿Qué tipo de problemas presenta?

#### Pregunta 33

En el programa de la carpeta **SOLID**, para el caso **DIP** verás la siguiente jerarquía:

- **BaseDatos.java**
- **OracleDatabase.java**

La primera parte del **DIP** sugiere que nos centramos en la abstracción. Esto hace que el
programa sea eficiente. Entonces, esta vez la clase **InterfazUsuario** tiene como objetivo la base
de datos de abstracción, en lugar de una implementación concreta como **OracleDatabase**.
Implementa la clase **InterfazUsuario**.
Esto brinda la flexibilidad de considerar una nueva base de datos, como MYSQLDatabase
también.
La segunda parte del **DIP** propone hacer la interfaz de la base de datos considerando la
necesidad de la clase **InterfazUsuario**.
Es importante porque si una interfaz necesita cambiar para admitir a uno de sus clientes, otros
clientes pueden verse afectados por el cambio.

#### Pregunta 34

Completa todos los archivos siguientes de la sección **SOLID**

- **InterfazUsuario.java**
- **BaseDatos.java**
- **OracleDataBase.java**
- **MySQLDatabase.java**
- **Cliente.java**

Explica los resultados. ¿El programa resuelve todos los posibles problemas del programa que
no usa **DIP**?
En resumen, en **OOP**, te sugiero seguir la cita de ***Robert C. Martin***:
> "Los módulos de alto nivel simplemente no deberían depender de los módulos de bajo nivel de
> ninguna manera. Entonces, cuando tienes una clase base y una clase derivada, tu clase base no debe conocer
> ninguna de sus clases derivadas."

#### Pregunta 35

Encuentra alguna excepción a esta sugerencia.

#### Pregunta 36

El constructor de la clase **InterfazUsuario** acepta un parámetro de base de datos.
Proporciona una instalación adicional a un usuario cuando utiliza tanto el constructor como el
método setter (**setDatabase**) dentro de esta clase. ¿Cuál es el beneficio?