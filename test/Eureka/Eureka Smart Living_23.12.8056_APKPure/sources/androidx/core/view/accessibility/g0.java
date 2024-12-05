package androidx.core.view.accessibility;

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
import androidx.core.view.accessibility.j0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class g0 {

    /* renamed from: d, reason: collision with root package name */
    private static int f2276d;

    /* renamed from: a, reason: collision with root package name */
    private final AccessibilityNodeInfo f2277a;

    /* renamed from: b, reason: collision with root package name */
    public int f2278b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f2279c = -1;

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
        public static final a N;
        public static final a O;
        public static final a P;
        public static final a Q;
        public static final a R;
        public static final a S;
        public static final a T;
        public static final a U;

        /* renamed from: e, reason: collision with root package name */
        public static final a f2280e = new a(1, null);

        /* renamed from: f, reason: collision with root package name */
        public static final a f2281f = new a(2, null);

        /* renamed from: g, reason: collision with root package name */
        public static final a f2282g = new a(4, null);

        /* renamed from: h, reason: collision with root package name */
        public static final a f2283h = new a(8, null);

        /* renamed from: i, reason: collision with root package name */
        public static final a f2284i = new a(16, null);

        /* renamed from: j, reason: collision with root package name */
        public static final a f2285j = new a(32, null);

        /* renamed from: k, reason: collision with root package name */
        public static final a f2286k = new a(64, null);

        /* renamed from: l, reason: collision with root package name */
        public static final a f2287l = new a(128, null);

        /* renamed from: m, reason: collision with root package name */
        public static final a f2288m = new a(256, (CharSequence) null, j0.b.class);

        /* renamed from: n, reason: collision with root package name */
        public static final a f2289n = new a(512, (CharSequence) null, j0.b.class);

        /* renamed from: o, reason: collision with root package name */
        public static final a f2290o = new a(1024, (CharSequence) null, j0.c.class);

        /* renamed from: p, reason: collision with root package name */
        public static final a f2291p = new a(2048, (CharSequence) null, j0.c.class);

        /* renamed from: q, reason: collision with root package name */
        public static final a f2292q = new a(4096, null);

        /* renamed from: r, reason: collision with root package name */
        public static final a f2293r = new a(8192, null);

        /* renamed from: s, reason: collision with root package name */
        public static final a f2294s = new a(16384, null);

        /* renamed from: t, reason: collision with root package name */
        public static final a f2295t = new a(32768, null);

        /* renamed from: u, reason: collision with root package name */
        public static final a f2296u = new a(65536, null);

        /* renamed from: v, reason: collision with root package name */
        public static final a f2297v = new a(131072, (CharSequence) null, j0.g.class);

        /* renamed from: w, reason: collision with root package name */
        public static final a f2298w = new a(262144, null);

        /* renamed from: x, reason: collision with root package name */
        public static final a f2299x = new a(524288, null);

        /* renamed from: y, reason: collision with root package name */
        public static final a f2300y = new a(1048576, null);

        /* renamed from: z, reason: collision with root package name */
        public static final a f2301z = new a(2097152, (CharSequence) null, j0.h.class);

        /* renamed from: a, reason: collision with root package name */
        final Object f2302a;

        /* renamed from: b, reason: collision with root package name */
        private final int f2303b;

        /* renamed from: c, reason: collision with root package name */
        private final Class f2304c;

        /* renamed from: d, reason: collision with root package name */
        protected final j0 f2305d;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction21;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction22;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction23;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction24;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction25;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction26;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction27;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction28;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction29;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction30;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction31;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction32;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction33;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction34;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction35;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction36;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction37;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction38;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction39;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction40;
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 23) {
                accessibilityAction40 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
                accessibilityAction = accessibilityAction40;
            } else {
                accessibilityAction = null;
            }
            A = new a(accessibilityAction, R.id.accessibilityActionShowOnScreen, null, null, null);
            if (i6 >= 23) {
                accessibilityAction39 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
                accessibilityAction2 = accessibilityAction39;
            } else {
                accessibilityAction2 = null;
            }
            B = new a(accessibilityAction2, R.id.accessibilityActionScrollToPosition, null, null, j0.e.class);
            if (i6 >= 23) {
                accessibilityAction38 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
                accessibilityAction3 = accessibilityAction38;
            } else {
                accessibilityAction3 = null;
            }
            C = new a(accessibilityAction3, R.id.accessibilityActionScrollUp, null, null, null);
            if (i6 >= 23) {
                accessibilityAction37 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
                accessibilityAction4 = accessibilityAction37;
            } else {
                accessibilityAction4 = null;
            }
            D = new a(accessibilityAction4, R.id.accessibilityActionScrollLeft, null, null, null);
            if (i6 >= 23) {
                accessibilityAction36 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
                accessibilityAction5 = accessibilityAction36;
            } else {
                accessibilityAction5 = null;
            }
            E = new a(accessibilityAction5, R.id.accessibilityActionScrollDown, null, null, null);
            if (i6 >= 23) {
                accessibilityAction35 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
                accessibilityAction6 = accessibilityAction35;
            } else {
                accessibilityAction6 = null;
            }
            F = new a(accessibilityAction6, R.id.accessibilityActionScrollRight, null, null, null);
            if (i6 >= 29) {
                accessibilityAction34 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
                accessibilityAction7 = accessibilityAction34;
            } else {
                accessibilityAction7 = null;
            }
            G = new a(accessibilityAction7, R.id.accessibilityActionPageUp, null, null, null);
            if (i6 >= 29) {
                accessibilityAction33 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
                accessibilityAction8 = accessibilityAction33;
            } else {
                accessibilityAction8 = null;
            }
            H = new a(accessibilityAction8, R.id.accessibilityActionPageDown, null, null, null);
            if (i6 >= 29) {
                accessibilityAction32 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
                accessibilityAction9 = accessibilityAction32;
            } else {
                accessibilityAction9 = null;
            }
            I = new a(accessibilityAction9, R.id.accessibilityActionPageLeft, null, null, null);
            if (i6 >= 29) {
                accessibilityAction31 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
                accessibilityAction10 = accessibilityAction31;
            } else {
                accessibilityAction10 = null;
            }
            J = new a(accessibilityAction10, R.id.accessibilityActionPageRight, null, null, null);
            if (i6 >= 23) {
                accessibilityAction30 = AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
                accessibilityAction11 = accessibilityAction30;
            } else {
                accessibilityAction11 = null;
            }
            K = new a(accessibilityAction11, R.id.accessibilityActionContextClick, null, null, null);
            if (i6 >= 24) {
                accessibilityAction29 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
                accessibilityAction12 = accessibilityAction29;
            } else {
                accessibilityAction12 = null;
            }
            L = new a(accessibilityAction12, R.id.accessibilityActionSetProgress, null, null, j0.f.class);
            if (i6 >= 26) {
                accessibilityAction28 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
                accessibilityAction13 = accessibilityAction28;
            } else {
                accessibilityAction13 = null;
            }
            M = new a(accessibilityAction13, R.id.accessibilityActionMoveWindow, null, null, j0.d.class);
            if (i6 >= 28) {
                accessibilityAction27 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
                accessibilityAction14 = accessibilityAction27;
            } else {
                accessibilityAction14 = null;
            }
            N = new a(accessibilityAction14, R.id.accessibilityActionShowTooltip, null, null, null);
            if (i6 >= 28) {
                accessibilityAction26 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
                accessibilityAction15 = accessibilityAction26;
            } else {
                accessibilityAction15 = null;
            }
            O = new a(accessibilityAction15, R.id.accessibilityActionHideTooltip, null, null, null);
            if (i6 >= 30) {
                accessibilityAction25 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
                accessibilityAction16 = accessibilityAction25;
            } else {
                accessibilityAction16 = null;
            }
            P = new a(accessibilityAction16, R.id.accessibilityActionPressAndHold, null, null, null);
            if (i6 >= 30) {
                accessibilityAction24 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
                accessibilityAction17 = accessibilityAction24;
            } else {
                accessibilityAction17 = null;
            }
            Q = new a(accessibilityAction17, R.id.accessibilityActionImeEnter, null, null, null);
            if (i6 >= 32) {
                accessibilityAction23 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
                accessibilityAction18 = accessibilityAction23;
            } else {
                accessibilityAction18 = null;
            }
            R = new a(accessibilityAction18, R.id.ALT, null, null, null);
            if (i6 >= 32) {
                accessibilityAction22 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
                accessibilityAction19 = accessibilityAction22;
            } else {
                accessibilityAction19 = null;
            }
            S = new a(accessibilityAction19, R.id.CTRL, null, null, null);
            if (i6 >= 32) {
                accessibilityAction21 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
                accessibilityAction20 = accessibilityAction21;
            } else {
                accessibilityAction20 = null;
            }
            T = new a(accessibilityAction20, R.id.FUNCTION, null, null, null);
            U = new a(i6 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.KEYCODE_0, null, null, null);
        }

        public a(int i6, CharSequence charSequence) {
            this(null, i6, charSequence, null, null);
        }

        public a a(CharSequence charSequence, j0 j0Var) {
            return new a(null, this.f2303b, charSequence, j0Var, this.f2304c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f2302a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f2302a).getLabel();
        }

        public boolean d(View view, Bundle bundle) {
            if (this.f2305d == null) {
                return false;
            }
            Class cls = this.f2304c;
            if (cls != null) {
                try {
                    androidx.appcompat.app.f0.a(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    throw null;
                } catch (Exception e6) {
                    Class cls2 = this.f2304c;
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e6);
                }
            }
            return this.f2305d.a(view, null);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            Object obj2 = this.f2302a;
            Object obj3 = ((a) obj).f2302a;
            return obj2 == null ? obj3 == null : obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f2302a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccessibilityActionCompat: ");
            String i6 = g0.i(this.f2303b);
            if (i6.equals("ACTION_UNKNOWN") && c() != null) {
                i6 = c().toString();
            }
            sb.append(i6);
            return sb.toString();
        }

        public a(int i6, CharSequence charSequence, j0 j0Var) {
            this(null, i6, charSequence, j0Var, null);
        }

        private a(int i6, CharSequence charSequence, Class cls) {
            this(null, i6, charSequence, null, cls);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        a(Object obj, int i6, CharSequence charSequence, j0 j0Var, Class cls) {
            this.f2303b = i6;
            this.f2305d = j0Var;
            this.f2302a = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i6, charSequence) : obj;
            this.f2304c = cls;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {
        public static Bundle a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtras();
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        final Object f2306a;

        c(Object obj) {
            this.f2306a = obj;
        }

        public static c a(int i6, int i7, boolean z5, int i8) {
            return new c(AccessibilityNodeInfo.CollectionInfo.obtain(i6, i7, z5, i8));
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        final Object f2307a;

        d(Object obj) {
            this.f2307a = obj;
        }

        public static d a(int i6, int i7, int i8, int i9, boolean z5, boolean z6) {
            return new d(AccessibilityNodeInfo.CollectionItemInfo.obtain(i6, i7, i8, i9, z5, z6));
        }
    }

    private g0(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f2277a = accessibilityNodeInfo;
    }

    public static g0 L() {
        return y0(AccessibilityNodeInfo.obtain());
    }

    public static g0 M(View view) {
        return y0(AccessibilityNodeInfo.obtain(view));
    }

    public static g0 N(g0 g0Var) {
        return y0(AccessibilityNodeInfo.obtain(g0Var.f2277a));
    }

    private void Q(View view) {
        SparseArray u5 = u(view);
        if (u5 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i6 = 0; i6 < u5.size(); i6++) {
                if (((WeakReference) u5.valueAt(i6)).get() == null) {
                    arrayList.add(Integer.valueOf(i6));
                }
            }
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                u5.remove(((Integer) arrayList.get(i7)).intValue());
            }
        }
    }

    private void S(int i6, boolean z5) {
        Bundle r5 = r();
        if (r5 != null) {
            int i7 = r5.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i6);
            if (!z5) {
                i6 = 0;
            }
            r5.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i6 | i7);
        }
    }

    private void d(ClickableSpan clickableSpan, Spanned spanned, int i6) {
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i6));
    }

    private void f() {
        b.a(this.f2277a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        b.a(this.f2277a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        b.a(this.f2277a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        b.a(this.f2277a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    private List g(String str) {
        ArrayList<Integer> integerArrayList = b.a(this.f2277a).getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        b.a(this.f2277a).putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    static String i(int i6) {
        if (i6 == 1) {
            return "ACTION_FOCUS";
        }
        if (i6 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i6) {
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
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
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
            default:
                switch (i6) {
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
                        switch (i6) {
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
                                switch (i6) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.ALT:
                                        return "ACTION_DRAG_START";
                                    case R.id.CTRL:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.FUNCTION:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    private boolean k(int i6) {
        Bundle r5 = r();
        return r5 != null && (r5.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i6) == i6;
    }

    public static ClickableSpan[] p(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private SparseArray s(View view) {
        SparseArray u5 = u(view);
        if (u5 != null) {
            return u5;
        }
        SparseArray sparseArray = new SparseArray();
        view.setTag(s.c.I, sparseArray);
        return sparseArray;
    }

    private SparseArray u(View view) {
        return (SparseArray) view.getTag(s.c.I);
    }

    private boolean y() {
        return !g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public static g0 y0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new g0(accessibilityNodeInfo);
    }

    private int z(ClickableSpan clickableSpan, SparseArray sparseArray) {
        if (sparseArray != null) {
            for (int i6 = 0; i6 < sparseArray.size(); i6++) {
                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray.valueAt(i6)).get())) {
                    return sparseArray.keyAt(i6);
                }
            }
        }
        int i7 = f2276d;
        f2276d = i7 + 1;
        return i7;
    }

    public boolean A() {
        return this.f2277a.isCheckable();
    }

    public boolean B() {
        return this.f2277a.isChecked();
    }

    public boolean C() {
        return this.f2277a.isClickable();
    }

    public boolean D() {
        return this.f2277a.isEnabled();
    }

    public boolean E() {
        return this.f2277a.isFocusable();
    }

    public boolean F() {
        return this.f2277a.isFocused();
    }

    public boolean G() {
        return this.f2277a.isLongClickable();
    }

    public boolean H() {
        return this.f2277a.isPassword();
    }

    public boolean I() {
        return this.f2277a.isScrollable();
    }

    public boolean J() {
        return this.f2277a.isSelected();
    }

    public boolean K() {
        boolean isShowingHintText;
        if (Build.VERSION.SDK_INT < 26) {
            return k(4);
        }
        isShowingHintText = this.f2277a.isShowingHintText();
        return isShowingHintText;
    }

    public boolean O(int i6, Bundle bundle) {
        return this.f2277a.performAction(i6, bundle);
    }

    public void P() {
    }

    public void R(boolean z5) {
        this.f2277a.setAccessibilityFocused(z5);
    }

    public void T(Rect rect) {
        this.f2277a.setBoundsInParent(rect);
    }

    public void U(Rect rect) {
        this.f2277a.setBoundsInScreen(rect);
    }

    public void V(boolean z5) {
        this.f2277a.setCheckable(z5);
    }

    public void W(boolean z5) {
        this.f2277a.setChecked(z5);
    }

    public void X(CharSequence charSequence) {
        this.f2277a.setClassName(charSequence);
    }

    public void Y(boolean z5) {
        this.f2277a.setClickable(z5);
    }

    public void Z(Object obj) {
        this.f2277a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((c) obj).f2306a);
    }

    public void a(int i6) {
        this.f2277a.addAction(i6);
    }

    public void a0(Object obj) {
        this.f2277a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((d) obj).f2307a);
    }

    public void b(a aVar) {
        this.f2277a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f2302a);
    }

    public void b0(CharSequence charSequence) {
        this.f2277a.setContentDescription(charSequence);
    }

    public void c(View view, int i6) {
        this.f2277a.addChild(view, i6);
    }

    public void c0(boolean z5) {
        this.f2277a.setDismissable(z5);
    }

    public void d0(boolean z5) {
        this.f2277a.setEnabled(z5);
    }

    public void e(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            f();
            Q(view);
            ClickableSpan[] p6 = p(charSequence);
            if (p6 == null || p6.length <= 0) {
                return;
            }
            r().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", s.c.f9135a);
            SparseArray s5 = s(view);
            for (int i6 = 0; i6 < p6.length; i6++) {
                int z5 = z(p6[i6], s5);
                s5.put(z5, new WeakReference(p6[i6]));
                d(p6[i6], (Spanned) charSequence, z5);
            }
        }
    }

    public void e0(CharSequence charSequence) {
        this.f2277a.setError(charSequence);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2277a;
        if (accessibilityNodeInfo == null) {
            if (g0Var.f2277a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(g0Var.f2277a)) {
            return false;
        }
        return this.f2279c == g0Var.f2279c && this.f2278b == g0Var.f2278b;
    }

    public void f0(boolean z5) {
        this.f2277a.setFocusable(z5);
    }

    public void g0(boolean z5) {
        this.f2277a.setFocused(z5);
    }

    public List h() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f2277a.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i6 = 0; i6 < size; i6++) {
            arrayList.add(new a(actionList.get(i6)));
        }
        return arrayList;
    }

    public void h0(boolean z5) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2277a.setHeading(z5);
        } else {
            S(2, z5);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2277a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public void i0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2277a.setHintText(charSequence);
        } else {
            b.a(this.f2277a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public int j() {
        return this.f2277a.getActions();
    }

    public void j0(View view) {
        this.f2277a.setLabelFor(view);
    }

    public void k0(int i6) {
        this.f2277a.setMaxTextLength(i6);
    }

    public void l(Rect rect) {
        this.f2277a.getBoundsInParent(rect);
    }

    public void l0(CharSequence charSequence) {
        this.f2277a.setPackageName(charSequence);
    }

    public void m(Rect rect) {
        this.f2277a.getBoundsInScreen(rect);
    }

    public void m0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2277a.setPaneTitle(charSequence);
        } else {
            b.a(this.f2277a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public int n() {
        return this.f2277a.getChildCount();
    }

    public void n0(View view) {
        this.f2278b = -1;
        this.f2277a.setParent(view);
    }

    public CharSequence o() {
        return this.f2277a.getClassName();
    }

    public void o0(View view, int i6) {
        this.f2278b = i6;
        this.f2277a.setParent(view, i6);
    }

    public void p0(boolean z5) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2277a.setScreenReaderFocusable(z5);
        } else {
            S(1, z5);
        }
    }

    public CharSequence q() {
        return this.f2277a.getContentDescription();
    }

    public void q0(boolean z5) {
        this.f2277a.setScrollable(z5);
    }

    public Bundle r() {
        return b.a(this.f2277a);
    }

    public void r0(boolean z5) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2277a.setShowingHintText(z5);
        } else {
            S(4, z5);
        }
    }

    public void s0(View view, int i6) {
        this.f2279c = i6;
        this.f2277a.setSource(view, i6);
    }

    public CharSequence t() {
        return this.f2277a.getPackageName();
    }

    public void t0(CharSequence charSequence) {
        if (androidx.core.os.b.b()) {
            this.f2277a.setStateDescription(charSequence);
        } else {
            b.a(this.f2277a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
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
        sb.append(t());
        sb.append("; className: ");
        sb.append(o());
        sb.append("; text: ");
        sb.append(v());
        sb.append("; contentDescription: ");
        sb.append(q());
        sb.append("; viewId: ");
        sb.append(x());
        sb.append("; uniqueId: ");
        sb.append(w());
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
        List h6 = h();
        for (int i6 = 0; i6 < h6.size(); i6++) {
            a aVar = (a) h6.get(i6);
            String i7 = i(aVar.b());
            if (i7.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                i7 = aVar.c().toString();
            }
            sb.append(i7);
            if (i6 != h6.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void u0(CharSequence charSequence) {
        this.f2277a.setText(charSequence);
    }

    public CharSequence v() {
        if (!y()) {
            return this.f2277a.getText();
        }
        List g6 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List g7 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List g8 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List g9 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f2277a.getText(), 0, this.f2277a.getText().length()));
        for (int i6 = 0; i6 < g6.size(); i6++) {
            spannableString.setSpan(new androidx.core.view.accessibility.a(((Integer) g9.get(i6)).intValue(), this, r().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) g6.get(i6)).intValue(), ((Integer) g7.get(i6)).intValue(), ((Integer) g8.get(i6)).intValue());
        }
        return spannableString;
    }

    public void v0(View view) {
        this.f2277a.setTraversalAfter(view);
    }

    public String w() {
        String uniqueId;
        if (!androidx.core.os.b.c()) {
            return b.a(this.f2277a).getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        }
        uniqueId = this.f2277a.getUniqueId();
        return uniqueId;
    }

    public void w0(boolean z5) {
        this.f2277a.setVisibleToUser(z5);
    }

    public String x() {
        return this.f2277a.getViewIdResourceName();
    }

    public AccessibilityNodeInfo x0() {
        return this.f2277a;
    }
}
