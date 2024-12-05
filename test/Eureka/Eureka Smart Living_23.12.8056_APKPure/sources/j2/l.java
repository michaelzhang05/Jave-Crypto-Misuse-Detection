package j2;

import android.os.Parcel;
import android.os.Parcelable;
import v1.i0;

/* loaded from: classes.dex */
public final class l extends w1.a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* renamed from: a, reason: collision with root package name */
    final int f7086a;

    /* renamed from: b, reason: collision with root package name */
    private final s1.a f7087b;

    /* renamed from: c, reason: collision with root package name */
    private final i0 f7088c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(int i6, s1.a aVar, i0 i0Var) {
        this.f7086a = i6;
        this.f7087b = aVar;
        this.f7088c = i0Var;
    }

    public final s1.a a() {
        return this.f7087b;
    }

    public final i0 b() {
        return this.f7088c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int a6 = w1.c.a(parcel);
        w1.c.f(parcel, 1, this.f7086a);
        w1.c.i(parcel, 2, this.f7087b, i6, false);
        w1.c.i(parcel, 3, this.f7088c, i6, false);
        w1.c.b(parcel, a6);
    }
}
