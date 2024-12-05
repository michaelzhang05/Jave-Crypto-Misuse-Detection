package r0;

import Q.AbstractC1400p;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* renamed from: r0.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3902j extends R.a {

    @NonNull
    public static final Parcelable.Creator<C3902j> CREATOR = new z();

    /* renamed from: a, reason: collision with root package name */
    boolean f38511a;

    /* renamed from: b, reason: collision with root package name */
    boolean f38512b;

    /* renamed from: c, reason: collision with root package name */
    C3895c f38513c;

    /* renamed from: d, reason: collision with root package name */
    boolean f38514d;

    /* renamed from: e, reason: collision with root package name */
    C3911t f38515e;

    /* renamed from: f, reason: collision with root package name */
    ArrayList f38516f;

    /* renamed from: g, reason: collision with root package name */
    C3904l f38517g;

    /* renamed from: h, reason: collision with root package name */
    C3912u f38518h;

    /* renamed from: i, reason: collision with root package name */
    boolean f38519i;

    /* renamed from: j, reason: collision with root package name */
    String f38520j;

    /* renamed from: k, reason: collision with root package name */
    byte[] f38521k;

    /* renamed from: l, reason: collision with root package name */
    Bundle f38522l;

    /* renamed from: r0.j$a */
    /* loaded from: classes3.dex */
    public final class a {
        /* synthetic */ a(y yVar) {
        }

        public C3902j a() {
            C3902j c3902j = C3902j.this;
            if (c3902j.f38520j == null && c3902j.f38521k == null) {
                AbstractC1400p.m(c3902j.f38516f, "Allowed payment methods must be set! You can set it through addAllowedPaymentMethod() or addAllowedPaymentMethods() in the PaymentDataRequest Builder.");
                AbstractC1400p.m(C3902j.this.f38513c, "Card requirements must be set!");
                C3902j c3902j2 = C3902j.this;
                if (c3902j2.f38517g != null) {
                    AbstractC1400p.m(c3902j2.f38518h, "Transaction info must be set if paymentMethodTokenizationParameters is set!");
                }
            }
            return C3902j.this;
        }
    }

    private C3902j() {
        this.f38519i = true;
    }

    public static C3902j p(String str) {
        a u8 = u();
        C3902j.this.f38520j = (String) AbstractC1400p.m(str, "paymentDataRequestJson cannot be null!");
        return u8.a();
    }

    public static a u() {
        return new a(null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.c(parcel, 1, this.f38511a);
        R.c.c(parcel, 2, this.f38512b);
        R.c.p(parcel, 3, this.f38513c, i8, false);
        R.c.c(parcel, 4, this.f38514d);
        R.c.p(parcel, 5, this.f38515e, i8, false);
        R.c.m(parcel, 6, this.f38516f, false);
        R.c.p(parcel, 7, this.f38517g, i8, false);
        R.c.p(parcel, 8, this.f38518h, i8, false);
        R.c.c(parcel, 9, this.f38519i);
        R.c.q(parcel, 10, this.f38520j, false);
        R.c.e(parcel, 11, this.f38522l, false);
        R.c.f(parcel, 12, this.f38521k, false);
        R.c.b(parcel, a8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3902j(boolean z8, boolean z9, C3895c c3895c, boolean z10, C3911t c3911t, ArrayList arrayList, C3904l c3904l, C3912u c3912u, boolean z11, String str, byte[] bArr, Bundle bundle) {
        this.f38511a = z8;
        this.f38512b = z9;
        this.f38513c = c3895c;
        this.f38514d = z10;
        this.f38515e = c3911t;
        this.f38516f = arrayList;
        this.f38517g = c3904l;
        this.f38518h = c3912u;
        this.f38519i = z11;
        this.f38520j = str;
        this.f38521k = bArr;
        this.f38522l = bundle;
    }
}
