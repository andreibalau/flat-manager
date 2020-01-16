import express from 'express';
import bodyParser from 'body-parser';
import router from './route/index';
import Building from './model/building';
const { Sequelize } = require('sequelize');
const app = express();

const sequelize = new Sequelize('postgres://app:password@localhost:5432/flat');
sequelize.authenticate();

app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());

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

app.use(router);

export default app;