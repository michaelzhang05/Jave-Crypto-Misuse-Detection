package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    private CharSequence[] b0;
    private CharSequence[] c0;
    private String d0;
    private String e0;
    private boolean f0;

    /* loaded from: classes.dex */
    public static final class a implements Preference.f<ListPreference> {
        private static a a;

        private a() {
        }

        public static a b() {
            if (a == null) {
                a = new a();
            }
            return a;
        }

        @Override // androidx.preference.Preference.f
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence a(ListPreference listPreference) {
            if (TextUtils.isEmpty(listPreference.g1())) {
                return listPreference.C().getString(r.f1377c);
            }
            return listPreference.g1();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.a0, i2, i3);
        this.b0 = androidx.core.content.d.g.q(obtainStyledAttributes, t.d0, t.b0);
        this.c0 = androidx.core.content.d.g.q(obtainStyledAttributes, t.e0, t.c0);
        int i4 = t.f0;
        if (androidx.core.content.d.g.b(obtainStyledAttributes, i4, i4, false)) {
            P0(a.b());
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, t.q0, i2, i3);
        this.e0 = androidx.core.content.d.g.o(obtainStyledAttributes2, t.Y0, t.y0);
        obtainStyledAttributes2.recycle();
    }

    private int j1() {
        return e1(this.d0);
    }

    @Override // androidx.preference.Preference
    public void O0(CharSequence charSequence) {
        super.O0(charSequence);
        if (charSequence == null && this.e0 != null) {
            this.e0 = null;
        } else {
            if (charSequence == null || charSequence.equals(this.e0)) {
                return;
            }
            this.e0 = charSequence.toString();
        }
    }

    @Override // androidx.preference.Preference
    public CharSequence T() {
        if (U() != null) {
            return U().a(this);
        }
        CharSequence g1 = g1();
        CharSequence T = super.T();
        String str = this.e0;
        if (str == null) {
            return T;
        }
        Object[] objArr = new Object[1];
        if (g1 == null) {
            g1 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        objArr[0] = g1;
        String format = String.format(str, objArr);
        if (TextUtils.equals(format, T)) {
            return T;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }

    public int e1(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.c0) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (this.c0[length].equals(str)) {
                return length;
            }
        }
        return -1;
    }

    public CharSequence[] f1() {
        return this.b0;
    }

    public CharSequence g1() {
        CharSequence[] charSequenceArr;
        int j1 = j1();
        if (j1 < 0 || (charSequenceArr = this.b0) == null) {
            return null;
        }
        return charSequenceArr[j1];
    }

    public CharSequence[] h1() {
        return this.c0;
    }

    public String i1() {
        return this.d0;
    }

    public void k1(String str) {
        boolean z = !TextUtils.equals(this.d0, str);
        if (z || !this.f0) {
            this.d0 = str;
            this.f0 = true;
            z0(str);
            if (z) {
                d0();
            }
        }
    }

    @Override // androidx.preference.Preference
    protected Object n0(TypedArray typedArray, int i2) {
        return typedArray.getString(i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void r0(Parcelable parcelable) {
        if (parcelable != null && parcelable.getClass().equals(SavedState.class)) {
            SavedState savedState = (SavedState) parcelable;
            super.r0(savedState.getSuperState());
            k1(savedState.f1289f);
            return;
        }
        super.r0(parcelable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public Parcelable s0() {
        Parcelable s0 = super.s0();
        if (a0()) {
            return s0;
        }
        SavedState savedState = new SavedState(s0);
        savedState.f1289f = i1();
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected void t0(Object obj) {
        k1(O((String) obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: f, reason: collision with root package name */
        String f1289f;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f1289f = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeString(this.f1289f);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.d.g.a(context, m.f1359c, R.attr.dialogPreferenceStyle));
    }
}
