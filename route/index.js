import BuildingService from '../service/buildingService';
import StairService from '../service/stairService';
import FlatService from '../service/flatService';
import PeopleService from '../service/peopleService';

const buildingService = new BuildingService();
const stairService = new StairService();
const flatService = new FlatService();
const peopleService = new PeopleService();

export default (app) => {
    app.route('/').get((request, response, next) => {
        response.json({'message': 'Welcome'});
    });

    app.route('/api/v1/buildings')
        .get(buildingService.findAll)
        .post(buildingService.create);
    app.route('/api/v1/buildings/:id')
        .get(buildingService.findById)
        .put(buildingService.update)
        .delete(buildingService.delete);

    app.route('/api/v1/flats')
        .get(flatService.findAll)
        .post(flatService.create);
    app.route('/api/v1/flats/:id')
        .get(flatService.findById)
        .put(flatService.update)
        .delete(flatService.delete);

    app.route('/api/v1/stairs')
        .get(stairService.findAll)
        .post(stairService.create);
    app.route('/api/v1/stairs/:id')
        .get(stairService.findById)
        .put(stairService.update)
        .delete(stairService.delete);

    app.route('/api/v1/peoples')
        .get(peopleService.findAll)
        .post(peopleService.create);
    app.route('/api/v1/peoples/:id')
        .get(peopleService.findById)
        .put(peopleService.update)
        .delete(peopleService.delete);
}
