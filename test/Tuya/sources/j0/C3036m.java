package j0;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;

/* renamed from: j0.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3036m extends S.a {
    public static final Parcelable.Creator<C3036m> CREATOR = new C3037n();

    /* renamed from: a, reason: collision with root package name */
    String[] f32708a;

    /* renamed from: b, reason: collision with root package name */
    int[] f32709b;

    /* renamed from: c, reason: collision with root package name */
    RemoteViews f32710c;

    /* renamed from: d, reason: collision with root package name */
    byte[] f32711d;

    public C3036m(String[] strArr, int[] iArr, RemoteViews remoteViews, byte[] bArr) {
        this.f32708a = strArr;
        this.f32709b = iArr;
        this.f32710c = remoteViews;
        this.f32711d = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.r(parcel, 1, this.f32708a, false);
        S.c.l(parcel, 2, this.f32709b, false);
        S.c.p(parcel, 3, this.f32710c, i8, false);
        S.c.f(parcel, 4, this.f32711d, false);
        S.c.b(parcel, a8);
    }
}
