package n1;

import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: n1.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3460e {

    /* renamed from: a, reason: collision with root package name */
    private final Boolean f35318a;

    /* renamed from: b, reason: collision with root package name */
    private final Double f35319b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f35320c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f35321d;

    /* renamed from: e, reason: collision with root package name */
    private final Long f35322e;

    public C3460e(Boolean bool, Double d8, Integer num, Integer num2, Long l8) {
        this.f35318a = bool;
        this.f35319b = d8;
        this.f35320c = num;
        this.f35321d = num2;
        this.f35322e = l8;
    }

    public final Integer a() {
        return this.f35321d;
    }

    public final Long b() {
        return this.f35322e;
    }

    public final Boolean c() {
        return this.f35318a;
    }

    public final Integer d() {
        return this.f35320c;
    }

    public final Double e() {
        return this.f35319b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3460e)) {
            return false;
        }
        C3460e c3460e = (C3460e) obj;
        if (AbstractC3255y.d(this.f35318a, c3460e.f35318a) && AbstractC3255y.d(this.f35319b, c3460e.f35319b) && AbstractC3255y.d(this.f35320c, c3460e.f35320c) && AbstractC3255y.d(this.f35321d, c3460e.f35321d) && AbstractC3255y.d(this.f35322e, c3460e.f35322e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        Boolean bool = this.f35318a;
        int i8 = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i9 = hashCode * 31;
        Double d8 = this.f35319b;
        if (d8 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = d8.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        Integer num = this.f35320c;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        Integer num2 = this.f35321d;
        if (num2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num2.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        Long l8 = this.f35322e;
        if (l8 != null) {
            i8 = l8.hashCode();
        }
        return i12 + i8;
    }

    public String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f35318a + ", sessionSamplingRate=" + this.f35319b + ", sessionRestartTimeout=" + this.f35320c + ", cacheDuration=" + this.f35321d + ", cacheUpdatedTime=" + this.f35322e + ')';
    }
}
