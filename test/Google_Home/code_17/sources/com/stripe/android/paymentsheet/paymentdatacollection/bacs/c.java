package com.stripe.android.paymentsheet.paymentdatacollection.bacs;

import android.content.Intent;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public interface c extends Parcelable {

    /* renamed from: j0, reason: collision with root package name */
    public static final b f27216j0 = b.f27218a;

    /* loaded from: classes4.dex */
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f27217a = new a();
        public static final Parcelable.Creator<a> CREATOR = new C0622a();

        /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0622a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                parcel.readInt();
                return a.f27217a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        private a() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f27218a = new b();

        private b() {
        }

        public final c a(Intent intent) {
            Object parcelableExtra;
            c cVar = null;
            if (Build.VERSION.SDK_INT >= 33) {
                if (intent != null) {
                    parcelableExtra = intent.getParcelableExtra("extra_activity_result", c.class);
                    cVar = (c) parcelableExtra;
                }
            } else if (intent != null) {
                cVar = (c) intent.getParcelableExtra("extra_activity_result");
            }
            if (cVar == null) {
                return a.f27217a;
            }
            return cVar;
        }

        public final Intent b(Intent intent, c result) {
            AbstractC3255y.i(intent, "intent");
            AbstractC3255y.i(result, "result");
            Intent putExtra = intent.putExtra("extra_activity_result", result);
            AbstractC3255y.h(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0623c implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final C0623c f27219a = new C0623c();
        public static final Parcelable.Creator<C0623c> CREATOR = new a();

        /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.c$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0623c createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                parcel.readInt();
                return C0623c.f27219a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0623c[] newArray(int i8) {
                return new C0623c[i8];
            }
        }

        private C0623c() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final d f27220a = new d();
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                parcel.readInt();
                return d.f27220a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        private d() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeInt(1);
        }
    }
}
