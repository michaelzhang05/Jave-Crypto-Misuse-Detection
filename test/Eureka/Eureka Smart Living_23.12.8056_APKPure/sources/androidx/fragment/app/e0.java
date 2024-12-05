package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.h;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    private final n f2836a;

    /* renamed from: b, reason: collision with root package name */
    private final ClassLoader f2837b;

    /* renamed from: d, reason: collision with root package name */
    int f2839d;

    /* renamed from: e, reason: collision with root package name */
    int f2840e;

    /* renamed from: f, reason: collision with root package name */
    int f2841f;

    /* renamed from: g, reason: collision with root package name */
    int f2842g;

    /* renamed from: h, reason: collision with root package name */
    int f2843h;

    /* renamed from: i, reason: collision with root package name */
    boolean f2844i;

    /* renamed from: k, reason: collision with root package name */
    String f2846k;

    /* renamed from: l, reason: collision with root package name */
    int f2847l;

    /* renamed from: m, reason: collision with root package name */
    CharSequence f2848m;

    /* renamed from: n, reason: collision with root package name */
    int f2849n;

    /* renamed from: o, reason: collision with root package name */
    CharSequence f2850o;

    /* renamed from: p, reason: collision with root package name */
    ArrayList f2851p;

    /* renamed from: q, reason: collision with root package name */
    ArrayList f2852q;

    /* renamed from: s, reason: collision with root package name */
    ArrayList f2854s;

    /* renamed from: c, reason: collision with root package name */
    ArrayList f2838c = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    boolean f2845j = true;

    /* renamed from: r, reason: collision with root package name */
    boolean f2853r = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        int f2855a;

        /* renamed from: b, reason: collision with root package name */
        Fragment f2856b;

        /* renamed from: c, reason: collision with root package name */
        boolean f2857c;

        /* renamed from: d, reason: collision with root package name */
        int f2858d;

        /* renamed from: e, reason: collision with root package name */
        int f2859e;

        /* renamed from: f, reason: collision with root package name */
        int f2860f;

        /* renamed from: g, reason: collision with root package name */
        int f2861g;

        /* renamed from: h, reason: collision with root package name */
        h.b f2862h;

        /* renamed from: i, reason: collision with root package name */
        h.b f2863i;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i6, Fragment fragment) {
            this.f2855a = i6;
            this.f2856b = fragment;
            this.f2857c = false;
            h.b bVar = h.b.RESUMED;
            this.f2862h = bVar;
            this.f2863i = bVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i6, Fragment fragment, boolean z5) {
            this.f2855a = i6;
            this.f2856b = fragment;
            this.f2857c = z5;
            h.b bVar = h.b.RESUMED;
            this.f2862h = bVar;
            this.f2863i = bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e0(n nVar, ClassLoader classLoader) {
        this.f2836a = nVar;
        this.f2837b = classLoader;
    }

    public e0 b(int i6, Fragment fragment, String str) {
        k(i6, fragment, str, 1);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e0 c(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.H = viewGroup;
        return b(viewGroup.getId(), fragment, str);
    }

    public e0 d(Fragment fragment, String str) {
        k(0, fragment, str, 1);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(a aVar) {
        this.f2838c.add(aVar);
        aVar.f2858d = this.f2839d;
        aVar.f2859e = this.f2840e;
        aVar.f2860f = this.f2841f;
        aVar.f2861g = this.f2842g;
    }

    public abstract int f();

    public abstract int g();

    public abstract void h();

    public abstract void i();

    public e0 j() {
        if (this.f2844i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f2845j = false;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(int i6, Fragment fragment, String str, int i7) {
        String str2 = fragment.Q;
        if (str2 != null) {
            c0.c.f(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.f2678z;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f2678z + " now " + str);
            }
            fragment.f2678z = str;
        }
        if (i6 != 0) {
            if (i6 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i8 = fragment.f2676x;
            if (i8 != 0 && i8 != i6) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f2676x + " now " + i6);
            }
            fragment.f2676x = i6;
            fragment.f2677y = i6;
        }
        e(new a(i7, fragment));
    }

    public e0 l(Fragment fragment) {
        e(new a(3, fragment));
        return this;
    }

    public e0 m(int i6, Fragment fragment) {
        return n(i6, fragment, null);
    }

    public e0 n(int i6, Fragment fragment, String str) {
        if (i6 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        k(i6, fragment, str, 2);
        return this;
    }

    public e0 o(boolean z5) {
        this.f2853r = z5;
        return this;
    }
}
