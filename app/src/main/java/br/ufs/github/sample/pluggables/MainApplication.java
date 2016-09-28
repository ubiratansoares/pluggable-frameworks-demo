package br.ufs.github.sample.pluggables;

import android.app.Application;

import java.util.List;

import javax.inject.Inject;

import br.ufs.github.sample.pluggables.di.DaggerFrameworksComponent;

/**
 * Created by ubiratansoares on 9/28/16.
 */

public class MainApplication extends Application {

    @Inject List<PluggableFramework> pluggables;

    @Override public void onCreate() {
        super.onCreate();
        setupFrameworks();
    }

    private void setupFrameworks() {

        DaggerFrameworksComponent.create().inject(this);
        // How many frameworks?  Debug builds or release ones?
        // Does it really matter?

        for (PluggableFramework framework : pluggables) {
            framework.plug(this);
        }
    }
}
