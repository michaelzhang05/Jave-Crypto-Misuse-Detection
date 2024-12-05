package com.inmobi.cmp.core.model;

import B5.i;
import B5.j;
import B5.k;
import B5.l;
import B5.s;
import B5.v;
import D5.f;
import P5.AbstractC1378t;
import R7.d;
import androidx.annotation.Keep;
import com.inmobi.cmp.ChoiceCmp;
import com.inmobi.cmp.core.cmpapi.map.ConsentMap;
import com.inmobi.cmp.core.cmpapi.map.OutOfBandMap;
import com.inmobi.cmp.core.cmpapi.map.PublisherMap;
import com.inmobi.cmp.core.cmpapi.status.CmpStatus;
import com.inmobi.cmp.core.cmpapi.status.EventStatus;
import com.inmobi.cmp.core.model.portalconfig.PrivacyEncodingMode;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import p.C3731a;

@Keep
/* loaded from: classes4.dex */
public final class GDPRData {
    private Integer cmpId;
    private CmpStatus cmpStatus;
    private Integer cmpVersion;
    private EventStatus eventStatus;
    private Boolean gdprApplies;
    private String gppString;
    private boolean isServiceSpecific;
    private final OutOfBandMap outOfBand;
    private PrivacyEncodingMode privacyEncodingMode;
    private final PublisherMap publisher;
    private String publisherCC;
    private final ConsentMap purpose;
    private boolean purposeOneTreatment;
    private Map<String, Boolean> specialFeaturesOptions;
    private String tcString;
    private final int tcfPolicyVersion;
    private boolean useNonStandardStacks;
    private final ConsentMap vendor;

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18893a;

