package G5;

import B5.s;
import O7.u;
import androidx.lifecycle.ViewModel;
import com.inmobi.cmp.core.model.portalconfig.PrivacyEncodingMode;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class l extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    public final s f3408a;

    /* renamed from: b, reason: collision with root package name */
    public final H6.f f3409b;

    /* renamed from: c, reason: collision with root package name */
    public final B5.e f3410c;

    /* renamed from: d, reason: collision with root package name */
    public final E6.l f3411d;

    /* renamed from: e, reason: collision with root package name */
    public final u f3412e;

    /* renamed from: f, reason: collision with root package name */
    public final O7.e f3413f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3414g;

    /* renamed from: h, reason: collision with root package name */
    public final M7.g f3415h;

    /* renamed from: i, reason: collision with root package name */
    public final J5.c f3416i;

    /* renamed from: j, reason: collision with root package name */
    public final O7.i f3417j;

    public l(s tcModel, H6.f portalConfig, B5.e googleVendorList, E6.l lVar, u portalConfigRepository, O7.e consentRepository, boolean z8, M7.g initScreen, J5.c gbcPurposeResponse, O7.i gbcConsentRepository) {
        AbstractC3255y.i(tcModel, "tcModel");
        AbstractC3255y.i(portalConfig, "portalConfig");
        AbstractC3255y.i(googleVendorList, "googleVendorList");
        AbstractC3255y.i(portalConfigRepository, "portalConfigRepository");
        AbstractC3255y.i(consentRepository, "consentRepository");
        AbstractC3255y.i(initScreen, "initScreen");
        AbstractC3255y.i(gbcPurposeResponse, "gbcPurposeResponse");
        AbstractC3255y.i(gbcConsentRepository, "gbcConsentRepository");
        this.f3408a = tcModel;
        this.f3409b = portalConfig;
        this.f3410c = googleVendorList;
        this.f3411d = lVar;
        this.f3412e = portalConfigRepository;
        this.f3413f = consentRepository;
        this.f3414g = z8;
        this.f3415h = initScreen;
        this.f3416i = gbcPurposeResponse;
        this.f3417j = gbcConsentRepository;
    }

    public final void a() {
        String str = this.f3409b.f3925b.f3872I;
        if (str != null) {
            PrivacyEncodingMode privacyEncodingMode = PrivacyEncodingMode.GPP;
            if (str.equals(privacyEncodingMode.getValue())) {
                this.f3413f.a(privacyEncodingMode, true);
                return;
            }
        }
        String str2 = this.f3409b.f3925b.f3872I;
        if (str2 != null) {
            PrivacyEncodingMode privacyEncodingMode2 = PrivacyEncodingMode.TCF;
            if (str2.equals(privacyEncodingMode2.getValue())) {
                this.f3413f.a(privacyEncodingMode2, true);
                return;
            }
        }
        this.f3413f.a(PrivacyEncodingMode.TCF_AND_GPP, true);
    }
}
