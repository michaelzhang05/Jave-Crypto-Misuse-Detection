package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b0 implements Parcelable {
    public static final Parcelable.Creator<b0> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final String f2741a;

    /* renamed from: b, reason: collision with root package name */
    final String f2742b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f2743c;

    /* renamed from: d, reason: collision with root package name */
    final int f2744d;

    /* renamed from: e, reason: collision with root package name */
    final int f2745e;

    /* renamed from: f, reason: collision with root package name */
    final String f2746f;

    /* renamed from: g, reason: collision with root package name */
    final boolean f2747g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f2748h;

    /* renamed from: i, reason: collision with root package name */
    final boolean f2749i;

    /* renamed from: j, reason: collision with root package name */
    final Bundle f2750j;

    /* renamed from: k, reason: collision with root package name */
    final boolean f2751k;

    /* renamed from: l, reason: collision with root package name */
    final int f2752l;

    /* renamed from: m, reason: collision with root package name */
    Bundle f2753m;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b0 createFromParcel(Parcel parcel) {
            return new b0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b0[] newArray(int i6) {
            return new b0[i6];
        }
    }

    b0(Parcel parcel) {
        this.f2741a = parcel.readString();
        this.f2742b = parcel.readString();
        this.f2743c = parcel.readInt() != 0;
        this.f2744d = parcel.readInt();
        this.f2745e = parcel.readInt();
        this.f2746f = parcel.readString();
        this.f2747g = parcel.readInt() != 0;
        this.f2748h = parcel.readInt() != 0;
        this.f2749i = parcel.readInt() != 0;
        this.f2750j = parcel.readBundle();
        this.f2751k = parcel.readInt() != 0;
        this.f2753m = parcel.readBundle();
        this.f2752l = parcel.readInt();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment a(n nVar, ClassLoader classLoader) {
        Fragment a6 = nVar.a(classLoader, this.f2741a);
        Bundle bundle = this.f2750j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a6.y1(this.f2750j);
        a6.f2658f = this.f2742b;
        a6.f2667o = this.f2743c;
        a6.f2669q = true;
        a6.f2676x = this.f2744d;
        a6.f2677y = this.f2745e;
        a6.f2678z = this.f2746f;
        a6.C = this.f2747g;
        a6.f2665m = this.f2748h;
        a6.B = this.f2749i;
        a6.A = this.f2751k;
        a6.R = h.b.values()[this.f2752l];
        Bundle bundle2 = this.f2753m;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        a6.f2654b = bundle2;
        return a6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f2741a);
        sb.append(" (");
        sb.append(this.f2742b);
        sb.append(")}:");
        if (this.f2743c) {
            sb.append(" fromLayout");
        }
        if (this.f2745e != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f2745e));
        }
        String str = this.f2746f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f2746f);
        }
        if (this.f2747g) {
            sb.append(" retainInstance");
        }
        if (this.f2748h) {
            sb.append(" removing");
        }
        if (this.f2749i) {
            sb.append(" detached");
        }
        if (this.f2751k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f2741a);
        parcel.writeString(this.f2742b);
        parcel.writeInt(this.f2743c ? 1 : 0);
        parcel.writeInt(this.f2744d);
        parcel.writeInt(this.f2745e);
        parcel.writeString(this.f2746f);
        parcel.writeInt(this.f2747g ? 1 : 0);
        parcel.writeInt(this.f2748h ? 1 : 0);
        parcel.writeInt(this.f2749i ? 1 : 0);
        parcel.writeBundle(this.f2750j);
        parcel.writeInt(this.f2751k ? 1 : 0);
        parcel.writeBundle(this.f2753m);
        parcel.writeInt(this.f2752l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b0(Fragment fragment) {
        this.f2741a = fragment.getClass().getName();
        this.f2742b = fragment.f2658f;
        this.f2743c = fragment.f2667o;
        this.f2744d = fragment.f2676x;
        this.f2745e = fragment.f2677y;
        this.f2746f = fragment.f2678z;
        this.f2747g = fragment.C;
        this.f2748h = fragment.f2665m;
        this.f2749i = fragment.B;
        this.f2750j = fragment.f2659g;
        this.f2751k = fragment.A;
        this.f2752l = fragment.R.ordinal();
    }
}
