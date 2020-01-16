import mongoose from 'mongoose';

const Building = mongoose.model(
    "Building",
    new mongoose.Schema({
        address: String,
        city: String,
        county: String,
        country: String,
        name: String,
        stairs: [
            {
                type: mongoose.Schema.Types.ObjectId,
                ref: "Stair"
            }
        ]
    })
);

module.exports = Building;