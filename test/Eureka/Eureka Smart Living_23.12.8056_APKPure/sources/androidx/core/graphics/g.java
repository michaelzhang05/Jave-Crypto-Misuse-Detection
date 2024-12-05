package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static final g f2109e = new g(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f2110a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2111b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2112c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2113d;

    /* loaded from: classes.dex */
    static class a {
        static Insets a(int i6, int i7, int i8, int i9) {
            Insets of;
            of = Insets.of(i6, i7, i8, i9);
            return of;
        }
    }

    private g(int i6, int i7, int i8, int i9) {
        this.f2110a = i6;
        this.f2111b = i7;
        this.f2112c = i8;
        this.f2113d = i9;
    }

    public static g a(g gVar, g gVar2) {
        return b(Math.max(gVar.f2110a, gVar2.f2110a), Math.max(gVar.f2111b, gVar2.f2111b), Math.max(gVar.f2112c, gVar2.f2112c), Math.max(gVar.f2113d, gVar2.f2113d));
    }

    public static g b(int i6, int i7, int i8, int i9) {
        return (i6 == 0 && i7 == 0 && i8 == 0 && i9 == 0) ? f2109e : new g(i6, i7, i8, i9);
    }

    public static g c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static g d(Insets insets) {
        int i6;
        int i7;
        int i8;
        int i9;
        i6 = insets.left;
        i7 = insets.top;
        i8 = insets.right;
        i9 = insets.bottom;
        return b(i6, i7, i8, i9);
    }

    public Insets e() {
        return a.a(this.f2110a, this.f2111b, this.f2112c, this.f2113d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return this.f2113d == gVar.f2113d && this.f2110a == gVar.f2110a && this.f2112c == gVar.f2112c && this.f2111b == gVar.f2111b;
    }

    public int hashCode() {
        return (((((this.f2110a * 31) + this.f2111b) * 31) + this.f2112c) * 31) + this.f2113d;
    }

    public String toString() {
        return "Insets{left=" + this.f2110a + ", top=" + this.f2111b + ", right=" + this.f2112c + ", bottom=" + this.f2113d + '}';
    }
}
