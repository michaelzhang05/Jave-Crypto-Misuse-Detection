package androidx.fragment.app;

import androidx.lifecycle.f;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: FragmentTransaction.java */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: b, reason: collision with root package name */
    int f1162b;

    /* renamed from: c, reason: collision with root package name */
    int f1163c;

    /* renamed from: d, reason: collision with root package name */
    int f1164d;

    /* renamed from: e, reason: collision with root package name */
    int f1165e;

    /* renamed from: f, reason: collision with root package name */
    int f1166f;

    /* renamed from: g, reason: collision with root package name */
    int f1167g;

    /* renamed from: h, reason: collision with root package name */
    boolean f1168h;

    /* renamed from: j, reason: collision with root package name */
    String f1170j;

    /* renamed from: k, reason: collision with root package name */
    int f1171k;
    CharSequence l;
    int m;
    CharSequence n;
    ArrayList<String> o;
    ArrayList<String> p;
    ArrayList<Runnable> r;
    ArrayList<a> a = new ArrayList<>();

    /* renamed from: i, reason: collision with root package name */
    boolean f1169i = true;
    boolean q = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentTransaction.java */
    /* loaded from: classes.dex */
    public static final class a {
        int a;

        /* renamed from: b, reason: collision with root package name */
        Fragment f1172b;

        /* renamed from: c, reason: collision with root package name */
        int f1173c;

        /* renamed from: d, reason: collision with root package name */
        int f1174d;

        /* renamed from: e, reason: collision with root package name */
        int f1175e;

        /* renamed from: f, reason: collision with root package name */
        int f1176f;

        /* renamed from: g, reason: collision with root package name */
        f.b f1177g;

        /* renamed from: h, reason: collision with root package name */
        f.b f1178h;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i2, Fragment fragment) {
            this.a = i2;
            this.f1172b = fragment;
            f.b bVar = f.b.RESUMED;
            this.f1177g = bVar;
            this.f1178h = bVar;
        }

        a(int i2, Fragment fragment, f.b bVar) {
            this.a = i2;
            this.f1172b = fragment;
            this.f1177g = fragment.mMaxState;
            this.f1178h = bVar;
        }
    }

    public m b(int i2, Fragment fragment) {
        n(i2, fragment, null, 1);
        return this;
    }

    public m c(int i2, Fragment fragment, String str) {
        n(i2, fragment, str, 1);
        return this;
    }

    public m d(Fragment fragment, String str) {
        n(0, fragment, str, 1);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(a aVar) {
        this.a.add(aVar);
        aVar.f1173c = this.f1162b;
        aVar.f1174d = this.f1163c;
        aVar.f1175e = this.f1164d;
        aVar.f1176f = this.f1165e;
    }

    public m f(String str) {
        if (this.f1169i) {
            this.f1168h = true;
            this.f1170j = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public m g(Fragment fragment) {
        e(new a(7, fragment));
        return this;
    }

    public abstract int h();

    public abstract int i();

    public abstract void j();

    public abstract void k();

    public m l(Fragment fragment) {
        e(new a(6, fragment));
        return this;
    }

    public m m() {
        if (!this.f1168h) {
            this.f1169i = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(int i2, Fragment fragment, String str, int i3) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str2 = fragment.mTag;
                if (str2 != null && !str.equals(str2)) {
                    throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
                }
                fragment.mTag = str;
            }
            if (i2 != 0) {
                if (i2 != -1) {
                    int i4 = fragment.mFragmentId;
                    if (i4 != 0 && i4 != i2) {
                        throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i2);
                    }
                    fragment.mFragmentId = i2;
                    fragment.mContainerId = i2;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
                }
            }
            e(new a(i3, fragment));
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    public m o(Fragment fragment) {
        e(new a(3, fragment));
        return this;
    }

    public m p(int i2, Fragment fragment) {
        return q(i2, fragment, null);
    }

    public m q(int i2, Fragment fragment, String str) {
        if (i2 != 0) {
            n(i2, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public m r(int i2, int i3, int i4, int i5) {
        this.f1162b = i2;
        this.f1163c = i3;
        this.f1164d = i4;
        this.f1165e = i5;
        return this;
    }

    public m s(Fragment fragment, f.b bVar) {
        e(new a(10, fragment, bVar));
        return this;
    }
}
