package androidx.core.view.d0;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.d0.f;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.pt.file.CacheHelper;
import com.google.android.gms.ads.AdRequest;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.http2.Http2;

/* compiled from: AccessibilityNodeInfoCompat.java */
/* loaded from: classes.dex */
public class c {
    private static int a;

    /* renamed from: b, reason: collision with root package name */
    private final AccessibilityNodeInfo f992b;

    /* renamed from: c, reason: collision with root package name */
    public int f993c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f994d = -1;

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a a = new a(1, null);

        /* renamed from: b, reason: collision with root package name */
        public static final a f995b = new a(2, null);

        /* renamed from: c, reason: collision with root package name */
        public static final a f996c = new a(4, null);

        /* renamed from: d, reason: collision with root package name */
        public static final a f997d = new a(8, null);

        /* renamed from: e, reason: collision with root package name */
        public static final a f998e = new a(16, null);

        /* renamed from: f, reason: collision with root package name */
        public static final a f999f = new a(32, null);

        /* renamed from: g, reason: collision with root package name */
        public static final a f1000g = new a(64, null);

        /* renamed from: h, reason: collision with root package name */
        public static final a f1001h = new a(128, null);

        /* renamed from: i, reason: collision with root package name */
        public static final a f1002i = new a(256, null, f.b.class);

        /* renamed from: j, reason: collision with root package name */
        public static final a f1003j = new a(AdRequest.MAX_CONTENT_URL_LENGTH, null, f.b.class);

        /* renamed from: k, reason: collision with root package name */
        public static final a f1004k = new a(1024, null, f.c.class);
        public static final a l = new a(RecyclerView.l.FLAG_MOVED, null, f.c.class);
        public static final a m = new a(RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT, null);
        public static final a n = new a(8192, null);
        public static final a o = new a(Http2.INITIAL_MAX_FRAME_SIZE, null);
        public static final a p = new a(32768, null);
        public static final a q = new a(65536, null);
        public static final a r = new a(131072, null, f.g.class);
        public static final a s = new a(262144, null);
        public static final a t = new a(524288, null);
        public static final a u = new a(CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES, null);
        public static final a v = new a(2097152, null, f.h.class);
        public static final a w;
        public static final a x;
        public static final a y;
        public static final a z;
        final Object N;
        private final int O;
        private final Class<? extends f.a> P;
        protected final f Q;

