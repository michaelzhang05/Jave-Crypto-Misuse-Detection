package com.stripe.android.model;

import P5.AbstractC1378t;
import P5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.o;
import e3.InterfaceC2784H;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class q implements InterfaceC2784H, Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public static final int f25706b = 0;

    /* renamed from: a, reason: collision with root package name */
    private final o.p f25707a;

    /* loaded from: classes4.dex */
    public static final class a extends q {

        /* renamed from: c, reason: collision with root package name */
        private Boolean f25710c;

        /* renamed from: d, reason: collision with root package name */
        public static final C0520a f25708d = new C0520a(null);

        /* renamed from: e, reason: collision with root package name */
        public static final int f25709e = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.model.q$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0520a {
            private C0520a() {
            }

            public /* synthetic */ C0520a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                Boolean valueOf;
                AbstractC3255y.i(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new a(valueOf);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(Boolean bool) {
            super(o.p.f25593o, null);
            this.f25710c = bool;
        }

        @Override // com.stripe.android.model.q
        public List a() {
            String str;
            Boolean bool = this.f25710c;
            if (bool != null) {
                str = bool.toString();
            } else {
                str = null;
            }
            return AbstractC1378t.e(O5.x.a("confirmed", str));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC3255y.d(this.f25710c, ((a) obj).f25710c);
        }

        public int hashCode() {
            Boolean bool = this.f25710c;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public String toString() {
            return "BacsDebit(confirmed=" + this.f25710c + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            int i9;
            AbstractC3255y.i(out, "out");
            Boolean bool = this.f25710c;
            if (bool == null) {
                i9 = 0;
            } else {
                out.writeInt(1);
                i9 = bool.booleanValue();
            }
            out.writeInt(i9);
        }
    }

    public /* synthetic */ q(o.p pVar, AbstractC3247p abstractC3247p) {
        this(pVar);
    }

    @Override // e3.InterfaceC2784H
    public final Map B() {
        Map map;
        List<O5.r> a8 = a();
        Map h8 = Q.h();
        for (O5.r rVar : a8) {
            String str = (String) rVar.a();
            Object b8 = rVar.b();
            if (b8 != null) {
                map = Q.e(O5.x.a(str, b8));
            } else {
                map = null;
            }
            if (map == null) {
                map = Q.h();
            }
            h8 = Q.q(h8, map);
        }
        if (!h8.isEmpty()) {
            return Q.e(O5.x.a(this.f25707a.f25605a, h8));
        }
        return Q.h();
    }

    public abstract List a();

    private q(o.p pVar) {
        this.f25707a = pVar;
    }
}
