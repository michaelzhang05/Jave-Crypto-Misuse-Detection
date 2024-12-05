package f3;

import com.stripe.android.model.Source;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: f3.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2663d {

    /* renamed from: a, reason: collision with root package name */
    private final String f31021a;

    /* renamed from: b, reason: collision with root package name */
    private final int f31022b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f31023c;

    /* renamed from: d, reason: collision with root package name */
    private final String f31024d;

    /* renamed from: e, reason: collision with root package name */
    private final Source f31025e;

    /* renamed from: f, reason: collision with root package name */
    private final String f31026f;

    public C2663d(String clientSecret, int i8, boolean z8, String str, Source source, String str2) {
        AbstractC3159y.i(clientSecret, "clientSecret");
        this.f31021a = clientSecret;
        this.f31022b = i8;
        this.f31023c = z8;
        this.f31024d = str;
        this.f31025e = source;
        this.f31026f = str2;
    }

    public final boolean a() {
        return this.f31023c;
    }

    public final String b() {
        return this.f31021a;
    }

    public final int c() {
        return this.f31022b;
    }

    public final String d() {
        return this.f31024d;
    }

    public final String e() {
        return this.f31026f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2663d)) {
            return false;
        }
        C2663d c2663d = (C2663d) obj;
        if (AbstractC3159y.d(this.f31021a, c2663d.f31021a) && this.f31022b == c2663d.f31022b && this.f31023c == c2663d.f31023c && AbstractC3159y.d(this.f31024d, c2663d.f31024d) && AbstractC3159y.d(this.f31025e, c2663d.f31025e) && AbstractC3159y.d(this.f31026f, c2663d.f31026f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((((this.f31021a.hashCode() * 31) + this.f31022b) * 31) + androidx.compose.foundation.a.a(this.f31023c)) * 31;
        String str = this.f31024d;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode3 + hashCode) * 31;
        Source source = this.f31025e;
        if (source == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = source.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str2 = this.f31026f;
        if (str2 != null) {
            i8 = str2.hashCode();
        }
        return i10 + i8;
    }

    public String toString() {
        return "Validated(clientSecret=" + this.f31021a + ", flowOutcome=" + this.f31022b + ", canCancelSource=" + this.f31023c + ", sourceId=" + this.f31024d + ", source=" + this.f31025e + ", stripeAccountId=" + this.f31026f + ")";
    }
}
