package E6;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class l extends f {

    /* renamed from: c, reason: collision with root package name */
    public final String f2648c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f2649d;

    /* renamed from: e, reason: collision with root package name */
    public final Set f2650e;

    /* renamed from: f, reason: collision with root package name */
    public final Set f2651f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f2652g;

    /* renamed from: h, reason: collision with root package name */
    public final Set f2653h;

    /* renamed from: i, reason: collision with root package name */
    public final Set f2654i;

    /* renamed from: j, reason: collision with root package name */
    public String f2655j;

    /* renamed from: k, reason: collision with root package name */
    public String f2656k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2657l;

    /* renamed from: m, reason: collision with root package name */
    public final Boolean f2658m;

    /* renamed from: n, reason: collision with root package name */
    public final Set f2659n;

    /* renamed from: o, reason: collision with root package name */
    public final c f2660o;

    /* renamed from: p, reason: collision with root package name */
    public final String f2661p;

    public /* synthetic */ l(int i8, String str, String str2, Set set, Set set2, Set set3, Set set4, Set set5, Set set6, String str3, String str4, h hVar, int i9, boolean z8, boolean z9, Boolean bool, Set set7, c cVar, Set set8, String str5, int i10) {
        this((i10 & 1) != 0 ? 0 : i8, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? new LinkedHashSet() : set, (i10 & 16) != 0 ? new LinkedHashSet() : set2, (i10 & 32) != 0 ? new LinkedHashSet() : set3, (i10 & 64) != 0 ? new LinkedHashSet() : set4, (i10 & 128) != 0 ? new LinkedHashSet() : set5, (i10 & 256) != 0 ? new LinkedHashSet() : set6, (i10 & 512) != 0 ? "" : str3, (i10 & 1024) != 0 ? null : str4, (i10 & 2048) != 0 ? null : hVar, (i10 & 4096) != 0 ? -1 : i9, (i10 & 8192) != 0 ? false : z8, (i10 & 16384) != 0 ? false : z9, (32768 & i10) != 0 ? null : bool, (i10 & 65536) != 0 ? new LinkedHashSet() : set7, (i10 & 131072) != 0 ? null : cVar, (i10 & 262144) != 0 ? new LinkedHashSet() : set8, (i10 & 524288) == 0 ? str5 : "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(int i8, String name, String str, Set purposes, Set legIntPurposes, Set flexiblePurposes, Set specialPurposes, Set features, Set specialFeatures, String policyUrl, String str2, h hVar, int i9, boolean z8, boolean z9, Boolean bool, Set dataDeclaration, c cVar, Set urls, String deviceStorageDisclosureUrl) {
        super(i8, name);
        AbstractC3255y.i(name, "name");
        AbstractC3255y.i(purposes, "purposes");
        AbstractC3255y.i(legIntPurposes, "legIntPurposes");
        AbstractC3255y.i(flexiblePurposes, "flexiblePurposes");
        AbstractC3255y.i(specialPurposes, "specialPurposes");
        AbstractC3255y.i(features, "features");
        AbstractC3255y.i(specialFeatures, "specialFeatures");
        AbstractC3255y.i(policyUrl, "policyUrl");
        AbstractC3255y.i(dataDeclaration, "dataDeclaration");
        AbstractC3255y.i(urls, "urls");
        AbstractC3255y.i(deviceStorageDisclosureUrl, "deviceStorageDisclosureUrl");
        this.f2648c = str;
        this.f2649d = purposes;
        this.f2650e = legIntPurposes;
        this.f2651f = flexiblePurposes;
        this.f2652g = specialPurposes;
        this.f2653h = features;
        this.f2654i = specialFeatures;
        this.f2655j = policyUrl;
        this.f2656k = str2;
        this.f2657l = i9;
        this.f2658m = bool;
        this.f2659n = dataDeclaration;
        this.f2660o = cVar;
        this.f2661p = deviceStorageDisclosureUrl;
    }
}
