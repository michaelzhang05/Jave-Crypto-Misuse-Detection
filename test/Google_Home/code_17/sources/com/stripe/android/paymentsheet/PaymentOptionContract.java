package com.stripe.android.paymentsheet;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class PaymentOptionContract extends ActivityResultContract<a, o> {

    /* renamed from: a, reason: collision with root package name */
    public static final b f26504a = new b(null);

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final L3.l f26507a;

        /* renamed from: b, reason: collision with root package name */
        private final Integer f26508b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f26509c;

        /* renamed from: d, reason: collision with root package name */
        private final Set f26510d;

        /* renamed from: e, reason: collision with root package name */
        public static final C0562a f26505e = new C0562a(null);

        /* renamed from: f, reason: collision with root package name */
        public static final int f26506f = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.paymentsheet.PaymentOptionContract$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0562a {
            private C0562a() {
            }

            public final a a(Intent intent) {
                AbstractC3255y.i(intent, "intent");
                return (a) intent.getParcelableExtra("extra_activity_args");
            }

            public /* synthetic */ C0562a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                L3.l createFromParcel = L3.l.CREATOR.createFromParcel(parcel);
                Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                boolean z8 = parcel.readInt() != 0;
                int readInt = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    linkedHashSet.add(parcel.readString());
                }
                return new a(createFromParcel, valueOf, z8, linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(L3.l state, Integer num, boolean z8, Set productUsage) {
            AbstractC3255y.i(state, "state");
            AbstractC3255y.i(productUsage, "productUsage");
            this.f26507a = state;
            this.f26508b = num;
            this.f26509c = z8;
            this.f26510d = productUsage;
        }

        public final Set a() {
            return this.f26510d;
        }

        public final L3.l b() {
            return this.f26507a;
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
            return AbstractC3255y.d(this.f26507a, aVar.f26507a) && AbstractC3255y.d(this.f26508b, aVar.f26508b) && this.f26509c == aVar.f26509c && AbstractC3255y.d(this.f26510d, aVar.f26510d);
        }

        public int hashCode() {
            int hashCode = this.f26507a.hashCode() * 31;
            Integer num = this.f26508b;
            return ((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f26509c)) * 31) + this.f26510d.hashCode();
        }

        public String toString() {
            return "Args(state=" + this.f26507a + ", statusBarColor=" + this.f26508b + ", enableLogging=" + this.f26509c + ", productUsage=" + this.f26510d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            int intValue;
            AbstractC3255y.i(out, "out");
            this.f26507a.writeToParcel(out, i8);
            Integer num = this.f26508b;
            if (num == null) {
                intValue = 0;
            } else {
                out.writeInt(1);
                intValue = num.intValue();
            }
            out.writeInt(intValue);
            out.writeInt(this.f26509c ? 1 : 0);
            Set set = this.f26510d;
            out.writeInt(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                out.writeString((String) it.next());
            }
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
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(input, "input");
        Intent putExtra = new Intent(context, (Class<?>) PaymentOptionsActivity.class).putExtra("extra_activity_args", input);
        AbstractC3255y.h(putExtra, "putExtra(...)");
        return putExtra;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public o parseResult(int i8, Intent intent) {
        return o.f27128b.a(intent);
    }
}
