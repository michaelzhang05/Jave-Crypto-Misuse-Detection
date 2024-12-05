package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.g0;
import androidx.core.view.accessibility.h0;
import androidx.core.view.b1;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class k extends androidx.core.view.a {

    /* renamed from: d, reason: collision with root package name */
    final RecyclerView f3596d;

    /* renamed from: e, reason: collision with root package name */
    private final a f3597e;

    /* loaded from: classes.dex */
    public static class a extends androidx.core.view.a {

        /* renamed from: d, reason: collision with root package name */
        final k f3598d;

        /* renamed from: e, reason: collision with root package name */
        private Map f3599e = new WeakHashMap();

        public a(k kVar) {
            this.f3598d = kVar;
        }

        @Override // androidx.core.view.a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = (androidx.core.view.a) this.f3599e.get(view);
            return aVar != null ? aVar.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        public h0 b(View view) {
            androidx.core.view.a aVar = (androidx.core.view.a) this.f3599e.get(view);
            return aVar != null ? aVar.b(view) : super.b(view);
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = (androidx.core.view.a) this.f3599e.get(view);
            if (aVar != null) {
                aVar.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.a
        public void g(View view, g0 g0Var) {
            if (!this.f3598d.o() && this.f3598d.f3596d.getLayoutManager() != null) {
                this.f3598d.f3596d.getLayoutManager().O0(view, g0Var);
                androidx.core.view.a aVar = (androidx.core.view.a) this.f3599e.get(view);
                if (aVar != null) {
                    aVar.g(view, g0Var);
                    return;
                }
            }
            super.g(view, g0Var);
        }

        @Override // androidx.core.view.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = (androidx.core.view.a) this.f3599e.get(view);
            if (aVar != null) {
                aVar.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = (androidx.core.view.a) this.f3599e.get(viewGroup);
            return aVar != null ? aVar.i(viewGroup, view, accessibilityEvent) : super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i6, Bundle bundle) {
            if (this.f3598d.o() || this.f3598d.f3596d.getLayoutManager() == null) {
                return super.j(view, i6, bundle);
            }
            androidx.core.view.a aVar = (androidx.core.view.a) this.f3599e.get(view);
            if (aVar != null) {
                if (aVar.j(view, i6, bundle)) {
                    return true;
                }
            } else if (super.j(view, i6, bundle)) {
                return true;
            }
            return this.f3598d.f3596d.getLayoutManager().i1(view, i6, bundle);
        }

        @Override // androidx.core.view.a
        public void l(View view, int i6) {
            androidx.core.view.a aVar = (androidx.core.view.a) this.f3599e.get(view);
            if (aVar != null) {
                aVar.l(view, i6);
            } else {
                super.l(view, i6);
            }
        }

        @Override // androidx.core.view.a
        public void m(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = (androidx.core.view.a) this.f3599e.get(view);
            if (aVar != null) {
                aVar.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public androidx.core.view.a n(View view) {
            return (androidx.core.view.a) this.f3599e.remove(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void o(View view) {
            androidx.core.view.a n6 = b1.n(view);
            if (n6 == null || n6 == this) {
                return;
            }
            this.f3599e.put(view, n6);
        }
    }

    public k(RecyclerView recyclerView) {
        this.f3596d = recyclerView;
        androidx.core.view.a n6 = n();
        this.f3597e = (n6 == null || !(n6 instanceof a)) ? new a(this) : (a) n6;
    }

    @Override // androidx.core.view.a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().K0(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.a
    public void g(View view, g0 g0Var) {
        super.g(view, g0Var);
        if (o() || this.f3596d.getLayoutManager() == null) {
            return;
        }
        this.f3596d.getLayoutManager().M0(g0Var);
    }

    @Override // androidx.core.view.a
    public boolean j(View view, int i6, Bundle bundle) {
        if (super.j(view, i6, bundle)) {
            return true;
        }
        if (o() || this.f3596d.getLayoutManager() == null) {
            return false;
        }
        return this.f3596d.getLayoutManager().g1(i6, bundle);
    }

    public androidx.core.view.a n() {
        return this.f3597e;
    }

    boolean o() {
        return this.f3596d.l0();
    }
}
