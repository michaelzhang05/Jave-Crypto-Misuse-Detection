package kotlin.reflect.x.internal.l0.m;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.AbstractIterator;
import kotlin.collections.j;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* compiled from: ArrayMap.kt */
/* loaded from: classes2.dex */
public final class d<T> extends c<T> {

    /* renamed from: f, reason: collision with root package name */
    public static final a f21397f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    private Object[] f21398g;

    /* renamed from: h, reason: collision with root package name */
    private int f21399h;

    /* compiled from: ArrayMap.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* compiled from: ArrayMap.kt */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractIterator<T> {

        /* renamed from: h, reason: collision with root package name */
        private int f21400h = -1;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ d<T> f21401i;

        b(d<T> dVar) {
            this.f21401i = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.collections.AbstractIterator
        protected void a() {
            do {
                int i2 = this.f21400h + 1;
                this.f21400h = i2;
                if (i2 >= ((d) this.f21401i).f21398g.length) {
                    break;
                }
            } while (((d) this.f21401i).f21398g[this.f21400h] == null);
            if (this.f21400h < ((d) this.f21401i).f21398g.length) {
                Object obj = ((d) this.f21401i).f21398g[this.f21400h];
                l.d(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
                d(obj);
                return;
            }
            c();
        }
    }

    private d(Object[] objArr, int i2) {
        super(null);
        this.f21398g = objArr;
        this.f21399h = i2;
    }

    private final void w(int i2) {
        Object[] objArr = this.f21398g;
        if (objArr.length <= i2) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length * 2);
            l.e(copyOf, "copyOf(this, newSize)");
            this.f21398g = copyOf;
        }
    }

    @Override // kotlin.reflect.x.internal.l0.m.c
    public int a() {
        return this.f21399h;
    }

    @Override // kotlin.reflect.x.internal.l0.m.c
    public void b(int i2, T t) {
        l.f(t, "value");
        w(i2);
        if (this.f21398g[i2] == null) {
            this.f21399h = a() + 1;
        }
        this.f21398g[i2] = t;
    }

    @Override // kotlin.reflect.x.internal.l0.m.c
    public T get(int i2) {
        return (T) j.B(this.f21398g, i2);
    }

    @Override // kotlin.reflect.x.internal.l0.m.c, java.lang.Iterable
    public Iterator<T> iterator() {
        return new b(this);
    }

    public d() {
        this(new Object[20], 0);
    }
}
