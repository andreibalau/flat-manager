import peopleRepository from '../sequelize';

export default class PeopleService {

    findAll(request, response) {
        peopleRepository
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