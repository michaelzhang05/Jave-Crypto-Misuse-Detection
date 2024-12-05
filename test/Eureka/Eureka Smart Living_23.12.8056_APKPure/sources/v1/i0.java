package v1;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import v1.i;

/* loaded from: classes.dex */
public final class i0 extends w1.a {
    public static final Parcelable.Creator<i0> CREATOR = new j0();

    /* renamed from: a, reason: collision with root package name */
    final int f9601a;

    /* renamed from: b, reason: collision with root package name */
    final IBinder f9602b;

    /* renamed from: c, reason: collision with root package name */
    private final s1.a f9603c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f9604d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f9605e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i0(int i6, IBinder iBinder, s1.a aVar, boolean z5, boolean z6) {
        this.f9601a = i6;
        this.f9602b = iBinder;
        this.f9603c = aVar;
        this.f9604d = z5;
        this.f9605e = z6;
    }

    public final s1.a a() {
        return this.f9603c;
    }

    public final i b() {
        IBinder iBinder = this.f9602b;
        if (iBinder == null) {
            return null;
        }
        return i.a.b(iBinder);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.f9603c.equals(i0Var.f9603c) && m.a(b(), i0Var.b());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int a6 = w1.c.a(parcel);
        w1.c.f(parcel, 1, this.f9601a);
        w1.c.e(parcel, 2, this.f9602b, false);
        w1.c.i(parcel, 3, this.f9603c, i6, false);
        w1.c.c(parcel, 4, this.f9604d);
        w1.c.c(parcel, 5, this.f9605e);
        w1.c.b(parcel, a6);
    }
}
