import * as fetch from 'node-fetch'
import * as FormData from 'form-data'
import { generateToken } from './generateToken'

const authUrl = 'https://www.zut.edu.pl/app-json-proxy/index.php?f=getAuthorization'
// const personal = 'https://www.zut.edu.pl/app-json-proxy/index.php?f=getPersonal'
// m3352c
const login = process.env.login
const password = process.env.password
const token = generateToken(login, password)
const tokenJpg = generateToken(login)
// const token = '9wTytsnBX5g74v9CztFGpcyHmXjuneVN'
// const tokenJpg = 'wouPXv6ZKW7gRA5CrFVsBUEx3ePSMM9o'

const form = new FormData()
form.append('login', login)
form.append('password', password)
form.append('token', token)
form.append('tokenJpg', tokenJpg)

const req = {
    method: 'POST',
    body: form,
}

fetch(authUrl, req)
    .then(async (res) => {

        const json = await res.json()
        console.log(JSON.stringify(json, null, 4))
    })


