package O7;

import P5.AbstractC1378t;
import android.os.Build;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.core.cmpapi.status.CmpStatus;
import com.inmobi.cmp.core.model.ACData;
import com.inmobi.cmp.core.model.GDPRData;
import com.inmobi.cmp.core.model.portalconfig.PrivacyEncodingMode;
import com.inmobi.cmp.data.storage.SharedStorage;
import com.inmobi.cmp.model.NonIABData;
import com.mbridge.msdk.MBridgeConstans;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.ZonedDateTime;
import j6.AbstractC3202a;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public final SharedStorage f8510a;

    /* renamed from: b, reason: collision with root package name */
    public final B5.s f8511b;

    /* renamed from: c, reason: collision with root package name */
    public final ChoiceCmpCallback f8512c;

    /* renamed from: d, reason: collision with root package name */
    public final D5.f f8513d;

    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8514a;

        static {
            int[] iArr = new int[PrivacyEncodingMode.values().length];
            iArr[PrivacyEncodingMode.GPP.ordinal()] = 1;
            iArr[PrivacyEncodingMode.TCF.ordinal()] = 2;
            f8514a = iArr;
        }
    }

    public f(SharedStorage sharedStorage, B5.s tcModel, ChoiceCmpCallback choiceCmpCallback) {
        AbstractC3255y.i(sharedStorage, "sharedStorage");
        AbstractC3255y.i(tcModel, "tcModel");
        this.f8510a = sharedStorage;
        this.f8511b = tcModel;
        this.f8512c = choiceCmpCallback;
        this.f8513d = new D5.f(Boolean.TRUE, 2, AbstractC1378t.s(B5.l.CORE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O7.e
    public void a(PrivacyEncodingMode encodingMode, boolean z8) {
        ChoiceCmpCallback choiceCmpCallback;
        Object valueOf;
        boolean z9;
        AbstractC3255y.i(encodingMode, "encodingMode");
        B5.s sVar = this.f8511b;
        int i8 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            ZonedDateTime now = ZonedDateTime.now(ZoneId.of("UTC"));
            ZonedDateTime of = ZonedDateTime.of(now.getYear(), now.getMonthValue(), now.getDayOfMonth(), 0, 0, 0, 0, ZoneOffset.UTC);
            sVar.f979d = of;
            long epochMilli = of.toInstant().toEpochMilli();
            sVar.f977b = epochMilli;
            sVar.f978c = epochMilli;
        } else {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date());
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            long timeInMillis = calendar.getTimeInMillis();
            sVar.f977b = timeInMillis;
            sVar.f978c = timeInMillis;
        }
        int i9 = a.f8514a[encodingMode.ordinal()];
        int i10 = 1;
        if (i9 != 1) {
            if (i9 != 2) {
                b();
                c();
            } else {
                c();
            }
        } else {
            b();
        }
        SharedStorage sharedStorage = this.f8510a;
        Q7.a aVar = Q7.a.NON_IAB_CONSENT_ENCODED;
        B5.s sVar2 = this.f8511b;
        long j8 = sVar2.f977b;
        long j9 = sVar2.f978c;
        int i11 = sVar2.f988m;
        int i12 = sVar2.f989n;
        int maxId = sVar2.f969A.getMaxId();
        Set<Integer> vendorConsents = sVar2.f969A.getAcceptedItems();
        AbstractC3255y.i(vendorConsents, "vendorConsents");
        StringBuilder sb = new StringBuilder();
        String l8 = Long.toString(j8, AbstractC3202a.a(2));
        AbstractC3255y.h(l8, "toString(this, checkRadix(radix))");
        sb.append(l8);
        String l9 = Long.toString(j9, AbstractC3202a.a(2));
        AbstractC3255y.h(l9, "toString(this, checkRadix(radix))");
        sb.append(l9);
        String num = Integer.toString(i11, AbstractC3202a.a(2));
        AbstractC3255y.h(num, "toString(this, checkRadix(radix))");
        sb.append(num);
        String num2 = Integer.toString(i12, AbstractC3202a.a(2));
        AbstractC3255y.h(num2, "toString(this, checkRadix(radix))");
        sb.append(num2);
        String num3 = Integer.toString(maxId, AbstractC3202a.a(2));
        AbstractC3255y.h(num3, "toString(this, checkRadix(radix))");
        sb.append(num3);
        String str = "";
        if (!vendorConsents.isEmpty()) {
            Iterator<T> it = vendorConsents.iterator();
            while (it.hasNext()) {
                String num4 = Integer.toString(((Number) it.next()).intValue(), AbstractC3202a.a(2));
                AbstractC3255y.h(num4, "toString(this, checkRadix(radix))");
                while (true) {
                    int length = num4.length();
                    String num5 = Integer.toString(maxId, AbstractC3202a.a(2));
                    AbstractC3255y.h(num5, "toString(this, checkRadix(radix))");
                    if (length < num5.length()) {
                        num4 = AbstractC3255y.q(MBridgeConstans.ENDCARD_URL_TYPE_PL, num4);
                    }
                }
                str = AbstractC3255y.q(str, num4);
            }
        }
        sb.append(str);
        sharedStorage.e(aVar, D5.a.f2206a.b(sb.toString()));
        if (z8) {
            ChoiceCmpCallback choiceCmpCallback2 = this.f8512c;
            if (choiceCmpCallback2 != null) {
                GDPRData gDPRData = new GDPRData(null, i10, 0 == true ? 1 : 0);
                gDPRData.setCmpStatus(CmpStatus.LOADED);
                choiceCmpCallback2.onIABVendorConsentGiven(gDPRData);
            }
            ChoiceCmpCallback choiceCmpCallback3 = this.f8512c;
            if (choiceCmpCallback3 != null) {
                if (this.f8510a.i(Q7.a.TCF_GDPR_APPLIES) == 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                choiceCmpCallback3.onNonIABVendorConsentGiven(new NonIABData(z9, false, false, this.f8510a.j(Q7.a.NON_IAB_CONSENT_ENCODED), this.f8511b.f969A.getMap()));
            }
            if (this.f8510a.h(Q7.a.GOOGLE_ENABLED) && (choiceCmpCallback = this.f8512c) != null) {
                Set<Integer> vendorsID = this.f8511b.f970B.getAcceptedItems();
                AbstractC3255y.i(vendorsID, "vendorsID");
                String str2 = "1~";
                for (Object obj : vendorsID) {
                    int i13 = i8 + 1;
                    if (i8 < 0) {
                        AbstractC1378t.w();
                    }
                    int intValue = ((Number) obj).intValue();
                    if (i8 != 0) {
                        valueOf = AbstractC3255y.q(".", Integer.valueOf(intValue));
                    } else {
                        valueOf = Integer.valueOf(intValue);
                    }
                    str2 = AbstractC3255y.q(str2, valueOf);
                    i8 = i13;
                }
                choiceCmpCallback.onGoogleVendorConsentGiven(new ACData(str2));
            }
        }
    }

    public final void b() {
        Object valueOf;
        B5.s sVar = this.f8511b;
        SharedStorage sharedStorage = this.f8510a;
        String gppString = B5.d.f932a.a(sVar);
        D5.b bVar = D5.b.f2208a;
        String nonIabVendorConsents = bVar.a(sVar.f969A);
        String nonIabVendorConsentsEncoded = L7.b.b(sVar.f969A.toString());
        String nonIabVendorLegitimateInterests = bVar.a(sVar.f972D);
        Set<Integer> vendorsID = sVar.f970B.getAcceptedItems();
        AbstractC3255y.i(vendorsID, "vendorsID");
        String googleVendorConsents = "1~";
        int i8 = 0;
        for (Object obj : vendorsID) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                AbstractC1378t.w();
            }
            int intValue = ((Number) obj).intValue();
            if (i8 != 0) {
                valueOf = AbstractC3255y.q(".", Integer.valueOf(intValue));
            } else {
                valueOf = Integer.valueOf(intValue);
            }
            googleVendorConsents = AbstractC3255y.q(googleVendorConsents, valueOf);
            i8 = i9;
        }
        String iabVendorConsents = bVar.a(sVar.f1001z);
        String vendorLegitimateInterests = bVar.a(sVar.f971C);
        String purposeConsents = bVar.a(sVar.f993r);
        String purposeLegitimateInterests = bVar.a(sVar.f994s);
        String specialFeatureOptions = bVar.a(sVar.f992q);
        String publisherRestrictions = sVar.f975G.f948c.toString();
        String publisherConsents = bVar.a(sVar.f997v);
        String publisherLegitimateInterests = bVar.a(sVar.f998w);
        String publisherCustomConsents = bVar.a(sVar.f999x);
        String publisherCustomLegitimateInterests = bVar.a(sVar.f1000y);
        sharedStorage.getClass();
        AbstractC3255y.i(gppString, "gppString");
        AbstractC3255y.i(nonIabVendorConsents, "nonIabVendorConsents");
        AbstractC3255y.i(nonIabVendorConsentsEncoded, "nonIabVendorConsentsEncoded");
        AbstractC3255y.i(nonIabVendorLegitimateInterests, "nonIabVendorLegitimateInterests");
        AbstractC3255y.i(googleVendorConsents, "googleVendorConsents");
        AbstractC3255y.i(iabVendorConsents, "iabVendorConsents");
        AbstractC3255y.i(vendorLegitimateInterests, "vendorLegitimateInterests");
        AbstractC3255y.i(purposeConsents, "purposeConsents");
        AbstractC3255y.i(purposeLegitimateInterests, "purposeLegitimateInterests");
        AbstractC3255y.i(specialFeatureOptions, "specialFeatureOptions");
        AbstractC3255y.i(publisherRestrictions, "publisherRestrictions");
        AbstractC3255y.i(publisherConsents, "publisherConsents");
        AbstractC3255y.i(publisherLegitimateInterests, "publisherLegitimateInterests");
        AbstractC3255y.i(publisherCustomConsents, "publisherCustomConsents");
        AbstractC3255y.i(publisherCustomLegitimateInterests, "publisherCustomLegitimateInterests");
        sharedStorage.e(Q7.a.NON_IAB_VENDOR_CONSENTS, nonIabVendorConsents);
        Q7.a aVar = Q7.a.NON_IAB_VENDOR_CONSENT_HASH;
        sharedStorage.e(aVar, L7.b.b(nonIabVendorConsentsEncoded));
        sharedStorage.e(Q7.a.NON_IAB_VENDOR_LEG_INTERESTS, nonIabVendorLegitimateInterests);
        sharedStorage.e(Q7.a.OPTION_HASH, AbstractC3255y.q(sharedStorage.j(aVar), sharedStorage.j(Q7.a.PORTAL_CONFIG_HASH)));
        sharedStorage.e(Q7.a.ADDTL_CONSENT, googleVendorConsents);
        sharedStorage.e(Q7.a.GPP_STRING, gppString);
        sharedStorage.e(Q7.a.GPP_VENDOR_CONSENTS, iabVendorConsents);
        sharedStorage.e(Q7.a.GPP_VENDOR_LEGITIMATE_INTERESTS, vendorLegitimateInterests);
        sharedStorage.e(Q7.a.GPP_PURPOSE_CONSENTS, purposeConsents);
        sharedStorage.e(Q7.a.GPP_PURPOSE_LEGITIMATE_INTERESTS, purposeLegitimateInterests);
        sharedStorage.e(Q7.a.GPP_SPECIAL_FEATURES_OPT_INS, specialFeatureOptions);
        sharedStorage.e(Q7.a.GPP_PUBLISHER_RESTRICTIONS, publisherRestrictions);
        sharedStorage.e(Q7.a.GPP_PUBLISHER_CONSENT, publisherConsents);
        sharedStorage.e(Q7.a.GPP_PUBLISHER_LEGITIMATE_INTERESTS, publisherLegitimateInterests);
        sharedStorage.e(Q7.a.GPP_PUBLISHER_CUSTOM_PURPOSES_CONSENTS, publisherCustomConsents);
        sharedStorage.e(Q7.a.GPP_PUBLISHER_CUSTOM_PURPOSES_LEGITIMATE_INTERESTS, publisherCustomLegitimateInterests);
    }

    public final void c() {
        Object valueOf;
        B5.s sVar = this.f8511b;
        SharedStorage sharedStorage = this.f8510a;
        String tcString = B5.v.f1005a.a(sVar, this.f8513d);
        D5.b bVar = D5.b.f2208a;
        String nonIabVendorConsents = bVar.a(sVar.f969A);
        String nonIabVendorConsentsEncoded = L7.b.b(sVar.f969A.toString());
        String nonIabVendorLegitimateInterests = bVar.a(sVar.f972D);
        Set<Integer> vendorsID = sVar.f970B.getAcceptedItems();
        AbstractC3255y.i(vendorsID, "vendorsID");
        String googleVendorConsents = "1~";
        int i8 = 0;
        for (Object obj : vendorsID) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                AbstractC1378t.w();
            }
            int intValue = ((Number) obj).intValue();
            if (i8 != 0) {
                valueOf = AbstractC3255y.q(".", Integer.valueOf(intValue));
            } else {
                valueOf = Integer.valueOf(intValue);
            }
            googleVendorConsents = AbstractC3255y.q(googleVendorConsents, valueOf);
            i8 = i9;
        }
        String iabVendorConsents = bVar.a(sVar.f1001z);
        String vendorLegitimateInterests = bVar.a(sVar.f971C);
        String purposeConsents = bVar.a(sVar.f993r);
        String purposeLegitimateInterests = bVar.a(sVar.f994s);
        String specialFeatureOptions = bVar.a(sVar.f992q);
        String publisherRestrictions = sVar.f975G.f948c.toString();
        String publisherConsents = bVar.a(sVar.f997v);
        String publisherLegitimateInterests = bVar.a(sVar.f998w);
        String publisherCustomConsents = bVar.a(sVar.f999x);
        String publisherCustomLegitimateInterests = bVar.a(sVar.f1000y);
        sharedStorage.getClass();
        AbstractC3255y.i(tcString, "tcString");
        AbstractC3255y.i(nonIabVendorConsents, "nonIabVendorConsents");
        AbstractC3255y.i(nonIabVendorConsentsEncoded, "nonIabVendorConsentsEncoded");
        AbstractC3255y.i(nonIabVendorLegitimateInterests, "nonIabVendorLegitimateInterests");
        AbstractC3255y.i(googleVendorConsents, "googleVendorConsents");
        AbstractC3255y.i(iabVendorConsents, "iabVendorConsents");
        AbstractC3255y.i(vendorLegitimateInterests, "vendorLegitimateInterests");
        AbstractC3255y.i(purposeConsents, "purposeConsents");
        AbstractC3255y.i(purposeLegitimateInterests, "purposeLegitimateInterests");
        AbstractC3255y.i(specialFeatureOptions, "specialFeatureOptions");
        AbstractC3255y.i(publisherRestrictions, "publisherRestrictions");
        AbstractC3255y.i(publisherConsents, "publisherConsents");
        AbstractC3255y.i(publisherLegitimateInterests, "publisherLegitimateInterests");
        AbstractC3255y.i(publisherCustomConsents, "publisherCustomConsents");
        AbstractC3255y.i(publisherCustomLegitimateInterests, "publisherCustomLegitimateInterests");
        sharedStorage.e(Q7.a.TC_STRING, tcString);
        sharedStorage.e(Q7.a.NON_IAB_VENDOR_CONSENTS, nonIabVendorConsents);
        Q7.a aVar = Q7.a.NON_IAB_VENDOR_CONSENT_HASH;
        sharedStorage.e(aVar, L7.b.b(nonIabVendorConsentsEncoded));
        sharedStorage.e(Q7.a.NON_IAB_VENDOR_LEG_INTERESTS, nonIabVendorLegitimateInterests);
        sharedStorage.e(Q7.a.OPTION_HASH, AbstractC3255y.q(sharedStorage.j(aVar), sharedStorage.j(Q7.a.PORTAL_CONFIG_HASH)));
        sharedStorage.e(Q7.a.ADDTL_CONSENT, googleVendorConsents);
        sharedStorage.e(Q7.a.TCF_VENDOR_CONSENTS, iabVendorConsents);
        sharedStorage.e(Q7.a.TCF_VENDOR_LEGITIMATE_INTERESTS, vendorLegitimateInterests);
        sharedStorage.e(Q7.a.TCF_PURPOSE_CONSENTS, purposeConsents);
        sharedStorage.e(Q7.a.TCF_PURPOSE_LEGITIMATE_INTERESTS, purposeLegitimateInterests);
        sharedStorage.e(Q7.a.TCF_SPECIAL_FEATURES_OPT_INS, specialFeatureOptions);
        sharedStorage.e(Q7.a.TCF_PUBLISHER_RESTRICTIONS, publisherRestrictions);
        sharedStorage.e(Q7.a.TCF_PUBLISHER_CONSENT, publisherConsents);
        sharedStorage.e(Q7.a.TCF_PUBLISHER_LEGITIMATE_INTERESTS, publisherLegitimateInterests);
        sharedStorage.e(Q7.a.TCF_PUBLISHER_CUSTOM_PURPOSES_CONSENTS, publisherCustomConsents);
        sharedStorage.e(Q7.a.TCF_PUBLISHER_CUSTOM_PURPOSES_LEGITIMATE_INTERESTS, publisherCustomLegitimateInterests);
    }
}
