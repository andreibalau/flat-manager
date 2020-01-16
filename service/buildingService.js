import Building from '../model/building';

class BuildingService {

    create(building) {
        return Building
            .create(building)
            .then(b => {
                console.log(`Building created: ${b}`);
                return b;
            });
    }

    findAll() {
        return Building.find();
    }

    addStair(buildingId, stair) {
        Building
            .findByIdAndUpdate(
                buildingId,
                {
                    $push: {
                        stairs: stair
                    }
                },
                { useFindAndModify: false }
            );
    }

}
const buildingService = new BuildingService();
export default buildingService;
