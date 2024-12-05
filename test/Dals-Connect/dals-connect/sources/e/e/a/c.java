package e.e.a;

import com.google.android.gms.ads.AdSize;

@Deprecated
/* loaded from: classes2.dex */
public final class c {
    public static final c a = new c(-1, -2, "mb");

    /* renamed from: b, reason: collision with root package name */
    public static final c f17411b = new c(320, 50, "mb");

    /* renamed from: c, reason: collision with root package name */
    public static final c f17412c = new c(300, 250, "as");

    /* renamed from: d, reason: collision with root package name */
    public static final c f17413d = new c(468, 60, "as");

    /* renamed from: e, reason: collision with root package name */
    public static final c f17414e = new c(728, 90, "as");

    /* renamed from: f, reason: collision with root package name */
    public static final c f17415f = new c(160, 600, "as");

    /* renamed from: g, reason: collision with root package name */
    private final AdSize f17416g;

    public c(AdSize adSize) {
        this.f17416g = adSize;
    }

    public final int a() {
        return this.f17416g.getHeight();
    }

    public final int b() {
        return this.f17416g.getWidth();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f17416g.equals(((c) obj).f17416g);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17416g.hashCode();
    }

    public final String toString() {
        return this.f17416g.toString();
    }

    private c(int i2, int i3, String str) {
        this(new AdSize(i2, i3));
    }
}
