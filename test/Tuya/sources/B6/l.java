package B6;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class l extends f {

    /* renamed from: c, reason: collision with root package name */
    public final String f1053c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f1054d;

    /* renamed from: e, reason: collision with root package name */
    public final Set f1055e;

    /* renamed from: f, reason: collision with root package name */
    public final Set f1056f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f1057g;

    /* renamed from: h, reason: collision with root package name */
    public final Set f1058h;

    /* renamed from: i, reason: collision with root package name */
    public final Set f1059i;

    /* renamed from: j, reason: collision with root package name */
    public String f1060j;

    /* renamed from: k, reason: collision with root package name */
    public String f1061k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1062l;

    /* renamed from: m, reason: collision with root package name */
    public final Boolean f1063m;

    /* renamed from: n, reason: collision with root package name */
    public final Set f1064n;

    /* renamed from: o, reason: collision with root package name */
    public final c f1065o;

    /* renamed from: p, reason: collision with root package name */
    public final String f1066p;

    public /* synthetic */ l(int i8, String str, String str2, Set set, Set set2, Set set3, Set set4, Set set5, Set set6, String str3, String str4, h hVar, int i9, boolean z8, boolean z9, Boolean bool, Set set7, c cVar, Set set8, String str5, int i10) {
        this((i10 & 1) != 0 ? 0 : i8, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? new LinkedHashSet() : set, (i10 & 16) != 0 ? new LinkedHashSet() : set2, (i10 & 32) != 0 ? new LinkedHashSet() : set3, (i10 & 64) != 0 ? new LinkedHashSet() : set4, (i10 & 128) != 0 ? new LinkedHashSet() : set5, (i10 & 256) != 0 ? new LinkedHashSet() : set6, (i10 & 512) != 0 ? "" : str3, (i10 & 1024) != 0 ? null : str4, (i10 & 2048) != 0 ? null : hVar, (i10 & 4096) != 0 ? -1 : i9, (i10 & 8192) != 0 ? false : z8, (i10 & 16384) != 0 ? false : z9, (32768 & i10) != 0 ? null : bool, (i10 & 65536) != 0 ? new LinkedHashSet() : set7, (i10 & 131072) != 0 ? null : cVar, (i10 & 262144) != 0 ? new LinkedHashSet() : set8, (i10 & 524288) == 0 ? str5 : "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(int i8, String name, String str, Set purposes, Set legIntPurposes, Set flexiblePurposes, Set specialPurposes, Set features, Set specialFeatures, String policyUrl, String str2, h hVar, int i9, boolean z8, boolean z9, Boolean bool, Set dataDeclaration, c cVar, Set urls, String deviceStorageDisclosureUrl) {
        super(i8, name);
        AbstractC3159y.i(name, "name");
        AbstractC3159y.i(purposes, "purposes");
        AbstractC3159y.i(legIntPurposes, "legIntPurposes");
        AbstractC3159y.i(flexiblePurposes, "flexiblePurposes");
        AbstractC3159y.i(specialPurposes, "specialPurposes");
        AbstractC3159y.i(features, "features");
        AbstractC3159y.i(specialFeatures, "specialFeatures");
        AbstractC3159y.i(policyUrl, "policyUrl");
        AbstractC3159y.i(dataDeclaration, "dataDeclaration");
        AbstractC3159y.i(urls, "urls");
        AbstractC3159y.i(deviceStorageDisclosureUrl, "deviceStorageDisclosureUrl");
        this.f1053c = str;
        this.f1054d = purposes;
        this.f1055e = legIntPurposes;
        this.f1056f = flexiblePurposes;
        this.f1057g = specialPurposes;
        this.f1058h = features;
        this.f1059i = specialFeatures;
        this.f1060j = policyUrl;
        this.f1061k = str2;
        this.f1062l = i9;
        this.f1063m = bool;
        this.f1064n = dataDeclaration;
        this.f1065o = cVar;
        this.f1066p = deviceStorageDisclosureUrl;
    }
}
