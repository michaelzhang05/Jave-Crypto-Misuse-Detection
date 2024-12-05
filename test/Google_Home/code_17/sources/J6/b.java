package J6;

/* loaded from: classes5.dex */
public abstract class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    protected final String f4938a;

    public b(String str, Object... objArr) {
        this.f4938a = c.o(str, objArr);
    }

    protected abstract void e();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f4938a);
        try {
            e();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
