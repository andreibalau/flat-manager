import stairRepository from '../sequelize';

export default class StairService {

    findAll(request, response) {
        stairRepository
            .findAll()
            .then(res => response.json(res));
    }

    create(request, response) {
        
    }

    delete(request, response) {

    }

    update(request, response) {

    }

    findById(request, response) {

    }

}