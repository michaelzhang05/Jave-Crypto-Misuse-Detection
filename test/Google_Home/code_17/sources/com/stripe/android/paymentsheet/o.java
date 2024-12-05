package com.stripe.android.paymentsheet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.BundleKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class o implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public static final b f27128b = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f27129a;

    /* loaded from: classes4.dex */
    public static final class a extends o {
        public static final Parcelable.Creator<a> CREATOR = new C0612a();

        /* renamed from: c, reason: collision with root package name */
        private final Throwable f27130c;

        /* renamed from: d, reason: collision with root package name */
        private final B3.f f27131d;

        /* renamed from: e, reason: collision with root package name */
        private final List f27132e;

        /* renamed from: com.stripe.android.paymentsheet.o$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0612a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                AbstractC3255y.i(parcel, "parcel");
                Throwable th = (Throwable) parcel.readSerializable();
                B3.f fVar = (B3.f) parcel.readParcelable(a.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    for (int i8 = 0; i8 != readInt; i8++) {
                        arrayList2.add(parcel.readParcelable(a.class.getClassLoader()));
                    }
                    arrayList = arrayList2;
                }
                return new a(th, fVar, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(Throwable th, B3.f fVar, List list) {
            super(0, null);
            this.f27130c = th;
            this.f27131d = fVar;
            this.f27132e = list;
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
            return AbstractC3255y.d(this.f27130c, aVar.f27130c) && AbstractC3255y.d(this.f27131d, aVar.f27131d) && AbstractC3255y.d(this.f27132e, aVar.f27132e);
        }

        public int hashCode() {
            Throwable th = this.f27130c;
            int hashCode = (th == null ? 0 : th.hashCode()) * 31;
            B3.f fVar = this.f27131d;
            int hashCode2 = (hashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
            List list = this.f27132e;
            return hashCode2 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "Canceled(mostRecentError=" + this.f27130c + ", paymentSelection=" + this.f27131d + ", paymentMethods=" + this.f27132e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeSerializable(this.f27130c);
            out.writeParcelable(this.f27131d, i8);
            List list = this.f27132e;
            if (list == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                out.writeParcelable((Parcelable) it.next(), i8);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final /* synthetic */ o a(Intent intent) {
            if (intent != null) {
                return (o) intent.getParcelableExtra("extra_activity_result");
            }
            return null;
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends o {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        private final B3.f f27133c;

        /* renamed from: d, reason: collision with root package name */
        private final List f27134d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                AbstractC3255y.i(parcel, "parcel");
                B3.f fVar = (B3.f) parcel.readParcelable(c.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    for (int i8 = 0; i8 != readInt; i8++) {
                        arrayList2.add(parcel.readParcelable(c.class.getClassLoader()));
                    }
                    arrayList = arrayList2;
                }
                return new c(fVar, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(B3.f paymentSelection, List list) {
            super(-1, null);
            AbstractC3255y.i(paymentSelection, "paymentSelection");
            this.f27133c = paymentSelection;
            this.f27134d = list;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC3255y.d(this.f27133c, cVar.f27133c) && AbstractC3255y.d(this.f27134d, cVar.f27134d);
        }

        public int hashCode() {
            int hashCode = this.f27133c.hashCode() * 31;
            List list = this.f27134d;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            return "Succeeded(paymentSelection=" + this.f27133c + ", paymentMethods=" + this.f27134d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeParcelable(this.f27133c, i8);
            List list = this.f27134d;
            if (list == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                out.writeParcelable((Parcelable) it.next(), i8);
            }
        }
    }

    public /* synthetic */ o(int i8, AbstractC3247p abstractC3247p) {
        this(i8);
    }

    public final int a() {
        return this.f27129a;
    }

    public final Bundle b() {
        return BundleKt.bundleOf(O5.x.a("extra_activity_result", this));
    }

    private o(int i8) {
        this.f27129a = i8;
    }
}
