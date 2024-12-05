package e.g.a.c;

import android.view.View;

/* compiled from: ViewScrollChangeEvent.java */
/* loaded from: classes2.dex */
public final class f extends c<View> {

    /* renamed from: b, reason: collision with root package name */
    private final int f17701b;

    /* renamed from: c, reason: collision with root package name */
    private final int f17702c;

    /* renamed from: d, reason: collision with root package name */
    private final int f17703d;

    /* renamed from: e, reason: collision with root package name */
    private final int f17704e;

    protected f(View view, int i2, int i3, int i4, int i5) {
        super(view);
        this.f17701b = i2;
        this.f17702c = i3;
        this.f17703d = i4;
        this.f17704e = i5;
    }

    public static f b(View view, int i2, int i3, int i4, int i5) {
        return new f(view, i2, i3, i4, i5);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return fVar.a() == a() && fVar.f17701b == this.f17701b && fVar.f17702c == this.f17702c && fVar.f17703d == this.f17703d && fVar.f17704e == this.f17704e;
    }

    public int hashCode() {
        return ((((((((629 + a().hashCode()) * 37) + this.f17701b) * 37) + this.f17702c) * 37) + this.f17703d) * 37) + this.f17704e;
    }

    public String toString() {
        return "ViewScrollChangeEvent{scrollX=" + this.f17701b + ", scrollY=" + this.f17702c + ", oldScrollX=" + this.f17703d + ", oldScrollY=" + this.f17704e + '}';
    }
}
