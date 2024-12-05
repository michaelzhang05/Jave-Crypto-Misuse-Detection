package com.stripe.android.view;

import M5.AbstractC1246t;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;

/* renamed from: com.stripe.android.view.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2469s {

    /* renamed from: c, reason: collision with root package name */
    private static final b f27925c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f27926d = 8;

    /* renamed from: e, reason: collision with root package name */
    private static final a f27927e = new a("00", "Stripe Test Bank");

    /* renamed from: a, reason: collision with root package name */
    private final List f27928a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f27929b;

    /* renamed from: com.stripe.android.view.s$a */
    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0695a();

        /* renamed from: a, reason: collision with root package name */
        private final String f27930a;

        /* renamed from: b, reason: collision with root package name */
        private final String f27931b;

        /* renamed from: com.stripe.android.view.s$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0695a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new a(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(String prefix, String name) {
            AbstractC3159y.i(prefix, "prefix");
            AbstractC3159y.i(name, "name");
            this.f27930a = prefix;
            this.f27931b = name;
        }

        public final String b() {
            return this.f27931b;
        }

        public final String c() {
            return this.f27930a;
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
            return AbstractC3159y.d(this.f27930a, aVar.f27930a) && AbstractC3159y.d(this.f27931b, aVar.f27931b);
        }

        public int hashCode() {
            return (this.f27930a.hashCode() * 31) + this.f27931b.hashCode();
        }

        public String toString() {
            return "Bank(prefix=" + this.f27930a + ", name=" + this.f27931b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f27930a);
            out.writeString(this.f27931b);
        }
    }

    /* renamed from: com.stripe.android.view.s$b */
    /* loaded from: classes4.dex */
    private static final class b {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List b(Context context) {
            Map b8 = v2.e.f38789a.b(new JSONObject(c(context)));
            if (b8 == null) {
                b8 = M5.Q.h();
            }
            ArrayList arrayList = new ArrayList(b8.size());
            for (Map.Entry entry : b8.entrySet()) {
                arrayList.add(new a((String) entry.getKey(), String.valueOf(entry.getValue())));
            }
            return arrayList;
        }

        private final String c(Context context) {
            String next = new Scanner(context.getResources().getAssets().open("au_becs_bsb.json")).useDelimiter("\\A").next();
            AbstractC3159y.h(next, "next(...)");
            return next;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public C2469s(List banks, boolean z8) {
        AbstractC3159y.i(banks, "banks");
        this.f27928a = banks;
        this.f27929b = z8;
    }

    public final a a(String bsb) {
        AbstractC3159y.i(bsb, "bsb");
        List list = this.f27928a;
        a aVar = f27927e;
        Object obj = null;
        if (!this.f27929b) {
            aVar = null;
        }
        Iterator it = AbstractC1246t.G0(list, AbstractC1246t.q(aVar)).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (g6.n.C(bsb, ((a) next).c(), false, 2, null)) {
                obj = next;
                break;
            }
        }
        return (a) obj;
    }

    public /* synthetic */ C2469s(Context context, boolean z8, int i8, AbstractC3151p abstractC3151p) {
        this(context, (i8 & 2) != 0 ? true : z8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2469s(Context context, boolean z8) {
        this(f27925c.b(context), z8);
        AbstractC3159y.i(context, "context");
    }
}
