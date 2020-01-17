import buildingRepository from '../sequelize';

export default class BuildingService {

    findAll(request, response) {
        buildingRepository
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