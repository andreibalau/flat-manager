import mongoose from 'mongoose';

const Person = mongoose.model(
    "Person",
    new mongoose.Schema({
        firstname: String,
        lastname: String,
        age: Number,
        email: String
    })
);

module.exports = Person;