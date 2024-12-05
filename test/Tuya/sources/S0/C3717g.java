package s0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

/* renamed from: s0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3717g extends S.a {

    @NonNull
    public static final Parcelable.Creator<C3717g> CREATOR = new V();

    /* renamed from: a, reason: collision with root package name */
    private final int f37763a;

    /* renamed from: b, reason: collision with root package name */
    String f37764b;

    /* renamed from: c, reason: collision with root package name */
    String f37765c;

    /* renamed from: d, reason: collision with root package name */
    CommonWalletObject f37766d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3717g(int i8, String str, String str2, CommonWalletObject commonWalletObject) {
        this.f37763a = i8;
        this.f37765c = str2;
        if (i8 < 3) {
            com.google.android.gms.wallet.wobs.a s8 = CommonWalletObject.s();
            s8.a(str);
            this.f37766d = s8.b();
            return;
        }
        this.f37766d = commonWalletObject;
    }

    public int s() {
        return this.f37763a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.k(parcel, 1, s());
        S.c.q(parcel, 2, this.f37764b, false);
        S.c.q(parcel, 3, this.f37765c, false);
        S.c.p(parcel, 4, this.f37766d, i8, false);
        S.c.b(parcel, a8);
    }
}
