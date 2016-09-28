package br.ufs.github.sample.pluggables.frameworks;

import android.content.Context;

import com.jakewharton.threetenabp.AndroidThreeTen;

import br.ufs.github.sample.pluggables.PluggableFramework;

/**
 * Created by ubiratansoares on 9/28/16.
 */

public class ThreeTenBackporter implements PluggableFramework {

    @Override public void plug(Context application) {
        AndroidThreeTen.init(application);
    }
}
