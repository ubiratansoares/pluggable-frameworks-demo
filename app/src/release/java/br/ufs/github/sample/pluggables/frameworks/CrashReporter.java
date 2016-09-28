package br.ufs.github.sample.pluggables.frameworks;

import android.content.Context;

import com.bugsnag.android.Bugsnag;

import br.ufs.github.sample.pluggables.PluggableFramework;

/**
 * Created by ubiratansoares on 9/28/16.
 */

public class CrashReporter implements PluggableFramework {

    @Override public void plug(Context application) {
        Bugsnag.init(application);
    }
}
