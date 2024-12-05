package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LayoutState.java */
/* loaded from: classes.dex */
class i {

    /* renamed from: b, reason: collision with root package name */
    int f1582b;

    /* renamed from: c, reason: collision with root package name */
    int f1583c;

    /* renamed from: d, reason: collision with root package name */
    int f1584d;

    /* renamed from: e, reason: collision with root package name */
    int f1585e;

    /* renamed from: h, reason: collision with root package name */
    boolean f1588h;

    /* renamed from: i, reason: collision with root package name */
    boolean f1589i;
    boolean a = true;

    /* renamed from: f, reason: collision with root package name */
    int f1586f = 0;

    /* renamed from: g, reason: collision with root package name */
    int f1587g = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(RecyclerView.z zVar) {
        int i2 = this.f1583c;
        return i2 >= 0 && i2 < zVar.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View b(RecyclerView.v vVar) {
        View o = vVar.o(this.f1583c);
        this.f1583c += this.f1584d;
        return o;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f1582b + ", mCurrentPosition=" + this.f1583c + ", mItemDirection=" + this.f1584d + ", mLayoutDirection=" + this.f1585e + ", mStartLine=" + this.f1586f + ", mEndLine=" + this.f1587g + '}';
    }
}
