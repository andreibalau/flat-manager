import express from 'express';
import { json } from 'body-parser';
import routes from './route/index';

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
routes(app);
app.listen(8080, () => {
    console.log(`Running`);
})