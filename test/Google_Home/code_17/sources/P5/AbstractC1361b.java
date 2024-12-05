package P5;

import b6.InterfaceC1985a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: P5.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1361b implements Iterator, InterfaceC1985a {

    /* renamed from: a, reason: collision with root package name */
    private f0 f8857a = f0.f8878b;

    /* renamed from: b, reason: collision with root package name */
    private Object f8858b;

    /* renamed from: P5.b$a */
    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8859a;

        static {
            int[] iArr = new int[f0.values().length];
            try {
                iArr[f0.f8879c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f0.f8877a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f8859a = iArr;
        }
    }

    private final boolean e() {
        this.f8857a = f0.f8880d;
        a();
        if (this.f8857a == f0.f8877a) {
            return true;
        }
        return false;
    }

    protected abstract void a();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b() {
        this.f8857a = f0.f8879c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(Object obj) {
        this.f8858b = obj;
        this.f8857a = f0.f8877a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        f0 f0Var = this.f8857a;
        if (f0Var != f0.f8880d) {
            int i8 = a.f8859a[f0Var.ordinal()];
            if (i8 != 1) {
                if (i8 == 2) {
                    return true;
                }
                return e();
            }
            return false;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.Iterator
    public Object next() {
        if (hasNext()) {
            this.f8857a = f0.f8878b;
            return this.f8858b;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
