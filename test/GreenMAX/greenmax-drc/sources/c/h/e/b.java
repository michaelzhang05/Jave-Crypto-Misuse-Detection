package c.h.e;

import android.graphics.Insets;
import android.graphics.Rect;

/* compiled from: Insets.java */
/* loaded from: classes.dex */
public final class b {
    public static final b a = new b(0, 0, 0, 0);

    /* renamed from: b, reason: collision with root package name */
    public final int f2651b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2652c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2653d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2654e;

    private b(int i2, int i3, int i4, int i5) {
        this.f2651b = i2;
        this.f2652c = i3;
        this.f2653d = i4;
        this.f2654e = i5;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f2651b, bVar2.f2651b), Math.max(bVar.f2652c, bVar2.f2652c), Math.max(bVar.f2653d, bVar2.f2653d), Math.max(bVar.f2654e, bVar2.f2654e));
    }

    public static b b(int i2, int i3, int i4, int i5) {
        if (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            return a;
        }
        return new b(i2, i3, i4, i5);
    }

    public static b c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static b d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets e() {
        return Insets.of(this.f2651b, this.f2652c, this.f2653d, this.f2654e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2654e == bVar.f2654e && this.f2651b == bVar.f2651b && this.f2653d == bVar.f2653d && this.f2652c == bVar.f2652c;
    }

    public int hashCode() {
        return (((((this.f2651b * 31) + this.f2652c) * 31) + this.f2653d) * 31) + this.f2654e;
    }

    public String toString() {
        return "Insets{left=" + this.f2651b + ", top=" + this.f2652c + ", right=" + this.f2653d + ", bottom=" + this.f2654e + '}';
    }
}
