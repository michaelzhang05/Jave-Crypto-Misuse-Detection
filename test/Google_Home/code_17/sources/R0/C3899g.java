package r0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

/* renamed from: r0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3899g extends R.a {

    @NonNull
    public static final Parcelable.Creator<C3899g> CREATOR = new V();

    /* renamed from: a, reason: collision with root package name */
    private final int f38498a;

    /* renamed from: b, reason: collision with root package name */
    String f38499b;

    /* renamed from: c, reason: collision with root package name */
    String f38500c;

    /* renamed from: d, reason: collision with root package name */
    CommonWalletObject f38501d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3899g(int i8, String str, String str2, CommonWalletObject commonWalletObject) {
        this.f38498a = i8;
        this.f38500c = str2;
        if (i8 < 3) {
            com.google.android.gms.wallet.wobs.a p8 = CommonWalletObject.p();
            p8.a(str);
            this.f38501d = p8.b();
            return;
        }
        this.f38501d = commonWalletObject;
    }

    public int p() {
        return this.f38498a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.k(parcel, 1, p());
        R.c.q(parcel, 2, this.f38499b, false);
        R.c.q(parcel, 3, this.f38500c, false);
        R.c.p(parcel, 4, this.f38501d, i8, false);
        R.c.b(parcel, a8);
    }
}
