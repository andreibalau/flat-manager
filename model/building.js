'use strict';
export default (sequelize, type) => {
  const Building = sequelize.define('Building', {
    id: {
      type: type.INTEGER,
      primaryKey: true,
      autoIncrement: true
    },
    streetName: type.STRING,
    streetNumber: type.INTEGER,
    number: type.INTEGER,
    city: type.STRING,
    county: type.STRING,
    country: type.STRING
  });

  Building.associate = function(models) {
    models.Building.hasMany(models.Stair);
  };

  return Building;
};