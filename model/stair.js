'use strict';
export default (sequelize, type) => {
  const Stair = sequelize.define('Stair', {
    id: {
      type: type.INTEGER,
      primaryKey: true,
      autoIncrement: true
    },
    name: type.STRING,
  });

  Stair.associate = function (models) {
    models.Stair.belongsTo(models.Building, {
      onDelete: "CASCADE",
      foreignKey: {
        allowNull: false
      }
    });
  };

  Stair.associate = function(models) {
    models.Stair.hasMany(models.Flat);
  };

  return Stair;
};