package R;

import O.C1258b;
import R.InterfaceC1313j;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class O extends S.a {
    public static final Parcelable.Creator<O> CREATOR = new P();

    /* renamed from: a, reason: collision with root package name */
    final int f8468a;

    /* renamed from: b, reason: collision with root package name */
    final IBinder f8469b;

    /* renamed from: c, reason: collision with root package name */
    private final C1258b f8470c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f8471d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f8472e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public O(int i8, IBinder iBinder, C1258b c1258b, boolean z8, boolean z9) {
        this.f8468a = i8;
        this.f8469b = iBinder;
        this.f8470c = c1258b;
        this.f8471d = z8;
        this.f8472e = z9;
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
        if (!this.f8470c.equals(o8.f8470c) || !AbstractC1317n.a(u(), o8.u())) {
            return false;
        }
        return true;
    }

    public final C1258b s() {
        return this.f8470c;
    }

    public final InterfaceC1313j u() {
        IBinder iBinder = this.f8469b;
        if (iBinder == null) {
            return null;
        }
        return InterfaceC1313j.a.j(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.k(parcel, 1, this.f8468a);
        S.c.j(parcel, 2, this.f8469b, false);
        S.c.p(parcel, 3, this.f8470c, i8, false);
        S.c.c(parcel, 4, this.f8471d);
        S.c.c(parcel, 5, this.f8472e);
        S.c.b(parcel, a8);
    }
}
