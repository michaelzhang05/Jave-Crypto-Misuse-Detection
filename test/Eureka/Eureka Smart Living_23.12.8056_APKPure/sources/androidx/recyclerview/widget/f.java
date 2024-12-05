package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
class f {

    /* renamed from: b, reason: collision with root package name */
    int f3573b;

    /* renamed from: c, reason: collision with root package name */
    int f3574c;

    /* renamed from: d, reason: collision with root package name */
    int f3575d;

    /* renamed from: e, reason: collision with root package name */
    int f3576e;

    /* renamed from: h, reason: collision with root package name */
    boolean f3579h;

    /* renamed from: i, reason: collision with root package name */
    boolean f3580i;

    /* renamed from: a, reason: collision with root package name */
    boolean f3572a = true;

    /* renamed from: f, reason: collision with root package name */
    int f3577f = 0;

    /* renamed from: g, reason: collision with root package name */
    int f3578g = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(RecyclerView.z zVar) {
        int i6 = this.f3574c;
        return i6 >= 0 && i6 < zVar.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View b(RecyclerView.u uVar) {
        View o6 = uVar.o(this.f3574c);
        this.f3574c += this.f3575d;
        return o6;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f3573b + ", mCurrentPosition=" + this.f3574c + ", mItemDirection=" + this.f3575d + ", mLayoutDirection=" + this.f3576e + ", mStartLine=" + this.f3577f + ", mEndLine=" + this.f3578g + '}';
    }
}
