package com.stripe.android.paymentsheet.addresselement;

import L5.x;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import com.stripe.android.paymentsheet.addresselement.d;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class AddressElementActivityContract extends ActivityResultContract<a, d> {

    /* renamed from: a, reason: collision with root package name */
    public static final b f25563a = new b(null);

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f25566a;

        /* renamed from: b, reason: collision with root package name */
        private final r3.e f25567b;

        /* renamed from: c, reason: collision with root package name */
        public static final C0586a f25564c = new C0586a(null);

        /* renamed from: d, reason: collision with root package name */
        public static final int f25565d = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0586a {
            private C0586a() {
            }

            public final a a(Intent intent) {
                AbstractC3159y.i(intent, "intent");
                return (a) intent.getParcelableExtra("com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract.extra_args");
            }

            public /* synthetic */ C0586a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new a(parcel.readString(), parcel.readInt() == 0 ? null : r3.e.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(String publishableKey, r3.e eVar) {
            AbstractC3159y.i(publishableKey, "publishableKey");
            this.f25566a = publishableKey;
            this.f25567b = eVar;
        }

        public final r3.e b() {
            return this.f25567b;
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
            return AbstractC3159y.d(this.f25566a, aVar.f25566a) && AbstractC3159y.d(this.f25567b, aVar.f25567b);
        }

        public int hashCode() {
            int hashCode = this.f25566a.hashCode() * 31;
            r3.e eVar = this.f25567b;
            return hashCode + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            return "Args(publishableKey=" + this.f25566a + ", config=" + this.f25567b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f25566a);
            r3.e eVar = this.f25567b;
            if (eVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                eVar.writeToParcel(out, i8);
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

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final d f25568a;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new c((d) parcel.readParcelable(c.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(d addressOptionsResult) {
            AbstractC3159y.i(addressOptionsResult, "addressOptionsResult");
            this.f25568a = addressOptionsResult;
        }

        public final d b() {
            return this.f25568a;
        }

        public Bundle c() {
            return BundleKt.bundleOf(x.a("com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract.extra_result", this));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC3159y.d(this.f25568a, ((c) obj).f25568a);
        }

        public int hashCode() {
            return this.f25568a.hashCode();
        }

        public String toString() {
            return "Result(addressOptionsResult=" + this.f25568a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeParcelable(this.f25568a, i8);
        }
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a input) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(input, "input");
        Intent putExtra = new Intent(context, (Class<?>) AddressElementActivity.class).putExtra("com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract.extra_args", input);
        AbstractC3159y.h(putExtra, "putExtra(...)");
        return putExtra;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public d parseResult(int i8, Intent intent) {
        c cVar;
        d b8;
        if (intent == null || (cVar = (c) intent.getParcelableExtra("com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract.extra_result")) == null || (b8 = cVar.b()) == null) {
            return d.a.f25582a;
        }
        return b8;
    }
}
