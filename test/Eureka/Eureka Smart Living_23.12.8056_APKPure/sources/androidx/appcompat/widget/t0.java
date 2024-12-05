package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.b;

/* loaded from: classes.dex */
public class t0 extends Spinner {

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f1225i = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    private final androidx.appcompat.widget.e f1226a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f1227b;

    /* renamed from: c, reason: collision with root package name */
    private h2 f1228c;

    /* renamed from: d, reason: collision with root package name */
    private SpinnerAdapter f1229d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f1230e;

    /* renamed from: f, reason: collision with root package name */
    private j f1231f;

    /* renamed from: g, reason: collision with root package name */
    int f1232g;

    /* renamed from: h, reason: collision with root package name */
    final Rect f1233h;

    /* loaded from: classes.dex */
    class a extends h2 {

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ h f1234j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, h hVar) {
            super(view);
            this.f1234j = hVar;
        }

        @Override // androidx.appcompat.widget.h2
        public androidx.appcompat.view.menu.p b() {
            return this.f1234j;
        }

        @Override // androidx.appcompat.widget.h2
        public boolean c() {
            if (t0.this.getInternalPopup().b()) {
                return true;
            }
            t0.this.b();
            return true;
        }
    }

    /* loaded from: classes.dex */
    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!t0.this.getInternalPopup().b()) {
                t0.this.b();
            }
            ViewTreeObserver viewTreeObserver = t0.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                c.a(viewTreeObserver, this);
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class c {
        static void a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d {
        static int a(View view) {
            return view.getTextAlignment();
        }

        static int b(View view) {
            return view.getTextDirection();
        }

        static void c(View view, int i6) {
            view.setTextAlignment(i6);
        }

        static void d(View view, int i6) {
            view.setTextDirection(i6);
        }
    }

    /* loaded from: classes.dex */
    private static final class e {
        static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            Resources.Theme dropDownViewTheme;
            dropDownViewTheme = themedSpinnerAdapter.getDropDownViewTheme();
            if (androidx.core.util.c.a(dropDownViewTheme, theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    /* loaded from: classes.dex */
    class f implements j, DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        androidx.appcompat.app.b f1237a;

        /* renamed from: b, reason: collision with root package name */
        private ListAdapter f1238b;

        /* renamed from: c, reason: collision with root package name */
        private CharSequence f1239c;

        f() {
        }

        @Override // androidx.appcompat.widget.t0.j
        public void a(int i6) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.t0.j
        public boolean b() {
            androidx.appcompat.app.b bVar = this.f1237a;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.t0.j
        public int c() {
            return 0;
        }

        @Override // androidx.appcompat.widget.t0.j
        public void d(int i6, int i7) {
            if (this.f1238b == null) {
                return;
            }
            b.a aVar = new b.a(t0.this.getPopupContext());
            CharSequence charSequence = this.f1239c;
            if (charSequence != null) {
                aVar.i(charSequence);
            }
            androidx.appcompat.app.b a6 = aVar.h(this.f1238b, t0.this.getSelectedItemPosition(), this).a();
            this.f1237a = a6;
            ListView k6 = a6.k();
            d.d(k6, i6);
            d.c(k6, i7);
            this.f1237a.show();
        }

        @Override // androidx.appcompat.widget.t0.j
        public void dismiss() {
            androidx.appcompat.app.b bVar = this.f1237a;
            if (bVar != null) {
                bVar.dismiss();
                this.f1237a = null;
            }
        }

        @Override // androidx.appcompat.widget.t0.j
        public int g() {
            return 0;
        }

        @Override // androidx.appcompat.widget.t0.j
        public Drawable i() {
            return null;
        }

        @Override // androidx.appcompat.widget.t0.j
        public CharSequence j() {
            return this.f1239c;
        }

        @Override // androidx.appcompat.widget.t0.j
        public void l(CharSequence charSequence) {
            this.f1239c = charSequence;
        }

        @Override // androidx.appcompat.widget.t0.j
        public void m(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.t0.j
        public void n(int i6) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.t0.j
        public void o(ListAdapter listAdapter) {
            this.f1238b = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i6) {
            t0.this.setSelection(i6);
            if (t0.this.getOnItemClickListener() != null) {
                t0.this.performItemClick(null, i6, this.f1238b.getItemId(i6));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.t0.j
        public void p(int i6) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class g implements ListAdapter, SpinnerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private SpinnerAdapter f1241a;

        /* renamed from: b, reason: collision with root package name */
        private ListAdapter f1242b;

        public g(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1241a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1242b = (ListAdapter) spinnerAdapter;
            }
            if (theme == null || Build.VERSION.SDK_INT < 23 || !w0.a(spinnerAdapter)) {
                return;
            }
            e.a(x0.a(spinnerAdapter), theme);
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1242b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1241a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i6, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1241a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i6, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i6) {
            SpinnerAdapter spinnerAdapter = this.f1241a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i6);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i6) {
            SpinnerAdapter spinnerAdapter = this.f1241a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i6);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i6) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i6, View view, ViewGroup viewGroup) {
            return getDropDownView(i6, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1241a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i6) {
            ListAdapter listAdapter = this.f1242b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i6);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1241a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1241a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* loaded from: classes.dex */
    class h extends j2 implements j {
        private CharSequence J;
        ListAdapter K;
        private final Rect L;
        private int M;

        /* loaded from: classes.dex */
        class a implements AdapterView.OnItemClickListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ t0 f1243a;

            a(t0 t0Var) {
                this.f1243a = t0Var;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i6, long j6) {
                t0.this.setSelection(i6);
                if (t0.this.getOnItemClickListener() != null) {
                    h hVar = h.this;
                    t0.this.performItemClick(view, i6, hVar.K.getItemId(i6));
                }
                h.this.dismiss();
            }
        }

        /* loaded from: classes.dex */
        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                h hVar = h.this;
                if (!hVar.V(t0.this)) {
                    h.this.dismiss();
                } else {
                    h.this.T();
                    h.super.f();
                }
            }
        }

        /* loaded from: classes.dex */
        class c implements PopupWindow.OnDismissListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1246a;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1246a = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = t0.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1246a);
                }
            }
        }

        public h(Context context, AttributeSet attributeSet, int i6) {
            super(context, attributeSet, i6);
            this.L = new Rect();
            D(t0.this);
            J(true);
            P(0);
            L(new a(t0.this));
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x009a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void T() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.i()
                if (r0 == 0) goto L24
                androidx.appcompat.widget.t0 r1 = androidx.appcompat.widget.t0.this
                android.graphics.Rect r1 = r1.f1233h
                r0.getPadding(r1)
                androidx.appcompat.widget.t0 r0 = androidx.appcompat.widget.t0.this
                boolean r0 = androidx.appcompat.widget.p3.b(r0)
                if (r0 == 0) goto L1c
                androidx.appcompat.widget.t0 r0 = androidx.appcompat.widget.t0.this
                android.graphics.Rect r0 = r0.f1233h
                int r0 = r0.right
                goto L2e
            L1c:
                androidx.appcompat.widget.t0 r0 = androidx.appcompat.widget.t0.this
                android.graphics.Rect r0 = r0.f1233h
                int r0 = r0.left
                int r0 = -r0
                goto L2e
            L24:
                androidx.appcompat.widget.t0 r0 = androidx.appcompat.widget.t0.this
                android.graphics.Rect r0 = r0.f1233h
                r1 = 0
                r0.right = r1
                r0.left = r1
                r0 = 0
            L2e:
                androidx.appcompat.widget.t0 r1 = androidx.appcompat.widget.t0.this
                int r1 = r1.getPaddingLeft()
                androidx.appcompat.widget.t0 r2 = androidx.appcompat.widget.t0.this
                int r2 = r2.getPaddingRight()
                androidx.appcompat.widget.t0 r3 = androidx.appcompat.widget.t0.this
                int r3 = r3.getWidth()
                androidx.appcompat.widget.t0 r4 = androidx.appcompat.widget.t0.this
                int r5 = r4.f1232g
                r6 = -2
                if (r5 != r6) goto L78
                android.widget.ListAdapter r5 = r8.K
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.i()
                int r4 = r4.a(r5, r6)
                androidx.appcompat.widget.t0 r5 = androidx.appcompat.widget.t0.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                androidx.appcompat.widget.t0 r6 = androidx.appcompat.widget.t0.this
                android.graphics.Rect r6 = r6.f1233h
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L70
                r4 = r5
            L70:
                int r5 = r3 - r1
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L7e
            L78:
                r4 = -1
                if (r5 != r4) goto L82
                int r4 = r3 - r1
                int r4 = r4 - r2
            L7e:
                r8.F(r4)
                goto L85
            L82:
                r8.F(r5)
            L85:
                androidx.appcompat.widget.t0 r4 = androidx.appcompat.widget.t0.this
                boolean r4 = androidx.appcompat.widget.p3.b(r4)
                if (r4 == 0) goto L9a
                int r3 = r3 - r2
                int r1 = r8.z()
                int r3 = r3 - r1
                int r1 = r8.U()
                int r3 = r3 - r1
                int r0 = r0 + r3
                goto La0
            L9a:
                int r2 = r8.U()
                int r1 = r1 + r2
                int r0 = r0 + r1
            La0:
                r8.a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.t0.h.T():void");
        }

        public int U() {
            return this.M;
        }

        boolean V(View view) {
            return androidx.core.view.b1.T(view) && view.getGlobalVisibleRect(this.L);
        }

        @Override // androidx.appcompat.widget.t0.j
        public void d(int i6, int i7) {
            ViewTreeObserver viewTreeObserver;
            boolean b6 = b();
            T();
            I(2);
            super.f();
            ListView k6 = k();
            k6.setChoiceMode(1);
            d.d(k6, i6);
            d.c(k6, i7);
            Q(t0.this.getSelectedItemPosition());
            if (b6 || (viewTreeObserver = t0.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            K(new c(bVar));
        }

        @Override // androidx.appcompat.widget.t0.j
        public CharSequence j() {
            return this.J;
        }

        @Override // androidx.appcompat.widget.t0.j
        public void l(CharSequence charSequence) {
            this.J = charSequence;
        }

        @Override // androidx.appcompat.widget.j2, androidx.appcompat.widget.t0.j
        public void o(ListAdapter listAdapter) {
            super.o(listAdapter);
            this.K = listAdapter;
        }

        @Override // androidx.appcompat.widget.t0.j
        public void p(int i6) {
            this.M = i6;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class i extends View.BaseSavedState {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        boolean f1248a;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public i[] newArray(int i6) {
                return new i[i6];
            }
        }

        i(Parcel parcel) {
            super(parcel);
            this.f1248a = parcel.readByte() != 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeByte(this.f1248a ? (byte) 1 : (byte) 0);
        }

        i(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface j {
        void a(int i6);

        boolean b();

        int c();

        void d(int i6, int i7);

        void dismiss();

        int g();

        Drawable i();

        CharSequence j();

        void l(CharSequence charSequence);

        void m(Drawable drawable);

        void n(int i6);

        void o(ListAdapter listAdapter);

        void p(int i6);
    }

    public t0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d.a.H);
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i6 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i7 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i6) {
                view = null;
                i6 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i7 = Math.max(i7, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i7;
        }
        drawable.getPadding(this.f1233h);
        Rect rect = this.f1233h;
        return i7 + rect.left + rect.right;
    }

    void b() {
        this.f1231f.d(d.b(this), d.a(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.e eVar = this.f1226a;
        if (eVar != null) {
            eVar.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        j jVar = this.f1231f;
        return jVar != null ? jVar.c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        j jVar = this.f1231f;
        return jVar != null ? jVar.g() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f1231f != null ? this.f1232g : super.getDropDownWidth();
    }

    final j getInternalPopup() {
        return this.f1231f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        j jVar = this.f1231f;
        return jVar != null ? jVar.i() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f1227b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        j jVar = this.f1231f;
        return jVar != null ? jVar.j() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.e eVar = this.f1226a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.e eVar = this.f1226a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.f1231f;
        if (jVar == null || !jVar.b()) {
            return;
        }
        this.f1231f.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i6, int i7) {
        super.onMeasure(i6, i7);
        if (this.f1231f == null || View.MeasureSpec.getMode(i6) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i6)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.getSuperState());
        if (!iVar.f1248a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        i iVar = new i(super.onSaveInstanceState());
        j jVar = this.f1231f;
        iVar.f1248a = jVar != null && jVar.b();
        return iVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        h2 h2Var = this.f1228c;
        if (h2Var == null || !h2Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        j jVar = this.f1231f;
        if (jVar == null) {
            return super.performClick();
        }
        if (jVar.b()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.e eVar = this.f1226a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        androidx.appcompat.widget.e eVar = this.f1226a;
        if (eVar != null) {
            eVar.g(i6);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i6) {
        j jVar = this.f1231f;
        if (jVar == null) {
            super.setDropDownHorizontalOffset(i6);
        } else {
            jVar.p(i6);
            this.f1231f.a(i6);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i6) {
        j jVar = this.f1231f;
        if (jVar != null) {
            jVar.n(i6);
        } else {
            super.setDropDownVerticalOffset(i6);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i6) {
        if (this.f1231f != null) {
            this.f1232g = i6;
        } else {
            super.setDropDownWidth(i6);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        j jVar = this.f1231f;
        if (jVar != null) {
            jVar.m(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i6) {
        setPopupBackgroundDrawable(e.a.b(getPopupContext(), i6));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        j jVar = this.f1231f;
        if (jVar != null) {
            jVar.l(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        androidx.appcompat.widget.e eVar = this.f1226a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        androidx.appcompat.widget.e eVar = this.f1226a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public t0(Context context, AttributeSet attributeSet, int i6) {
        this(context, attributeSet, i6, -1);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1230e) {
            this.f1229d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1231f != null) {
            Context context = this.f1227b;
            if (context == null) {
                context = getContext();
            }
            this.f1231f.o(new g(spinnerAdapter, context.getTheme()));
        }
    }

    public t0(Context context, AttributeSet attributeSet, int i6, int i7) {
        this(context, attributeSet, i6, i7, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005e, code lost:
    
        if (r11 == null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.appcompat.widget.t0, android.view.View] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t0(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.f1233h = r0
            android.content.Context r0 = r6.getContext()
            androidx.appcompat.widget.y2.a(r6, r0)
            int[] r0 = d.j.f6368x2
            r1 = 0
            androidx.appcompat.widget.c3 r0 = androidx.appcompat.widget.c3.v(r7, r8, r0, r9, r1)
            androidx.appcompat.widget.e r2 = new androidx.appcompat.widget.e
            r2.<init>(r6)
            r6.f1226a = r2
            if (r11 == 0) goto L29
            androidx.appcompat.view.d r2 = new androidx.appcompat.view.d
            r2.<init>(r7, r11)
        L26:
            r6.f1227b = r2
            goto L39
        L29:
            int r11 = d.j.C2
            int r11 = r0.n(r11, r1)
            if (r11 == 0) goto L37
            androidx.appcompat.view.d r2 = new androidx.appcompat.view.d
            r2.<init>(r7, r11)
            goto L26
        L37:
            r6.f1227b = r7
        L39:
            r11 = -1
            r2 = 0
            if (r10 != r11) goto L69
            int[] r11 = androidx.appcompat.widget.t0.f1225i     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            android.content.res.TypedArray r11 = r7.obtainStyledAttributes(r8, r11, r9, r1)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            boolean r3 = r11.hasValue(r1)     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L61
            if (r3 == 0) goto L4d
            int r10 = r11.getInt(r1, r1)     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L61
        L4d:
            r11.recycle()
            goto L69
        L51:
            r3 = move-exception
            goto L57
        L53:
            r7 = move-exception
            goto L63
        L55:
            r3 = move-exception
            r11 = r2
        L57:
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r3)     // Catch: java.lang.Throwable -> L61
            if (r11 == 0) goto L69
            goto L4d
        L61:
            r7 = move-exception
            r2 = r11
        L63:
            if (r2 == 0) goto L68
            r2.recycle()
        L68:
            throw r7
        L69:
            r11 = 1
            if (r10 == 0) goto La6
            if (r10 == r11) goto L6f
            goto Lb6
        L6f:
            androidx.appcompat.widget.t0$h r10 = new androidx.appcompat.widget.t0$h
            android.content.Context r3 = r6.f1227b
            r10.<init>(r3, r8, r9)
            android.content.Context r3 = r6.f1227b
            int[] r4 = d.j.f6368x2
            androidx.appcompat.widget.c3 r1 = androidx.appcompat.widget.c3.v(r3, r8, r4, r9, r1)
            int r3 = d.j.B2
            r4 = -2
            int r3 = r1.m(r3, r4)
            r6.f1232g = r3
            int r3 = d.j.f6378z2
            android.graphics.drawable.Drawable r3 = r1.g(r3)
            r10.m(r3)
            int r3 = d.j.A2
            java.lang.String r3 = r0.o(r3)
            r10.l(r3)
            r1.w()
            r6.f1231f = r10
            androidx.appcompat.widget.t0$a r1 = new androidx.appcompat.widget.t0$a
            r1.<init>(r6, r10)
            r6.f1228c = r1
            goto Lb6
        La6:
            androidx.appcompat.widget.t0$f r10 = new androidx.appcompat.widget.t0$f
            r10.<init>()
            r6.f1231f = r10
            int r1 = d.j.A2
            java.lang.String r1 = r0.o(r1)
            r10.l(r1)
        Lb6:
            int r10 = d.j.f6373y2
            java.lang.CharSequence[] r10 = r0.q(r10)
            if (r10 == 0) goto Lce
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r7, r3, r10)
            int r7 = d.g.f6233t
            r1.setDropDownViewResource(r7)
            r6.setAdapter(r1)
        Lce:
            r0.w()
            r6.f1230e = r11
            android.widget.SpinnerAdapter r7 = r6.f1229d
            if (r7 == 0) goto Ldc
            r6.setAdapter(r7)
            r6.f1229d = r2
        Ldc:
            androidx.appcompat.widget.e r7 = r6.f1226a
            r7.e(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.t0.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
