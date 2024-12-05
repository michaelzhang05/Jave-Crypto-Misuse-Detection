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
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import y3.AbstractC3986a;
import y3.C3990e;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class PaymentSheetContract extends ActivityResultContract<a, x> {

    /* renamed from: a, reason: collision with root package name */
    public static final b f25500a = new b(null);

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC3986a f25503a;

        /* renamed from: b, reason: collision with root package name */
        private final u.g f25504b;

        /* renamed from: c, reason: collision with root package name */
        private final Integer f25505c;

        /* renamed from: d, reason: collision with root package name */
        private final String f25506d;

        /* renamed from: e, reason: collision with root package name */
        public static final C0575a f25501e = new C0575a(null);

        /* renamed from: f, reason: collision with root package name */
        public static final int f25502f = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.paymentsheet.PaymentSheetContract$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0575a {
            private C0575a() {
            }

            public /* synthetic */ C0575a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new a((AbstractC3986a) parcel.readParcelable(a.class.getClassLoader()), parcel.readInt() == 0 ? null : u.g.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(AbstractC3986a clientSecret, u.g gVar, Integer num, String injectorKey) {
            AbstractC3159y.i(clientSecret, "clientSecret");
            AbstractC3159y.i(injectorKey, "injectorKey");
            this.f25503a = clientSecret;
            this.f25504b = gVar;
            this.f25505c = num;
            this.f25506d = injectorKey;
        }

        public static /* synthetic */ a c(a aVar, AbstractC3986a abstractC3986a, u.g gVar, Integer num, String str, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                abstractC3986a = aVar.f25503a;
            }
            if ((i8 & 2) != 0) {
                gVar = aVar.f25504b;
            }
            if ((i8 & 4) != 0) {
                num = aVar.f25505c;
            }
            if ((i8 & 8) != 0) {
                str = aVar.f25506d;
            }
            return aVar.b(abstractC3986a, gVar, num, str);
        }

        public final a b(AbstractC3986a clientSecret, u.g gVar, Integer num, String injectorKey) {
            AbstractC3159y.i(clientSecret, "clientSecret");
            AbstractC3159y.i(injectorKey, "injectorKey");
            return new a(clientSecret, gVar, num, injectorKey);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final PaymentSheetContractV2.a e(Context context) {
            u.l cVar;
            AbstractC3159y.i(context, "context");
            AbstractC3986a abstractC3986a = this.f25503a;
            if (abstractC3986a instanceof C3990e) {
                cVar = new u.l.b(this.f25503a.b());
            } else if (abstractC3986a instanceof y3.k) {
                cVar = new u.l.c(this.f25503a.b());
            } else {
                throw new L5.p();
            }
            u.g gVar = this.f25504b;
            if (gVar == null) {
                gVar = u.g.f26416q.a(context);
            }
            return new PaymentSheetContractV2.a(cVar, gVar, this.f25505c, false);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3159y.d(this.f25503a, aVar.f25503a) && AbstractC3159y.d(this.f25504b, aVar.f25504b) && AbstractC3159y.d(this.f25505c, aVar.f25505c) && AbstractC3159y.d(this.f25506d, aVar.f25506d);
        }

        public int hashCode() {
            int hashCode = this.f25503a.hashCode() * 31;
            u.g gVar = this.f25504b;
            int hashCode2 = (hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
            Integer num = this.f25505c;
            return ((hashCode2 + (num != null ? num.hashCode() : 0)) * 31) + this.f25506d.hashCode();
        }

        public String toString() {
            return "Args(clientSecret=" + this.f25503a + ", config=" + this.f25504b + ", statusBarColor=" + this.f25505c + ", injectorKey=" + this.f25506d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeParcelable(this.f25503a, i8);
            u.g gVar = this.f25504b;
            if (gVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                gVar.writeToParcel(out, i8);
            }
            Integer num = this.f25505c;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            out.writeString(this.f25506d);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a input) {
        Activity activity;
        Window window;
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(input, "input");
        Integer num = null;
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = null;
        }
        if (activity != null && (window = activity.getWindow()) != null) {
            num = Integer.valueOf(window.getStatusBarColor());
        }
        Intent putExtra = new Intent(context, (Class<?>) PaymentSheetActivity.class).putExtra("com.stripe.android.paymentsheet.PaymentSheetContract.extra_args", a.c(input, null, null, num, null, 11, null).e(context));
        AbstractC3159y.h(putExtra, "putExtra(...)");
        return putExtra;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public x parseResult(int i8, Intent intent) {
        x xVar;
        PaymentSheetContractV2.c cVar;
        if (intent != null && (cVar = (PaymentSheetContractV2.c) intent.getParcelableExtra("com.stripe.android.paymentsheet.PaymentSheetContract.extra_result")) != null) {
            xVar = cVar.b();
        } else {
            xVar = null;
        }
        if (xVar == null) {
            return new x.c(new IllegalArgumentException("Failed to retrieve a PaymentSheetResult."));
        }
        return xVar;
    }
}
