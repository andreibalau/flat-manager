import Sequelize from 'sequelize';
import BuildingModel from './model/building';
import FlatModel from './model/flat';
import PersonModel from './model/person';
import StairModel from './model/stair';

const sequelize = new Sequelize('postgres://app:password@localhost:5432/flat');

const buildingRepository = BuildingModel(sequelize, Sequelize);
const flatRepository = FlatModel(sequelize, Sequelize);
const personRepository = PersonModel(sequelize, Sequelize);
const stairRepository = StairModel(sequelize, Sequelize);

sequelize.sync({ force: true })
  .then(() => {
    console.log(`Database & tables created!`)
  })

module.exports = {
  buildingRepository,
  flatRepository,
  personRepository,
  stairRepository
};