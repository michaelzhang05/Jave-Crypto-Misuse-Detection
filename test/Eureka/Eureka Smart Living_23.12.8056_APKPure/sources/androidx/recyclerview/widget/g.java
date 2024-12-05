package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class g extends RecyclerView.y {

    /* renamed from: k, reason: collision with root package name */
    protected PointF f3583k;

    /* renamed from: l, reason: collision with root package name */
    private final DisplayMetrics f3584l;

    /* renamed from: n, reason: collision with root package name */
    private float f3586n;

    /* renamed from: i, reason: collision with root package name */
    protected final LinearInterpolator f3581i = new LinearInterpolator();

    /* renamed from: j, reason: collision with root package name */
    protected final DecelerateInterpolator f3582j = new DecelerateInterpolator();

    /* renamed from: m, reason: collision with root package name */
    private boolean f3585m = false;

    /* renamed from: o, reason: collision with root package name */
    protected int f3587o = 0;

    /* renamed from: p, reason: collision with root package name */
    protected int f3588p = 0;

    public g(Context context) {
        this.f3584l = context.getResources().getDisplayMetrics();
    }

    private float A() {
        if (!this.f3585m) {
            this.f3586n = v(this.f3584l);
            this.f3585m = true;
        }
        return this.f3586n;
    }

    private int y(int i6, int i7) {
        int i8 = i6 - i7;
        if (i6 * i8 <= 0) {
            return 0;
        }
        return i8;
    }

    protected int B() {
        PointF pointF = this.f3583k;
        if (pointF != null) {
            float f6 = pointF.y;
            if (f6 != 0.0f) {
                return f6 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    protected void C(RecyclerView.y.a aVar) {
        PointF a6 = a(f());
        if (a6 == null || (a6.x == 0.0f && a6.y == 0.0f)) {
            aVar.b(f());
            r();
            return;
        }
        i(a6);
        this.f3583k = a6;
        this.f3587o = (int) (a6.x * 10000.0f);
        this.f3588p = (int) (a6.y * 10000.0f);
        aVar.d((int) (this.f3587o * 1.2f), (int) (this.f3588p * 1.2f), (int) (x(10000) * 1.2f), this.f3581i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y
    protected void l(int i6, int i7, RecyclerView.z zVar, RecyclerView.y.a aVar) {
        if (c() == 0) {
            r();
            return;
        }
        this.f3587o = y(this.f3587o, i6);
        int y5 = y(this.f3588p, i7);
        this.f3588p = y5;
        if (this.f3587o == 0 && y5 == 0) {
            C(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y
    protected void m() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y
    protected void n() {
        this.f3588p = 0;
        this.f3587o = 0;
        this.f3583k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y
    protected void o(View view, RecyclerView.z zVar, RecyclerView.y.a aVar) {
        int t5 = t(view, z());
        int u5 = u(view, B());
        int w5 = w((int) Math.sqrt((t5 * t5) + (u5 * u5)));
        if (w5 > 0) {
            aVar.d(-t5, -u5, w5, this.f3582j);
        }
    }

    public int s(int i6, int i7, int i8, int i9, int i10) {
        if (i10 == -1) {
            return i8 - i6;
        }
        if (i10 != 0) {
            if (i10 == 1) {
                return i9 - i7;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i11 = i8 - i6;
        if (i11 > 0) {
            return i11;
        }
        int i12 = i9 - i7;
        if (i12 < 0) {
            return i12;
        }
        return 0;
    }

    public int t(View view, int i6) {
        RecyclerView.o e6 = e();
        if (e6 == null || !e6.k()) {
            return 0;
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return s(e6.Q(view) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, e6.T(view) + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, e6.e0(), e6.o0() - e6.f0(), i6);
    }

    public int u(View view, int i6) {
        RecyclerView.o e6 = e();
        if (e6 == null || !e6.l()) {
            return 0;
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return s(e6.U(view) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, e6.O(view) + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin, e6.g0(), e6.W() - e6.d0(), i6);
    }

    protected float v(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int w(int i6) {
        return (int) Math.ceil(x(i6) / 0.3356d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int x(int i6) {
        return (int) Math.ceil(Math.abs(i6) * A());
    }

    protected int z() {
        PointF pointF = this.f3583k;
        if (pointF != null) {
            float f6 = pointF.x;
            if (f6 != 0.0f) {
                return f6 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}
