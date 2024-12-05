package e.e.b.b.s;

import android.content.Context;
import android.graphics.Color;
import e.e.b.b.w.b;

/* compiled from: ElevationOverlayProvider.java */
/* loaded from: classes2.dex */
public class a {
    private final boolean a;

    /* renamed from: b, reason: collision with root package name */
    private final int f17527b;

    /* renamed from: c, reason: collision with root package name */
    private final int f17528c;

    /* renamed from: d, reason: collision with root package name */
    private final float f17529d;

    public a(Context context) {
        this.a = b.b(context, e.e.b.b.b.r, false);
        this.f17527b = e.e.b.b.q.a.a(context, e.e.b.b.b.q, 0);
        this.f17528c = e.e.b.b.q.a.a(context, e.e.b.b.b.o, 0);
        this.f17529d = context.getResources().getDisplayMetrics().density;
    }

    private boolean e(int i2) {
        return c.h.e.a.o(i2, 255) == this.f17528c;
    }

    public float a(float f2) {
        if (this.f17529d <= 0.0f || f2 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f2 / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i2, float f2) {
        float a = a(f2);
        return c.h.e.a.o(e.e.b.b.q.a.f(c.h.e.a.o(i2, 255), this.f17527b, a), Color.alpha(i2));
    }

    public int c(int i2, float f2) {
        return (this.a && e(i2)) ? b(i2, f2) : i2;
    }

    public boolean d() {
        return this.a;
    }
}
