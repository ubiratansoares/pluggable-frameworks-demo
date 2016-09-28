package br.ufs.github.sample.pluggables.frameworks;

import android.app.Application;
import android.content.Context;

import com.squareup.leakcanary.LeakCanary;

import br.ufs.github.sample.pluggables.PluggableFramework;

/**
 * Created by ubiratansoares on 9/28/16.
 */

public class MemoryLeakReporter implements PluggableFramework {

    @Override public void plug(Context application) {
        if (LeakCanary.isInAnalyzerProcess(application)) {
            return;
        }

        LeakCanary.install((Application) application);
    }
}
