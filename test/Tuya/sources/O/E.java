package O;

import Z.a;
import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class E extends S.a {
    public static final Parcelable.Creator<E> CREATOR = new F();

    /* renamed from: a, reason: collision with root package name */
    private final String f7629a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f7630b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f7631c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f7632d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f7633e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f7634f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public E(String str, boolean z8, boolean z9, IBinder iBinder, boolean z10, boolean z11) {
        this.f7629a = str;
        this.f7630b = z8;
        this.f7631c = z9;
        this.f7632d = (Context) Z.b.l(a.AbstractBinderC0256a.j(iBinder));
        this.f7633e = z10;
        this.f7634f = z11;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [Z.a, android.os.IBinder] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f7629a;
        int a8 = S.c.a(parcel);
        S.c.q(parcel, 1, str, false);
        S.c.c(parcel, 2, this.f7630b);
        S.c.c(parcel, 3, this.f7631c);
        S.c.j(parcel, 4, Z.b.m0(this.f7632d), false);
        S.c.c(parcel, 5, this.f7633e);
        S.c.c(parcel, 6, this.f7634f);
        S.c.b(parcel, a8);
    }
}
