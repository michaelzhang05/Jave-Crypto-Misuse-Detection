package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private AtomicReference f3084a = new AtomicReference();

    /* loaded from: classes.dex */
    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static final C0052a Companion = new C0052a(null);

        /* renamed from: androidx.lifecycle.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0052a {

            /* renamed from: androidx.lifecycle.h$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public /* synthetic */ class C0053a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f3085a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[b.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f3085a = iArr;
                }
            }

            private C0052a() {
            }

            public /* synthetic */ C0052a(f5.f fVar) {
                this();
            }

            public final a a(b bVar) {
                f5.h.e(bVar, "state");
                int i6 = C0053a.f3085a[bVar.ordinal()];
                if (i6 == 1) {
                    return a.ON_DESTROY;
                }
                if (i6 == 2) {
                    return a.ON_STOP;
                }
                if (i6 != 3) {
                    return null;
                }
                return a.ON_PAUSE;
            }

            public final a b(b bVar) {
                f5.h.e(bVar, "state");
                int i6 = C0053a.f3085a[bVar.ordinal()];
                if (i6 == 1) {
                    return a.ON_START;
                }
                if (i6 == 2) {
                    return a.ON_RESUME;
                }
                if (i6 != 5) {
                    return null;
                }
                return a.ON_CREATE;
            }
        }

        /* loaded from: classes.dex */
        public /* synthetic */ class b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f3086a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f3086a = iArr;
            }
        }

        public final b b() {
            switch (b.f3086a[ordinal()]) {
                case 1:
                case 2:
                    return b.CREATED;
                case 3:
                case 4:
                    return b.STARTED;
                case t3.b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                    return b.RESUMED;
                case 6:
                    return b.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean b(b bVar) {
            f5.h.e(bVar, "state");
            return compareTo(bVar) >= 0;
        }
    }

    public abstract void a(l lVar);

    public abstract b b();

    public abstract void c(l lVar);
}
