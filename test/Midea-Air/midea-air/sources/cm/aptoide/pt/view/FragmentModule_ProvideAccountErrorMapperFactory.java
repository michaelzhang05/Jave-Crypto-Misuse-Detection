package cm.aptoide.pt.view;

import cm.aptoide.pt.account.view.AccountErrorMapper;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class FragmentModule_ProvideAccountErrorMapperFactory implements Provider {
    private final FragmentModule module;

    public FragmentModule_ProvideAccountErrorMapperFactory(FragmentModule fragmentModule) {
        this.module = fragmentModule;
    }

    public static FragmentModule_ProvideAccountErrorMapperFactory create(FragmentModule fragmentModule) {
        return new FragmentModule_ProvideAccountErrorMapperFactory(fragmentModule);
    }

    public static AccountErrorMapper provideAccountErrorMapper(FragmentModule fragmentModule) {
        return (AccountErrorMapper) f.b.b.c(fragmentModule.provideAccountErrorMapper());
    }

    @Override // javax.inject.Provider
    public AccountErrorMapper get() {
        return provideAccountErrorMapper(this.module);
    }
}
