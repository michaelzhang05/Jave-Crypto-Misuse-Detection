package androidx.preference;

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.preference.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {
    private Object A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private int L;
    private int M;
    private b N;
    private List<Preference> O;
    private PreferenceGroup P;
    private boolean Q;
    private boolean R;
    private e S;
    private f T;
    private final View.OnClickListener U;

    /* renamed from: f, reason: collision with root package name */
    private Context f1291f;

    /* renamed from: g, reason: collision with root package name */
    private j f1292g;

    /* renamed from: h, reason: collision with root package name */
    private androidx.preference.e f1293h;

    /* renamed from: i, reason: collision with root package name */
    private long f1294i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f1295j;

    /* renamed from: k, reason: collision with root package name */
    private c f1296k;
    private d l;
    private int m;
    private int n;
    private CharSequence o;
    private CharSequence p;
    private int q;
    private Drawable r;
    private String s;
    private Intent t;
    private String u;
    private Bundle v;
    private boolean w;
    private boolean x;
    private boolean y;
    private String z;

    /* loaded from: classes.dex */
    public static class BaseSavedState extends AbsSavedState {
        public static final Parcelable.Creator<BaseSavedState> CREATOR = new a();

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<BaseSavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public BaseSavedState createFromParcel(Parcel parcel) {
                return new BaseSavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public BaseSavedState[] newArray(int i2) {
                return new BaseSavedState[i2];
            }
        }

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }

        public BaseSavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Preference.this.w0(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        void a(Preference preference);

        void b(Preference preference);

        void e(Preference preference);
    }

    /* loaded from: classes.dex */
    public interface c {
        boolean a(Preference preference, Object obj);
    }

    /* loaded from: classes.dex */
    public interface d {
        boolean onPreferenceClick(Preference preference);
    }

    /* loaded from: classes.dex */
    private static class e implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

        /* renamed from: f, reason: collision with root package name */
        private final Preference f1298f;

        e(Preference preference) {
            this.f1298f = preference;
        }

        @Override // android.view.View.OnCreateContextMenuListener
        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            CharSequence T = this.f1298f.T();
            if (!this.f1298f.Y() || TextUtils.isEmpty(T)) {
                return;
            }
            contextMenu.setHeaderTitle(T);
            contextMenu.add(0, 0, 0, r.a).setOnMenuItemClickListener(this);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            ClipboardManager clipboardManager = (ClipboardManager) this.f1298f.C().getSystemService("clipboard");
            CharSequence T = this.f1298f.T();
            clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", T));
            Toast.makeText(this.f1298f.C(), this.f1298f.C().getString(r.f1378d, T), 0).show();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface f<T extends Preference> {
        CharSequence a(T t);
    }

    public Preference(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.m = Integer.MAX_VALUE;
        this.n = 0;
        this.w = true;
        this.x = true;
        this.y = true;
        this.B = true;
        this.C = true;
        this.D = true;
        this.E = true;
        this.F = true;
        this.H = true;
        this.K = true;
        int i4 = q.f1373b;
        this.L = i4;
        this.U = new a();
        this.f1291f = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.q0, i2, i3);
        this.q = androidx.core.content.d.g.n(obtainStyledAttributes, t.O0, t.r0, 0);
        this.s = androidx.core.content.d.g.o(obtainStyledAttributes, t.R0, t.x0);
        this.o = androidx.core.content.d.g.p(obtainStyledAttributes, t.Z0, t.v0);
        this.p = androidx.core.content.d.g.p(obtainStyledAttributes, t.Y0, t.y0);
        this.m = androidx.core.content.d.g.d(obtainStyledAttributes, t.T0, t.z0, Integer.MAX_VALUE);
        this.u = androidx.core.content.d.g.o(obtainStyledAttributes, t.N0, t.E0);
        this.L = androidx.core.content.d.g.n(obtainStyledAttributes, t.S0, t.u0, i4);
        this.M = androidx.core.content.d.g.n(obtainStyledAttributes, t.a1, t.A0, 0);
        this.w = androidx.core.content.d.g.b(obtainStyledAttributes, t.M0, t.t0, true);
        this.x = androidx.core.content.d.g.b(obtainStyledAttributes, t.V0, t.w0, true);
        this.y = androidx.core.content.d.g.b(obtainStyledAttributes, t.U0, t.s0, true);
        this.z = androidx.core.content.d.g.o(obtainStyledAttributes, t.K0, t.B0);
        int i5 = t.H0;
        this.E = androidx.core.content.d.g.b(obtainStyledAttributes, i5, i5, this.x);
        int i6 = t.I0;
        this.F = androidx.core.content.d.g.b(obtainStyledAttributes, i6, i6, this.x);
        int i7 = t.J0;
        if (obtainStyledAttributes.hasValue(i7)) {
            this.A = n0(obtainStyledAttributes, i7);
        } else {
            int i8 = t.C0;
            if (obtainStyledAttributes.hasValue(i8)) {
                this.A = n0(obtainStyledAttributes, i8);
            }
        }
        this.K = androidx.core.content.d.g.b(obtainStyledAttributes, t.W0, t.D0, true);
        int i9 = t.X0;
        boolean hasValue = obtainStyledAttributes.hasValue(i9);
        this.G = hasValue;
        if (hasValue) {
            this.H = androidx.core.content.d.g.b(obtainStyledAttributes, i9, t.F0, true);
        }
        this.I = androidx.core.content.d.g.b(obtainStyledAttributes, t.P0, t.G0, false);
        int i10 = t.Q0;
        this.D = androidx.core.content.d.g.b(obtainStyledAttributes, i10, i10, true);
        int i11 = t.L0;
        this.J = androidx.core.content.d.g.b(obtainStyledAttributes, i11, i11, false);
        obtainStyledAttributes.recycle();
    }

    private void B0() {
        if (TextUtils.isEmpty(this.z)) {
            return;
        }
        Preference B = B(this.z);
        if (B != null) {
            B.C0(this);
            return;
        }
        throw new IllegalStateException("Dependency \"" + this.z + "\" not found for preference \"" + this.s + "\" (title: \"" + ((Object) this.o) + "\"");
    }

    private void C0(Preference preference) {
        if (this.O == null) {
            this.O = new ArrayList();
        }
        this.O.add(preference);
        preference.l0(this, T0());
    }

    private void G0(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                G0(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    private void V0(SharedPreferences.Editor editor) {
        if (this.f1292g.r()) {
            editor.apply();
        }
    }

    private void W0() {
        Preference B;
        String str = this.z;
        if (str == null || (B = B(str)) == null) {
            return;
        }
        B.X0(this);
    }

    private void X0(Preference preference) {
        List<Preference> list = this.O;
        if (list != null) {
            list.remove(preference);
        }
    }

    private void x() {
        if (Q() != null) {
            u0(true, this.A);
            return;
        }
        if (U0() && S().contains(this.s)) {
            u0(true, null);
            return;
        }
        Object obj = this.A;
        if (obj != null) {
            u0(false, obj);
        }
    }

    public boolean A0(Set<String> set) {
        if (!U0()) {
            return false;
        }
        if (set.equals(P(null))) {
            return true;
        }
        if (Q() == null) {
            SharedPreferences.Editor c2 = this.f1292g.c();
            c2.putStringSet(this.s, set);
            V0(c2);
            return true;
        }
        throw null;
    }

    protected <T extends Preference> T B(String str) {
        j jVar = this.f1292g;
        if (jVar == null) {
            return null;
        }
        return (T) jVar.a(str);
    }

    public Context C() {
        return this.f1291f;
    }

    public Bundle D() {
        if (this.v == null) {
            this.v = new Bundle();
        }
        return this.v;
    }

    public void D0(Bundle bundle) {
        o(bundle);
    }

    StringBuilder E() {
        StringBuilder sb = new StringBuilder();
        CharSequence V = V();
        if (!TextUtils.isEmpty(V)) {
            sb.append(V);
            sb.append(' ');
        }
        CharSequence T = T();
        if (!TextUtils.isEmpty(T)) {
            sb.append(T);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb;
    }

    public void E0(Bundle bundle) {
        r(bundle);
    }

    public String F() {
        return this.u;
    }

    public void F0(boolean z) {
        if (this.w != z) {
            this.w = z;
            e0(T0());
            d0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long G() {
        return this.f1294i;
    }

    public Intent H() {
        return this.t;
    }

    public void H0(int i2) {
        I0(c.a.k.a.a.d(this.f1291f, i2));
        this.q = i2;
    }

    public String I() {
        return this.s;
    }

    public void I0(Drawable drawable) {
        if (this.r != drawable) {
            this.r = drawable;
            this.q = 0;
            d0();
        }
    }

    public final int J() {
        return this.L;
    }

    public void J0(Intent intent) {
        this.t = intent;
    }

    public int K() {
        return this.m;
    }

    public void K0(int i2) {
        this.L = i2;
    }

    public PreferenceGroup L() {
        return this.P;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void L0(b bVar) {
        this.N = bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean M(boolean z) {
        if (!U0()) {
            return z;
        }
        if (Q() == null) {
            return this.f1292g.j().getBoolean(this.s, z);
        }
        throw null;
    }

    public void M0(d dVar) {
        this.l = dVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int N(int i2) {
        if (!U0()) {
            return i2;
        }
        if (Q() == null) {
            return this.f1292g.j().getInt(this.s, i2);
        }
        throw null;
    }

    public void N0(int i2) {
        if (i2 != this.m) {
            this.m = i2;
            f0();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String O(String str) {
        if (!U0()) {
            return str;
        }
        if (Q() == null) {
            return this.f1292g.j().getString(this.s, str);
        }
        throw null;
    }

    public void O0(CharSequence charSequence) {
        if (U() == null) {
            if (TextUtils.equals(this.p, charSequence)) {
                return;
            }
            this.p = charSequence;
            d0();
            return;
        }
        throw new IllegalStateException("Preference already has a SummaryProvider set.");
    }

    public Set<String> P(Set<String> set) {
        if (!U0()) {
            return set;
        }
        if (Q() == null) {
            return this.f1292g.j().getStringSet(this.s, set);
        }
        throw null;
    }

    public final void P0(f fVar) {
        this.T = fVar;
        d0();
    }

    public androidx.preference.e Q() {
        androidx.preference.e eVar = this.f1293h;
        if (eVar != null) {
            return eVar;
        }
        j jVar = this.f1292g;
        if (jVar != null) {
            return jVar.h();
        }
        return null;
    }

    public void Q0(int i2) {
        R0(this.f1291f.getString(i2));
    }

    public j R() {
        return this.f1292g;
    }

    public void R0(CharSequence charSequence) {
        if ((charSequence != null || this.o == null) && (charSequence == null || charSequence.equals(this.o))) {
            return;
        }
        this.o = charSequence;
        d0();
    }

    public SharedPreferences S() {
        if (this.f1292g == null || Q() != null) {
            return null;
        }
        return this.f1292g.j();
    }

    public final void S0(boolean z) {
        if (this.D != z) {
            this.D = z;
            b bVar = this.N;
            if (bVar != null) {
                bVar.b(this);
            }
        }
    }

    public CharSequence T() {
        if (U() != null) {
            return U().a(this);
        }
        return this.p;
    }

    public boolean T0() {
        return !Z();
    }

    public final f U() {
        return this.T;
    }

    protected boolean U0() {
        return this.f1292g != null && a0() && X();
    }

    public CharSequence V() {
        return this.o;
    }

    public final int W() {
        return this.M;
    }

    public boolean X() {
        return !TextUtils.isEmpty(this.s);
    }

    public boolean Y() {
        return this.J;
    }

    public boolean Z() {
        return this.w && this.B && this.C;
    }

    public boolean a0() {
        return this.y;
    }

    public boolean b0() {
        return this.x;
    }

    public final boolean c0() {
        return this.D;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(PreferenceGroup preferenceGroup) {
        if (preferenceGroup != null && this.P != null) {
            throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        }
        this.P = preferenceGroup;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d0() {
        b bVar = this.N;
        if (bVar != null) {
            bVar.e(this);
        }
    }

    public void e0(boolean z) {
        List<Preference> list = this.O;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            list.get(i2).l0(this, z);
        }
    }

    public boolean f(Object obj) {
        c cVar = this.f1296k;
        return cVar == null || cVar.a(this, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f0() {
        b bVar = this.N;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    public void g0() {
        B0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void h0(j jVar) {
        this.f1292g = jVar;
        if (!this.f1295j) {
            this.f1294i = jVar.d();
        }
        x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        this.Q = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void i0(j jVar, long j2) {
        this.f1294i = j2;
        this.f1295j = true;
        try {
            h0(jVar);
        } finally {
            this.f1295j = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j0(androidx.preference.l r9) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.j0(androidx.preference.l):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void k0() {
    }

    public void l0(Preference preference, boolean z) {
        if (this.B == z) {
            this.B = !z;
            e0(T0());
            d0();
        }
    }

    public void m0() {
        W0();
        this.Q = true;
    }

    @Override // java.lang.Comparable
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int compareTo(Preference preference) {
        int i2 = this.m;
        int i3 = preference.m;
        if (i2 != i3) {
            return i2 - i3;
        }
        CharSequence charSequence = this.o;
        CharSequence charSequence2 = preference.o;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.o.toString());
    }

    protected Object n0(TypedArray typedArray, int i2) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(Bundle bundle) {
        Parcelable parcelable;
        if (!X() || (parcelable = bundle.getParcelable(this.s)) == null) {
            return;
        }
        this.R = false;
        r0(parcelable);
        if (!this.R) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    @Deprecated
    public void o0(androidx.core.view.d0.c cVar) {
    }

    public void p0(Preference preference, boolean z) {
        if (this.C == z) {
            this.C = !z;
            e0(T0());
            d0();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void q0() {
        W0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(Bundle bundle) {
        if (X()) {
            this.R = false;
            Parcelable s0 = s0();
            if (!this.R) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (s0 != null) {
                bundle.putParcelable(this.s, s0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void r0(Parcelable parcelable) {
        this.R = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Parcelable s0() {
        this.R = true;
        return AbsSavedState.EMPTY_STATE;
    }

    protected void t0(Object obj) {
    }

    public String toString() {
        return E().toString();
    }

    @Deprecated
    protected void u0(boolean z, Object obj) {
        t0(obj);
    }

    public void v0() {
        j.c f2;
        if (Z() && b0()) {
            k0();
            d dVar = this.l;
            if (dVar == null || !dVar.onPreferenceClick(this)) {
                j R = R();
                if ((R == null || (f2 = R.f()) == null || !f2.onPreferenceTreeClick(this)) && this.t != null) {
                    C().startActivity(this.t);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void w0(View view) {
        v0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean x0(boolean z) {
        if (!U0()) {
            return false;
        }
        if (z == M(!z)) {
            return true;
        }
        if (Q() == null) {
            SharedPreferences.Editor c2 = this.f1292g.c();
            c2.putBoolean(this.s, z);
            V0(c2);
            return true;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean y0(int i2) {
        if (!U0()) {
            return false;
        }
        if (i2 == N(i2 ^ (-1))) {
            return true;
        }
        if (Q() == null) {
            SharedPreferences.Editor c2 = this.f1292g.c();
            c2.putInt(this.s, i2);
            V0(c2);
            return true;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean z0(String str) {
        if (!U0()) {
            return false;
        }
        if (TextUtils.equals(str, O(null))) {
            return true;
        }
        if (Q() == null) {
            SharedPreferences.Editor c2 = this.f1292g.c();
            c2.putString(this.s, str);
            V0(c2);
            return true;
        }
        throw null;
    }

    public Preference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.d.g.a(context, m.f1365i, R.attr.preferenceStyle));
    }

    public Preference(Context context) {
        this(context, null);
    }
}
