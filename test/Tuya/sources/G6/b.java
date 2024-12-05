package G6;

/* loaded from: classes5.dex */
public abstract class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    protected final String f3219a;

    public b(String str, Object... objArr) {
        this.f3219a = c.o(str, objArr);
    }

    protected abstract void e();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f3219a);
        try {
            e();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
