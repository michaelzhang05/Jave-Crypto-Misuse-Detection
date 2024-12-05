package u2;

import android.content.Context;
import android.graphics.Color;
import z2.b;

/* loaded from: classes.dex */
public class a {

    /* renamed from: f, reason: collision with root package name */
    private static final int f9413f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f9414a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9415b;

    /* renamed from: c, reason: collision with root package name */
    private final int f9416c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9417d;

    /* renamed from: e, reason: collision with root package name */
    private final float f9418e;

    public a(Context context) {
        this(b.b(context, m2.a.f7562p, false), r2.a.b(context, m2.a.f7561o, 0), r2.a.b(context, m2.a.f7560n, 0), r2.a.b(context, m2.a.f7558l, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean e(int i6) {
        return androidx.core.graphics.a.j(i6, 255) == this.f9417d;
    }

    public float a(float f6) {
        if (this.f9418e <= 0.0f || f6 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f6 / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i6, float f6) {
        int i7;
        float a6 = a(f6);
        int alpha = Color.alpha(i6);
        int j6 = r2.a.j(androidx.core.graphics.a.j(i6, 255), this.f9415b, a6);
        if (a6 > 0.0f && (i7 = this.f9416c) != 0) {
            j6 = r2.a.i(j6, androidx.core.graphics.a.j(i7, f9413f));
        }
        return androidx.core.graphics.a.j(j6, alpha);
    }

    public int c(int i6, float f6) {
        return (this.f9414a && e(i6)) ? b(i6, f6) : i6;
    }

    public boolean d() {
        return this.f9414a;
    }

    public a(boolean z5, int i6, int i7, int i8, float f6) {
        this.f9414a = z5;
        this.f9415b = i6;
        this.f9416c = i7;
        this.f9417d = i8;
        this.f9418e = f6;
    }
}
