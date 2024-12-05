package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.u;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: RecyclerViewAccessibilityDelegate.java */
/* loaded from: classes.dex */
public class o extends androidx.core.view.a {

    /* renamed from: d, reason: collision with root package name */
    final RecyclerView f1592d;

    /* renamed from: e, reason: collision with root package name */
    private final a f1593e;

    /* compiled from: RecyclerViewAccessibilityDelegate.java */
    /* loaded from: classes.dex */
    public static class a extends androidx.core.view.a {

        /* renamed from: d, reason: collision with root package name */
        final o f1594d;

        /* renamed from: e, reason: collision with root package name */
        private Map<View, androidx.core.view.a> f1595e = new WeakHashMap();

        public a(o oVar) {
            this.f1594d = oVar;
        }

        @Override // androidx.core.view.a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f1595e.get(view);
            if (aVar != null) {
                return aVar.a(view, accessibilityEvent);
            }
            return super.a(view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        public androidx.core.view.d0.d b(View view) {
            androidx.core.view.a aVar = this.f1595e.get(view);
            if (aVar != null) {
                return aVar.b(view);
            }
            return super.b(view);
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f1595e.get(view);
            if (aVar != null) {
                aVar.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.a
        public void g(View view, androidx.core.view.d0.c cVar) {
            if (!this.f1594d.o() && this.f1594d.f1592d.getLayoutManager() != null) {
                this.f1594d.f1592d.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, cVar);
                androidx.core.view.a aVar = this.f1595e.get(view);
                if (aVar != null) {
                    aVar.g(view, cVar);
                    return;
                } else {
                    super.g(view, cVar);
                    return;
                }
            }
            super.g(view, cVar);
        }

        @Override // androidx.core.view.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f1595e.get(view);
            if (aVar != null) {
                aVar.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f1595e.get(viewGroup);
            if (aVar != null) {
                return aVar.i(viewGroup, view, accessibilityEvent);
            }
            return super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i2, Bundle bundle) {
            if (!this.f1594d.o() && this.f1594d.f1592d.getLayoutManager() != null) {
                androidx.core.view.a aVar = this.f1595e.get(view);
                if (aVar != null) {
                    if (aVar.j(view, i2, bundle)) {
                        return true;
                    }
                } else if (super.j(view, i2, bundle)) {
                    return true;
                }
                return this.f1594d.f1592d.getLayoutManager().performAccessibilityActionForItem(view, i2, bundle);
            }
            return super.j(view, i2, bundle);
        }

        @Override // androidx.core.view.a
        public void l(View view, int i2) {
            androidx.core.view.a aVar = this.f1595e.get(view);
            if (aVar != null) {
                aVar.l(view, i2);
            } else {
                super.l(view, i2);
            }
        }

        @Override // androidx.core.view.a
        public void m(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f1595e.get(view);
            if (aVar != null) {
                aVar.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public androidx.core.view.a n(View view) {
            return this.f1595e.remove(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void o(View view) {
            androidx.core.view.a j2 = u.j(view);
            if (j2 == null || j2 == this) {
                return;
            }
            this.f1595e.put(view, j2);
        }
    }

    public o(RecyclerView recyclerView) {
        this.f1592d = recyclerView;
        androidx.core.view.a n = n();
        if (n != null && (n instanceof a)) {
            this.f1593e = (a) n;
        } else {
            this.f1593e = new a(this);
        }
    }

    @Override // androidx.core.view.a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.a
    public void g(View view, androidx.core.view.d0.c cVar) {
        super.g(view, cVar);
        if (o() || this.f1592d.getLayoutManager() == null) {
            return;
        }
        this.f1592d.getLayoutManager().onInitializeAccessibilityNodeInfo(cVar);
    }

    @Override // androidx.core.view.a
    public boolean j(View view, int i2, Bundle bundle) {
        if (super.j(view, i2, bundle)) {
            return true;
        }
        if (o() || this.f1592d.getLayoutManager() == null) {
            return false;
        }
        return this.f1592d.getLayoutManager().performAccessibilityAction(i2, bundle);
    }

    public androidx.core.view.a n() {
        return this.f1593e;
    }

    boolean o() {
        return this.f1592d.hasPendingAdapterUpdates();
    }
}
