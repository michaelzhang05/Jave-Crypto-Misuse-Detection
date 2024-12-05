package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.EditText;
import androidx.preference.Preference;

/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    private String b0;
    private a c0;

    /* loaded from: classes.dex */
    public interface a {
        void a(EditText editText);
    }

    /* loaded from: classes.dex */
    public static final class b implements Preference.f<EditTextPreference> {
        private static b a;

        private b() {
        }

        public static b b() {
            if (a == null) {
                a = new b();
            }
            return a;
        }

        @Override // androidx.preference.Preference.f
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence a(EditTextPreference editTextPreference) {
            if (TextUtils.isEmpty(editTextPreference.f1())) {
                return editTextPreference.C().getString(r.f1377c);
            }
            return editTextPreference.f1();
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.R, i2, i3);
        int i4 = t.S;
        if (androidx.core.content.d.g.b(obtainStyledAttributes, i4, i4, false)) {
            P0(b.b());
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public boolean T0() {
        return TextUtils.isEmpty(this.b0) || super.T0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a e1() {
        return this.c0;
    }

    public String f1() {
        return this.b0;
    }

    public void g1(String str) {
        boolean T0 = T0();
        this.b0 = str;
        z0(str);
        boolean T02 = T0();
        if (T02 != T0) {
            e0(T02);
        }
        d0();
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
            g1(savedState.f1288f);
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
        savedState.f1288f = f1();
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected void t0(Object obj) {
        g1(O((String) obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: f, reason: collision with root package name */
        String f1288f;

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
            this.f1288f = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeString(this.f1288f);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.d.g.a(context, m.f1361e, R.attr.editTextPreferenceStyle));
    }
}
