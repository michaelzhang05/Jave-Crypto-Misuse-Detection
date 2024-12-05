package L7;

import M5.AbstractC1246t;
import android.os.Build;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.core.cmpapi.status.CmpStatus;
import com.inmobi.cmp.core.model.ACData;
import com.inmobi.cmp.core.model.GDPRData;
import com.inmobi.cmp.core.model.portalconfig.PrivacyEncodingMode;
import com.inmobi.cmp.data.storage.SharedStorage;
import com.inmobi.cmp.model.NonIABData;
import com.mbridge.msdk.MBridgeConstans;
import g6.AbstractC2725a;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;
import y5.AbstractC3997d;

/* loaded from: classes5.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public final SharedStorage f6719a;

    /* renamed from: b, reason: collision with root package name */
    public final y5.s f6720b;

    /* renamed from: c, reason: collision with root package name */
    public final ChoiceCmpCallback f6721c;

    /* renamed from: d, reason: collision with root package name */
    public final A5.f f6722d;

    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6723a;

        static {
            int[] iArr = new int[PrivacyEncodingMode.values().length];
            iArr[PrivacyEncodingMode.GPP.ordinal()] = 1;
            iArr[PrivacyEncodingMode.TCF.ordinal()] = 2;
            f6723a = iArr;
        }
    }

    public f(SharedStorage sharedStorage, y5.s tcModel, ChoiceCmpCallback choiceCmpCallback) {
        AbstractC3159y.i(sharedStorage, "sharedStorage");
        AbstractC3159y.i(tcModel, "tcModel");
        this.f6719a = sharedStorage;
        this.f6720b = tcModel;
        this.f6721c = choiceCmpCallback;
        this.f6722d = new A5.f(Boolean.TRUE, 2, AbstractC1246t.s(y5.l.CORE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // L7.e
    public void a(PrivacyEncodingMode encodingMode, boolean z8) {
        ChoiceCmpCallback choiceCmpCallback;
        Object valueOf;
        boolean z9;
        AbstractC3159y.i(encodingMode, "encodingMode");
        y5.s sVar = this.f6720b;
        int i8 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            ZonedDateTime now = ZonedDateTime.now(ZoneId.of("UTC"));
            ZonedDateTime of = ZonedDateTime.of(now.getYear(), now.getMonthValue(), now.getDayOfMonth(), 0, 0, 0, 0, ZoneOffset.UTC);
            sVar.f39935d = of;
            long epochMilli = of.toInstant().toEpochMilli();
            sVar.f39933b = epochMilli;
            sVar.f39934c = epochMilli;
        } else {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date());
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            long timeInMillis = calendar.getTimeInMillis();
            sVar.f39933b = timeInMillis;
            sVar.f39934c = timeInMillis;
        }
        int i9 = a.f6723a[encodingMode.ordinal()];
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
        SharedStorage sharedStorage = this.f6719a;
        N7.a aVar = N7.a.NON_IAB_CONSENT_ENCODED;
        y5.s sVar2 = this.f6720b;
        long j8 = sVar2.f39933b;
        long j9 = sVar2.f39934c;
        int i11 = sVar2.f39944m;
        int i12 = sVar2.f39945n;
        int maxId = sVar2.f39925A.getMaxId();
        Set<Integer> vendorConsents = sVar2.f39925A.getAcceptedItems();
        AbstractC3159y.i(vendorConsents, "vendorConsents");
        StringBuilder sb = new StringBuilder();
        String l8 = Long.toString(j8, AbstractC2725a.a(2));
        AbstractC3159y.h(l8, "toString(this, checkRadix(radix))");
        sb.append(l8);
        String l9 = Long.toString(j9, AbstractC2725a.a(2));
        AbstractC3159y.h(l9, "toString(this, checkRadix(radix))");
        sb.append(l9);
        String num = Integer.toString(i11, AbstractC2725a.a(2));
        AbstractC3159y.h(num, "toString(this, checkRadix(radix))");
        sb.append(num);
        String num2 = Integer.toString(i12, AbstractC2725a.a(2));
        AbstractC3159y.h(num2, "toString(this, checkRadix(radix))");
        sb.append(num2);
        String num3 = Integer.toString(maxId, AbstractC2725a.a(2));
        AbstractC3159y.h(num3, "toString(this, checkRadix(radix))");
        sb.append(num3);
        String str = "";
        if (!vendorConsents.isEmpty()) {
            Iterator<T> it = vendorConsents.iterator();
            while (it.hasNext()) {
                String num4 = Integer.toString(((Number) it.next()).intValue(), AbstractC2725a.a(2));
                AbstractC3159y.h(num4, "toString(this, checkRadix(radix))");
                while (true) {
                    int length = num4.length();
                    String num5 = Integer.toString(maxId, AbstractC2725a.a(2));
                    AbstractC3159y.h(num5, "toString(this, checkRadix(radix))");
                    if (length < num5.length()) {
                        num4 = AbstractC3159y.q(MBridgeConstans.ENDCARD_URL_TYPE_PL, num4);
                    }
                }
                str = AbstractC3159y.q(str, num4);
            }
        }
        sb.append(str);
        sharedStorage.e(aVar, A5.a.f484a.b(sb.toString()));
        if (z8) {
            ChoiceCmpCallback choiceCmpCallback2 = this.f6721c;
            if (choiceCmpCallback2 != null) {
                GDPRData gDPRData = new GDPRData(null, i10, 0 == true ? 1 : 0);
                gDPRData.setCmpStatus(CmpStatus.LOADED);
                choiceCmpCallback2.onIABVendorConsentGiven(gDPRData);
            }
            ChoiceCmpCallback choiceCmpCallback3 = this.f6721c;
            if (choiceCmpCallback3 != null) {
                if (this.f6719a.i(N7.a.TCF_GDPR_APPLIES) == 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                choiceCmpCallback3.onNonIABVendorConsentGiven(new NonIABData(z9, false, false, this.f6719a.j(N7.a.NON_IAB_CONSENT_ENCODED), this.f6720b.f39925A.getMap()));
            }
            if (this.f6719a.h(N7.a.GOOGLE_ENABLED) && (choiceCmpCallback = this.f6721c) != null) {
                Set<Integer> vendorsID = this.f6720b.f39926B.getAcceptedItems();
                AbstractC3159y.i(vendorsID, "vendorsID");
                String str2 = "1~";
                for (Object obj : vendorsID) {
                    int i13 = i8 + 1;
                    if (i8 < 0) {
                        AbstractC1246t.w();
                    }
                    int intValue = ((Number) obj).intValue();
                    if (i8 != 0) {
                        valueOf = AbstractC3159y.q(".", Integer.valueOf(intValue));
                    } else {
                        valueOf = Integer.valueOf(intValue);
                    }
                    str2 = AbstractC3159y.q(str2, valueOf);
                    i8 = i13;
                }
                choiceCmpCallback.onGoogleVendorConsentGiven(new ACData(str2));
            }
        }
    }

    public final void b() {
        Object valueOf;
        y5.s sVar = this.f6720b;
        SharedStorage sharedStorage = this.f6719a;
        String gppString = AbstractC3997d.f39888a.a(sVar);
        A5.b bVar = A5.b.f486a;
        String nonIabVendorConsents = bVar.a(sVar.f39925A);
        String nonIabVendorConsentsEncoded = I7.b.b(sVar.f39925A.toString());
        String nonIabVendorLegitimateInterests = bVar.a(sVar.f39928D);
        Set<Integer> vendorsID = sVar.f39926B.getAcceptedItems();
        AbstractC3159y.i(vendorsID, "vendorsID");
        String googleVendorConsents = "1~";
        int i8 = 0;
        for (Object obj : vendorsID) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                AbstractC1246t.w();
            }
            int intValue = ((Number) obj).intValue();
            if (i8 != 0) {
                valueOf = AbstractC3159y.q(".", Integer.valueOf(intValue));
            } else {
                valueOf = Integer.valueOf(intValue);
            }
            googleVendorConsents = AbstractC3159y.q(googleVendorConsents, valueOf);
            i8 = i9;
        }
        String iabVendorConsents = bVar.a(sVar.f39957z);
        String vendorLegitimateInterests = bVar.a(sVar.f39927C);
        String purposeConsents = bVar.a(sVar.f39949r);
        String purposeLegitimateInterests = bVar.a(sVar.f39950s);
        String specialFeatureOptions = bVar.a(sVar.f39948q);
        String publisherRestrictions = sVar.f39931G.f39904c.toString();
        String publisherConsents = bVar.a(sVar.f39953v);
        String publisherLegitimateInterests = bVar.a(sVar.f39954w);
        String publisherCustomConsents = bVar.a(sVar.f39955x);
        String publisherCustomLegitimateInterests = bVar.a(sVar.f39956y);
        sharedStorage.getClass();
        AbstractC3159y.i(gppString, "gppString");
        AbstractC3159y.i(nonIabVendorConsents, "nonIabVendorConsents");
        AbstractC3159y.i(nonIabVendorConsentsEncoded, "nonIabVendorConsentsEncoded");
        AbstractC3159y.i(nonIabVendorLegitimateInterests, "nonIabVendorLegitimateInterests");
        AbstractC3159y.i(googleVendorConsents, "googleVendorConsents");
        AbstractC3159y.i(iabVendorConsents, "iabVendorConsents");
        AbstractC3159y.i(vendorLegitimateInterests, "vendorLegitimateInterests");
        AbstractC3159y.i(purposeConsents, "purposeConsents");
        AbstractC3159y.i(purposeLegitimateInterests, "purposeLegitimateInterests");
        AbstractC3159y.i(specialFeatureOptions, "specialFeatureOptions");
        AbstractC3159y.i(publisherRestrictions, "publisherRestrictions");
        AbstractC3159y.i(publisherConsents, "publisherConsents");
        AbstractC3159y.i(publisherLegitimateInterests, "publisherLegitimateInterests");
        AbstractC3159y.i(publisherCustomConsents, "publisherCustomConsents");
        AbstractC3159y.i(publisherCustomLegitimateInterests, "publisherCustomLegitimateInterests");
        sharedStorage.e(N7.a.NON_IAB_VENDOR_CONSENTS, nonIabVendorConsents);
        N7.a aVar = N7.a.NON_IAB_VENDOR_CONSENT_HASH;
        sharedStorage.e(aVar, I7.b.b(nonIabVendorConsentsEncoded));
        sharedStorage.e(N7.a.NON_IAB_VENDOR_LEG_INTERESTS, nonIabVendorLegitimateInterests);
        sharedStorage.e(N7.a.OPTION_HASH, AbstractC3159y.q(sharedStorage.j(aVar), sharedStorage.j(N7.a.PORTAL_CONFIG_HASH)));
        sharedStorage.e(N7.a.ADDTL_CONSENT, googleVendorConsents);
        sharedStorage.e(N7.a.GPP_STRING, gppString);
        sharedStorage.e(N7.a.GPP_VENDOR_CONSENTS, iabVendorConsents);
        sharedStorage.e(N7.a.GPP_VENDOR_LEGITIMATE_INTERESTS, vendorLegitimateInterests);
        sharedStorage.e(N7.a.GPP_PURPOSE_CONSENTS, purposeConsents);
        sharedStorage.e(N7.a.GPP_PURPOSE_LEGITIMATE_INTERESTS, purposeLegitimateInterests);
        sharedStorage.e(N7.a.GPP_SPECIAL_FEATURES_OPT_INS, specialFeatureOptions);
        sharedStorage.e(N7.a.GPP_PUBLISHER_RESTRICTIONS, publisherRestrictions);
        sharedStorage.e(N7.a.GPP_PUBLISHER_CONSENT, publisherConsents);
        sharedStorage.e(N7.a.GPP_PUBLISHER_LEGITIMATE_INTERESTS, publisherLegitimateInterests);
        sharedStorage.e(N7.a.GPP_PUBLISHER_CUSTOM_PURPOSES_CONSENTS, publisherCustomConsents);
        sharedStorage.e(N7.a.GPP_PUBLISHER_CUSTOM_PURPOSES_LEGITIMATE_INTERESTS, publisherCustomLegitimateInterests);
    }

    public final void c() {
        Object valueOf;
        y5.s sVar = this.f6720b;
        SharedStorage sharedStorage = this.f6719a;
        String tcString = y5.v.f39961a.a(sVar, this.f6722d);
        A5.b bVar = A5.b.f486a;
        String nonIabVendorConsents = bVar.a(sVar.f39925A);
        String nonIabVendorConsentsEncoded = I7.b.b(sVar.f39925A.toString());
        String nonIabVendorLegitimateInterests = bVar.a(sVar.f39928D);
        Set<Integer> vendorsID = sVar.f39926B.getAcceptedItems();
        AbstractC3159y.i(vendorsID, "vendorsID");
        String googleVendorConsents = "1~";
        int i8 = 0;
        for (Object obj : vendorsID) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                AbstractC1246t.w();
            }
            int intValue = ((Number) obj).intValue();
            if (i8 != 0) {
                valueOf = AbstractC3159y.q(".", Integer.valueOf(intValue));
            } else {
                valueOf = Integer.valueOf(intValue);
            }
            googleVendorConsents = AbstractC3159y.q(googleVendorConsents, valueOf);
            i8 = i9;
        }
        String iabVendorConsents = bVar.a(sVar.f39957z);
        String vendorLegitimateInterests = bVar.a(sVar.f39927C);
        String purposeConsents = bVar.a(sVar.f39949r);
        String purposeLegitimateInterests = bVar.a(sVar.f39950s);
        String specialFeatureOptions = bVar.a(sVar.f39948q);
        String publisherRestrictions = sVar.f39931G.f39904c.toString();
        String publisherConsents = bVar.a(sVar.f39953v);
        String publisherLegitimateInterests = bVar.a(sVar.f39954w);
        String publisherCustomConsents = bVar.a(sVar.f39955x);
        String publisherCustomLegitimateInterests = bVar.a(sVar.f39956y);
        sharedStorage.getClass();
        AbstractC3159y.i(tcString, "tcString");
        AbstractC3159y.i(nonIabVendorConsents, "nonIabVendorConsents");
        AbstractC3159y.i(nonIabVendorConsentsEncoded, "nonIabVendorConsentsEncoded");
        AbstractC3159y.i(nonIabVendorLegitimateInterests, "nonIabVendorLegitimateInterests");
        AbstractC3159y.i(googleVendorConsents, "googleVendorConsents");
        AbstractC3159y.i(iabVendorConsents, "iabVendorConsents");
        AbstractC3159y.i(vendorLegitimateInterests, "vendorLegitimateInterests");
        AbstractC3159y.i(purposeConsents, "purposeConsents");
        AbstractC3159y.i(purposeLegitimateInterests, "purposeLegitimateInterests");
        AbstractC3159y.i(specialFeatureOptions, "specialFeatureOptions");
        AbstractC3159y.i(publisherRestrictions, "publisherRestrictions");
        AbstractC3159y.i(publisherConsents, "publisherConsents");
        AbstractC3159y.i(publisherLegitimateInterests, "publisherLegitimateInterests");
        AbstractC3159y.i(publisherCustomConsents, "publisherCustomConsents");
        AbstractC3159y.i(publisherCustomLegitimateInterests, "publisherCustomLegitimateInterests");
        sharedStorage.e(N7.a.TC_STRING, tcString);
        sharedStorage.e(N7.a.NON_IAB_VENDOR_CONSENTS, nonIabVendorConsents);
        N7.a aVar = N7.a.NON_IAB_VENDOR_CONSENT_HASH;
        sharedStorage.e(aVar, I7.b.b(nonIabVendorConsentsEncoded));
        sharedStorage.e(N7.a.NON_IAB_VENDOR_LEG_INTERESTS, nonIabVendorLegitimateInterests);
        sharedStorage.e(N7.a.OPTION_HASH, AbstractC3159y.q(sharedStorage.j(aVar), sharedStorage.j(N7.a.PORTAL_CONFIG_HASH)));
        sharedStorage.e(N7.a.ADDTL_CONSENT, googleVendorConsents);
        sharedStorage.e(N7.a.TCF_VENDOR_CONSENTS, iabVendorConsents);
        sharedStorage.e(N7.a.TCF_VENDOR_LEGITIMATE_INTERESTS, vendorLegitimateInterests);
        sharedStorage.e(N7.a.TCF_PURPOSE_CONSENTS, purposeConsents);
        sharedStorage.e(N7.a.TCF_PURPOSE_LEGITIMATE_INTERESTS, purposeLegitimateInterests);
        sharedStorage.e(N7.a.TCF_SPECIAL_FEATURES_OPT_INS, specialFeatureOptions);
        sharedStorage.e(N7.a.TCF_PUBLISHER_RESTRICTIONS, publisherRestrictions);
        sharedStorage.e(N7.a.TCF_PUBLISHER_CONSENT, publisherConsents);
        sharedStorage.e(N7.a.TCF_PUBLISHER_LEGITIMATE_INTERESTS, publisherLegitimateInterests);
        sharedStorage.e(N7.a.TCF_PUBLISHER_CUSTOM_PURPOSES_CONSENTS, publisherCustomConsents);
        sharedStorage.e(N7.a.TCF_PUBLISHER_CUSTOM_PURPOSES_LEGITIMATE_INTERESTS, publisherCustomLegitimateInterests);
    }
}
