package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* loaded from: classes.dex */
public class g {

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadLocal f2532d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    private final int f2533a;

    /* renamed from: b, reason: collision with root package name */
    private final m f2534b;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f2535c = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(m mVar, int i6) {
        this.f2534b = mVar;
        this.f2533a = i6;
    }

    private z.a g() {
        ThreadLocal threadLocal = f2532d;
        z.a aVar = (z.a) threadLocal.get();
        if (aVar == null) {
            aVar = new z.a();
            threadLocal.set(aVar);
        }
        this.f2534b.d().j(aVar, this.f2533a);
        return aVar;
    }

    public void a(Canvas canvas, float f6, float f7, Paint paint) {
        Typeface g6 = this.f2534b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(g6);
        canvas.drawText(this.f2534b.c(), this.f2533a * 2, 2, f6, f7, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i6) {
        return g().h(i6);
    }

    public int c() {
        return g().i();
    }

    public int d() {
        return this.f2535c;
    }

    public short e() {
        return g().k();
    }

    public int f() {
        return g().l();
    }

    public short h() {
        return g().m();
    }

    public short i() {
        return g().n();
    }

    public boolean j() {
        return g().j();
    }

    public void k(boolean z5) {
        this.f2535c = z5 ? 2 : 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(f()));
        sb.append(", codepoints:");
        int c6 = c();
        for (int i6 = 0; i6 < c6; i6++) {
            sb.append(Integer.toHexString(b(i6)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