        static {
            int[] iArr = new int[PrivacyEncodingMode.values().length];
            iArr[PrivacyEncodingMode.TCF.ordinal()] = 1;
            iArr[PrivacyEncodingMode.GPP.ordinal()] = 2;
            f18893a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GDPRData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final Map<String, Map<String, k>> createRestrictions(j jVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (jVar.a() > 0) {
            int a8 = jVar.a();
            int i8 = 1;
            if (1 <= a8) {
                while (true) {
                    int i9 = i8 + 1;
                    for (i iVar : jVar.b(Integer.valueOf(i8))) {
                        if (!linkedHashMap.containsKey(String.valueOf(iVar.f944a))) {
                            linkedHashMap.put(String.valueOf(iVar.f944a), new LinkedHashMap());
                        }
                        Map map = (Map) linkedHashMap.get(String.valueOf(iVar.f944a));
                        if (map != null) {
                        }
                    }
                    if (i8 == a8) {
                        break;
                    }
                    i8 = i9;
                }
            }
        }
        return linkedHashMap;
    }

    private final int getPublisherVendorId() {
        Vector vector;
        s sVar = C3731a.f36893c;
        if (sVar == null || (vector = sVar.f995t) == null || vector.isEmpty()) {
            return -1;
        }
        return ((Number) AbstractC1378t.l0(vector.getKeys())).intValue();
    }

    public final Integer getCmpId() {
        return this.cmpId;
    }

    public final CmpStatus getCmpStatus() {
        return this.cmpStatus;
    }

    public final Integer getCmpVersion() {
        return this.cmpVersion;
    }

    public final EventStatus getEventStatus() {
        return this.eventStatus;
    }

    public final Boolean getGdprApplies() {
        return this.gdprApplies;
    }

    public final String getGppString() {
        return this.gppString;
    }

    public final OutOfBandMap getOutOfBand() {
        return this.outOfBand;
    }

    public final PrivacyEncodingMode getPrivacyEncodingMode() {
        return this.privacyEncodingMode;
    }

    public final PublisherMap getPublisher() {
        return this.publisher;
    }

    public final String getPublisherCC() {
        return this.publisherCC;
    }

    public final ConsentMap getPurpose() {
        return this.purpose;
    }

    public final boolean getPurposeOneTreatment() {
        return this.purposeOneTreatment;
    }

    public final Map<String, Boolean> getSpecialFeaturesOptions() {
        return this.specialFeaturesOptions;
    }

    public final String getTcString() {
        return this.tcString;
    }

    public final int getTcfPolicyVersion() {
        return this.tcfPolicyVersion;
    }

    public final boolean getUseNonStandardStacks() {
        return this.useNonStandardStacks;
    }

    public final ConsentMap getVendor() {
        return this.vendor;
    }

    public final boolean isServiceSpecific() {
        return this.isServiceSpecific;
    }

    public final void setCmpId(Integer num) {
        this.cmpId = num;
    }

    public final void setCmpStatus(CmpStatus cmpStatus) {
        AbstractC3255y.i(cmpStatus, "<set-?>");
        this.cmpStatus = cmpStatus;
    }

    public final void setCmpVersion(Integer num) {
        this.cmpVersion = num;
    }

    public final void setEventStatus(EventStatus eventStatus) {
        this.eventStatus = eventStatus;
    }

    public final void setGdprApplies(Boolean bool) {
        this.gdprApplies = bool;
    }

    public final void setGppString(String str) {
        this.gppString = str;
    }

    public final void setPrivacyEncodingMode(PrivacyEncodingMode privacyEncodingMode) {
        this.privacyEncodingMode = privacyEncodingMode;
    }

    public final void setPublisherCC(String str) {
        this.publisherCC = str;
    }

    public final void setPurposeOneTreatment(boolean z8) {
        this.purposeOneTreatment = z8;
    }

    public final void setServiceSpecific(boolean z8) {
        this.isServiceSpecific = z8;
    }

    public final void setSpecialFeaturesOptions(Map<String, Boolean> map) {
        AbstractC3255y.i(map, "<set-?>");
        this.specialFeaturesOptions = map;
    }

    public final void setTcString(String str) {
        this.tcString = str;
    }

    public final void setUseNonStandardStacks(boolean z8) {
        this.useNonStandardStacks = z8;
    }

    public GDPRData(Set<Integer> set) {
        this.tcfPolicyVersion = 2;
        C3731a c3731a = C3731a.f36891a;
        this.eventStatus = null;
        this.cmpStatus = c3731a.a();
        this.purpose = new ConsentMap(null, null, 3, null);
        this.vendor = new ConsentMap(null, null, 3, null);
        this.specialFeaturesOptions = new LinkedHashMap();
        this.publisher = new PublisherMap(0, null, null, null, null, 31, null);
        this.outOfBand = new OutOfBandMap(null, null, 3, null);
        c3731a.b(ChoiceCmp.INSTANCE.getTcModel$app_release());
        s f8 = c3731a.f();
        if (f8 == null) {
            return;
        }
        F6.j jVar = F6.j.f2865a;
        d dVar = d.f9662a;
        setPrivacyEncodingMode(jVar.a(dVar.j().a().a()));
        PrivacyEncodingMode privacyEncodingMode = getPrivacyEncodingMode();
        int i8 = privacyEncodingMode == null ? -1 : a.f18893a[privacyEncodingMode.ordinal()];
        if (i8 == 1) {
            c3731a.e(v.f1005a.a(f8, new f(Boolean.TRUE, 2, AbstractC1378t.s(l.CORE))));
            setTcString(c3731a.g());
        } else if (i8 != 2) {
            c3731a.e(v.f1005a.a(f8, new f(Boolean.TRUE, 2, AbstractC1378t.s(l.CORE))));
            setTcString(c3731a.g());
            c3731a.c(B5.d.f932a.a(f8));
            setGppString(c3731a.d());
        } else {
            c3731a.c(B5.d.f932a.a(f8));
            setGppString(c3731a.d());
        }
        setServiceSpecific(f8.w());
        setUseNonStandardStacks(f8.r());
        setPurposeOneTreatment(f8.p());
        setPublisherCC(f8.i());
        setCmpId(Integer.valueOf(f8.a()));
        setCmpVersion(Integer.valueOf(f8.d()));
        setGdprApplies(Boolean.valueOf(dVar.m().i(Q7.a.TCF_GDPR_APPLIES) == 1));
        OutOfBandMap outOfBand = getOutOfBand();
        outOfBand.setAllowedVendors(jVar.c(f8.u(), set));
        outOfBand.setDisclosedVendors(jVar.c(f8.v(), set));
        ConsentMap purpose = getPurpose();
        purpose.setConsents(jVar.b(f8.n()));
        purpose.setLegitimateInterests(jVar.b(f8.o()));
        ConsentMap vendor = getVendor();
        vendor.setConsents(jVar.b(f8.s()));
        vendor.setLegitimateInterests(jVar.b(f8.t()));
        setSpecialFeaturesOptions(jVar.b(f8.q()));
        PublisherMap publisher = getPublisher();
        publisher.setVendorId(getPublisherVendorId());
        publisher.setConsents(jVar.b(f8.h()));
        publisher.setLegitimateInterests(jVar.b(f8.l()));
        ConsentMap customPurpose = publisher.getCustomPurpose();
        customPurpose.setConsents(jVar.b(f8.j()));
        customPurpose.setLegitimateInterests(jVar.b(f8.k()));
        publisher.setRestrictions(createRestrictions(f8.m()));
    }

    public /* synthetic */ GDPRData(Set set, int i8, AbstractC3247p abstractC3247p) {
        this((i8 & 1) != 0 ? null : set);
    }
}
