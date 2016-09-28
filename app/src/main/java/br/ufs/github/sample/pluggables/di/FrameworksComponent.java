package br.ufs.github.sample.pluggables.di;

import javax.inject.Singleton;

import br.ufs.github.sample.pluggables.MainApplication;
import dagger.Component;

/**
 * Created by ubiratansoares on 9/28/16.
 */

@Singleton
@Component(modules = PluggableFrameworksModule.class)
public interface FrameworksComponent {

    void inject(MainApplication target);
}
