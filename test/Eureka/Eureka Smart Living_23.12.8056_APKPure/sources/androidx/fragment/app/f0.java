package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    static final h0 f2865a = new g0();

    /* renamed from: b, reason: collision with root package name */
    static final h0 f2866b = b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Fragment fragment, Fragment fragment2, boolean z5, l.a aVar, boolean z6) {
        if (z5) {
            fragment2.y();
        } else {
            fragment.y();
        }
    }

    private static h0 b() {
        try {
            return (h0) m0.e.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(l.a aVar, l.a aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey((String) aVar.m(size))) {
                aVar.k(size);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(ArrayList arrayList, int i6) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((View) arrayList.get(size)).setVisibility(i6);
        }
    }
}
