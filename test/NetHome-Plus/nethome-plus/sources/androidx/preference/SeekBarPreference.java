package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;

/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {
    int V;
    int W;
    private int X;
    private int Y;
    boolean Z;
    SeekBar a0;
    private TextView b0;
    boolean c0;
    private boolean d0;
    boolean e0;
    private SeekBar.OnSeekBarChangeListener f0;
    private View.OnKeyListener g0;

    /* loaded from: classes.dex */
    class a implements SeekBar.OnSeekBarChangeListener {
        a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
            if (z) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.e0 || !seekBarPreference.Z) {
                    seekBarPreference.c1(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.d1(i2 + seekBarPreference2.W);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.Z = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.Z = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.W != seekBarPreference.V) {
                seekBarPreference.c1(seekBar);
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnKeyListener {
        b() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i2, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.c0 && (i2 == 21 || i2 == 22)) || i2 == 23 || i2 == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.a0;
            if (seekBar == null) {
                Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
                return false;
            }
            return seekBar.onKeyDown(i2, keyEvent);
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f0 = new a();
        this.g0 = new b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.r1, i2, i3);
        this.W = obtainStyledAttributes.getInt(t.u1, 0);
        Y0(obtainStyledAttributes.getInt(t.s1, 100));
        Z0(obtainStyledAttributes.getInt(t.v1, 0));
        this.c0 = obtainStyledAttributes.getBoolean(t.t1, true);
        this.d0 = obtainStyledAttributes.getBoolean(t.w1, false);
        this.e0 = obtainStyledAttributes.getBoolean(t.x1, false);
        obtainStyledAttributes.recycle();
    }

    private void b1(int i2, boolean z) {
        int i3 = this.W;
        if (i2 < i3) {
            i2 = i3;
        }
        int i4 = this.X;
        if (i2 > i4) {
            i2 = i4;
        }
        if (i2 != this.V) {
            this.V = i2;
            d1(i2);
            y0(i2);
            if (z) {
                d0();
            }
        }
    }

    public final void Y0(int i2) {
        int i3 = this.W;
        if (i2 < i3) {
            i2 = i3;
        }
        if (i2 != this.X) {
            this.X = i2;
            d0();
        }
    }

    public final void Z0(int i2) {
        if (i2 != this.Y) {
            this.Y = Math.min(this.X - this.W, Math.abs(i2));
            d0();
        }
    }

    public void a1(int i2) {
        b1(i2, true);
    }

    void c1(SeekBar seekBar) {
        int progress = this.W + seekBar.getProgress();
        if (progress != this.V) {
            if (f(Integer.valueOf(progress))) {
                b1(progress, false);
            } else {
                seekBar.setProgress(this.V - this.W);
                d1(this.V);
            }
        }
    }

    void d1(int i2) {
        TextView textView = this.b0;
        if (textView != null) {
            textView.setText(String.valueOf(i2));
        }
    }

    @Override // androidx.preference.Preference
    public void j0(l lVar) {
        super.j0(lVar);
        lVar.itemView.setOnKeyListener(this.g0);
        this.a0 = (SeekBar) lVar.a(p.f1369c);
        TextView textView = (TextView) lVar.a(p.f1370d);
        this.b0 = textView;
        if (this.d0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.b0 = null;
        }
        SeekBar seekBar = this.a0;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.f0);
        this.a0.setMax(this.X - this.W);
        int i2 = this.Y;
        if (i2 != 0) {
            this.a0.setKeyProgressIncrement(i2);
        } else {
            this.Y = this.a0.getKeyProgressIncrement();
        }
        this.a0.setProgress(this.V - this.W);
        d1(this.V);
        this.a0.setEnabled(Z());
    }

    @Override // androidx.preference.Preference
    protected Object n0(TypedArray typedArray, int i2) {
        return Integer.valueOf(typedArray.getInt(i2, 0));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void r0(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.r0(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.r0(savedState.getSuperState());
        this.V = savedState.f1301f;
        this.W = savedState.f1302g;
        this.X = savedState.f1303h;
        d0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public Parcelable s0() {
        Parcelable s0 = super.s0();
        if (a0()) {
            return s0;
        }
        SavedState savedState = new SavedState(s0);
        savedState.f1301f = this.V;
        savedState.f1302g = this.W;
        savedState.f1303h = this.X;
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected void t0(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        a1(N(((Integer) obj).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: f, reason: collision with root package name */
        int f1301f;

        /* renamed from: g, reason: collision with root package name */
        int f1302g;

        /* renamed from: h, reason: collision with root package name */
        int f1303h;

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
            this.f1301f = parcel.readInt();
            this.f1302g = parcel.readInt();
            this.f1303h = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f1301f);
            parcel.writeInt(this.f1302g);
            parcel.writeInt(this.f1303h);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, m.f1367k);
    }
}
