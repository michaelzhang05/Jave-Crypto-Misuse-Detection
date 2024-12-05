package p4;

import kotlin.jvm.internal.AbstractC3247p;
import m4.AbstractC3435g;

/* loaded from: classes4.dex */
public abstract class z0 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f37881a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f37882b;

    /* loaded from: classes4.dex */
    public static final class a extends z0 {

        /* renamed from: c, reason: collision with root package name */
        public static final a f37883c = new a();

        /* JADX WARN: Multi-variable type inference failed */
        private a() {
            super(AbstractC3435g.f35188y, null, 2, 0 == true ? 1 : 0);
        }

        @Override // p4.y0
        public boolean b() {
            return true;
        }

        @Override // p4.y0
        public boolean c(boolean z8) {
            return false;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends z0 {

        /* renamed from: c, reason: collision with root package name */
        private final int f37884c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(int i8) {
            super(i8, null, 2, 0 == true ? 1 : 0);
            this.f37884c = i8;
        }

        @Override // p4.y0
        public boolean b() {
            return false;
        }

        @Override // p4.y0
        public boolean c(boolean z8) {
            return !z8;
        }

        @Override // p4.z0
        protected int e() {
            return this.f37884c;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends z0 {

        /* renamed from: c, reason: collision with root package name */
        private final int f37885c;

        /* renamed from: d, reason: collision with root package name */
        private final Object[] f37886d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f37887e;

        public /* synthetic */ c(int i8, Object[] objArr, boolean z8, int i9, AbstractC3247p abstractC3247p) {
            this(i8, (i9 & 2) != 0 ? null : objArr, (i9 & 4) != 0 ? false : z8);
        }

        @Override // p4.y0
        public boolean b() {
            return false;
        }

        @Override // p4.y0
        public boolean c(boolean z8) {
            return true;
        }

        @Override // p4.z0, p4.y0
        public boolean d() {
            return this.f37887e;
        }

        @Override // p4.z0
        protected int e() {
            return this.f37885c;
        }

        @Override // p4.z0
        protected Object[] f() {
            return this.f37886d;
        }

        public c(int i8, Object[] objArr, boolean z8) {
            super(i8, objArr, null);
            this.f37885c = i8;
            this.f37886d = objArr;
            this.f37887e = z8;
        }
    }

    public /* synthetic */ z0(int i8, Object[] objArr, AbstractC3247p abstractC3247p) {
        this(i8, objArr);
    }

    @Override // p4.y0
    public boolean a() {
        return false;
    }

    @Override // p4.y0
    public boolean d() {
        return false;
    }

    protected int e() {
        return this.f37881a;
    }

    protected Object[] f() {
        return this.f37882b;
    }

    @Override // p4.y0
    public C getError() {
        return new C(e(), f());
    }

    private z0(int i8, Object[] objArr) {
        this.f37881a = i8;
        this.f37882b = objArr;
    }

    public /* synthetic */ z0(int i8, Object[] objArr, int i9, AbstractC3247p abstractC3247p) {
        this(i8, (i9 & 2) != 0 ? null : objArr, null);
    }
}
