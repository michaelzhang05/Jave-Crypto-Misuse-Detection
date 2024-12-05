package com.google.android.gms.wallet.button;

import R.AbstractC1317n;
import R.AbstractC1319p;
import S.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import t0.AbstractC3768a;

/* loaded from: classes3.dex */
public final class ButtonOptions extends S.a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<ButtonOptions> CREATOR = new com.google.android.gms.wallet.button.a();

    /* renamed from: a, reason: collision with root package name */
    int f16981a;

    /* renamed from: b, reason: collision with root package name */
    int f16982b;

    /* renamed from: c, reason: collision with root package name */
    int f16983c;

    /* renamed from: d, reason: collision with root package name */
    String f16984d;

    /* renamed from: e, reason: collision with root package name */
    boolean f16985e = false;

    /* loaded from: classes3.dex */
    public final class a {
        /* synthetic */ a(AbstractC3768a abstractC3768a) {
        }

        public ButtonOptions a() {
            return ButtonOptions.this;
        }

        public a b(String str) {
            ButtonOptions.this.f16984d = str;
            return this;
        }

        public a c(int i8) {
            ButtonOptions.this.f16982b = i8;
            return this;
        }

        public a d(int i8) {
            ButtonOptions.this.f16981a = i8;
            return this;
        }

        public a e(int i8) {
            ButtonOptions buttonOptions = ButtonOptions.this;
            buttonOptions.f16983c = i8;
            buttonOptions.f16985e = true;
            return this;
        }
    }

    private ButtonOptions() {
    }

    public static a I() {
        return new a(null);
    }

    public int G() {
        return this.f16983c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ButtonOptions) {
            ButtonOptions buttonOptions = (ButtonOptions) obj;
            if (AbstractC1317n.a(Integer.valueOf(this.f16981a), Integer.valueOf(buttonOptions.f16981a)) && AbstractC1317n.a(Integer.valueOf(this.f16982b), Integer.valueOf(buttonOptions.f16982b)) && AbstractC1317n.a(Integer.valueOf(this.f16983c), Integer.valueOf(buttonOptions.f16983c)) && AbstractC1317n.a(this.f16984d, buttonOptions.f16984d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return AbstractC1317n.b(Integer.valueOf(this.f16981a));
    }

    public String s() {
        return this.f16984d;
    }

    public int u() {
        return this.f16982b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = c.a(parcel);
        c.k(parcel, 1, z());
        c.k(parcel, 2, u());
        c.k(parcel, 3, G());
        c.q(parcel, 4, s(), false);
        c.b(parcel, a8);
    }

    public int z() {
        return this.f16981a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ButtonOptions(int i8, int i9, int i10, String str) {
        this.f16981a = ((Integer) AbstractC1319p.l(Integer.valueOf(i8))).intValue();
        this.f16982b = ((Integer) AbstractC1319p.l(Integer.valueOf(i9))).intValue();
        this.f16983c = ((Integer) AbstractC1319p.l(Integer.valueOf(i10))).intValue();
        this.f16984d = (String) AbstractC1319p.l(str);
    }
}
