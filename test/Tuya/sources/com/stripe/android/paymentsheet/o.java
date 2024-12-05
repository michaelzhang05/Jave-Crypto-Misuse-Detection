package com.stripe.android.paymentsheet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.BundleKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import y3.AbstractC3991f;

/* loaded from: classes4.dex */
public abstract class o implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public static final b f26073b = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f26074a;

    /* loaded from: classes4.dex */
    public static final class a extends o {
        public static final Parcelable.Creator<a> CREATOR = new C0616a();

        /* renamed from: c, reason: collision with root package name */
        private final Throwable f26075c;

        /* renamed from: d, reason: collision with root package name */
        private final AbstractC3991f f26076d;

        /* renamed from: e, reason: collision with root package name */
        private final List f26077e;

        /* renamed from: com.stripe.android.paymentsheet.o$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0616a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                AbstractC3159y.i(parcel, "parcel");
                Throwable th = (Throwable) parcel.readSerializable();
                AbstractC3991f abstractC3991f = (AbstractC3991f) parcel.readParcelable(a.class.getClassLoader());
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
                return new a(th, abstractC3991f, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(Throwable th, AbstractC3991f abstractC3991f, List list) {
            super(0, null);
            this.f26075c = th;
            this.f26076d = abstractC3991f;
            this.f26077e = list;
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
            return AbstractC3159y.d(this.f26075c, aVar.f26075c) && AbstractC3159y.d(this.f26076d, aVar.f26076d) && AbstractC3159y.d(this.f26077e, aVar.f26077e);
        }

        public int hashCode() {
            Throwable th = this.f26075c;
            int hashCode = (th == null ? 0 : th.hashCode()) * 31;
            AbstractC3991f abstractC3991f = this.f26076d;
            int hashCode2 = (hashCode + (abstractC3991f == null ? 0 : abstractC3991f.hashCode())) * 31;
            List list = this.f26077e;
            return hashCode2 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "Canceled(mostRecentError=" + this.f26075c + ", paymentSelection=" + this.f26076d + ", paymentMethods=" + this.f26077e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeSerializable(this.f26075c);
            out.writeParcelable(this.f26076d, i8);
            List list = this.f26077e;
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

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends o {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        private final AbstractC3991f f26078c;

        /* renamed from: d, reason: collision with root package name */
        private final List f26079d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                AbstractC3159y.i(parcel, "parcel");
                AbstractC3991f abstractC3991f = (AbstractC3991f) parcel.readParcelable(c.class.getClassLoader());
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
                return new c(abstractC3991f, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC3991f paymentSelection, List list) {
            super(-1, null);
            AbstractC3159y.i(paymentSelection, "paymentSelection");
            this.f26078c = paymentSelection;
            this.f26079d = list;
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
            return AbstractC3159y.d(this.f26078c, cVar.f26078c) && AbstractC3159y.d(this.f26079d, cVar.f26079d);
        }

        public int hashCode() {
            int hashCode = this.f26078c.hashCode() * 31;
            List list = this.f26079d;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            return "Succeeded(paymentSelection=" + this.f26078c + ", paymentMethods=" + this.f26079d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeParcelable(this.f26078c, i8);
            List list = this.f26079d;
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

    public /* synthetic */ o(int i8, AbstractC3151p abstractC3151p) {
        this(i8);
    }

    public final int b() {
        return this.f26074a;
    }

    public final Bundle c() {
        return BundleKt.bundleOf(L5.x.a("extra_activity_result", this));
    }

    private o(int i8) {
        this.f26074a = i8;
    }
}
