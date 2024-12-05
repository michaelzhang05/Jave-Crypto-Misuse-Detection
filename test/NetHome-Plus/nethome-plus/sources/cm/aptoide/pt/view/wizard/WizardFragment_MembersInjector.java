package cm.aptoide.pt.view.wizard;

import javax.inject.Provider;

/* loaded from: classes.dex */
public final class WizardFragment_MembersInjector implements f.a<WizardFragment> {
    private final Provider<WizardFragmentProvider> wizardFragmentProvider;
    private final Provider<WizardPresenter> wizardPresenterProvider;

    public WizardFragment_MembersInjector(Provider<WizardPresenter> provider, Provider<WizardFragmentProvider> provider2) {
        this.wizardPresenterProvider = provider;
        this.wizardFragmentProvider = provider2;
    }

    public static f.a<WizardFragment> create(Provider<WizardPresenter> provider, Provider<WizardFragmentProvider> provider2) {
        return new WizardFragment_MembersInjector(provider, provider2);
    }

    public static void injectWizardFragmentProvider(WizardFragment wizardFragment, WizardFragmentProvider wizardFragmentProvider) {
        wizardFragment.wizardFragmentProvider = wizardFragmentProvider;
    }

    public static void injectWizardPresenter(WizardFragment wizardFragment, WizardPresenter wizardPresenter) {
        wizardFragment.wizardPresenter = wizardPresenter;
    }

    public void injectMembers(WizardFragment wizardFragment) {
        injectWizardPresenter(wizardFragment, this.wizardPresenterProvider.get());
        injectWizardFragmentProvider(wizardFragment, this.wizardFragmentProvider.get());
    }
}
