package k1;

import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: k1.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3105e {

    /* renamed from: a, reason: collision with root package name */
    private final Boolean f33327a;

    /* renamed from: b, reason: collision with root package name */
    private final Double f33328b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f33329c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f33330d;

    /* renamed from: e, reason: collision with root package name */
    private final Long f33331e;

    public C3105e(Boolean bool, Double d8, Integer num, Integer num2, Long l8) {
        this.f33327a = bool;
        this.f33328b = d8;
        this.f33329c = num;
        this.f33330d = num2;
        this.f33331e = l8;
    }

    public final Integer a() {
        return this.f33330d;
    }

    public final Long b() {
        return this.f33331e;
    }

    public final Boolean c() {
        return this.f33327a;
    }

    public final Integer d() {
        return this.f33329c;
    }

    public final Double e() {
        return this.f33328b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3105e)) {
            return false;
        }
        C3105e c3105e = (C3105e) obj;
        if (AbstractC3159y.d(this.f33327a, c3105e.f33327a) && AbstractC3159y.d(this.f33328b, c3105e.f33328b) && AbstractC3159y.d(this.f33329c, c3105e.f33329c) && AbstractC3159y.d(this.f33330d, c3105e.f33330d) && AbstractC3159y.d(this.f33331e, c3105e.f33331e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        Boolean bool = this.f33327a;
        int i8 = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i9 = hashCode * 31;
        Double d8 = this.f33328b;
        if (d8 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = d8.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        Integer num = this.f33329c;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        Integer num2 = this.f33330d;
        if (num2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num2.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        Long l8 = this.f33331e;
        if (l8 != null) {
            i8 = l8.hashCode();
        }
        return i12 + i8;
    }

    public String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f33327a + ", sessionSamplingRate=" + this.f33328b + ", sessionRestartTimeout=" + this.f33329c + ", cacheDuration=" + this.f33330d + ", cacheUpdatedTime=" + this.f33331e + ')';
    }
}
