import Sequelize from 'sequelize';
import BuildingModel from './model/building';
import FlatModel from './model/flat';
import PersonModel from './model/person';
import StairModel from './model/stair';

const sequelize = new Sequelize('postgres://app:password@localhost:5432/flat');

const Building = BuildingModel(sequelize, Sequelize);
const Flat = FlatModel(sequelize, Sequelize);
const Person = PersonModel(sequelize, Sequelize);
const Stair = StairModel(sequelize, Sequelize);

sequelize.sync({ force: true })
  .then(() => {
    console.log(`Database & tables created!`)
  })

module.exports = {
    Building,
    Flat,
    Person,
    Stair
};