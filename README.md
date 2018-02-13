# Cache and Remote

/**
* En son kullanılacak olan observable yani remote
Observable<ProfileModel> localProfile = CCINextApp.getInstance().getLocalDataSource().getObProfileCache()
                .subscribeOn(Schedulers.computation());

        Observable<ProfileModel> remotelProfile = CCINextApp.getInstance().getApi().getProfile(sessionId, clientId, clientSecret)
                .map(ProfileResponse::getProfile);

        return Observable.concat(localProfile, remotelProfile)
                .observeOn(AndroidSchedulers.mainThread());
                
       /*
       *LocalDataSource'daki method 
       */
       @Override
        public Observable<ProfileModel> getObProfileCache() {
        ProfileModel profileModel=gson.fromJson(sharedPreferences.getString(PROFILE,null),ProfileModel.class);
        profileModel.setBalance( gson.fromJson(sharedPreferences.getString(PROFILE,null),ProfileModel.class).getBalance()+100);

        return Observable.just(profileModel);
    }
