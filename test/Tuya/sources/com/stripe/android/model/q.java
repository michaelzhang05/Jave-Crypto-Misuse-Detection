package com.stripe.android.model;

import M5.AbstractC1246t;
import M5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import b3.InterfaceC1863H;
import com.stripe.android.model.o;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class q implements InterfaceC1863H, Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public static final int f24651b = 0;

    /* renamed from: a, reason: collision with root package name */
    private final o.p f24652a;

    /* loaded from: classes4.dex */
    public static final class a extends q {

        /* renamed from: c, reason: collision with root package name */
        private Boolean f24655c;

        /* renamed from: d, reason: collision with root package name */
        public static final C0524a f24653d = new C0524a(null);

        /* renamed from: e, reason: collision with root package name */
        public static final int f24654e = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.model.q$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0524a {
            private C0524a() {
            }

            public /* synthetic */ C0524a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                Boolean valueOf;
                AbstractC3159y.i(parcel, "parcel");
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
            super(o.p.f24538o, null);
            this.f24655c = bool;
        }

        @Override // com.stripe.android.model.q
        public List b() {
            String str;
            Boolean bool = this.f24655c;
            if (bool != null) {
                str = bool.toString();
            } else {
                str = null;
            }
            return AbstractC1246t.e(L5.x.a("confirmed", str));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC3159y.d(this.f24655c, ((a) obj).f24655c);
        }

        public int hashCode() {
            Boolean bool = this.f24655c;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public String toString() {
            return "BacsDebit(confirmed=" + this.f24655c + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            int i9;
            AbstractC3159y.i(out, "out");
            Boolean bool = this.f24655c;
            if (bool == null) {
                i9 = 0;
            } else {
                out.writeInt(1);
                i9 = bool.booleanValue();
            }
            out.writeInt(i9);
        }
    }

    public /* synthetic */ q(o.p pVar, AbstractC3151p abstractC3151p) {
        this(pVar);
    }

    public abstract List b();

    @Override // b3.InterfaceC1863H
    public final Map y() {
        Map map;
        List<L5.r> b8 = b();
        Map h8 = Q.h();
        for (L5.r rVar : b8) {
            String str = (String) rVar.a();
            Object b9 = rVar.b();
            if (b9 != null) {
                map = Q.e(L5.x.a(str, b9));
            } else {
                map = null;
            }
            if (map == null) {
                map = Q.h();
            }
            h8 = Q.q(h8, map);
        }
        if (!h8.isEmpty()) {
            return Q.e(L5.x.a(this.f24652a.f24550a, h8));
        }
        return Q.h();
    }

    private q(o.p pVar) {
        this.f24652a = pVar;
    }
}
