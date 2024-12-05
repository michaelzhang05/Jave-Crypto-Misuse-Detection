package m4;

import j4.AbstractC3081g;
import kotlin.jvm.internal.AbstractC3151p;

/* loaded from: classes4.dex */
public abstract class z0 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f35855a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f35856b;

    /* loaded from: classes4.dex */
    public static final class a extends z0 {

        /* renamed from: c, reason: collision with root package name */
        public static final a f35857c = new a();

        /* JADX WARN: Multi-variable type inference failed */
        private a() {
            super(AbstractC3081g.f33212y, null, 2, 0 == true ? 1 : 0);
        }

        @Override // m4.y0
        public boolean b() {
            return true;
        }

        @Override // m4.y0
        public boolean c(boolean z8) {
            return false;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends z0 {

        /* renamed from: c, reason: collision with root package name */
        private final int f35858c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(int i8) {
            super(i8, null, 2, 0 == true ? 1 : 0);
            this.f35858c = i8;
        }

        @Override // m4.y0
        public boolean b() {
            return false;
        }

        @Override // m4.y0
        public boolean c(boolean z8) {
            return !z8;
        }

        @Override // m4.z0
        protected int e() {
            return this.f35858c;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends z0 {

        /* renamed from: c, reason: collision with root package name */
        private final int f35859c;

        /* renamed from: d, reason: collision with root package name */
        private final Object[] f35860d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f35861e;

        public /* synthetic */ c(int i8, Object[] objArr, boolean z8, int i9, AbstractC3151p abstractC3151p) {
            this(i8, (i9 & 2) != 0 ? null : objArr, (i9 & 4) != 0 ? false : z8);
        }

        @Override // m4.y0
        public boolean b() {
            return false;
        }

        @Override // m4.y0
        public boolean c(boolean z8) {
            return true;
        }

        @Override // m4.z0, m4.y0
        public boolean d() {
            return this.f35861e;
        }

        @Override // m4.z0
        protected int e() {
            return this.f35859c;
        }

        @Override // m4.z0
        protected Object[] f() {
            return this.f35860d;
        }

        public c(int i8, Object[] objArr, boolean z8) {
            super(i8, objArr, null);
            this.f35859c = i8;
            this.f35860d = objArr;
            this.f35861e = z8;
        }
    }

    public /* synthetic */ z0(int i8, Object[] objArr, AbstractC3151p abstractC3151p) {
        this(i8, objArr);
    }

    @Override // m4.y0
    public boolean a() {
        return false;
    }

    @Override // m4.y0
    public boolean d() {
        return false;
    }

    protected int e() {
        return this.f35855a;
    }

    protected Object[] f() {
        return this.f35856b;
    }

    @Override // m4.y0
    public C getError() {
        return new C(e(), f());
    }

    private z0(int i8, Object[] objArr) {
        this.f35855a = i8;
        this.f35856b = objArr;
    }

    public /* synthetic */ z0(int i8, Object[] objArr, int i9, AbstractC3151p abstractC3151p) {
        this(i8, (i9 & 2) != 0 ? null : objArr, null);
    }
}
