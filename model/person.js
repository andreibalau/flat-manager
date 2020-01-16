'use strict';
export default (sequelize, type) => {
  const Person = sequelize.define('Person', {
    id: {
      type: type.INTEGER,
      primaryKey: true,
      autoIncrement: true
    },
    firstname: type.STRING,
    lastname: type.STRING,
    age: type.INTEGER,
    email: type.STRING
  });

  Person.associate = function (models) {
    models.Person.belongsTo(models.Flat, {
      onDelete: "CASCADE",
      foreignKey: {
        allowNull: false
      }
    });
  };

  return Person;
};
