﻿using System;
using System.Collections.Generic;
using Microsoft.AspNetCore.Http;
using ServerAPI.Models.DefaultModel;

namespace ServerAPI.IService
{
    public interface IBuildingService
    {
        List<Company> GetAllBuildingsActive();
        List<Company> GetAllBuildings();


        string UploadFloorMap(IFormFileCollection files, string buildingId);






        Building GetLocations(string buildingId);
        string UpdateDataBuilding(IFormFile file);
        string CreateNewBuilding(Building building);

        string UpdateBuilding(Building building);
    }
}
