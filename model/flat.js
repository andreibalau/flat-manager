import mongoose from 'mongoose';

const Flat = mongoose.model(
    "Flat",
    new mongoose.Schema({
        name: String,
        number: String,
        persons: [
            {
                type: mongoose.Schema.Types.ObjectId,
                ref: "Person"
            }
        ]
    })
);

module.exports = Flat;