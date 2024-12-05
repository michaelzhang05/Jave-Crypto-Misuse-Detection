package androidx.fragment.app;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.b1;
import androidx.core.view.z0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class h0 {

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f2885a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f2886b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f2887c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f2888d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f2889e;

        a(int i6, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f2885a = i6;
            this.f2886b = arrayList;
            this.f2887c = arrayList2;
            this.f2888d = arrayList3;
            this.f2889e = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i6 = 0; i6 < this.f2885a; i6++) {
                b1.H0((View) this.f2886b.get(i6), (String) this.f2887c.get(i6));
                b1.H0((View) this.f2888d.get(i6), (String) this.f2889e.get(i6));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void d(List list, View view) {
        int size = list.size();
        if (g(list, view, size)) {
            return;
        }
        if (b1.M(view) != null) {
            list.add(view);
        }
        for (int i6 = size; i6 < list.size(); i6++) {
            View view2 = (View) list.get(i6);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = viewGroup.getChildAt(i7);
                    if (!g(list, childAt, size) && b1.M(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    private static boolean g(List list, View view, int i6) {
        for (int i7 = 0; i7 < i6; i7++) {
            if (list.get(i7) == view) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean i(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    public abstract Object f(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public void h(View view, Rect rect) {
        if (b1.T(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public abstract Object j(Object obj, Object obj2, Object obj3);

    public abstract Object k(Object obj, Object obj2, Object obj3);

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList l(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) arrayList.get(i6);
            arrayList2.add(b1.M(view));
            b1.H0(view, null);
        }
        return arrayList2;
    }

    public abstract void m(Object obj, View view, ArrayList arrayList);

    public abstract void n(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3);

    public abstract void o(Object obj, Rect rect);

    public abstract void p(Object obj, View view);

    public void q(Fragment fragment, Object obj, androidx.core.os.f fVar, Runnable runnable) {
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(View view, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Map map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i6 = 0; i6 < size; i6++) {
            View view2 = (View) arrayList.get(i6);
            String M = b1.M(view2);
            arrayList4.add(M);
            if (M != null) {
                b1.H0(view2, null);
                String str = (String) map.get(M);
                int i7 = 0;
                while (true) {
                    if (i7 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i7))) {
                        b1.H0((View) arrayList2.get(i7), M);
                        break;
                    }
                    i7++;
                }
            }
        }
        z0.a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void s(Object obj, View view, ArrayList arrayList);

    public abstract void t(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract Object u(Object obj);
}
