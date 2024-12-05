package rx.n.e.o;

/* compiled from: BaseLinkedQueue.java */
/* loaded from: classes3.dex */
abstract class e<E> extends c<E> {

    /* renamed from: f, reason: collision with root package name */
    protected static final long f23178f = z.a(e.class, "producerNode");
    protected rx.n.e.n.c<E> producerNode;

    /* JADX INFO: Access modifiers changed from: protected */
    public final rx.n.e.n.c<E> a() {
        return (rx.n.e.n.c) z.a.getObjectVolatile(this, f23178f);
    }
}
