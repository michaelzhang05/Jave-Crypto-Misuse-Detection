package androidx.core.text;

import java.util.Locale;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final t f2250a = new e(null, false);

    /* renamed from: b, reason: collision with root package name */
    public static final t f2251b = new e(null, true);

    /* renamed from: c, reason: collision with root package name */
    public static final t f2252c;

    /* renamed from: d, reason: collision with root package name */
    public static final t f2253d;

    /* renamed from: e, reason: collision with root package name */
    public static final t f2254e;

    /* renamed from: f, reason: collision with root package name */
    public static final t f2255f;

    /* loaded from: classes.dex */
    private static class a implements c {

        /* renamed from: b, reason: collision with root package name */
        static final a f2256b = new a(true);

        /* renamed from: a, reason: collision with root package name */
        private final boolean f2257a;

        private a(boolean z5) {
            this.f2257a = z5;
        }

        @Override // androidx.core.text.u.c
        public int a(CharSequence charSequence, int i6, int i7) {
            int i8 = i7 + i6;
            boolean z5 = false;
            while (i6 < i8) {
                int a6 = u.a(Character.getDirectionality(charSequence.charAt(i6)));
                if (a6 != 0) {
                    if (a6 != 1) {
                        continue;
                        i6++;
                    } else if (!this.f2257a) {
                        return 1;
                    }
                } else if (this.f2257a) {
                    return 0;
                }
                z5 = true;
                i6++;
            }
            if (z5) {
                return this.f2257a ? 1 : 0;
            }
            return 2;
        }
    }

    /* loaded from: classes.dex */
    private static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        static final b f2258a = new b();

        private b() {
        }

        @Override // androidx.core.text.u.c
        public int a(CharSequence charSequence, int i6, int i7) {
            int i8 = i7 + i6;
            int i9 = 2;
            while (i6 < i8 && i9 == 2) {
                i9 = u.b(Character.getDirectionality(charSequence.charAt(i6)));
                i6++;
            }
            return i9;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface c {
        int a(CharSequence charSequence, int i6, int i7);
    }

    /* loaded from: classes.dex */
    private static abstract class d implements t {

        /* renamed from: a, reason: collision with root package name */
        private final c f2259a;

        d(c cVar) {
            this.f2259a = cVar;
        }

        private boolean c(CharSequence charSequence, int i6, int i7) {
            int a6 = this.f2259a.a(charSequence, i6, i7);
            if (a6 == 0) {
                return true;
            }
            if (a6 != 1) {
                return b();
            }
            return false;
        }

        @Override // androidx.core.text.t
        public boolean a(CharSequence charSequence, int i6, int i7) {
            if (charSequence == null || i6 < 0 || i7 < 0 || charSequence.length() - i7 < i6) {
                throw new IllegalArgumentException();
            }
            return this.f2259a == null ? b() : c(charSequence, i6, i7);
        }

        protected abstract boolean b();
    }

    /* loaded from: classes.dex */
    private static class e extends d {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f2260b;

        e(c cVar, boolean z5) {
            super(cVar);
            this.f2260b = z5;
        }

        @Override // androidx.core.text.u.d
        protected boolean b() {
            return this.f2260b;
        }
    }

    /* loaded from: classes.dex */
    private static class f extends d {

        /* renamed from: b, reason: collision with root package name */
        static final f f2261b = new f();

        f() {
            super(null);
        }

        @Override // androidx.core.text.u.d
        protected boolean b() {
            return v.a(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f2258a;
        f2252c = new e(bVar, false);
        f2253d = new e(bVar, true);
        f2254e = new e(a.f2256b, false);
        f2255f = f.f2261b;
    }

    static int a(int i6) {
        if (i6 != 0) {
            return (i6 == 1 || i6 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i6) {
        if (i6 != 0) {
            if (i6 == 1 || i6 == 2) {
                return 0;
            }
            switch (i6) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
