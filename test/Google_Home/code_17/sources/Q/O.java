package Q;

import N.C1331b;
import Q.InterfaceC1394j;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class O extends R.a {
    public static final Parcelable.Creator<O> CREATOR = new P();

    /* renamed from: a, reason: collision with root package name */
    final int f8930a;

    /* renamed from: b, reason: collision with root package name */
    final IBinder f8931b;

    /* renamed from: c, reason: collision with root package name */
    private final C1331b f8932c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f8933d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f8934e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public O(int i8, IBinder iBinder, C1331b c1331b, boolean z8, boolean z9) {
        this.f8930a = i8;
        this.f8931b = iBinder;
        this.f8932c = c1331b;
        this.f8933d = z8;
        this.f8934e = z9;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o8 = (O) obj;
        if (!this.f8932c.equals(o8.f8932c) || !AbstractC1398n.a(u(), o8.u())) {
            return false;
        }
        return true;
    }

    public final C1331b p() {
        return this.f8932c;
    }

    public final InterfaceC1394j u() {
        IBinder iBinder = this.f8931b;
        if (iBinder == null) {
            return null;
        }
        return InterfaceC1394j.a.i(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.k(parcel, 1, this.f8930a);
        R.c.j(parcel, 2, this.f8931b, false);
        R.c.p(parcel, 3, this.f8932c, i8, false);
        R.c.c(parcel, 4, this.f8933d);
        R.c.c(parcel, 5, this.f8934e);
        R.c.b(parcel, a8);
    }
}
