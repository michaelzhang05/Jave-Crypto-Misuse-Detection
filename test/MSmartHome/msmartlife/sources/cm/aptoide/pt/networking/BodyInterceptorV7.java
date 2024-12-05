package cm.aptoide.pt.networking;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextUtils;
import cm.aptoide.pt.dataprovider.ws.BodyInterceptor;
import cm.aptoide.pt.dataprovider.ws.v7.BaseBody;
import cm.aptoide.pt.preferences.AptoideMd5Manager;
import cm.aptoide.pt.preferences.managed.ManagerPreferences;
import cm.aptoide.pt.preferences.toolbox.ToolboxManager;
import cm.aptoide.pt.utils.AptoideUtils;
import cm.aptoide.pt.utils.q.QManager;
import rx.Single;
import rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class BodyInterceptorV7 implements BodyInterceptor<BaseBody> {
    private final AptoideMd5Manager aptoideMd5Manager;
    private final String aptoidePackage;
    private final int aptoideVersionCode;
    private final AuthenticationPersistence authenticationPersistence;
    private final Cdn cdn;
    private final IdsRepository idsRepository;
    private final QManager qManager;
    private final Resources resources;
    private final SharedPreferences sharedPreferences;

    public BodyInterceptorV7(IdsRepository idsRepository, AuthenticationPersistence authenticationPersistence, AptoideMd5Manager aptoideMd5Manager, String str, QManager qManager, Cdn cdn, SharedPreferences sharedPreferences, Resources resources, int i2) {
        this.idsRepository = idsRepository;
        this.authenticationPersistence = authenticationPersistence;
        this.aptoideMd5Manager = aptoideMd5Manager;
        this.aptoidePackage = str;
        this.qManager = qManager;
        this.cdn = cdn;
        this.aptoideVersionCode = i2;
        this.sharedPreferences = sharedPreferences;
        this.resources = resources;
    }

    private /* synthetic */ BaseBody lambda$intercept$0(Authentication authentication, BaseBody baseBody, String str) {
        if (authentication.isAuthenticated()) {
            baseBody.setAccessToken(authentication.getAccessToken());
        } else {
            baseBody.setAccessToken(null);
        }
        baseBody.setAptoideId(str);
        baseBody.setAptoideVercode(this.aptoideVersionCode);
        baseBody.setCdn(this.cdn.name().toLowerCase());
        baseBody.setLang(AptoideUtils.SystemU.getCountryCode(this.resources));
        baseBody.setQ(this.qManager.getFilters(ManagerPreferences.getHWSpecsFilter(this.sharedPreferences)));
        String forceCountry = ToolboxManager.getForceCountry(this.sharedPreferences);
        if (!TextUtils.isEmpty(forceCountry)) {
            baseBody.setCountry(forceCountry);
        }
        String aptoideMd5 = this.aptoideMd5Manager.getAptoideMd5();
        if (!aptoideMd5.isEmpty()) {
            baseBody.setAptoideMd5sum(aptoideMd5);
        }
        baseBody.setAptoidePackage(this.aptoidePackage);
        return baseBody;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$intercept$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single b(final BaseBody baseBody, final Authentication authentication) {
        return this.idsRepository.getUniqueIdentifier().n(new rx.m.e() { // from class: cm.aptoide.pt.networking.h
            @Override // rx.m.e
            public final Object call(Object obj) {
                BodyInterceptorV7 bodyInterceptorV7 = BodyInterceptorV7.this;
                Authentication authentication2 = authentication;
                BaseBody baseBody2 = baseBody;
                bodyInterceptorV7.a(authentication2, baseBody2, (String) obj);
                return baseBody2;
            }
        });
    }

    public /* synthetic */ BaseBody a(Authentication authentication, BaseBody baseBody, String str) {
        lambda$intercept$0(authentication, baseBody, str);
        return baseBody;
    }

    @Override // cm.aptoide.pt.dataprovider.ws.BodyInterceptor
    public Single<BaseBody> intercept(final BaseBody baseBody) {
        return this.authenticationPersistence.getAuthentication().i(new rx.m.e() { // from class: cm.aptoide.pt.networking.g
            @Override // rx.m.e
            public final Object call(Object obj) {
                return BodyInterceptorV7.this.b(baseBody, (Authentication) obj);
            }
        }).v(Schedulers.computation());
    }
}
