package O5;

import kotlin.jvm.internal.AbstractC3247p;

/* loaded from: classes5.dex */
public final class A implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f8262b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f8263a;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private /* synthetic */ A(int i8) {
        this.f8263a = i8;
    }

    public static final /* synthetic */ A a(int i8) {
        return new A(i8);
    }

    public static boolean c(int i8, Object obj) {
        if (!(obj instanceof A) || i8 != ((A) obj).f()) {
            return false;
        }
        return true;
    }

    public static String e(int i8) {
        return String.valueOf(i8 & 4294967295L);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return K.a(f(), ((A) obj).f());
    }

    public boolean equals(Object obj) {
        return c(this.f8263a, obj);
    }

    public final /* synthetic */ int f() {
        return this.f8263a;
    }

    public int hashCode() {
        return d(this.f8263a);
    }

    public String toString() {
        return e(this.f8263a);
    }

    public static int b(int i8) {
        return i8;
    }

    public static int d(int i8) {
        return i8;
    }
}
