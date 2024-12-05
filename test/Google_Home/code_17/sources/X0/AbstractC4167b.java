package x0;

import java.util.NoSuchElementException;

/* renamed from: x0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4167b extends S {

    /* renamed from: a, reason: collision with root package name */
    private EnumC0923b f40600a = EnumC0923b.NOT_READY;

    /* renamed from: b, reason: collision with root package name */
    private Object f40601b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x0.b$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f40602a;

        static {
            int[] iArr = new int[EnumC0923b.values().length];
            f40602a = iArr;
            try {
                iArr[EnumC0923b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40602a[EnumC0923b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public enum EnumC0923b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    private boolean c() {
        this.f40600a = EnumC0923b.FAILED;
        this.f40601b = a();
        if (this.f40600a != EnumC0923b.DONE) {
            this.f40600a = EnumC0923b.READY;
            return true;
        }
        return false;
    }

    protected abstract Object a();

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object b() {
        this.f40600a = EnumC0923b.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z8;
        if (this.f40600a != EnumC0923b.FAILED) {
            z8 = true;
        } else {
            z8 = false;
        }
        w0.h.n(z8);
        int i8 = a.f40602a[this.f40600a.ordinal()];
        if (i8 == 1) {
            return false;
        }
        if (i8 == 2) {
            return true;
        }
        return c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f40600a = EnumC0923b.NOT_READY;
            Object a8 = AbstractC4161E.a(this.f40601b);
            this.f40601b = null;
            return a8;
        }
        throw new NoSuchElementException();
    }
}
