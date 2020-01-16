import express from 'express';
import { json } from 'body-parser';

import { Building, Flat, Person, Stair } from './sequelize';

const app = express()
app.use(json())
app.use((err, req, res, next) => {
    console.log(err.stack);
    res.status(400).send(`Error: ${res.originUrl} not found`);
    next();
});
app.use((err, req, res, next) => {
    console.log(err.stack)
    res.status(500).send(`Error: ${err}`);
    next();
});

const port = 8080;
app.listen(port, () => {
    console.log(`Running on http://localhost:${port}`);
})