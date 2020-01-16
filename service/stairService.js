import Stair from '../model/stair';

class StairService {

    create(stair) {
        return Stair
            .create(stair)
            .then(s => {
                console.log(`Stair created: ${s}`)
                return s; 
            });
    }

}
const stairService = new StairService();
export default stairService;
