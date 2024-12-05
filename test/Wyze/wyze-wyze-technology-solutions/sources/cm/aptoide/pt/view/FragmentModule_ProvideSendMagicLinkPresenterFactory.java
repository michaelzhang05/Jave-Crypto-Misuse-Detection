package cm.aptoide.pt.view;

import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.pt.account.AgentPersistence;
import cm.aptoide.pt.account.view.magiclink.SendMagicLinkNavigator;
import cm.aptoide.pt.account.view.magiclink.SendMagicLinkPresenter;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class FragmentModule_ProvideSendMagicLinkPresenterFactory implements Provider {
    private final Provider<AptoideAccountManager> accountManagerProvider;
    private final Provider<AgentPersistence> agentPersitenceProvider;
    private final FragmentModule module;
    private final Provider<SendMagicLinkNavigator> navigatorProvider;

    public FragmentModule_ProvideSendMagicLinkPresenterFactory(FragmentModule fragmentModule, Provider<AptoideAccountManager> provider, Provider<SendMagicLinkNavigator> provider2, Provider<AgentPersistence> provider3) {
        this.module = fragmentModule;
        this.accountManagerProvider = provider;
        this.navigatorProvider = provider2;
        this.agentPersitenceProvider = provider3;
    }

    public static FragmentModule_ProvideSendMagicLinkPresenterFactory create(FragmentModule fragmentModule, Provider<AptoideAccountManager> provider, Provider<SendMagicLinkNavigator> provider2, Provider<AgentPersistence> provider3) {
        return new FragmentModule_ProvideSendMagicLinkPresenterFactory(fragmentModule, provider, provider2, provider3);
    }

    public static SendMagicLinkPresenter provideSendMagicLinkPresenter(FragmentModule fragmentModule, AptoideAccountManager aptoideAccountManager, SendMagicLinkNavigator sendMagicLinkNavigator, AgentPersistence agentPersistence) {
        return (SendMagicLinkPresenter) f.b.b.c(fragmentModule.provideSendMagicLinkPresenter(aptoideAccountManager, sendMagicLinkNavigator, agentPersistence));
    }

    @Override // javax.inject.Provider
    public SendMagicLinkPresenter get() {
        return provideSendMagicLinkPresenter(this.module, this.accountManagerProvider.get(), this.navigatorProvider.get(), this.agentPersitenceProvider.get());
    }
}
