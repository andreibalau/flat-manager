import flatRepository from '../sequelize';

export default class FlatService {

    findAll(request, response) {
        flatRepository
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