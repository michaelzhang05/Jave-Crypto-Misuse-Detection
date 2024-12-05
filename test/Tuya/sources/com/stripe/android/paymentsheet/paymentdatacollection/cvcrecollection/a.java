package com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection;

import android.content.Intent;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public interface a extends Parcelable {

    /* renamed from: l0, reason: collision with root package name */
    public static final b f26211l0 = b.f26213a;

    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0634a implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0634a f26212a = new C0634a();
        public static final Parcelable.Creator<C0634a> CREATOR = new C0635a();

        /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0635a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0634a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                parcel.readInt();
                return C0634a.f26212a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0634a[] newArray(int i8) {
                return new C0634a[i8];
            }
        }

        private C0634a() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f26213a = new b();

        private b() {
        }

        public final a a(Intent intent) {
            Object parcelableExtra;
            a aVar = null;
            if (Build.VERSION.SDK_INT >= 33) {
                if (intent != null) {
                    parcelableExtra = intent.getParcelableExtra("extra_activity_result", a.class);
                    aVar = (a) parcelableExtra;
                }
            } else if (intent != null) {
                aVar = (a) intent.getParcelableExtra("extra_activity_result");
            }
            if (aVar == null) {
                return C0634a.f26212a;
            }
            return aVar;
        }

        public final Intent b(Intent intent, a result) {
            AbstractC3159y.i(intent, "intent");
            AbstractC3159y.i(result, "result");
            Intent putExtra = intent.putExtra("extra_activity_result", result);
            AbstractC3159y.h(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements a {
        public static final Parcelable.Creator<c> CREATOR = new C0636a();

        /* renamed from: a, reason: collision with root package name */
        private final String f26214a;

        /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0636a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new c(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(String cvc) {
            AbstractC3159y.i(cvc, "cvc");
            this.f26214a = cvc;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC3159y.d(this.f26214a, ((c) obj).f26214a);
        }

        public int hashCode() {
            return this.f26214a.hashCode();
        }

        public String toString() {
            return "Confirmed(cvc=" + this.f26214a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f26214a);
        }
    }
}
