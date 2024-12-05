package u5;

/* loaded from: classes5.dex */
public abstract class j {

    /* loaded from: classes5.dex */
    class a implements i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ I5.a f38575a;

        a(I5.a aVar) {
            this.f38575a = aVar;
        }

        @Override // I5.a
        public Object get() {
            return this.f38575a.get();
        }
    }

    public static i a(I5.a aVar) {
        h.b(aVar);
        return new a(aVar);
    }
}
