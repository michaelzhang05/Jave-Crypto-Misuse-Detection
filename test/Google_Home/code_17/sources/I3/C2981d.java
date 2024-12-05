package i3;

import com.stripe.android.model.Source;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: i3.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2981d {

    /* renamed from: a, reason: collision with root package name */
    private final String f32884a;

    /* renamed from: b, reason: collision with root package name */
    private final int f32885b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f32886c;

    /* renamed from: d, reason: collision with root package name */
    private final String f32887d;

    /* renamed from: e, reason: collision with root package name */
    private final Source f32888e;

    /* renamed from: f, reason: collision with root package name */
    private final String f32889f;

    public C2981d(String clientSecret, int i8, boolean z8, String str, Source source, String str2) {
        AbstractC3255y.i(clientSecret, "clientSecret");
        this.f32884a = clientSecret;
        this.f32885b = i8;
        this.f32886c = z8;
        this.f32887d = str;
        this.f32888e = source;
        this.f32889f = str2;
    }

    public final boolean a() {
        return this.f32886c;
    }

    public final String b() {
        return this.f32884a;
    }

    public final int c() {
        return this.f32885b;
    }

    public final String d() {
        return this.f32887d;
    }

    public final String e() {
        return this.f32889f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2981d)) {
            return false;
        }
        C2981d c2981d = (C2981d) obj;
        if (AbstractC3255y.d(this.f32884a, c2981d.f32884a) && this.f32885b == c2981d.f32885b && this.f32886c == c2981d.f32886c && AbstractC3255y.d(this.f32887d, c2981d.f32887d) && AbstractC3255y.d(this.f32888e, c2981d.f32888e) && AbstractC3255y.d(this.f32889f, c2981d.f32889f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((((this.f32884a.hashCode() * 31) + this.f32885b) * 31) + androidx.compose.foundation.a.a(this.f32886c)) * 31;
        String str = this.f32887d;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode3 + hashCode) * 31;
        Source source = this.f32888e;
        if (source == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = source.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str2 = this.f32889f;
        if (str2 != null) {
            i8 = str2.hashCode();
        }
        return i10 + i8;
    }

    public String toString() {
        return "Validated(clientSecret=" + this.f32884a + ", flowOutcome=" + this.f32885b + ", canCancelSource=" + this.f32886c + ", sourceId=" + this.f32887d + ", source=" + this.f32888e + ", stripeAccountId=" + this.f32889f + ")";
    }
}
