package androidx.lifecycle;

import android.app.Application;
import f0.a;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    private final i0 f3072a;

    /* renamed from: b, reason: collision with root package name */
    private final b f3073b;

    /* renamed from: c, reason: collision with root package name */
    private final f0.a f3074c;

    /* loaded from: classes.dex */
    public static class a extends c {

        /* renamed from: f, reason: collision with root package name */
        private static a f3076f;

        /* renamed from: d, reason: collision with root package name */
        private final Application f3078d;

        /* renamed from: e, reason: collision with root package name */
        public static final C0049a f3075e = new C0049a(null);

        /* renamed from: g, reason: collision with root package name */
        public static final a.b f3077g = C0049a.C0050a.f3079a;

        /* renamed from: androidx.lifecycle.f0$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0049a {

            /* renamed from: androidx.lifecycle.f0$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            private static final class C0050a implements a.b {

                /* renamed from: a, reason: collision with root package name */
                public static final C0050a f3079a = new C0050a();

                private C0050a() {
                }
            }

            private C0049a() {
            }

            public /* synthetic */ C0049a(f5.f fVar) {
                this();
            }

            public final b a(j0 j0Var) {
                f5.h.e(j0Var, "owner");
                return j0Var instanceof g ? ((g) j0Var).w() : c.f3080a.a();
            }

            public final a b(Application application) {
                f5.h.e(application, "application");
                if (a.f3076f == null) {
                    a.f3076f = new a(application);
                }
                a aVar = a.f3076f;
                f5.h.b(aVar);
                return aVar;
            }
        }

        public a() {
            this(null, 0);
        }

        private final e0 g(Class cls, Application application) {
            if (!androidx.lifecycle.a.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            try {
                e0 e0Var = (e0) cls.getConstructor(Application.class).newInstance(application);
                f5.h.d(e0Var, "{\n                try {\n…          }\n            }");
                return e0Var;
            } catch (IllegalAccessException e6) {
                throw new RuntimeException("Cannot create an instance of " + cls, e6);
            } catch (InstantiationException e7) {
                throw new RuntimeException("Cannot create an instance of " + cls, e7);
            } catch (NoSuchMethodException e8) {
                throw new RuntimeException("Cannot create an instance of " + cls, e8);
            } catch (InvocationTargetException e9) {
                throw new RuntimeException("Cannot create an instance of " + cls, e9);
            }
        }

        @Override // androidx.lifecycle.f0.c, androidx.lifecycle.f0.b
        public e0 a(Class cls) {
            f5.h.e(cls, "modelClass");
            Application application = this.f3078d;
            if (application != null) {
                return g(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.f0.c, androidx.lifecycle.f0.b
        public e0 b(Class cls, f0.a aVar) {
            f5.h.e(cls, "modelClass");
            f5.h.e(aVar, "extras");
            if (this.f3078d != null) {
                return a(cls);
            }
            Application application = (Application) aVar.a(f3077g);
            if (application != null) {
                return g(cls, application);
            }
            if (androidx.lifecycle.a.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return super.a(cls);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            f5.h.e(application, "application");
        }

        private a(Application application, int i6) {
            this.f3078d = application;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        e0 a(Class cls);

        e0 b(Class cls, f0.a aVar);
    }

    /* loaded from: classes.dex */
    public static class c implements b {

        /* renamed from: b, reason: collision with root package name */
        private static c f3081b;

        /* renamed from: a, reason: collision with root package name */
        public static final a f3080a = new a(null);

        /* renamed from: c, reason: collision with root package name */
        public static final a.b f3082c = a.C0051a.f3083a;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: androidx.lifecycle.f0$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            private static final class C0051a implements a.b {

                /* renamed from: a, reason: collision with root package name */
                public static final C0051a f3083a = new C0051a();

                private C0051a() {
                }
            }

            private a() {
            }

            public /* synthetic */ a(f5.f fVar) {
                this();
            }

            public final c a() {
                if (c.f3081b == null) {
                    c.f3081b = new c();
                }
                c cVar = c.f3081b;
                f5.h.b(cVar);
                return cVar;
            }
        }

        @Override // androidx.lifecycle.f0.b
        public e0 a(Class cls) {
            f5.h.e(cls, "modelClass");
            try {
                Object newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                f5.h.d(newInstance, "{\n                modelC…wInstance()\n            }");
                return (e0) newInstance;
            } catch (IllegalAccessException e6) {
                throw new RuntimeException("Cannot create an instance of " + cls, e6);
            } catch (InstantiationException e7) {
                throw new RuntimeException("Cannot create an instance of " + cls, e7);
            } catch (NoSuchMethodException e8) {
                throw new RuntimeException("Cannot create an instance of " + cls, e8);
            }
        }

        @Override // androidx.lifecycle.f0.b
        public /* synthetic */ e0 b(Class cls, f0.a aVar) {
            return g0.b(this, cls, aVar);
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public abstract void c(e0 e0Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f0(i0 i0Var, b bVar) {
        this(i0Var, bVar, null, 4, null);
        f5.h.e(i0Var, "store");
        f5.h.e(bVar, "factory");
    }

    public e0 a(Class cls) {
        f5.h.e(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
    }

    public e0 b(String str, Class cls) {
        e0 a6;
        f5.h.e(str, "key");
        f5.h.e(cls, "modelClass");
        e0 b6 = this.f3072a.b(str);
        if (!cls.isInstance(b6)) {
            f0.d dVar = new f0.d(this.f3074c);
            dVar.c(c.f3082c, str);
            try {
                a6 = this.f3073b.b(cls, dVar);
            } catch (AbstractMethodError unused) {
                a6 = this.f3073b.a(cls);
            }
            this.f3072a.d(str, a6);
            return a6;
        }
        Object obj = this.f3073b;
        d dVar2 = obj instanceof d ? (d) obj : null;
        if (dVar2 != null) {
            f5.h.b(b6);
            dVar2.c(b6);
        }
        f5.h.c(b6, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return b6;
    }

    public f0(i0 i0Var, b bVar, f0.a aVar) {
        f5.h.e(i0Var, "store");
        f5.h.e(bVar, "factory");
        f5.h.e(aVar, "defaultCreationExtras");
        this.f3072a = i0Var;
        this.f3073b = bVar;
        this.f3074c = aVar;
    }

    public /* synthetic */ f0(i0 i0Var, b bVar, f0.a aVar, int i6, f5.f fVar) {
        this(i0Var, bVar, (i6 & 4) != 0 ? a.C0099a.f6575b : aVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f0(j0 j0Var) {
        this(j0Var.n(), a.f3075e.a(j0Var), h0.a(j0Var));
        f5.h.e(j0Var, "owner");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f0(j0 j0Var, b bVar) {
        this(j0Var.n(), bVar, h0.a(j0Var));
        f5.h.e(j0Var, "owner");
        f5.h.e(bVar, "factory");
    }
}
