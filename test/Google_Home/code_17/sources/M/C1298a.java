package M;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: M.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1298a extends R.a {

    @NonNull
    public static final Parcelable.Creator<C1298a> CREATOR = new C1301d();

    /* renamed from: a, reason: collision with root package name */
    final Intent f6344a;

    public C1298a(Intent intent) {
        this.f6344a = intent;
    }

    public Intent p() {
        return this.f6344a;
    }

    public String u() {
        String stringExtra = this.f6344a.getStringExtra("google.message_id");
        if (stringExtra == null) {
            return this.f6344a.getStringExtra("message_id");
        }
        return stringExtra;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Integer v() {
        if (this.f6344a.hasExtra("google.product_id")) {
            return Integer.valueOf(this.f6344a.getIntExtra("google.product_id", 0));
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.p(parcel, 1, this.f6344a, i8, false);
        R.c.b(parcel, a8);
    }
}