        static {
            int i2 = Build.VERSION.SDK_INT;
            w = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, R.id.accessibilityActionShowOnScreen, null, null, null);
            x = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, R.id.accessibilityActionScrollToPosition, null, null, f.e.class);
            y = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, R.id.accessibilityActionScrollUp, null, null, null);
            z = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, R.id.accessibilityActionScrollLeft, null, null, null);
            A = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, R.id.accessibilityActionScrollDown, null, null, null);
            B = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, R.id.accessibilityActionScrollRight, null, null, null);
            C = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            D = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            E = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            F = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            G = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, R.id.accessibilityActionContextClick, null, null, null);
            H = new a(i2 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, f.C0023f.class);
            I = new a(i2 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, f.d.class);
            J = new a(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            K = new a(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            L = new a(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            M = new a(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        }

        public a(int i2, CharSequence charSequence) {
            this(null, i2, charSequence, null, null);
        }

        public a a(CharSequence charSequence, f fVar) {
            return new a(null, this.O, charSequence, fVar, this.P);
        }

        public int b() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.N).getId();
            }
            return 0;
        }

        public CharSequence c() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.N).getLabel();
            }
            return null;
        }

        public boolean d(View view, Bundle bundle) {
            f.a newInstance;
            if (this.Q == null) {
                return false;
            }
            f.a aVar = null;
            Class<? extends f.a> cls = this.P;
            if (cls != null) {
                try {
                    newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    newInstance.a(bundle);
                    aVar = newInstance;
                } catch (Exception e3) {
                    e = e3;
                    aVar = newInstance;
                    Class<? extends f.a> cls2 = this.P;
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e);
                    return this.Q.a(view, aVar);
                }
            }
            return this.Q.a(view, aVar);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.N;
            return obj2 == null ? aVar.N == null : obj2.equals(aVar.N);
        }

        public int hashCode() {
            Object obj = this.N;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private a(int i2, CharSequence charSequence, Class<? extends f.a> cls) {
            this(null, i2, charSequence, null, cls);
        }

        a(Object obj, int i2, CharSequence charSequence, f fVar, Class<? extends f.a> cls) {
            this.O = i2;
            this.Q = fVar;
            if (Build.VERSION.SDK_INT >= 21 && obj == null) {
                this.N = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
            } else {
                this.N = obj;
            }
            this.P = cls;
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        final Object a;

        b(Object obj) {
            this.a = obj;
        }

        public static b a(int i2, int i3, boolean z, int i4) {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 21) {
                return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i2, i3, z, i4));
            }
            if (i5 >= 19) {
                return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i2, i3, z));
            }
            return new b(null);
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* renamed from: androidx.core.view.d0.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0022c {
        final Object a;

        C0022c(Object obj) {
            this.a = obj;
        }

        public static C0022c f(int i2, int i3, int i4, int i5, boolean z, boolean z2) {
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 21) {
                return new C0022c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i4, i5, z, z2));
            }
            if (i6 >= 19) {
                return new C0022c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i4, i5, z));
            }
            return new C0022c(null);
        }

        public int a() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.a).getColumnIndex();
            }
            return 0;
        }

        public int b() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.a).getColumnSpan();
            }
            return 0;
        }

        public int c() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.a).getRowIndex();
            }
            return 0;
        }

        public int d() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.a).getRowSpan();
            }
            return 0;
        }

        public boolean e() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.a).isSelected();
            }
            return false;
        }
    }

    private c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f992b = accessibilityNodeInfo;
    }

    public static c L() {
        return y0(AccessibilityNodeInfo.obtain());
    }

    public static c M(View view) {
        return y0(AccessibilityNodeInfo.obtain(view));
    }

    public static c N(c cVar) {
        return y0(AccessibilityNodeInfo.obtain(cVar.f992b));
    }

    private void R(View view) {
        SparseArray<WeakReference<ClickableSpan>> v = v(view);
        if (v != null) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < v.size(); i2++) {
                if (v.valueAt(i2).get() == null) {
                    arrayList.add(Integer.valueOf(i2));
                }
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                v.remove(((Integer) arrayList.get(i3)).intValue());
            }
        }
    }

    private void T(int i2, boolean z) {
        Bundle s = s();
        if (s != null) {
            int i3 = s.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (i2 ^ (-1));
            if (!z) {
                i2 = 0;
            }
            s.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i2 | i3);
        }
    }

    private void d(ClickableSpan clickableSpan, Spanned spanned, int i2) {
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i2));
    }

    private void f() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f992b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.f992b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.f992b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.f992b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    private List<Integer> g(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.f992b.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f992b.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    private static String i(int i2) {
        if (i2 == 1) {
            return "ACTION_FOCUS";
        }
        if (i2 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i2) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case AdRequest.MAX_CONTENT_URL_LENGTH /* 512 */:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case RecyclerView.l.FLAG_MOVED /* 2048 */:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT /* 4096 */:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case Http2.INITIAL_MAX_FRAME_SIZE /* 16384 */:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionImeEnter:
                return "ACTION_IME_ENTER";
            default:
                switch (i2) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i2) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    private boolean k(int i2) {
        Bundle s = s();
        return s != null && (s.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i2) == i2;
    }

    public static ClickableSpan[] p(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private SparseArray<WeakReference<ClickableSpan>> t(View view) {
        SparseArray<WeakReference<ClickableSpan>> v = v(view);
        if (v != null) {
            return v;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(c.h.c.I, sparseArray);
        return sparseArray;
    }

    private SparseArray<WeakReference<ClickableSpan>> v(View view) {
        return (SparseArray) view.getTag(c.h.c.I);
    }

    private boolean y() {
        return !g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public static c y0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new c(accessibilityNodeInfo);
    }

    private int z(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                if (clickableSpan.equals(sparseArray.valueAt(i2).get())) {
                    return sparseArray.keyAt(i2);
                }
            }
        }
        int i3 = a;
        a = i3 + 1;
        return i3;
    }

    public boolean A() {
        return this.f992b.isCheckable();
    }

    public boolean B() {
        return this.f992b.isChecked();
    }

    public boolean C() {
        return this.f992b.isClickable();
    }

    public boolean D() {
        return this.f992b.isEnabled();
    }

    public boolean E() {
        return this.f992b.isFocusable();
    }

    public boolean F() {
        return this.f992b.isFocused();
    }

    public boolean G() {
        return this.f992b.isLongClickable();
    }

    public boolean H() {
        return this.f992b.isPassword();
    }

    public boolean I() {
        return this.f992b.isScrollable();
    }

    public boolean J() {
        return this.f992b.isSelected();
    }

    public boolean K() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f992b.isShowingHintText();
        }
        return k(4);
    }

    public boolean O(int i2, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f992b.performAction(i2, bundle);
        }
        return false;
    }

    public void P() {
        this.f992b.recycle();
    }

    public boolean Q(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f992b.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.N);
        }
        return false;
    }

    public void S(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f992b.setAccessibilityFocused(z);
        }
    }

    @Deprecated
    public void U(Rect rect) {
        this.f992b.setBoundsInParent(rect);
    }

    public void V(Rect rect) {
        this.f992b.setBoundsInScreen(rect);
    }

    public void W(boolean z) {
        this.f992b.setCheckable(z);
    }

    public void X(boolean z) {
        this.f992b.setChecked(z);
    }

    public void Y(CharSequence charSequence) {
        this.f992b.setClassName(charSequence);
    }

    public void Z(boolean z) {
        this.f992b.setClickable(z);
    }

    public void a(int i2) {
        this.f992b.addAction(i2);
    }

    public void a0(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f992b.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((b) obj).a);
        }
    }

    public void b(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f992b.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.N);
        }
    }

    public void b0(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f992b.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((C0022c) obj).a);
        }
    }

    public void c(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f992b.addChild(view, i2);
        }
    }

    public void c0(CharSequence charSequence) {
        this.f992b.setContentDescription(charSequence);
    }

    public void d0(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f992b.setDismissable(z);
        }
    }

    public void e(CharSequence charSequence, View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 19 || i2 >= 26) {
            return;
        }
        f();
        R(view);
        ClickableSpan[] p = p(charSequence);
        if (p == null || p.length <= 0) {
            return;
        }
        s().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", c.h.c.a);
        SparseArray<WeakReference<ClickableSpan>> t = t(view);
        for (int i3 = 0; i3 < p.length; i3++) {
            int z = z(p[i3], t);
            t.put(z, new WeakReference<>(p[i3]));
            d(p[i3], (Spanned) charSequence, z);
        }
    }

    public void e0(boolean z) {
        this.f992b.setEnabled(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f992b;
        if (accessibilityNodeInfo == null) {
            if (cVar.f992b != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(cVar.f992b)) {
            return false;
        }
        return this.f994d == cVar.f994d && this.f993c == cVar.f993c;
    }

    public void f0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f992b.setError(charSequence);
        }
    }

    public void g0(boolean z) {
        this.f992b.setFocusable(z);
    }

    public List<a> h() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = Build.VERSION.SDK_INT >= 21 ? this.f992b.getActionList() : null;
        if (actionList != null) {
            ArrayList arrayList = new ArrayList();
            int size = actionList.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(new a(actionList.get(i2)));
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    public void h0(boolean z) {
        this.f992b.setFocused(z);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f992b;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public void i0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f992b.setHeading(z);
        } else {
            T(2, z);
        }
    }

    public int j() {
        return this.f992b.getActions();
    }

    public void j0(CharSequence charSequence) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            this.f992b.setHintText(charSequence);
        } else if (i2 >= 19) {
            this.f992b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public void k0(int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f992b.setMaxTextLength(i2);
        }
    }

    @Deprecated
    public void l(Rect rect) {
        this.f992b.getBoundsInParent(rect);
    }

    public void l0(CharSequence charSequence) {
        this.f992b.setPackageName(charSequence);
    }

    public void m(Rect rect) {
        this.f992b.getBoundsInScreen(rect);
    }

    public void m0(CharSequence charSequence) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            this.f992b.setPaneTitle(charSequence);
        } else if (i2 >= 19) {
            this.f992b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public int n() {
        return this.f992b.getChildCount();
    }

    public void n0(View view) {
        this.f993c = -1;
        this.f992b.setParent(view);
    }

    public CharSequence o() {
        return this.f992b.getClassName();
    }

    public void o0(View view, int i2) {
        this.f993c = i2;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f992b.setParent(view, i2);
        }
    }

    public void p0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f992b.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
        }
    }

    public C0022c q() {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        if (Build.VERSION.SDK_INT < 19 || (collectionItemInfo = this.f992b.getCollectionItemInfo()) == null) {
            return null;
        }
        return new C0022c(collectionItemInfo);
    }

    public void q0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f992b.setScreenReaderFocusable(z);
        } else {
            T(1, z);
        }
    }

    public CharSequence r() {
        return this.f992b.getContentDescription();
    }

    public void r0(boolean z) {
        this.f992b.setScrollable(z);
    }

    public Bundle s() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.f992b.getExtras();
        }
        return new Bundle();
    }

    public void s0(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f992b.setShowingHintText(z);
        } else {
            T(4, z);
        }
    }

    public void t0(View view, int i2) {
        this.f994d = i2;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f992b.setSource(view, i2);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        l(rect);
        sb.append("; boundsInParent: " + rect);
        m(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(u());
        sb.append("; className: ");
        sb.append(o());
        sb.append("; text: ");
        sb.append(w());
        sb.append("; contentDescription: ");
        sb.append(r());
        sb.append("; viewId: ");
        sb.append(x());
        sb.append("; checkable: ");
        sb.append(A());
        sb.append("; checked: ");
        sb.append(B());
        sb.append("; focusable: ");
        sb.append(E());
        sb.append("; focused: ");
        sb.append(F());
        sb.append("; selected: ");
        sb.append(J());
        sb.append("; clickable: ");
        sb.append(C());
        sb.append("; longClickable: ");
        sb.append(G());
        sb.append("; enabled: ");
        sb.append(D());
        sb.append("; password: ");
        sb.append(H());
        sb.append("; scrollable: " + I());
        sb.append("; [");
        if (Build.VERSION.SDK_INT >= 21) {
            List<a> h2 = h();
            for (int i2 = 0; i2 < h2.size(); i2++) {
                a aVar = h2.get(i2);
                String i3 = i(aVar.b());
                if (i3.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                    i3 = aVar.c().toString();
                }
                sb.append(i3);
                if (i2 != h2.size() - 1) {
                    sb.append(", ");
                }
            }
        } else {
            int j2 = j();
            while (j2 != 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(j2);
                j2 &= numberOfTrailingZeros ^ (-1);
                sb.append(i(numberOfTrailingZeros));
                if (j2 != 0) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public CharSequence u() {
        return this.f992b.getPackageName();
    }

    public void u0(CharSequence charSequence) {
        if (androidx.core.os.a.b()) {
            this.f992b.setStateDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 19) {
            this.f992b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public void v0(CharSequence charSequence) {
        this.f992b.setText(charSequence);
    }

    public CharSequence w() {
        if (y()) {
            List<Integer> g2 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List<Integer> g3 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List<Integer> g4 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List<Integer> g5 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.f992b.getText(), 0, this.f992b.getText().length()));
            for (int i2 = 0; i2 < g2.size(); i2++) {
                spannableString.setSpan(new androidx.core.view.d0.a(g5.get(i2).intValue(), this, s().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), g2.get(i2).intValue(), g3.get(i2).intValue(), g4.get(i2).intValue());
            }
            return spannableString;
        }
        return this.f992b.getText();
    }

    public void w0(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f992b.setVisibleToUser(z);
        }
    }

    public String x() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f992b.getViewIdResourceName();
        }
        return null;
    }

    public AccessibilityNodeInfo x0() {
        return this.f992b;
    }
}
