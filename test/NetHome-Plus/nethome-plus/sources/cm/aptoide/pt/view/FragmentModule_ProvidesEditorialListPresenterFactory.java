package cm.aptoide.pt.view;

import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.pt.UserFeedbackAnalytics;
import cm.aptoide.pt.editorialList.EditorialListAnalytics;
import cm.aptoide.pt.editorialList.EditorialListManager;
import cm.aptoide.pt.editorialList.EditorialListNavigator;
import cm.aptoide.pt.editorialList.EditorialListPresenter;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class FragmentModule_ProvidesEditorialListPresenterFactory implements Provider {
    private final Provider<AptoideAccountManager> aptoideAccountManagerProvider;
    private final Provider<EditorialListAnalytics> editorialListAnalyticsProvider;
    private final Provider<EditorialListManager> editorialListManagerProvider;
    private final Provider<EditorialListNavigator> editorialListNavigatorProvider;
    private final FragmentModule module;
    private final Provider<UserFeedbackAnalytics> userFeedbackAnalyticsProvider;

    public FragmentModule_ProvidesEditorialListPresenterFactory(FragmentModule fragmentModule, Provider<EditorialListManager> provider, Provider<AptoideAccountManager> provider2, Provider<EditorialListNavigator> provider3, Provider<EditorialListAnalytics> provider4, Provider<UserFeedbackAnalytics> provider5) {
        this.module = fragmentModule;
        this.editorialListManagerProvider = provider;
        this.aptoideAccountManagerProvider = provider2;
        this.editorialListNavigatorProvider = provider3;
        this.editorialListAnalyticsProvider = provider4;
        this.userFeedbackAnalyticsProvider = provider5;
    }

    public static FragmentModule_ProvidesEditorialListPresenterFactory create(FragmentModule fragmentModule, Provider<EditorialListManager> provider, Provider<AptoideAccountManager> provider2, Provider<EditorialListNavigator> provider3, Provider<EditorialListAnalytics> provider4, Provider<UserFeedbackAnalytics> provider5) {
        return new FragmentModule_ProvidesEditorialListPresenterFactory(fragmentModule, provider, provider2, provider3, provider4, provider5);
    }

    public static EditorialListPresenter providesEditorialListPresenter(FragmentModule fragmentModule, EditorialListManager editorialListManager, AptoideAccountManager aptoideAccountManager, EditorialListNavigator editorialListNavigator, EditorialListAnalytics editorialListAnalytics, UserFeedbackAnalytics userFeedbackAnalytics) {
        return (EditorialListPresenter) f.b.b.c(fragmentModule.providesEditorialListPresenter(editorialListManager, aptoideAccountManager, editorialListNavigator, editorialListAnalytics, userFeedbackAnalytics));
    }

    @Override // javax.inject.Provider
    public EditorialListPresenter get() {
        return providesEditorialListPresenter(this.module, this.editorialListManagerProvider.get(), this.aptoideAccountManagerProvider.get(), this.editorialListNavigatorProvider.get(), this.editorialListAnalyticsProvider.get(), this.userFeedbackAnalyticsProvider.get());
    }
}
