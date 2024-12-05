package androidx.core.view;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.g0;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static final View.AccessibilityDelegate f2268c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    private final View.AccessibilityDelegate f2269a;

    /* renamed from: b, reason: collision with root package name */
    private final View.AccessibilityDelegate f2270b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0034a extends View.AccessibilityDelegate {

        /* renamed from: a, reason: collision with root package name */
        final a f2271a;

        C0034a(a aVar) {
            this.f2271a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f2271a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            androidx.core.view.accessibility.h0 b6 = this.f2271a.b(view);
            if (b6 != null) {
                return (AccessibilityNodeProvider) b6.e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2271a.f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            androidx.core.view.accessibility.g0 y02 = androidx.core.view.accessibility.g0.y0(accessibilityNodeInfo);
            y02.p0(b1.X(view));
            y02.h0(b1.S(view));
            y02.m0(b1.r(view));
            y02.t0(b1.L(view));
            this.f2271a.g(view, y02);
            y02.e(accessibilityNodeInfo.getText(), view);
            List c6 = a.c(view);
            for (int i6 = 0; i6 < c6.size(); i6++) {
                y02.b((g0.a) c6.get(i6));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2271a.h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f2271a.i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i6, Bundle bundle) {
            return this.f2271a.j(view, i6, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i6) {
            this.f2271a.l(view, i6);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f2271a.m(view, accessibilityEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {
        static AccessibilityNodeProvider a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        static boolean b(View.AccessibilityDelegate accessibilityDelegate, View view, int i6, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i6, bundle);
        }
    }

    public a() {
        this(f2268c);
    }

    static List c(View view) {
        List list = (List) view.getTag(s.c.H);
        return list == null ? Collections.emptyList() : list;
    }

    private boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] p6 = androidx.core.view.accessibility.g0.p(view.createAccessibilityNodeInfo().getText());
            for (int i6 = 0; p6 != null && i6 < p6.length; i6++) {
                if (clickableSpan.equals(p6[i6])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean k(int i6, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(s.c.I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i6)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f2269a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public androidx.core.view.accessibility.h0 b(View view) {
        AccessibilityNodeProvider a6 = b.a(this.f2269a, view);
        if (a6 != null) {
            return new androidx.core.view.accessibility.h0(a6);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View.AccessibilityDelegate d() {
        return this.f2270b;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f2269a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, androidx.core.view.accessibility.g0 g0Var) {
        this.f2269a.onInitializeAccessibilityNodeInfo(view, g0Var.x0());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f2269a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f2269a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i6, Bundle bundle) {
        List c6 = c(view);
        boolean z5 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= c6.size()) {
                break;
            }
            g0.a aVar = (g0.a) c6.get(i7);
            if (aVar.b() == i6) {
                z5 = aVar.d(view, bundle);
                break;
            }
            i7++;
        }
        if (!z5) {
            z5 = b.b(this.f2269a, view, i6, bundle);
        }
        return (z5 || i6 != s.c.f9135a || bundle == null) ? z5 : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void l(View view, int i6) {
        this.f2269a.sendAccessibilityEvent(view, i6);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f2269a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f2269a = accessibilityDelegate;
        this.f2270b = new C0034a(this);
    }
}
