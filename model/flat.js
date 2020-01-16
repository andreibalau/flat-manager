'use strict';
export default (sequelize, type) => {
  const Flat = sequelize.define('Flat', {
    id: {
      type: type.INTEGER,
      primaryKey: true,
      autoIncrement: true
    },
    name: type.STRING,
    number: type.STRING
  });

  Flat.associate = function (models) {
    models.Flat.belongsTo(models.Stair, {
      onDelete: "CASCADE",
      foreignKey: {
        allowNull: false
      }
    });
  };

  Flat.associate = function(models) {
    models.Flat.hasMany(models.Person);
  };

  return Flat;
};
