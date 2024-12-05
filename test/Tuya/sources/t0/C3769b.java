package t0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: t0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3769b extends S.a {
    public static final Parcelable.Creator<C3769b> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    String f38203a;

    /* renamed from: b, reason: collision with root package name */
    int f38204b;

    /* renamed from: c, reason: collision with root package name */
    boolean f38205c;

    /* renamed from: d, reason: collision with root package name */
    String f38206d;

    /* renamed from: e, reason: collision with root package name */
    String f38207e;

    /* renamed from: f, reason: collision with root package name */
    String f38208f;

    /* renamed from: g, reason: collision with root package name */
    String f38209g;

    /* renamed from: h, reason: collision with root package name */
    String f38210h;

    /* renamed from: i, reason: collision with root package name */
    String f38211i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3769b(String str, int i8, boolean z8, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f38203a = str;
        this.f38204b = i8;
        this.f38205c = z8;
        this.f38206d = str2;
        this.f38207e = str3;
        this.f38208f = str4;
        this.f38209g = str5;
        this.f38210h = str6;
        this.f38211i = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.q(parcel, 1, this.f38203a, false);
        S.c.k(parcel, 2, this.f38204b);
        S.c.c(parcel, 3, this.f38205c);
        S.c.q(parcel, 4, this.f38206d, false);
        S.c.q(parcel, 5, this.f38207e, false);
        S.c.q(parcel, 6, this.f38208f, false);
        S.c.q(parcel, 7, this.f38209g, false);
        S.c.q(parcel, 8, this.f38210h, false);
        S.c.q(parcel, 9, this.f38211i, false);
        S.c.b(parcel, a8);
    }
}
