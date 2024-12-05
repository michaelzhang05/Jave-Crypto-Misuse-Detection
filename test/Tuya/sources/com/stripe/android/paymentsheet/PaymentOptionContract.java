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
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class PaymentOptionContract extends ActivityResultContract<a, o> {

    /* renamed from: a, reason: collision with root package name */
    public static final b f25449a = new b(null);

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final I3.l f25452a;

        /* renamed from: b, reason: collision with root package name */
        private final Integer f25453b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f25454c;

        /* renamed from: d, reason: collision with root package name */
        private final Set f25455d;

        /* renamed from: e, reason: collision with root package name */
        public static final C0566a f25450e = new C0566a(null);

        /* renamed from: f, reason: collision with root package name */
        public static final int f25451f = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.paymentsheet.PaymentOptionContract$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0566a {
            private C0566a() {
            }

            public final a a(Intent intent) {
                AbstractC3159y.i(intent, "intent");
                return (a) intent.getParcelableExtra("extra_activity_args");
            }

            public /* synthetic */ C0566a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                I3.l createFromParcel = I3.l.CREATOR.createFromParcel(parcel);
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

        public a(I3.l state, Integer num, boolean z8, Set productUsage) {
            AbstractC3159y.i(state, "state");
            AbstractC3159y.i(productUsage, "productUsage");
            this.f25452a = state;
            this.f25453b = num;
            this.f25454c = z8;
            this.f25455d = productUsage;
        }

        public final Set b() {
            return this.f25455d;
        }

        public final I3.l c() {
            return this.f25452a;
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
            return AbstractC3159y.d(this.f25452a, aVar.f25452a) && AbstractC3159y.d(this.f25453b, aVar.f25453b) && this.f25454c == aVar.f25454c && AbstractC3159y.d(this.f25455d, aVar.f25455d);
        }

        public int hashCode() {
            int hashCode = this.f25452a.hashCode() * 31;
            Integer num = this.f25453b;
            return ((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f25454c)) * 31) + this.f25455d.hashCode();
        }

        public String toString() {
            return "Args(state=" + this.f25452a + ", statusBarColor=" + this.f25453b + ", enableLogging=" + this.f25454c + ", productUsage=" + this.f25455d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            int intValue;
            AbstractC3159y.i(out, "out");
            this.f25452a.writeToParcel(out, i8);
            Integer num = this.f25453b;
            if (num == null) {
                intValue = 0;
            } else {
                out.writeInt(1);
                intValue = num.intValue();
            }
            out.writeInt(intValue);
            out.writeInt(this.f25454c ? 1 : 0);
            Set set = this.f25455d;
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

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a input) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(input, "input");
        Intent putExtra = new Intent(context, (Class<?>) PaymentOptionsActivity.class).putExtra("extra_activity_args", input);
        AbstractC3159y.h(putExtra, "putExtra(...)");
        return putExtra;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public o parseResult(int i8, Intent intent) {
        return o.f26073b.a(intent);
    }
}
