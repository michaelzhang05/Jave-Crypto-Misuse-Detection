package com.stripe.android.paymentsheet;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Window;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import com.stripe.android.paymentsheet.PaymentSheetContractV2;
import com.stripe.android.paymentsheet.u;
import com.stripe.android.paymentsheet.x;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class PaymentSheetContract extends ActivityResultContract<a, x> {

    /* renamed from: a, reason: collision with root package name */
    public static final b f26555a = new b(null);

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final B3.a f26558a;

        /* renamed from: b, reason: collision with root package name */
        private final u.g f26559b;

        /* renamed from: c, reason: collision with root package name */
        private final Integer f26560c;

        /* renamed from: d, reason: collision with root package name */
        private final String f26561d;

        /* renamed from: e, reason: collision with root package name */
        public static final C0571a f26556e = new C0571a(null);

        /* renamed from: f, reason: collision with root package name */
        public static final int f26557f = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.paymentsheet.PaymentSheetContract$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0571a {
            private C0571a() {
            }

            public /* synthetic */ C0571a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new a((B3.a) parcel.readParcelable(a.class.getClassLoader()), parcel.readInt() == 0 ? null : u.g.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(B3.a clientSecret, u.g gVar, Integer num, String injectorKey) {
            AbstractC3255y.i(clientSecret, "clientSecret");
            AbstractC3255y.i(injectorKey, "injectorKey");
            this.f26558a = clientSecret;
            this.f26559b = gVar;
            this.f26560c = num;
            this.f26561d = injectorKey;
        }

        public static /* synthetic */ a b(a aVar, B3.a aVar2, u.g gVar, Integer num, String str, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                aVar2 = aVar.f26558a;
            }
            if ((i8 & 2) != 0) {
                gVar = aVar.f26559b;
            }
            if ((i8 & 4) != 0) {
                num = aVar.f26560c;
            }
            if ((i8 & 8) != 0) {
                str = aVar.f26561d;
            }
            return aVar.a(aVar2, gVar, num, str);
        }

        public final a a(B3.a clientSecret, u.g gVar, Integer num, String injectorKey) {
            AbstractC3255y.i(clientSecret, "clientSecret");
            AbstractC3255y.i(injectorKey, "injectorKey");
            return new a(clientSecret, gVar, num, injectorKey);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3255y.d(this.f26558a, aVar.f26558a) && AbstractC3255y.d(this.f26559b, aVar.f26559b) && AbstractC3255y.d(this.f26560c, aVar.f26560c) && AbstractC3255y.d(this.f26561d, aVar.f26561d);
        }

        public final PaymentSheetContractV2.a g(Context context) {
            u.l cVar;
            AbstractC3255y.i(context, "context");
            B3.a aVar = this.f26558a;
            if (aVar instanceof B3.e) {
                cVar = new u.l.b(this.f26558a.a());
            } else if (aVar instanceof B3.k) {
                cVar = new u.l.c(this.f26558a.a());
            } else {
                throw new O5.p();
            }
            u.g gVar = this.f26559b;
            if (gVar == null) {
                gVar = u.g.f27471q.a(context);
            }
            return new PaymentSheetContractV2.a(cVar, gVar, this.f26560c, false);
        }

        public int hashCode() {
            int hashCode = this.f26558a.hashCode() * 31;
            u.g gVar = this.f26559b;
            int hashCode2 = (hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
            Integer num = this.f26560c;
            return ((hashCode2 + (num != null ? num.hashCode() : 0)) * 31) + this.f26561d.hashCode();
        }

        public String toString() {
            return "Args(clientSecret=" + this.f26558a + ", config=" + this.f26559b + ", statusBarColor=" + this.f26560c + ", injectorKey=" + this.f26561d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeParcelable(this.f26558a, i8);
            u.g gVar = this.f26559b;
            if (gVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                gVar.writeToParcel(out, i8);
            }
            Integer num = this.f26560c;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            out.writeString(this.f26561d);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a input) {
        Activity activity;
        Window window;
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(input, "input");
        Integer num = null;
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = null;
        }
        if (activity != null && (window = activity.getWindow()) != null) {
            num = Integer.valueOf(window.getStatusBarColor());
        }
        Intent putExtra = new Intent(context, (Class<?>) PaymentSheetActivity.class).putExtra("com.stripe.android.paymentsheet.PaymentSheetContract.extra_args", a.b(input, null, null, num, null, 11, null).g(context));
        AbstractC3255y.h(putExtra, "putExtra(...)");
        return putExtra;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public x parseResult(int i8, Intent intent) {
        x xVar;
        PaymentSheetContractV2.c cVar;
        if (intent != null && (cVar = (PaymentSheetContractV2.c) intent.getParcelableExtra("com.stripe.android.paymentsheet.PaymentSheetContract.extra_result")) != null) {
            xVar = cVar.a();
        } else {
            xVar = null;
        }
        if (xVar == null) {
            return new x.c(new IllegalArgumentException("Failed to retrieve a PaymentSheetResult."));
        }
        return xVar;
    }
}
