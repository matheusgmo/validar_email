const ValidarEmail = (email) => {
    const REGEX = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+(\.[a-zA-Z]{2,})+$/;
    return REGEX.test(email) ? "Email valido" : "Email invalido"
}

console.log(ValidarEmail("meuemail123@mymail.com"));