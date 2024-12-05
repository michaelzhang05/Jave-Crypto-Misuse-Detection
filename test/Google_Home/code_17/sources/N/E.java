package N;

import Y.a;
import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class E extends R.a {
    public static final Parcelable.Creator<E> CREATOR = new F();

    /* renamed from: a, reason: collision with root package name */
    private final String f7430a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f7431b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f7432c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f7433d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f7434e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f7435f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public E(String str, boolean z8, boolean z9, IBinder iBinder, boolean z10, boolean z11) {
        this.f7430a = str;
        this.f7431b = z8;
        this.f7432c = z9;
        this.f7433d = (Context) Y.b.k(a.AbstractBinderC0258a.i(iBinder));
        this.f7434e = z10;
        this.f7435f = z11;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [Y.a, android.os.IBinder] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f7430a;
        int a8 = R.c.a(parcel);
        R.c.q(parcel, 1, str, false);
        R.c.c(parcel, 2, this.f7431b);
        R.c.c(parcel, 3, this.f7432c);
        R.c.j(parcel, 4, Y.b.s0(this.f7433d), false);
        R.c.c(parcel, 5, this.f7434e);
        R.c.c(parcel, 6, this.f7435f);
        R.c.b(parcel, a8);
    }
}
