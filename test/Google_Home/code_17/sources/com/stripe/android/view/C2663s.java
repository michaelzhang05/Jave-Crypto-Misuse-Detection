package com.stripe.android.view;

import P5.AbstractC1378t;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONObject;

/* renamed from: com.stripe.android.view.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2663s {

    /* renamed from: c, reason: collision with root package name */
    private static final b f28980c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f28981d = 8;

    /* renamed from: e, reason: collision with root package name */
    private static final a f28982e = new a("00", "Stripe Test Bank");

    /* renamed from: a, reason: collision with root package name */
    private final List f28983a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f28984b;

    /* renamed from: com.stripe.android.view.s$a */
    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0691a();

        /* renamed from: a, reason: collision with root package name */
        private final String f28985a;

        /* renamed from: b, reason: collision with root package name */
        private final String f28986b;

        /* renamed from: com.stripe.android.view.s$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0691a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new a(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(String prefix, String name) {
            AbstractC3255y.i(prefix, "prefix");
            AbstractC3255y.i(name, "name");
            this.f28985a = prefix;
            this.f28986b = name;
        }

        public final String a() {
            return this.f28986b;
        }

        public final String b() {
            return this.f28985a;
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
            return AbstractC3255y.d(this.f28985a, aVar.f28985a) && AbstractC3255y.d(this.f28986b, aVar.f28986b);
        }

        public int hashCode() {
            return (this.f28985a.hashCode() * 31) + this.f28986b.hashCode();
        }

        public String toString() {
            return "Bank(prefix=" + this.f28985a + ", name=" + this.f28986b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f28985a);
            out.writeString(this.f28986b);
        }
    }

    /* renamed from: com.stripe.android.view.s$b */
    /* loaded from: classes4.dex */
    private static final class b {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List b(Context context) {
            Map b8 = y2.e.f40920a.b(new JSONObject(c(context)));
            if (b8 == null) {
                b8 = P5.Q.h();
            }
            ArrayList arrayList = new ArrayList(b8.size());
            for (Map.Entry entry : b8.entrySet()) {
                arrayList.add(new a((String) entry.getKey(), String.valueOf(entry.getValue())));
            }
            return arrayList;
        }

        private final String c(Context context) {
            String next = new Scanner(context.getResources().getAssets().open("au_becs_bsb.json")).useDelimiter("\\A").next();
            AbstractC3255y.h(next, "next(...)");
            return next;
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public C2663s(List banks, boolean z8) {
        AbstractC3255y.i(banks, "banks");
        this.f28983a = banks;
        this.f28984b = z8;
    }

    public final a a(String bsb) {
        AbstractC3255y.i(bsb, "bsb");
        List list = this.f28983a;
        a aVar = f28982e;
        Object obj = null;
        if (!this.f28984b) {
            aVar = null;
        }
        Iterator it = AbstractC1378t.G0(list, AbstractC1378t.q(aVar)).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (j6.n.C(bsb, ((a) next).b(), false, 2, null)) {
                obj = next;
                break;
            }
        }
        return (a) obj;
    }

    public /* synthetic */ C2663s(Context context, boolean z8, int i8, AbstractC3247p abstractC3247p) {
        this(context, (i8 & 2) != 0 ? true : z8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2663s(Context context, boolean z8) {
        this(f28980c.b(context), z8);
        AbstractC3255y.i(context, "context");
    }
}
