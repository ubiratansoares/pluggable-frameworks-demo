package br.ufs.github.sample.pluggables.di;

import java.util.Arrays;
import java.util.List;

import javax.inject.Singleton;

import br.ufs.github.sample.pluggables.PluggableFramework;
import br.ufs.github.sample.pluggables.frameworks.CrashReporter;
import br.ufs.github.sample.pluggables.frameworks.ThreeTenBackporter;
import dagger.Module;
import dagger.Provides;

/**
 * Created by ubiratansoares on 9/28/16.
 */

@Module
public class PluggableFrameworksModule {

    @Provides @Singleton List<PluggableFramework> frameworks() {

        return Arrays.asList(
                new ThreeTenBackporter(),
                new CrashReporter()
        );
    }
}
