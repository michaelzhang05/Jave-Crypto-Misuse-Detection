package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class q2 extends j2 implements n2 {
    private static Method K;
    private n2 J;

    /* loaded from: classes.dex */
    static class a {
        static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    /* loaded from: classes.dex */
    static class b {
        static void a(PopupWindow popupWindow, boolean z5) {
            popupWindow.setTouchModal(z5);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends d2 {

        /* renamed from: n, reason: collision with root package name */
        final int f1195n;

        /* renamed from: o, reason: collision with root package name */
        final int f1196o;

        /* renamed from: p, reason: collision with root package name */
        private n2 f1197p;

        /* renamed from: q, reason: collision with root package name */
        private MenuItem f1198q;

        /* loaded from: classes.dex */
        static class a {
            static int a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public c(Context context, boolean z5) {
            super(context, z5);
            if (1 == a.a(context.getResources().getConfiguration())) {
                this.f1195n = 21;
                this.f1196o = 22;
            } else {
                this.f1195n = 22;
                this.f1196o = 21;
            }
        }

        @Override // androidx.appcompat.widget.d2
        public /* bridge */ /* synthetic */ int d(int i6, int i7, int i8, int i9, int i10) {
            return super.d(i6, i7, i8, i9, i10);
        }

        @Override // androidx.appcompat.widget.d2
        public /* bridge */ /* synthetic */ boolean e(MotionEvent motionEvent, int i6) {
            return super.e(motionEvent, i6);
        }

        @Override // androidx.appcompat.widget.d2, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.d2, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.d2, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.d2, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // androidx.appcompat.widget.d2, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            androidx.appcompat.view.menu.f fVar;
            int i6;
            int pointToPosition;
            int i7;
            if (this.f1197p != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i6 = headerViewListAdapter.getHeadersCount();
                    fVar = (androidx.appcompat.view.menu.f) headerViewListAdapter.getWrappedAdapter();
                } else {
                    fVar = (androidx.appcompat.view.menu.f) adapter;
                    i6 = 0;
                }
                androidx.appcompat.view.menu.i item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i7 = pointToPosition - i6) < 0 || i7 >= fVar.getCount()) ? null : fVar.getItem(i7);
                MenuItem menuItem = this.f1198q;
                if (menuItem != item) {
                    androidx.appcompat.view.menu.g b6 = fVar.b();
                    if (menuItem != null) {
                        this.f1197p.h(b6, menuItem);
                    }
                    this.f1198q = item;
                    if (item != null) {
                        this.f1197p.e(b6, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i6, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i6 == this.f1195n) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i6 != this.f1196o) {
                return super.onKeyDown(i6, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((androidx.appcompat.view.menu.f) adapter).b().e(false);
            return true;
        }

        @Override // androidx.appcompat.widget.d2, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(n2 n2Var) {
            this.f1197p = n2Var;
        }

        @Override // androidx.appcompat.widget.d2, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                K = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public q2(Context context, AttributeSet attributeSet, int i6, int i7) {
        super(context, attributeSet, i6, i7);
    }

    public void S(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            a.a(this.F, (Transition) obj);
        }
    }

    public void T(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            a.b(this.F, (Transition) obj);
        }
    }

    public void U(n2 n2Var) {
        this.J = n2Var;
    }

    public void V(boolean z5) {
        if (Build.VERSION.SDK_INT > 28) {
            b.a(this.F, z5);
            return;
        }
        Method method = K;
        if (method != null) {
            try {
                method.invoke(this.F, Boolean.valueOf(z5));
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // androidx.appcompat.widget.n2
    public void e(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        n2 n2Var = this.J;
        if (n2Var != null) {
            n2Var.e(gVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.n2
    public void h(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        n2 n2Var = this.J;
        if (n2Var != null) {
            n2Var.h(gVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.j2
    d2 s(Context context, boolean z5) {
        c cVar = new c(context, z5);
        cVar.setHoverListener(this);
        return cVar;
    }
}
