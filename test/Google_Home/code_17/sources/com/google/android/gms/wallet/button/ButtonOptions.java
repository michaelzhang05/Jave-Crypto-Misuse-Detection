package com.google.android.gms.wallet.button;

import Q.AbstractC1398n;
import Q.AbstractC1400p;
import R.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import s0.AbstractC3985a;

/* loaded from: classes3.dex */
public final class ButtonOptions extends R.a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<ButtonOptions> CREATOR = new com.google.android.gms.wallet.button.a();

    /* renamed from: a, reason: collision with root package name */
    int f18014a;

    /* renamed from: b, reason: collision with root package name */
    int f18015b;

    /* renamed from: c, reason: collision with root package name */
    int f18016c;

    /* renamed from: d, reason: collision with root package name */
    String f18017d;

    /* renamed from: e, reason: collision with root package name */
    boolean f18018e = false;

    /* loaded from: classes3.dex */
    public final class a {
        /* synthetic */ a(AbstractC3985a abstractC3985a) {
        }

        public ButtonOptions a() {
            return ButtonOptions.this;
        }

        public a b(String str) {
            ButtonOptions.this.f18017d = str;
            return this;
        }

        public a c(int i8) {
            ButtonOptions.this.f18015b = i8;
            return this;
        }

        public a d(int i8) {
            ButtonOptions.this.f18014a = i8;
            return this;
        }

        public a e(int i8) {
            ButtonOptions buttonOptions = ButtonOptions.this;
            buttonOptions.f18016c = i8;
            buttonOptions.f18018e = true;
            return this;
        }
    }

    private ButtonOptions() {
    }

    public static a z() {
        return new a(null);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ButtonOptions) {
            ButtonOptions buttonOptions = (ButtonOptions) obj;
            if (AbstractC1398n.a(Integer.valueOf(this.f18014a), Integer.valueOf(buttonOptions.f18014a)) && AbstractC1398n.a(Integer.valueOf(this.f18015b), Integer.valueOf(buttonOptions.f18015b)) && AbstractC1398n.a(Integer.valueOf(this.f18016c), Integer.valueOf(buttonOptions.f18016c)) && AbstractC1398n.a(this.f18017d, buttonOptions.f18017d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return AbstractC1398n.b(Integer.valueOf(this.f18014a));
    }

    public String p() {
        return this.f18017d;
    }

    public int u() {
        return this.f18015b;
    }

    public int v() {
        return this.f18014a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = c.a(parcel);
        c.k(parcel, 1, v());
        c.k(parcel, 2, u());
        c.k(parcel, 3, y());
        c.q(parcel, 4, p(), false);
        c.b(parcel, a8);
    }

    public int y() {
        return this.f18016c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ButtonOptions(int i8, int i9, int i10, String str) {
        this.f18014a = ((Integer) AbstractC1400p.l(Integer.valueOf(i8))).intValue();
        this.f18015b = ((Integer) AbstractC1400p.l(Integer.valueOf(i9))).intValue();
        this.f18016c = ((Integer) AbstractC1400p.l(Integer.valueOf(i10))).intValue();
        this.f18017d = (String) AbstractC1400p.l(str);
    }
}
