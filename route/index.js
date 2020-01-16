import express from 'express';
const router = express.Router();

router.get('/', function(request, response, next) {
    response.json({
        'message': 'Welcome',
    });
});

export default router;
