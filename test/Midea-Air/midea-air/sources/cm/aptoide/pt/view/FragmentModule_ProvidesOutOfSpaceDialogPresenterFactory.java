package cm.aptoide.pt.view;

import cm.aptoide.pt.crashreports.CrashReport;
import cm.aptoide.pt.download.view.outofspace.OutOfSpaceDialogPresenter;
import cm.aptoide.pt.download.view.outofspace.OutOfSpaceManager;
import cm.aptoide.pt.download.view.outofspace.OutOfSpaceNavigator;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class FragmentModule_ProvidesOutOfSpaceDialogPresenterFactory implements Provider {
    private final Provider<CrashReport> crashReporterProvider;
    private final FragmentModule module;
    private final Provider<OutOfSpaceManager> outOfSpaceManagerProvider;
    private final Provider<OutOfSpaceNavigator> outOfSpaceNavigatorProvider;

    public FragmentModule_ProvidesOutOfSpaceDialogPresenterFactory(FragmentModule fragmentModule, Provider<CrashReport> provider, Provider<OutOfSpaceManager> provider2, Provider<OutOfSpaceNavigator> provider3) {
        this.module = fragmentModule;
        this.crashReporterProvider = provider;
        this.outOfSpaceManagerProvider = provider2;
        this.outOfSpaceNavigatorProvider = provider3;
    }

    public static FragmentModule_ProvidesOutOfSpaceDialogPresenterFactory create(FragmentModule fragmentModule, Provider<CrashReport> provider, Provider<OutOfSpaceManager> provider2, Provider<OutOfSpaceNavigator> provider3) {
        return new FragmentModule_ProvidesOutOfSpaceDialogPresenterFactory(fragmentModule, provider, provider2, provider3);
    }

    public static OutOfSpaceDialogPresenter providesOutOfSpaceDialogPresenter(FragmentModule fragmentModule, CrashReport crashReport, OutOfSpaceManager outOfSpaceManager, OutOfSpaceNavigator outOfSpaceNavigator) {
        return (OutOfSpaceDialogPresenter) f.b.b.c(fragmentModule.providesOutOfSpaceDialogPresenter(crashReport, outOfSpaceManager, outOfSpaceNavigator));
    }

    @Override // javax.inject.Provider
    public OutOfSpaceDialogPresenter get() {
        return providesOutOfSpaceDialogPresenter(this.module, this.crashReporterProvider.get(), this.outOfSpaceManagerProvider.get(), this.outOfSpaceNavigatorProvider.get());
    }
}
