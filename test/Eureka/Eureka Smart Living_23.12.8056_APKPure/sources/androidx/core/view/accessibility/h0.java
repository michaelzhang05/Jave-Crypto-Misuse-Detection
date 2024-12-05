package androidx.core.view.accessibility;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class h0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f2308a;

    /* loaded from: classes.dex */
    static class a extends AccessibilityNodeProvider {

        /* renamed from: a, reason: collision with root package name */
        final h0 f2309a;

        a(h0 h0Var) {
            this.f2309a = h0Var;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i6) {
            g0 b6 = this.f2309a.b(i6);
            if (b6 == null) {
                return null;
            }
            return b6.x0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List findAccessibilityNodeInfosByText(String str, int i6) {
            List c6 = this.f2309a.c(str, i6);
            if (c6 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c6.size();
            for (int i7 = 0; i7 < size; i7++) {
                arrayList.add(((g0) c6.get(i7)).x0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i6, int i7, Bundle bundle) {
            return this.f2309a.f(i6, i7, bundle);
        }
    }

    /* loaded from: classes.dex */
    static class b extends a {
        b(h0 h0Var) {
            super(h0Var);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i6) {
            g0 d6 = this.f2309a.d(i6);
            if (d6 == null) {
                return null;
            }
            return d6.x0();
        }
    }

    /* loaded from: classes.dex */
    static class c extends b {
        c(h0 h0Var) {
            super(h0Var);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i6, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f2309a.a(i6, g0.y0(accessibilityNodeInfo), str, bundle);
        }
    }

    public h0() {
        this.f2308a = Build.VERSION.SDK_INT >= 26 ? new c(this) : new b(this);
    }

    public void a(int i6, g0 g0Var, String str, Bundle bundle) {
    }

    public g0 b(int i6) {
        return null;
    }

    public List c(String str, int i6) {
        return null;
    }

    public g0 d(int i6) {
        return null;
    }

    public Object e() {
        return this.f2308a;
    }

    public boolean f(int i6, int i7, Bundle bundle) {
        return false;
    }

    public h0(Object obj) {
        this.f2308a = obj;
    }
}
