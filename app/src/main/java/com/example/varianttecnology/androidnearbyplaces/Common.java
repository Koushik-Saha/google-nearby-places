package com.example.varianttecnology.androidnearbyplaces;

import com.example.varianttecnology.androidnearbyplaces.Remote.IGoogleAPIService;
import com.example.varianttecnology.androidnearbyplaces.Remote.RetrofitClient;

public class Common {

    private static final String GOOGLE_API_URL = "https://maps.googleapis.com/";

    public static IGoogleAPIService getGoogleAPIService()
    {
        return RetrofitClient.getRetrofit(GOOGLE_API_URL).create(IGoogleAPIService.class);
    }
}
