import mongoose from 'mongoose';

const Stair = mongoose.model(
    "Stair",
    new mongoose.Schema({
        name: String,
        flats: [
            {
                type: mongoose.Schema.Types.ObjectId,
                ref: "Flat"
            }
        ]
    })
);

module.exports = Stair;