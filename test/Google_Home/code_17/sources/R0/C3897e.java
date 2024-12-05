package r0;

import Q.AbstractC1400p;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* renamed from: r0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3897e extends R.a {

    @NonNull
    public static final Parcelable.Creator<C3897e> CREATOR = new T();

    /* renamed from: a, reason: collision with root package name */
    ArrayList f38469a;

    /* renamed from: b, reason: collision with root package name */
    String f38470b;

    /* renamed from: c, reason: collision with root package name */
    String f38471c;

    /* renamed from: d, reason: collision with root package name */
    ArrayList f38472d;

    /* renamed from: e, reason: collision with root package name */
    boolean f38473e;

    /* renamed from: f, reason: collision with root package name */
    String f38474f;

    /* renamed from: r0.e$a */
    /* loaded from: classes3.dex */
    public final class a {
        /* synthetic */ a(S s8) {
        }

        public C3897e a() {
            return C3897e.this;
        }
    }

    C3897e() {
    }

    public static C3897e p(String str) {
        a u8 = u();
        C3897e.this.f38474f = (String) AbstractC1400p.m(str, "isReadyToPayRequestJson cannot be null!");
        return u8.a();
    }

    public static a u() {
        return new a(null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.m(parcel, 2, this.f38469a, false);
        R.c.q(parcel, 4, this.f38470b, false);
        R.c.q(parcel, 5, this.f38471c, false);
        R.c.m(parcel, 6, this.f38472d, false);
        R.c.c(parcel, 7, this.f38473e);
        R.c.q(parcel, 8, this.f38474f, false);
        R.c.b(parcel, a8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3897e(ArrayList arrayList, String str, String str2, ArrayList arrayList2, boolean z8, String str3) {
        this.f38469a = arrayList;
        this.f38470b = str;
        this.f38471c = str2;
        this.f38472d = arrayList2;
        this.f38473e = z8;
        this.f38474f = str3;
    }
}
