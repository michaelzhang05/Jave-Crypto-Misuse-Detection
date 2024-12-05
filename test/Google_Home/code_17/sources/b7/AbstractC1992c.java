package b7;

/* renamed from: b7.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1992c extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private Throwable f15528a;

    public AbstractC1992c(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f15528a;
    }
}
