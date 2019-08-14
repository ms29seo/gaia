gaia = db.getSiblingDB('gaia');
gaia.terraformModule.drop();
gaia.terraformModule.insert([
    {
        "_id": "e01f9925-a559-45a2-8a55-f93dc434c676",
        "name": "terraform-docker-mongo",
        "description": "A sample terraform 🌍 module for running a mongodb 🍃 database inside a docker 🐳 container",
        "gitRepositoryUrl": "https://github.com/juwit/terraform-docker-mongo.git",
        "directory": null,
        "gitBranch": "master",
        "cliVersion": "0.11.14",
        "authorizedTeams": [{"$ref": "team", "$id": "Ze Team"}],
        "estimatedMonthlyCost": 0.99,
        "estimatedMonthlyCostDescription": "Kamoulox",
        "variables": [
            {
                "name": "mongo_container_name",
                "description": "the name of the docker container",
                "defaultValue": null,
                "editable": true
            },
            {
                "name": "mongo_exposed_port",
                "description": "the exposed port of the mongo container",
                "defaultValue": null,
                "editable": true
            }
        ]
    },
    {
        "_id": "845543d0-20a5-466c-8978-33c9a4661606",
        "name": "terraform-docker-mongo-limited",
        "description": "A module only visible by admin and team Not Ze Team",
        "gitRepositoryUrl": "https://github.com/juwit/terraform-docker-mongo.git",
        "directory": null,
        "gitBranch": "master",
        "cliVersion": "0.11.14",
        "authorizedTeams": [{"$ref": "team", "$id": "Not Ze Team"}],
        "estimatedMonthlyCost": 9.99,
        "estimatedMonthlyCostDescription": "Not Ze Team! Not Ze Team!",
        "variables": []
    },
]);