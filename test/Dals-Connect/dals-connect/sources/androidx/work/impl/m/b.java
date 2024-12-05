package androidx.work.impl.m;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: NetworkState.java */
/* loaded from: classes.dex */
public class b {
    private boolean a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f1973b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f1974c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1975d;

    public b(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.f1973b = z2;
        this.f1974c = z3;
        this.f1975d = z4;
    }

    public boolean a() {
        return this.a;
    }

    public boolean b() {
        return this.f1974c;
    }

    public boolean c() {
        return this.f1975d;
    }

    public boolean d() {
        return this.f1973b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.f1973b == bVar.f1973b && this.f1974c == bVar.f1974c && this.f1975d == bVar.f1975d;
    }

    public int hashCode() {
        int i2 = this.a ? 1 : 0;
        if (this.f1973b) {
            i2 += 16;
        }
        if (this.f1974c) {
            i2 += 256;
        }
        return this.f1975d ? i2 + RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT : i2;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.a), Boolean.valueOf(this.f1973b), Boolean.valueOf(this.f1974c), Boolean.valueOf(this.f1975d));
    }
}
