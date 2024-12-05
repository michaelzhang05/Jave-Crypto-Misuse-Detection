package r0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* renamed from: r0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3895c extends R.a {

    @NonNull
    public static final Parcelable.Creator<C3895c> CREATOR = new O();

    /* renamed from: a, reason: collision with root package name */
    ArrayList f38462a;

    /* renamed from: b, reason: collision with root package name */
    boolean f38463b;

    /* renamed from: c, reason: collision with root package name */
    boolean f38464c;

    /* renamed from: d, reason: collision with root package name */
    int f38465d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3895c(ArrayList arrayList, boolean z8, boolean z9, int i8) {
        this.f38462a = arrayList;
        this.f38463b = z8;
        this.f38464c = z9;
        this.f38465d = i8;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.m(parcel, 1, this.f38462a, false);
        R.c.c(parcel, 2, this.f38463b);
        R.c.c(parcel, 3, this.f38464c);
        R.c.k(parcel, 4, this.f38465d);
        R.c.b(parcel, a8);
    }
}
