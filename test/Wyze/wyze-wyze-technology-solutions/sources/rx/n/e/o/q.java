package rx.n.e.o;

/* compiled from: SpmcArrayQueue.java */
/* loaded from: classes3.dex */
abstract class q<E> extends m<E> {

    /* renamed from: k, reason: collision with root package name */
    protected static final long f23184k = z.a(q.class, "producerIndex");
    private volatile long producerIndex;

    public q(int i2) {
        super(i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long D() {
        return this.producerIndex;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void J(long j2) {
        z.a.putOrderedLong(this, f23184k, j2);
    }
}
