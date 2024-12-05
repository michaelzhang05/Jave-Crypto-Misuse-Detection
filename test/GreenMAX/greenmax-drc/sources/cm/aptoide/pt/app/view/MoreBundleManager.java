package cm.aptoide.pt.app.view;

import cm.aptoide.pt.home.bundles.BundlesRepository;
import cm.aptoide.pt.home.bundles.HomeBundlesModel;
import rx.Single;

/* loaded from: classes.dex */
public class MoreBundleManager {
    private final BundlesRepository bundlesRepository;

    public MoreBundleManager(BundlesRepository bundlesRepository) {
        this.bundlesRepository = bundlesRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleEmptyBundles, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Single<HomeBundlesModel> b(String str, String str2, HomeBundlesModel homeBundlesModel) {
        if (isOnlyEmptyBundles(homeBundlesModel)) {
            return loadNextBundles(str, str2);
        }
        return Single.m(homeBundlesModel);
    }

    private boolean isOnlyEmptyBundles(HomeBundlesModel homeBundlesModel) {
        return (homeBundlesModel.hasErrors() || homeBundlesModel.isLoading() || !homeBundlesModel.getList().isEmpty()) ? false : true;
    }

    public boolean hasMore(String str) {
        return this.bundlesRepository.hasMore(str);
    }

    public Single<HomeBundlesModel> loadBundle(final String str, final String str2) {
        return this.bundlesRepository.loadBundles(str, str2).i(new rx.m.e() { // from class: cm.aptoide.pt.app.view.wd
            @Override // rx.m.e
            public final Object call(Object obj) {
                return MoreBundleManager.this.a(str, str2, (HomeBundlesModel) obj);
            }
        });
    }

    public Single<HomeBundlesModel> loadFreshBundles(String str, String str2) {
        return this.bundlesRepository.loadFreshBundles(str, str2);
    }

    public Single<HomeBundlesModel> loadNextBundles(final String str, final String str2) {
        return this.bundlesRepository.loadNextBundles(str, str2).i(new rx.m.e() { // from class: cm.aptoide.pt.app.view.vd
            @Override // rx.m.e
            public final Object call(Object obj) {
                return MoreBundleManager.this.b(str, str2, (HomeBundlesModel) obj);
            }
        });
    }
}
